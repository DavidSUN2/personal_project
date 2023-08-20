
package MutableBoolean;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableBoolean0 {

    public static boolean debug = false;

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test02");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Class<?> wildcardClass4 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test03");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Class<?> wildcardClass2 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test04");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue(false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test05");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        java.lang.Class<?> wildcardClass3 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test06");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue(false);
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test07");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        mutableBoolean0.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test08");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean4 = mutableBoolean3.isTrue();
        int int5 = mutableBoolean2.compareTo(mutableBoolean3);
        int int6 = mutableBoolean1.compareTo(mutableBoolean3);
        mutableBoolean3.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test09");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test10");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        boolean boolean6 = mutableBoolean0.booleanValue();
        boolean boolean7 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test11");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        java.lang.Class<?> wildcardClass2 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test12");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        java.lang.Boolean boolean1 = mutableBoolean0.getValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean4 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        boolean boolean5 = mutableBoolean0.equals((java.lang.Object) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test13");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.String str2 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test14");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test15");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue(true);
        java.lang.String str4 = mutableBoolean1.toString();
        java.lang.Class<?> wildcardClass5 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test16");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue(true);
        java.lang.String str4 = mutableBoolean1.toString();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = mutableBoolean1.compareTo(mutableBoolean5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test17");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean5 = mutableBoolean1.equals((java.lang.Object) 1.0f);
        boolean boolean6 = mutableBoolean1.isTrue();
        boolean boolean8 = mutableBoolean1.equals((java.lang.Object) 1L);
        java.lang.String str9 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test18");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean4 = mutableBoolean3.isTrue();
        int int5 = mutableBoolean2.compareTo(mutableBoolean3);
        int int6 = mutableBoolean1.compareTo(mutableBoolean3);
        mutableBoolean3.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test19");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue(true);
        boolean boolean5 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test20");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        boolean boolean2 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test21");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean4 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean5 = mutableBoolean4.isTrue();
        java.lang.Boolean boolean6 = mutableBoolean4.getValue();
        int int7 = mutableBoolean0.compareTo(mutableBoolean4);
        java.lang.Boolean boolean8 = mutableBoolean4.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test22");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.String str3 = mutableBoolean0.toString();
        java.lang.String str4 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test23");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean5 = mutableBoolean1.equals((java.lang.Object) 1.0f);
        boolean boolean6 = mutableBoolean1.isTrue();
        boolean boolean7 = mutableBoolean1.isFalse();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test24");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean4 = mutableBoolean3.isTrue();
        int int5 = mutableBoolean2.compareTo(mutableBoolean3);
        int int6 = mutableBoolean1.compareTo(mutableBoolean3);
        java.lang.Boolean boolean7 = mutableBoolean3.getValue();
        java.lang.String str8 = mutableBoolean3.toString();
        java.lang.String str9 = mutableBoolean3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test25");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        java.lang.Boolean boolean1 = mutableBoolean0.getValue();
        java.lang.String str2 = mutableBoolean0.toString();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean4 = mutableBoolean3.isTrue();
        mutableBoolean3.setValue(false);
        boolean boolean7 = mutableBoolean0.equals((java.lang.Object) mutableBoolean3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test26");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue(false);
        boolean boolean4 = mutableBoolean0.booleanValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean7 = mutableBoolean0.booleanValue();
        java.lang.String str8 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test27");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue(false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test28");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean5 = mutableBoolean1.equals((java.lang.Object) 1.0f);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean6 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean7 = mutableBoolean1.equals((java.lang.Object) mutableBoolean6);
        boolean boolean8 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test29");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test30");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        java.lang.Boolean boolean1 = mutableBoolean0.getValue();
        java.lang.String str2 = mutableBoolean0.toString();
        boolean boolean3 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test31");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean4 = mutableBoolean3.isTrue();
        int int5 = mutableBoolean2.compareTo(mutableBoolean3);
        int int6 = mutableBoolean1.compareTo(mutableBoolean3);
        boolean boolean8 = mutableBoolean3.equals((java.lang.Object) 100.0d);
        boolean boolean9 = mutableBoolean3.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test32");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test33");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue(false);
        mutableBoolean0.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test34");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        java.lang.Boolean boolean1 = mutableBoolean0.getValue();
        java.lang.String str2 = mutableBoolean0.toString();
        boolean boolean3 = mutableBoolean0.booleanValue();
        boolean boolean4 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test35");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        boolean boolean2 = mutableBoolean1.isTrue();
        mutableBoolean1.setValue(true);
        boolean boolean5 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test36");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue(true);
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        boolean boolean7 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test37");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        boolean boolean2 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean3 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test38");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean4 = mutableBoolean3.isTrue();
        int int5 = mutableBoolean2.compareTo(mutableBoolean3);
        int int6 = mutableBoolean1.compareTo(mutableBoolean3);
        java.lang.Boolean boolean7 = mutableBoolean1.getValue();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test39");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue(false);
        boolean boolean4 = mutableBoolean0.booleanValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.String str7 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
    }
}

