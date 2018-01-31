/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 30 20:55:31 GMT 2018
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.Utils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Utils_ESTest extends Utils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = 122;
      int int1 = Utils.emptyOpContext(int0, byteArray0[5]);
      assertFalse(int1 == int0);
      assertEquals(16, int1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(9, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 1844;
      int int1 = 97;
      int int2 = Utils.emptyOpContext(int1, int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals(16, int2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 90;
      int int1 = Utils.emptyOpContext(int0, int0);
      assertFalse(int1 == int0);
      assertEquals(32, int1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = 0;
      int int1 = Utils.unhex(int0);
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)119;
      byte[] byteArray1 = new byte[3];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byteArray1[2] = byte0;
      int int2 = Utils.indexOf(byteArray0, byteArray1, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertTrue(int2 == int1);
      assertFalse(int2 == int0);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertEquals((-1), int2);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)119}, byteArray1);
      assertEquals(7, byteArray0.length);
      assertEquals(3, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      byte byte0 = (byte)90;
      byteArray0[0] = byte0;
      byteArray0[1] = byteArray0[0];
      byte[] byteArray1 = new byte[4];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      int int0 = Utils.indexOf(byteArray0, byteArray1, byteArray1[1]);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertEquals(2, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
      assertEquals(20, byteArray0.length);
      assertEquals(4, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      int int0 = 1;
      int int1 = Utils.indexOf(byteArray0, byteArray0, int0);
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = 0;
      byte[] byteArray1 = Utils.subarray(byteArray0, int0, int0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      assertEquals(0, byteArray0.length);
      assertEquals(0, byteArray1.length);
      
      int int1 = Utils.indexOf(byteArray1, byteArray1, int0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertTrue(int1 == int0);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertEquals(0, int1);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      assertEquals(0, byteArray0.length);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 66729;
      String string0 = Utils.runeToString(int0);
      assertNotNull(string0);
      assertEquals("\u04A9", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte byte0 = (byte)92;
      StringBuilder stringBuilder0 = null;
      // Undeclared exception!
      try { 
        Utils.escapeRune(stringBuilder0, byte0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = 65;
      int int1 = Utils.unhex(int0);
      assertFalse(int1 == int0);
      assertEquals(10, int1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = 97;
      int int1 = Utils.unhex(int0);
      assertFalse(int1 == int0);
      assertEquals(10, int1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = 122;
      boolean boolean0 = Utils.isalnum(int0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = 97;
      boolean boolean0 = Utils.isalnum(int0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = 65;
      boolean boolean0 = Utils.isalnum(int0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = 48;
      boolean boolean0 = Utils.isalnum(int0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = 48;
      int int1 = Utils.unhex(int0);
      assertFalse(int1 == int0);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = 1;
      int int1 = 2;
      int[] intArray1 = Utils.subarray(intArray0, int0, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertFalse(intArray1.equals((Object)intArray0));
      assertNotSame(intArray0, intArray1);
      assertNotSame(intArray1, intArray0);
      assertNotNull(intArray1);
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
      assertArrayEquals(new int[] {0}, intArray1);
      assertEquals(4, intArray0.length);
      assertEquals(1, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte)1;
      byte byte1 = (byte)0;
      byte[] byteArray1 = Utils.subarray(byteArray0, byte1, byte0);
      assertFalse(byte0 == byte1);
      assertFalse(byte1 == byte0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray1);
      assertEquals(6, byteArray0.length);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "";
      int[] intArray0 = Utils.stringToRunes(string0);
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {}, intArray0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = 9;
      int[] intArray0 = null;
      int int1 = 1964;
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, int0, int1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = 3237;
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, int0, intArray0[2]);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = null;
      int int0 = (-1803);
      int int1 = (-402);
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, int0, int1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      byte byte0 = (byte)90;
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, byte0, byteArray0[2]);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = null;
      // Undeclared exception!
      try { 
        Utils.stringToRunes(string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = null;
      int int0 = 0;
      // Undeclared exception!
      try { 
        Utils.indexOf(byteArray0, byteArray0, int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byte byte0 = (byte)57;
      byte byte1 = (byte)10;
      byteArray0[4] = byte1;
      int int0 = Utils.emptyOpContext(byte0, byteArray0[4]);
      assertFalse(byte0 == byte1);
      assertEquals(18, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)10, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(10, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = 0;
      int int1 = Utils.unhex(int0);
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      
      int int2 = Utils.emptyOpContext(int0, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals(42, int2);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = 715;
      byte byte0 = (byte)10;
      int int1 = Utils.emptyOpContext(byte0, int0);
      assertFalse(int1 == int0);
      assertEquals(33, int1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = 95;
      boolean boolean0 = Utils.isWordRune(int0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = 48;
      int int1 = Utils.emptyOpContext(int0, int0);
      assertFalse(int1 == int0);
      assertEquals(32, int1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = 2677;
      int int1 = Utils.unhex(int0);
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      
      int int2 = Utils.emptyOpContext(int1, int0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals(37, int2);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = (-2845);
      int int1 = 65;
      int int2 = Utils.emptyOpContext(int0, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals(21, int2);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = 2677;
      int int1 = Utils.unhex(int0);
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      
      boolean boolean0 = Utils.isWordRune(int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      byte byte0 = (byte)90;
      byte[] byteArray1 = new byte[4];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byteArray1[0] = byte0;
      int int0 = Utils.indexOf(byteArray0, byteArray1, byteArray1[1]);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new byte[] {(byte)90, (byte)0, (byte)0, (byte)0}, byteArray1);
      assertEquals(20, byteArray0.length);
      assertEquals(4, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = Utils.subarray(byteArray0, byteArray0[7], byteArray0[7]);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      assertEquals(8, byteArray0.length);
      assertEquals(0, byteArray1.length);
      
      int int0 = Utils.indexOf(byteArray0, byteArray1, byteArray0[1]);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertEquals(0, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      assertEquals(8, byteArray0.length);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      byte byte0 = (byte) (-86);
      byte[] byteArray1 = new byte[4];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byteArray1[1] = byte0;
      int int0 = Utils.indexOf(byteArray0, byteArray1, byteArray1[1]);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-86), (byte)0, (byte)0}, byteArray1);
      assertEquals(20, byteArray0.length);
      assertEquals(4, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte)43;
      byteArray0[1] = byte0;
      int int0 = Utils.indexOf(byteArray0, byteArray0, byteArray0[1]);
      assertEquals((-1), int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)43, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(9, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte) (-7);
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, byte0, byteArray0[2]);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -7
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = 1779;
      int int1 = Utils.indexOf(byteArray0, byteArray0, int0);
      assertFalse(int1 == int0);
      assertEquals(0, int1);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals(0, byteArray0.length);
      
      int[] intArray0 = new int[9];
      intArray0[1] = int0;
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, int1, intArray0[1]);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = 0;
      int[] intArray0 = new int[0];
      int[] intArray1 = Utils.subarray(intArray0, int0, int0);
      assertFalse(intArray1.equals((Object)intArray0));
      assertNotSame(intArray0, intArray1);
      assertNotSame(intArray1, intArray0);
      assertNotNull(intArray1);
      assertArrayEquals(new int[] {}, intArray0);
      assertArrayEquals(new int[] {}, intArray1);
      assertEquals(0, intArray0.length);
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = 2677;
      int int1 = Utils.unhex(int0);
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      
      String string0 = Utils.runeToString(int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(string0);
      assertEquals("\uFFFF", string0);
      
      int[] intArray0 = Utils.stringToRunes(string0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {65535}, intArray0);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte)0;
      String string0 = Utils.runeToString(byteArray0[7]);
      assertNotNull(string0);
      assertEquals("\u0000", string0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(8, byteArray0.length);
      
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) string0);
      assertNotNull(stringBuilder0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(8, byteArray0.length);
      assertEquals("\u0000", stringBuilder0.toString());
      
      Utils.escapeRune(stringBuilder0, byte0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(8, byteArray0.length);
      assertEquals("\u0000\\x00", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = 2677;
      int int1 = Utils.unhex(int0);
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      
      String string0 = Utils.runeToString(int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(string0);
      assertEquals("\uFFFF", string0);
      
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) string0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(stringBuilder0);
      assertEquals("\uFFFF", stringBuilder0.toString());
      
      int int2 = 2746;
      Utils.escapeRune(stringBuilder0, int2);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals("\uFFFF\\x{aba}", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int int0 = 2677;
      int int1 = Utils.unhex(int0);
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      
      String string0 = Utils.runeToString(int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(string0);
      assertEquals("\uFFFF", string0);
      
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) string0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(stringBuilder0);
      assertEquals("\uFFFF", stringBuilder0.toString());
      
      int int2 = 13;
      Utils.escapeRune(stringBuilder0, int2);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertEquals("\uFFFF\\r", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      int int0 = 2677;
      int int1 = Utils.unhex(int0);
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      
      String string0 = Utils.runeToString(int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(string0);
      assertEquals("\uFFFF", string0);
      
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) string0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(stringBuilder0);
      assertEquals("\uFFFF", stringBuilder0.toString());
      
      int int2 = 12;
      Utils.escapeRune(stringBuilder0, int2);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertEquals("\uFFFF\\f", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      int int0 = 2677;
      int int1 = Utils.unhex(int0);
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      
      String string0 = Utils.runeToString(int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(string0);
      assertEquals("\uFFFF", string0);
      
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) string0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(stringBuilder0);
      assertEquals("\uFFFF", stringBuilder0.toString());
      
      int int2 = 10;
      Utils.escapeRune(stringBuilder0, int2);
      assertFalse(int0 == int2);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertFalse(int1 == int2);
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertEquals("\uFFFF\\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      int int0 = 9;
      String string0 = Utils.runeToString(int0);
      assertNotNull(string0);
      assertEquals("\t", string0);
      
      StringBuilder stringBuilder0 = new StringBuilder(string0);
      assertNotNull(stringBuilder0);
      assertEquals("\t", stringBuilder0.toString());
      
      Utils.escapeRune(stringBuilder0, int0);
      assertEquals("\t\\t", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte byte0 = (byte)8;
      String string0 = Utils.runeToString(byte0);
      assertNotNull(string0);
      assertEquals("\b", string0);
      
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) string0);
      assertNotNull(stringBuilder0);
      assertEquals("\b", stringBuilder0.toString());
      
      Utils.escapeRune(stringBuilder0, byte0);
      assertEquals("\b\\b", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte byte0 = (byte)90;
      StringBuilder stringBuilder0 = null;
      // Undeclared exception!
      try { 
        Utils.escapeRune(stringBuilder0, byte0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      int int0 = 2677;
      int int1 = Utils.unhex(int0);
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      
      String string0 = Utils.runeToString(int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(string0);
      assertEquals("\uFFFF", string0);
      
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte)43;
      byteArray0[1] = byte0;
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) string0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(stringBuilder0);
      assertEquals("\uFFFF", stringBuilder0.toString());
      
      Utils.escapeRune(stringBuilder0, byteArray0[1]);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)43, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(9, byteArray0.length);
      assertEquals("\uFFFF\\+", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      int int0 = 2677;
      int int1 = Utils.unhex(int0);
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      
      String string0 = Utils.runeToString(int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(string0);
      assertEquals("\uFFFF", string0);
      
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) string0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertNotNull(stringBuilder0);
      assertEquals("\uFFFF", stringBuilder0.toString());
      
      Utils.escapeRune(stringBuilder0, int1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertEquals("\uFFFF\\xffffffff", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      int int0 = 70;
      int int1 = Utils.unhex(int0);
      assertFalse(int1 == int0);
      assertEquals(15, int1);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      int int0 = 102;
      int int1 = Utils.unhex(int0);
      assertFalse(int1 == int0);
      assertEquals(15, int1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      int int0 = 57;
      int int1 = Utils.unhex(int0);
      assertFalse(int1 == int0);
      assertEquals(9, int1);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      int int0 = 90;
      boolean boolean0 = Utils.isalnum(int0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte byte0 = (byte)57;
      boolean boolean0 = Utils.isalnum(byte0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      int int0 = 2677;
      boolean boolean0 = Utils.isalnum(int0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      int int0 = 0;
      boolean boolean0 = Utils.isalnum(int0);
      assertFalse(boolean0);
  }
}
