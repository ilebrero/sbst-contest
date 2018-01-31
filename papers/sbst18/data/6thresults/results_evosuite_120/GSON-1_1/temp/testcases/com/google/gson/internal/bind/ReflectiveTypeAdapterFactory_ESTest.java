/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 30 21:28:34 GMT 2018
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.chrono.ChronoLocalDate;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReflectiveTypeAdapterFactory_ESTest extends ReflectiveTypeAdapterFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ReflectiveTypeAdapterFactory.Adapter<ChronoLocalDate> reflectiveTypeAdapterFactory_Adapter0 = (ReflectiveTypeAdapterFactory.Adapter<ChronoLocalDate>) mock(ReflectiveTypeAdapterFactory.Adapter.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(reflectiveTypeAdapterFactory_Adapter0).read(any(com.google.gson.stream.JsonReader.class));
      Gson gson0 = new Gson();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertNotNull(gson0);
      
      Reader reader0 = mock(Reader.class, new ViolatedAssumptionAnswer());
      JsonReader jsonReader0 = gson0.newJsonReader(reader0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertFalse(jsonReader0.isLenient());
      assertNotNull(jsonReader0);
      
      ChronoLocalDate chronoLocalDate0 = reflectiveTypeAdapterFactory_Adapter0.read(jsonReader0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertFalse(jsonReader0.isLenient());
      assertNull(chronoLocalDate0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ObjectConstructor<Object> objectConstructor0 = null;
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      ReflectiveTypeAdapterFactory.Adapter<Object> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Object>(objectConstructor0, hashMap0);
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(reflectiveTypeAdapterFactory_Adapter0);
      
      char[] charArray0 = new char[4];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      assertEquals(4, charArray0.length);
      assertNotNull(charArrayReader0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      
      JsonReader jsonReader0 = new JsonReader(charArrayReader0);
      assertFalse(jsonReader0.isLenient());
      assertEquals(4, charArray0.length);
      assertNotNull(jsonReader0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      
      try { 
        reflectiveTypeAdapterFactory_Adapter0.read(jsonReader0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $
         //
         verifyException("com.google.gson.stream.JsonReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConstructorConstructor constructorConstructor0 = mock(ConstructorConstructor.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectConstructor) null).when(constructorConstructor0).get(any(com.google.gson.reflect.TypeToken.class));
      FieldNamingStrategy fieldNamingStrategy0 = mock(FieldNamingStrategy.class, new ViolatedAssumptionAnswer());
      Excluder excluder0 = mock(Excluder.class, new ViolatedAssumptionAnswer());
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor0);
      assertNotNull(jsonAdapterAnnotationTypeAdapterFactory0);
      
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory(constructorConstructor0, fieldNamingStrategy0, excluder0, jsonAdapterAnnotationTypeAdapterFactory0);
      assertNotNull(reflectiveTypeAdapterFactory0);
      
      Gson gson0 = new Gson();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertNotNull(gson0);
      
      Class<MockThaiBuddhistDate> class0 = MockThaiBuddhistDate.class;
      TypeToken<MockThaiBuddhistDate> typeToken0 = TypeToken.get(class0);
      assertNotNull(typeToken0);
      
      TypeAdapter<MockThaiBuddhistDate> typeAdapter0 = reflectiveTypeAdapterFactory0.create(gson0, typeToken0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertNotNull(typeAdapter0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Field field0 = null;
      boolean boolean0 = false;
      Excluder excluder0 = new Excluder();
      assertNotNull(excluder0);
      
      // Undeclared exception!
      try { 
        ReflectiveTypeAdapterFactory.excludeField(field0, boolean0, excluder0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConstructorConstructor constructorConstructor0 = null;
      FieldNamingStrategy fieldNamingStrategy0 = null;
      Excluder excluder0 = Excluder.DEFAULT;
      assertNotNull(excluder0);
      
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor0);
      assertNotNull(jsonAdapterAnnotationTypeAdapterFactory0);
      
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory(constructorConstructor0, fieldNamingStrategy0, excluder0, jsonAdapterAnnotationTypeAdapterFactory0);
      assertNotNull(reflectiveTypeAdapterFactory0);
      
      Gson gson0 = new Gson();
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
      assertNotNull(gson0);
      
      Class<MockJapaneseDate> class0 = MockJapaneseDate.class;
      TypeToken<MockJapaneseDate> typeToken0 = TypeToken.get(class0);
      assertNotNull(typeToken0);
      
      // Undeclared exception!
      try { 
        reflectiveTypeAdapterFactory0.create(gson0, typeToken0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstructorConstructor constructorConstructor0 = mock(ConstructorConstructor.class, new ViolatedAssumptionAnswer());
      FieldNamingStrategy fieldNamingStrategy0 = mock(FieldNamingStrategy.class, new ViolatedAssumptionAnswer());
      Excluder excluder0 = mock(Excluder.class, new ViolatedAssumptionAnswer());
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor0);
      assertNotNull(jsonAdapterAnnotationTypeAdapterFactory0);
      
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory(constructorConstructor0, fieldNamingStrategy0, excluder0, jsonAdapterAnnotationTypeAdapterFactory0);
      assertNotNull(reflectiveTypeAdapterFactory0);
      
      Field field0 = null;
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        reflectiveTypeAdapterFactory0.excludeField(field0, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ObjectConstructor<SerializedName> objectConstructor0 = null;
      Map<String, ReflectiveTypeAdapterFactory.BoundField> map0 = (Map<String, ReflectiveTypeAdapterFactory.BoundField>) mock(Map.class, new ViolatedAssumptionAnswer());
      ReflectiveTypeAdapterFactory.Adapter<SerializedName> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<SerializedName>(objectConstructor0, map0);
      assertNotNull(reflectiveTypeAdapterFactory_Adapter0);
      
      JsonWriter jsonWriter0 = mock(JsonWriter.class, new ViolatedAssumptionAnswer());
      doReturn((JsonWriter) null).when(jsonWriter0).nullValue();
      SerializedName serializedName0 = null;
      reflectiveTypeAdapterFactory_Adapter0.write(jsonWriter0, serializedName0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Gson gson0 = new Gson();
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
      assertNotNull(gson0);
      
      Class<MockThaiBuddhistDate> class0 = MockThaiBuddhistDate.class;
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      assertFalse(jsonNull0.isJsonPrimitive());
      assertTrue(jsonNull0.isJsonNull());
      assertFalse(jsonNull0.isJsonArray());
      assertFalse(jsonNull0.isJsonObject());
      assertNotNull(jsonNull0);
      
      MockThaiBuddhistDate mockThaiBuddhistDate0 = gson0.fromJson((JsonElement) jsonNull0, (Type) class0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
      assertFalse(jsonNull0.isJsonPrimitive());
      assertTrue(jsonNull0.isJsonNull());
      assertFalse(jsonNull0.isJsonArray());
      assertFalse(jsonNull0.isJsonObject());
      assertNull(mockThaiBuddhistDate0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Gson gson0 = new Gson();
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertNotNull(gson0);
      
      ObjectConstructor<Object> objectConstructor0 = (ObjectConstructor<Object>) mock(ObjectConstructor.class, new ViolatedAssumptionAnswer());
      doReturn(gson0).when(objectConstructor0).construct();
      Map<String, ReflectiveTypeAdapterFactory.BoundField> map0 = (Map<String, ReflectiveTypeAdapterFactory.BoundField>) mock(Map.class, new ViolatedAssumptionAnswer());
      ReflectiveTypeAdapterFactory.Adapter<Object> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Object>(objectConstructor0, map0);
      assertFalse(gson0.serializeNulls());
      assertTrue(gson0.htmlSafe());
      assertNotNull(reflectiveTypeAdapterFactory_Adapter0);
      
      char char0 = 'o';
      Character character0 = new Character(char0);
      assertTrue(character0.equals((Object)char0));
      assertNotNull(character0);
      assertEquals('o', (char)character0);
      
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(character0);
      assertTrue(character0.equals((Object)char0));
      assertFalse(jsonPrimitive0.isNumber());
      assertTrue(jsonPrimitive0.isJsonPrimitive());
      assertFalse(jsonPrimitive0.isJsonObject());
      assertFalse(jsonPrimitive0.isJsonNull());
      assertFalse(jsonPrimitive0.isBoolean());
      assertFalse(jsonPrimitive0.isJsonArray());
      assertTrue(jsonPrimitive0.isString());
      assertNotNull(jsonPrimitive0);
      
      // Undeclared exception!
      try { 
        reflectiveTypeAdapterFactory_Adapter0.fromJsonTree(jsonPrimitive0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_OBJECT but was STRING at path $
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConstructorConstructor constructorConstructor0 = mock(ConstructorConstructor.class, new ViolatedAssumptionAnswer());
      doReturn((ObjectConstructor) null).when(constructorConstructor0).get(any(com.google.gson.reflect.TypeToken.class));
      String string0 = null;
      FieldNamingStrategy fieldNamingStrategy0 = mock(FieldNamingStrategy.class, new ViolatedAssumptionAnswer());
      doReturn(string0, string0).when(fieldNamingStrategy0).translateName(any(java.lang.reflect.Field.class));
      boolean boolean0 = true;
      Excluder excluder0 = mock(Excluder.class, new ViolatedAssumptionAnswer());
      doReturn(boolean0, boolean0, boolean0, boolean0).when(excluder0).excludeClass(any(java.lang.Class.class) , anyBoolean());
      doReturn(boolean0, boolean0, boolean0, boolean0).when(excluder0).excludeField(any(java.lang.reflect.Field.class) , anyBoolean());
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor0);
      //  // Unstable assertion: assertNotNull(jsonAdapterAnnotationTypeAdapterFactory0);
      
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory(constructorConstructor0, fieldNamingStrategy0, excluder0, jsonAdapterAnnotationTypeAdapterFactory0);
      //  // Unstable assertion: assertNotNull(reflectiveTypeAdapterFactory0);
      
      Gson gson0 = new Gson();
      //  // Unstable assertion: assertFalse(gson0.serializeNulls());
      //  // Unstable assertion: assertTrue(gson0.htmlSafe());
      //  // Unstable assertion: assertNotNull(gson0);
      
      Class<ReflectiveTypeAdapterFactory.BoundField> class0 = ReflectiveTypeAdapterFactory.BoundField.class;
      TypeToken<ReflectiveTypeAdapterFactory.BoundField> typeToken0 = TypeToken.get(class0);
      //  // Unstable assertion: assertNotNull(typeToken0);
      
      // Undeclared exception!
      try { 
        reflectiveTypeAdapterFactory0.create(gson0, typeToken0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // class com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField declares multiple JSON fields named null
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Gson gson0 = new Gson();
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
      assertNotNull(gson0);
      
      Excluder excluder0 = gson0.excluder();
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
      assertNotNull(excluder0);
      
      String string0 = gson0.toJson((Object) excluder0);
      assertTrue(gson0.htmlSafe());
      assertFalse(gson0.serializeNulls());
      assertNotNull(string0);
  }
}
