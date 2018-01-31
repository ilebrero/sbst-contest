/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 30 21:21:27 GMT 2018
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedHashTreeMap;
import java.io.ObjectStreamConstants;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedHashTreeMap_ESTest extends LinkedHashTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      assertNotNull(linkedHashTreeMap_Node0);
      
      Collection<String> collection0 = linkedHashTreeMap0.values();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(collection0);
      
      LinkedHashTreeMap<String, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<String, Object>();
      assertEquals(0, linkedHashTreeMap1.size());
      assertNotNull(linkedHashTreeMap1);
      
      boolean boolean0 = linkedHashTreeMap1.containsValue(collection0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap1.size());
      
      LinkedHashTreeMap<String, Object> linkedHashTreeMap2 = new LinkedHashTreeMap<String, Object>();
      assertTrue(linkedHashTreeMap2.equals((Object)linkedHashTreeMap1));
      assertEquals(0, linkedHashTreeMap2.size());
      assertNotNull(linkedHashTreeMap2);
      
      linkedHashTreeMap1.putAll(linkedHashTreeMap2);
      assertNotSame(linkedHashTreeMap1, linkedHashTreeMap2);
      assertNotSame(linkedHashTreeMap2, linkedHashTreeMap1);
      assertTrue(linkedHashTreeMap1.equals((Object)linkedHashTreeMap2));
      assertTrue(linkedHashTreeMap2.equals((Object)linkedHashTreeMap1));
      assertEquals(0, linkedHashTreeMap1.size());
      assertEquals(0, linkedHashTreeMap2.size());
      
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      assertEquals(2, int0);
      
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = linkedHashTreeMap1.findByObject(int0);
      assertNotSame(linkedHashTreeMap1, linkedHashTreeMap2);
      assertTrue(linkedHashTreeMap1.equals((Object)linkedHashTreeMap2));
      assertEquals(0, linkedHashTreeMap1.size());
      assertNull(linkedHashTreeMap_Node1);
      
      LinkedHashTreeMap.AvlBuilder<Object, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Object, String>();
      assertNotNull(linkedHashTreeMap_AvlBuilder0);
      
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap1.new EntrySet();
      assertTrue(linkedHashTreeMap1.equals((Object)linkedHashTreeMap2));
      assertEquals(0, linkedHashTreeMap1.size());
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertNotNull(linkedHashTreeMap_EntrySet0);
      
      Integer integer0 = new Integer(int0);
      assertEquals(2, (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      assertNotNull(integer0);
      
      String string0 = "";
      AbstractMap.SimpleImmutableEntry<Integer, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, String>(integer0, string0);
      assertTrue(integer0.equals((Object)int0));
      assertNotNull(abstractMap_SimpleImmutableEntry0);
      
      AbstractMap.SimpleEntry<Integer, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, String>(abstractMap_SimpleImmutableEntry0);
      assertTrue(integer0.equals((Object)int0));
      assertNotNull(abstractMap_SimpleEntry0);
      
      AbstractMap.SimpleImmutableEntry<Integer, String> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<Integer, String>(abstractMap_SimpleEntry0);
      assertTrue(integer0.equals((Object)int0));
      assertNotNull(abstractMap_SimpleImmutableEntry1);
      
      boolean boolean1 = linkedHashTreeMap_EntrySet0.contains(abstractMap_SimpleImmutableEntry1);
      assertFalse(boolean1);
      assertNotSame(linkedHashTreeMap1, linkedHashTreeMap2);
      assertTrue(boolean1 == boolean0);
      assertTrue(linkedHashTreeMap1.equals((Object)linkedHashTreeMap2));
      assertTrue(integer0.equals((Object)int0));
      assertEquals(0, linkedHashTreeMap1.size());
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Integer>();
      assertNotNull(linkedHashTreeMap_Node0);
      
      Integer integer0 = linkedHashTreeMap_Node0.getValue();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      assertNotNull(linkedHashTreeMap_Node0);
      
      Object object0 = linkedHashTreeMap_Node0.getKey();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>(comparator0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertNotNull(linkedHashTreeMap_EntrySet0);
      
      Iterator<Map.Entry<String, Object>> iterator0 = (Iterator<Map.Entry<String, Object>>)linkedHashTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Integer, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Integer, String>();
      assertNotNull(linkedHashTreeMap_AvlBuilder0);
      
      // Undeclared exception!
      try { 
        linkedHashTreeMap_AvlBuilder0.root();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap$AvlBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      assertNotNull(linkedHashTreeMap_Node0);
      
      LinkedHashTreeMap.AvlBuilder<Object, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Object, String>();
      assertNotNull(linkedHashTreeMap_AvlBuilder0);
      
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>(comparator0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<Integer, Object>(comparator1);
      assertEquals(0, linkedHashTreeMap1.size());
      assertNotNull(linkedHashTreeMap1);
      
      int int0 = 4438;
      Integer integer0 = new Integer(int0);
      assertEquals(4438, (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      assertNotNull(integer0);
      
      Integer integer1 = linkedHashTreeMap0.put(linkedHashTreeMap1, integer0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(1, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap1.size());
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      LinkedHashTreeMap<String, String> linkedHashTreeMap1 = new LinkedHashTreeMap<String, String>();
      assertEquals(0, linkedHashTreeMap1.size());
      assertNotNull(linkedHashTreeMap1);
      
      String string0 = linkedHashTreeMap1.get(linkedHashTreeMap0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap1.size());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      assertNotNull(linkedHashTreeMap_Node0);
      
      boolean boolean0 = false;
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node1 = linkedHashTreeMap0.find(linkedHashTreeMap_Node0, boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Object>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Integer, Object>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 0);
      LinkedHashTreeMap.Node<Integer, Object>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, Object>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(0, linkedHashTreeMap_NodeArray0.length);
      assertEquals(0, linkedHashTreeMap_NodeArray1.length);
      assertNotNull(linkedHashTreeMap_NodeArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Object, String> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Object, String>();
      assertNotNull(linkedHashTreeMap_AvlIterator0);
      
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap0.findByObject(linkedHashTreeMap_AvlIterator0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNull(linkedHashTreeMap_Node0);
      
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, Object>();
      assertEquals(0, linkedHashTreeMap1.size());
      assertNotNull(linkedHashTreeMap1);
      
      boolean boolean0 = linkedHashTreeMap1.containsKey(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      String string0 = "";
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>(string0, linkedHashTreeMap0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(abstractMap_SimpleImmutableEntry0);
      
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap0.removeInternalByKey(abstractMap_SimpleImmutableEntry0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNull(linkedHashTreeMap_Node0);
      
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.findByEntry(linkedHashTreeMap_Node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Object>[] linkedHashTreeMap_NodeArray0 = null;
      // Undeclared exception!
      try { 
        LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Object, Object>[]) linkedHashTreeMap_NodeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<String, String> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<String, String>();
      assertNotNull(linkedHashTreeMap_AvlIterator0);
      
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      assertNotNull(linkedHashTreeMap_Node0);
      
      linkedHashTreeMap_AvlIterator0.reset(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlIterator0.next();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      linkedHashTreeMap0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Object, Object> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Object, Object>();
      assertNotNull(linkedHashTreeMap_AvlIterator0);
      
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap_AvlIterator0.next();
      assertNull(linkedHashTreeMap_Node0);
      
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      assertEquals(1, int0);
      
      Object object0 = linkedHashTreeMap0.replace((Object) int0, (Object) linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertNotNull(linkedHashTreeMap_KeySet0);
      
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove(object0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertNotNull(linkedHashTreeMap_EntrySet0);
      
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(object0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      assertNotNull(linkedHashTreeMap_Node0);
      
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertNotNull(linkedHashTreeMap_EntrySet0);
      
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertNotNull(linkedHashTreeMap_EntrySet0);
      
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Object>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Integer, Object>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 9);
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Object>();
      assertNotNull(linkedHashTreeMap_Node0);
      
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node0;
      int int0 = 0;
      Integer integer0 = new Integer(int0);
      assertEquals(0, (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      assertNotNull(integer0);
      
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, Object>(linkedHashTreeMap_Node0, integer0, int0, linkedHashTreeMap_Node0, linkedHashTreeMap_NodeArray0[0]);
      assertEquals(9, linkedHashTreeMap_NodeArray0.length);
      assertTrue(integer0.equals((Object)int0));
      assertFalse(linkedHashTreeMap_Node1.equals((Object)linkedHashTreeMap_Node0));
      assertNotNull(linkedHashTreeMap_Node1);
      
      linkedHashTreeMap_NodeArray0[4] = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<Integer, Object>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, Object>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(9, linkedHashTreeMap_NodeArray0.length);
      assertEquals(18, linkedHashTreeMap_NodeArray1.length);
      assertNotNull(linkedHashTreeMap_NodeArray1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>(comparator0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      String string0 = "GT$0@<Q#_;";
      boolean boolean0 = true;
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find(string0, boolean0);
      assertEquals(1, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap_Node0);
      
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.last();
      assertSame(linkedHashTreeMap_Node0, linkedHashTreeMap_Node1);
      assertSame(linkedHashTreeMap_Node1, linkedHashTreeMap_Node0);
      assertEquals(1, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      assertNotNull(linkedHashTreeMap_Node0);
      
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.first();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>(comparator0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      String string0 = "GT$0@<Q#_;";
      boolean boolean0 = true;
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find(string0, boolean0);
      assertEquals(1, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap_Node0);
      
      boolean boolean1 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node0);
      assertTrue(boolean1);
      assertTrue(boolean1 == boolean0);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap0.header;
      assertNotNull(linkedHashTreeMap_Node0);
      
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, String>();
      assertNotNull(linkedHashTreeMap_Node1);
      
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>(linkedHashTreeMap_Node1);
      assertNotNull(abstractMap_SimpleEntry0);
      
      boolean boolean0 = linkedHashTreeMap_Node0.equals(abstractMap_SimpleEntry0);
      assertTrue(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      assertNotNull(linkedHashTreeMap_Node0);
      
      Object object0 = null;
      boolean boolean0 = linkedHashTreeMap_Node0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>(comparator0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      Set<Object> set0 = linkedHashTreeMap0.keySet();
      assertEquals(0, linkedHashTreeMap0.size());
      assertTrue(set0.isEmpty());
      assertEquals(0, set0.size());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      Set<Map.Entry<Integer, Object>> set0 = (Set<Map.Entry<Integer, Object>>)linkedHashTreeMap0.entrySet();
      assertEquals(0, linkedHashTreeMap0.size());
      assertTrue(set0.isEmpty());
      assertEquals(0, set0.size());
      assertNotNull(set0);
      
      Set<Map.Entry<Integer, Object>> set1 = (Set<Map.Entry<Integer, Object>>)linkedHashTreeMap0.entrySet();
      assertSame(set1, set0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, set1.size());
      assertTrue(set1.isEmpty());
      assertNotNull(set1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      assertNotNull(linkedHashTreeMap_Node0);
      
      linkedHashTreeMap_Node0.left = linkedHashTreeMap_Node0;
      boolean boolean0 = false;
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, boolean0);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      assertNotNull(linkedHashTreeMap_Node0);
      
      boolean boolean0 = false;
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, boolean0);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>(comparator0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      assertNotNull(linkedHashTreeMap_Node0);
      
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = linkedHashTreeMap0.findByEntry(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNull(linkedHashTreeMap_Node1);
      
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node1, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Object, Object> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Object, Object>();
      assertNotNull(linkedHashTreeMap_AvlBuilder0);
      
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find(linkedHashTreeMap_AvlBuilder0, boolean0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedHashTreeMap$AvlBuilder is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      Object object0 = linkedHashTreeMap0.remove((Object) linkedHashTreeMap0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      Object object0 = null;
      int int0 = 1;
      Integer integer0 = new Integer(int0);
      assertEquals(1, (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      assertNotNull(integer0);
      
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put(object0, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Comparator<Object> comparator0 = null;
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>(comparator0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertNotNull(linkedHashTreeMap_KeySet0);
      
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertNotNull(linkedHashTreeMap_KeySet0);
      
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertNotNull(linkedHashTreeMap_KeySet0);
      
      int int0 = linkedHashTreeMap_KeySet0.size();
      assertEquals(0, int0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertNotNull(linkedHashTreeMap_EntrySet0);
      
      linkedHashTreeMap_EntrySet0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertNotNull(linkedHashTreeMap_EntrySet0);
      
      int int0 = linkedHashTreeMap_EntrySet0.size();
      assertEquals(0, int0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(anyString() , anyString());
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>(comparator0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      String string0 = "po9$-;";
      int int0 = 0;
      Integer integer0 = new Integer(int0);
      assertEquals(0, (int)integer0);
      assertTrue(integer0.equals((Object)int0));
      assertNotNull(integer0);
      
      Integer integer1 = linkedHashTreeMap0.putIfAbsent(string0, integer0);
      assertTrue(integer0.equals((Object)int0));
      assertEquals(1, linkedHashTreeMap0.size());
      assertNull(integer1);
      
      linkedHashTreeMap0.putAll(linkedHashTreeMap0);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      assertNotNull(linkedHashTreeMap_Node0);
      
      String string0 = "[2IHJth";
      String string1 = linkedHashTreeMap_Node0.setValue(string0);
      assertNull(string1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = "(V-v`";
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      boolean boolean0 = true;
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find(string0, boolean0);
      assertEquals(1, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap_Node0);
      
      String string1 = linkedHashTreeMap_Node0.toString();
      assertEquals("(V-v`=null", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string1.equals((Object)string0));
      assertEquals(1, linkedHashTreeMap0.size());
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      int int0 = linkedHashTreeMap0.size();
      assertEquals(0, int0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      assertEquals(0, linkedHashTreeMap0.size());
      assertNotNull(linkedHashTreeMap0);
      
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertNotNull(linkedHashTreeMap_KeySet0);
      
      Iterator<Object> iterator0 = linkedHashTreeMap_KeySet0.iterator();
      assertEquals(0, linkedHashTreeMap0.size());
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertNotNull(iterator0);
  }
}
