package sbst.runtool;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.evosuite.EvoSuite;

public class EvoSuiteTestingTool implements ITestingTool {

	private EvoSuite evosuite = null;
	
	private String targetClassPath ="";
	
	public List<File> getExtraClassPath() {
        List<File> extra = new ArrayList<File>();
		File evoJar = new File("lib"+File.separator+"evosuite-master-1.1.1-SNAPSHOT.jar");
		if(!evoJar.exists()){
			System.err.println("Wrong EvoSuite jar setting, jar is not at: "+evoJar.getAbsolutePath());
		} else {
            extra.add(evoJar);
        }

		return extra;
	}

	public void initialize(File src, File bin, List<File> classPath) {
		StringBuilder sb = new StringBuilder();
		// Including the source may include other dependency jars
		// sb.append(src.getPath());
		// sb.append(File.pathSeparator);
		sb.append(bin.getPath());
		for(File dependency : classPath) {
			sb.append(File.pathSeparator);
			sb.append(dependency.getPath());
		}
		targetClassPath = sb.toString();
		evosuite = new EvoSuite();
	}

	public void run(String cName, long timeBudget) {
		if(evosuite == null) {
			System.err.println("EvoSuite has not been initialized with the target classpath!");
			return;
		}
		
		//OUTPUT_DIR  report_dir  test_dir

		final int PHASES = 6; //not including "search"

		//the main phase is "search", which should take at least 50% of the budget
		long halfTime = timeBudget / 2;
        System.err.println("TimeBudget: "+timeBudget);

		long initialization = halfTime / PHASES;
		long minimization = (long) (1.4 * (halfTime   / PHASES));
		long assertions = (long) (0.8 * (halfTime     / PHASES)); // using all assertions, so less time for that?
        long junit = halfTime          / PHASES;
		long extra = halfTime          / PHASES;
		long write = (long) (0.8 * (halfTime   / PHASES)); // less time for that?


        final int MAJOR_DELTA = 120;
		final int MINOR_DELTA = 60;

		if (halfTime > PHASES * MAJOR_DELTA) {
			initialization = MAJOR_DELTA;
			minimization = MAJOR_DELTA;
			assertions = MAJOR_DELTA;
			extra = MAJOR_DELTA;
			junit = MAJOR_DELTA;
			write = MAJOR_DELTA;
		} else if (halfTime > PHASES * MINOR_DELTA) {
			initialization = MINOR_DELTA;
			minimization = MINOR_DELTA;
			assertions = MINOR_DELTA;
			extra = MINOR_DELTA;
			junit = MINOR_DELTA;
			write = MINOR_DELTA;
		}

		long search = timeBudget - (initialization + minimization + assertions + junit + write);

        // extra += (int)Math.floor(timeBudget/10.0);
		extra = timeBudget; // According to JP we have that much time
		// Leaving the sum without extra intentionally less than timeBudget
		// to avoid time penalties

        System.err.println("Search: "+search);
        System.err.println("Init  : "+initialization);
        System.err.println("Min   : "+minimization);
        System.err.println("Ass   : "+assertions);
        System.err.println("Extra : "+extra);
        System.err.println("JUnit : "+junit);
        System.err.println("Write : "+write);


        List<String> commands = new ArrayList<String>();
		commands.addAll(Arrays.asList(
			//"-generateMOSuite",
		        //"-Dalgorithm=DynaMOSA",
			"-generateSuiteUsingDSE",
		        cName,
			"-Ddse_solver=CVC4_SOLVER",
			"-Dcvc4_path=\"/usr/bin/cvc4\"",
			"-Dselected_dse_module_arrays_support_version=LAZY_VARIABLES",
			"-Ddse_exploration_algorithm=GENERATIONAL_SEARCH",
			"-Ddse_module_version=NEW",
			"-Ddse_stopping_condition=MaxTime",
		        "-class",
		        "-Duse_deprecated=true",
//		        "-Dreplace_calls=false",
		        "-Dshow_progress=false", 
		        "-Dstopping_condition=MaxTime",
//		        "-Dstopping_condition=TimeDelta",
//		        "-criterion","weakmutation",
//		        "-criterion","archivebranch:archiveline:archivemutation",
//		        "-Dcompositional_fitness=true",
//		        "-Dtest_factory=ARCHIVE",
		        "-Dassertion_strategy=all",
//		        "-Dmax_mutants=-1",
//		        "-Dstop_zero=false",
		        "-Dtest_comments=false", 
		        "-mem", "1200",
//		        "-Dsecondary_objectives=totallength",
		        "-Dminimize=true",
		        "-Dinline=false",
//		        "-Dsandbox_mode=IO",
		        "-Dcoverage=false",
		        "-Dvariable_pool=true", 
		        "-Dsearch_budget="+search,
		        "-Dglobal_timeout="+search,
		        "-Dnew_statistics=false",
		        "-Dstatistics_backend=NONE",
		        "-Dminimization_timeout="+minimization,
		        "-Dassertion_timeout="+assertions,
				"-Dinitialization_timeout=" + initialization,
				"-Djunit_check_timeout="+junit,
				"-Dextra_timeout=" + (extra + (int)Math.floor(timeBudget/11.0)),
				"-Dwrite_junit_timeout=" + write,
				"-projectCP="+targetClassPath,
		        "-Dtest_dir=temp/testcases",
//		        "-Dtest_scaffolding=false",
                "-Dp_functional_mocking=0.8",
                "-Dfunctional_mocking_percent=0.5",
                "-Dp_reflection_on_private=0.5",
                "-Dreflection_start_percent=0.8",
                "-Dreuse_leftover_time=true"
//		        "-Dbranch_statement=true"
		        // "-Duse_separate_classloader=true"
		        // "-Dlogback.configurationFile=sbst_logback.xml"  NOTE: cannot be set for client, as not among parameters, but should be fine*/
		        ));
		String[] command = new String[commands.size()];
		commands.toArray(command);
		evosuite.parseCommandLine(command);
	}

}
