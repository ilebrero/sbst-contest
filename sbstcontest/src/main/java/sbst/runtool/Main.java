package sbst.runtool;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args){
		ITestingTool tool = new EvoSuiteTestingTool();
		RunTool runTool = new RunTool(tool, new InputStreamReader(System.in), new OutputStreamWriter(System.out));
		try {
			runTool.run();
   		        System.exit(0);
		} catch (IOException e) {			
			e.printStackTrace();
   		        System.exit(1);
		}
	}
	
}
