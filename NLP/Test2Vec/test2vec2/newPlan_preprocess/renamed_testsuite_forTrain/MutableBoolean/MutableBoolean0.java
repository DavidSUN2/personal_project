
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
            System.out.format("%n%s%n", "MutableBoolean0.test001");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        mutableBoolean0.setValue(true);
        java.lang.Class<?> wildcardClass6 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test002");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableBoolean0.equals(obj4);
        mutableBoolean0.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test003");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.String str5 = mutableBoolean0.toString();
        java.lang.Class<?> wildcardClass6 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test004");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.getValue();
        mutableBoolean2.setValue((java.lang.Boolean) false);
        mutableBoolean2.setValue(false);
        int int9 = mutableBoolean1.compareTo(mutableBoolean2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test005");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean6 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean7 = mutableBoolean6.booleanValue();
        java.lang.Boolean boolean8 = mutableBoolean6.toBoolean();
        boolean boolean9 = mutableBoolean0.equals((java.lang.Object) boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test006");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        java.lang.Class<?> wildcardClass3 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test007");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass2 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test008");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean7 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test009");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean4 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean5 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean6 = mutableBoolean5.isTrue();
        int int7 = mutableBoolean4.compareTo(mutableBoolean5);
        boolean boolean8 = mutableBoolean5.booleanValue();
        boolean boolean9 = mutableBoolean0.equals((java.lang.Object) boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test010");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean6 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        int int7 = mutableBoolean1.compareTo(mutableBoolean6);
        java.lang.Boolean boolean8 = mutableBoolean1.toBoolean();
        boolean boolean9 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test011");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        java.lang.String str3 = mutableBoolean1.toString();
        java.lang.Class<?> wildcardClass4 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test012");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean6 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        int int7 = mutableBoolean1.compareTo(mutableBoolean6);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test013");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) (byte) -1);
        java.lang.String str7 = mutableBoolean1.toString();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test014");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue(false);
        java.lang.Boolean boolean7 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test015");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue(true);
        java.lang.Class<?> wildcardClass8 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test016");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.String str4 = mutableBoolean1.toString();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test017");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        java.lang.Boolean boolean1 = mutableBoolean0.toBoolean();
        boolean boolean2 = mutableBoolean0.booleanValue();
        java.lang.Class<?> wildcardClass3 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test018");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Class<?> wildcardClass4 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test019");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue(true);
        java.lang.Boolean boolean8 = mutableBoolean0.toBoolean();
        boolean boolean9 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test020");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.booleanValue();
        java.lang.Class<?> wildcardClass4 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test021");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean4 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean5 = mutableBoolean4.booleanValue();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) boolean5);
        java.lang.Class<?> wildcardClass7 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test022");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue(false);
        mutableBoolean0.setValue(true);
        mutableBoolean0.setValue(true);
        java.lang.String str9 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "true" + "'", str9.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test023");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        boolean boolean7 = mutableBoolean1.booleanValue();
        boolean boolean9 = mutableBoolean1.equals((java.lang.Object) (-1L));
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test024");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue(false);
        mutableBoolean0.setValue(true);
        mutableBoolean0.setValue(true);
        boolean boolean9 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test025");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean2.toBoolean();
        mutableBoolean2.setValue((java.lang.Boolean) false);
        boolean boolean8 = mutableBoolean1.equals((java.lang.Object) mutableBoolean2);
        boolean boolean9 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test026");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        boolean boolean5 = mutableBoolean1.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean7 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean8 = mutableBoolean7.getValue();
        boolean boolean9 = mutableBoolean1.equals((java.lang.Object) mutableBoolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test027");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue(true);
        boolean boolean8 = mutableBoolean0.isFalse();
        boolean boolean9 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test028");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test029");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        boolean boolean8 = mutableBoolean0.equals((java.lang.Object) (short) 0);
        boolean boolean9 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test030");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.String str4 = mutableBoolean0.toString();
        boolean boolean5 = mutableBoolean0.isFalse();
        java.lang.Class<?> wildcardClass6 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test031");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.isFalse();
        java.lang.Class<?> wildcardClass4 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test032");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.String str5 = mutableBoolean1.toString();
        boolean boolean6 = mutableBoolean1.isFalse();
        java.lang.Class<?> wildcardClass7 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test033");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean2.toBoolean();
        mutableBoolean2.setValue((java.lang.Boolean) false);
        boolean boolean8 = mutableBoolean1.equals((java.lang.Object) mutableBoolean2);
        boolean boolean9 = mutableBoolean2.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test034");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test035");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean4 = mutableBoolean3.isTrue();
        int int5 = mutableBoolean2.compareTo(mutableBoolean3);
        java.lang.Boolean boolean6 = mutableBoolean3.getValue();
        java.lang.Boolean boolean7 = mutableBoolean3.toBoolean();
        boolean boolean8 = mutableBoolean3.isFalse();
        int int9 = mutableBoolean0.compareTo(mutableBoolean3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test036");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Boolean boolean8 = mutableBoolean0.getValue();
        boolean boolean9 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test037");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass8 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test038");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue(true);
        java.lang.Boolean boolean8 = mutableBoolean0.toBoolean();
        boolean boolean9 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test039");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        java.lang.Class<?> wildcardClass7 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test040");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Class<?> wildcardClass4 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test041");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean2.toBoolean();
        mutableBoolean2.setValue((java.lang.Boolean) false);
        boolean boolean8 = mutableBoolean1.equals((java.lang.Object) mutableBoolean2);
        boolean boolean9 = mutableBoolean2.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test042");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean7 = mutableBoolean2.getValue();
        mutableBoolean2.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test043");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean0.booleanValue();
        boolean boolean8 = mutableBoolean0.equals((java.lang.Object) (-1.0f));
        java.lang.Boolean boolean9 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test044");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Class<?> wildcardClass5 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test045");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean1.isTrue();
        java.lang.Class<?> wildcardClass5 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test046");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean6 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean7 = mutableBoolean6.booleanValue();
        boolean boolean8 = mutableBoolean6.booleanValue();
        int int9 = mutableBoolean0.compareTo(mutableBoolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test047");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.isFalse();
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        java.lang.Class<?> wildcardClass6 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test048");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.booleanValue();
        boolean boolean7 = mutableBoolean1.isTrue();
        java.lang.Class<?> wildcardClass8 = mutableBoolean1.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test049");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) (byte) -1);
        java.lang.String str7 = mutableBoolean1.toString();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        java.lang.Boolean boolean9 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test050");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean0.booleanValue();
        boolean boolean8 = mutableBoolean0.equals((java.lang.Object) (-1.0f));
        java.lang.Boolean boolean9 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test051");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = mutableBoolean1.isFalse();
        mutableBoolean1.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test052");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.String str2 = mutableBoolean0.toString();
        java.lang.Class<?> wildcardClass3 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test053");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        boolean boolean5 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test054");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean9 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test055");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean7 = mutableBoolean2.getValue();
        boolean boolean8 = mutableBoolean2.booleanValue();
        java.lang.String str9 = mutableBoolean2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test056");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test057");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.isFalse();
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.String str5 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test058");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean8 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean9 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test059");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        boolean boolean7 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        java.lang.Class<?> wildcardClass9 = mutableBoolean1.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test060");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.isFalse();
        boolean boolean7 = mutableBoolean0.equals((java.lang.Object) "false");
        java.lang.Class<?> wildcardClass8 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test061");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.String str5 = mutableBoolean0.toString();
        java.lang.Class<?> wildcardClass6 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "true" + "'", str5.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test062");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue(false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean5 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean6 = mutableBoolean5.booleanValue();
        mutableBoolean5.setValue((java.lang.Boolean) true);
        boolean boolean9 = mutableBoolean1.equals((java.lang.Object) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test063");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        java.lang.String str7 = mutableBoolean1.toString();
        boolean boolean8 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean9 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "true" + "'", str7.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test064");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        java.lang.String str7 = mutableBoolean1.toString();
        boolean boolean8 = mutableBoolean1.isTrue();
        java.lang.String str9 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "true" + "'", str7.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "true" + "'", str9.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test065");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        java.lang.String str7 = mutableBoolean1.toString();
        boolean boolean8 = mutableBoolean1.booleanValue();
        boolean boolean9 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "true" + "'", str7.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test066");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass8 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test067");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test068");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        boolean boolean7 = mutableBoolean1.isTrue();
        java.lang.String str8 = mutableBoolean1.toString();
        boolean boolean9 = mutableBoolean1.isTrue();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test069");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableBoolean0.equals(obj4);
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.String str8 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test070");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        java.lang.String str4 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test071");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean2.booleanValue();
        boolean boolean7 = mutableBoolean2.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test072");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        boolean boolean5 = mutableBoolean1.booleanValue();
        java.lang.Class<?> wildcardClass6 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test073");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.String str7 = mutableBoolean0.toString();
        mutableBoolean0.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "true" + "'", str7.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test074");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean6 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        int int7 = mutableBoolean1.compareTo(mutableBoolean6);
        boolean boolean8 = mutableBoolean6.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test075");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        boolean boolean5 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.isTrue();
        mutableBoolean1.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test076");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        java.lang.String str6 = mutableBoolean1.toString();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = mutableBoolean1.compareTo(mutableBoolean7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test077");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Class<?> wildcardClass4 = mutableBoolean1.getClass();
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
            System.out.format("%n%s%n", "MutableBoolean0.test078");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        java.lang.Class<?> wildcardClass7 = mutableBoolean1.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test079");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean7 = mutableBoolean0.isFalse();
        boolean boolean8 = mutableBoolean0.isFalse();
        java.lang.Class<?> wildcardClass9 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test080");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        java.lang.Class<?> wildcardClass7 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test081");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean2.booleanValue();
        mutableBoolean2.setValue((java.lang.Boolean) true);
        java.lang.Boolean boolean9 = mutableBoolean2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test082");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        boolean boolean7 = mutableBoolean1.booleanValue();
        java.lang.Class<?> wildcardClass8 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test083");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean6 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        int int7 = mutableBoolean1.compareTo(mutableBoolean6);
        mutableBoolean6.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test084");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.booleanValue();
        boolean boolean7 = mutableBoolean1.isTrue();
        boolean boolean8 = mutableBoolean1.isFalse();
        boolean boolean9 = mutableBoolean1.booleanValue();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test085");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        boolean boolean5 = mutableBoolean1.isTrue();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean8 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test086");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        boolean boolean5 = mutableBoolean1.isTrue();
        java.lang.Class<?> wildcardClass6 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test087");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        boolean boolean7 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean8 = mutableBoolean1.toBoolean();
        boolean boolean9 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test088");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        java.lang.Class<?> wildcardClass7 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test089");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean6 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        int int7 = mutableBoolean1.compareTo(mutableBoolean6);
        java.lang.Boolean boolean8 = mutableBoolean1.toBoolean();
        boolean boolean9 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test090");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        java.lang.Class<?> wildcardClass5 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test091");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean9 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test092");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        mutableBoolean1.setValue(false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test093");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        java.lang.String str6 = mutableBoolean2.toString();
        mutableBoolean2.setValue((java.lang.Boolean) true);
        boolean boolean9 = mutableBoolean2.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test094");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue(false);
        mutableBoolean0.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test095");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        boolean boolean7 = mutableBoolean1.isTrue();
        java.lang.String str8 = mutableBoolean1.toString();
        java.lang.Boolean boolean9 = mutableBoolean1.getValue();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test096");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        java.lang.String str7 = mutableBoolean1.toString();
        boolean boolean8 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean9 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "true" + "'", str7.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test097");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        java.lang.Boolean boolean7 = mutableBoolean0.getValue();
        java.lang.Boolean boolean8 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test098");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.String str5 = mutableBoolean1.toString();
        boolean boolean6 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean7 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test099");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue(false);
        boolean boolean5 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test100");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.String str2 = mutableBoolean0.toString();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass5 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test101");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = mutableBoolean1.getValue();
        java.lang.Class<?> wildcardClass8 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test102");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        mutableBoolean0.setValue(false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean4 = mutableBoolean3.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean5 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean6 = mutableBoolean5.booleanValue();
        java.lang.Boolean boolean7 = mutableBoolean5.toBoolean();
        int int8 = mutableBoolean3.compareTo(mutableBoolean5);
        int int9 = mutableBoolean0.compareTo(mutableBoolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test103");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.String str4 = mutableBoolean1.toString();
        java.lang.Class<?> wildcardClass5 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test104");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Boolean boolean7 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test105");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test106");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        boolean boolean7 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test107");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean4 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean5 = mutableBoolean4.isTrue();
        int int6 = mutableBoolean3.compareTo(mutableBoolean4);
        boolean boolean7 = mutableBoolean4.booleanValue();
        int int8 = mutableBoolean0.compareTo(mutableBoolean4);
        java.lang.Boolean boolean9 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test108");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean4 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test109");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Boolean boolean7 = mutableBoolean0.toBoolean();
        boolean boolean8 = mutableBoolean0.booleanValue();
        boolean boolean9 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test110");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue(false);
        boolean boolean7 = mutableBoolean0.booleanValue();
        java.lang.Class<?> wildcardClass8 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test111");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean2.toBoolean();
        mutableBoolean2.setValue((java.lang.Boolean) false);
        boolean boolean8 = mutableBoolean1.equals((java.lang.Object) mutableBoolean2);
        boolean boolean9 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test112");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        boolean boolean7 = mutableBoolean0.isTrue();
        boolean boolean8 = mutableBoolean0.booleanValue();
        boolean boolean9 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test113");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        boolean boolean7 = mutableBoolean1.booleanValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = mutableBoolean1.compareTo(mutableBoolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test114");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean7 = mutableBoolean0.isFalse();
        java.lang.String str8 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "true" + "'", str8.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test115");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        java.lang.String str3 = mutableBoolean1.toString();
        boolean boolean4 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass7 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test116");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        java.lang.Class<?> wildcardClass7 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test117");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue(false);
        mutableBoolean0.setValue(true);
        mutableBoolean0.setValue(true);
        java.lang.Boolean boolean9 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test118");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        boolean boolean8 = mutableBoolean0.equals((java.lang.Object) (short) 0);
        java.lang.String str9 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "true" + "'", str9.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test119");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean0.equals((java.lang.Object) (byte) 1);
        java.lang.Boolean boolean3 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test120");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue(true);
        mutableBoolean0.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test121");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean7 = mutableBoolean1.isFalse();
        boolean boolean8 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test122");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.String str2 = mutableBoolean0.toString();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean5 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test123");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue(false);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean9 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test124");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean4 = mutableBoolean3.booleanValue();
        int int5 = mutableBoolean1.compareTo(mutableBoolean3);
        java.lang.Boolean boolean6 = mutableBoolean3.getValue();
        boolean boolean7 = mutableBoolean3.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test125");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isFalse();
        boolean boolean3 = mutableBoolean1.isFalse();
        java.lang.Class<?> wildcardClass4 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test126");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean7 = mutableBoolean0.isFalse();
        boolean boolean8 = mutableBoolean0.isFalse();
        boolean boolean9 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test127");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean2.toBoolean();
        mutableBoolean2.setValue((java.lang.Boolean) false);
        boolean boolean8 = mutableBoolean1.equals((java.lang.Object) mutableBoolean2);
        java.lang.Boolean boolean9 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test128");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.String str9 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test129");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        mutableBoolean0.setValue(false);
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test130");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        boolean boolean7 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean8 = mutableBoolean1.toBoolean();
        java.lang.Class<?> wildcardClass9 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test131");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        java.lang.Boolean boolean7 = mutableBoolean0.getValue();
        boolean boolean8 = mutableBoolean0.isFalse();
        java.lang.Class<?> wildcardClass9 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test132");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.isFalse();
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        java.lang.String str6 = mutableBoolean0.toString();
        java.lang.Class<?> wildcardClass7 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test133");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        boolean boolean5 = mutableBoolean1.isTrue();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test134");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue(true);
        java.lang.Boolean boolean8 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean9 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test135");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        boolean boolean7 = mutableBoolean0.booleanValue();
        mutableBoolean0.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test136");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.isFalse();
        boolean boolean7 = mutableBoolean0.equals((java.lang.Object) "false");
        mutableBoolean0.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test137");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.String str5 = mutableBoolean1.toString();
        boolean boolean6 = mutableBoolean1.isFalse();
        boolean boolean7 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        java.lang.Class<?> wildcardClass9 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test138");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) (byte) -1);
        java.lang.String str7 = mutableBoolean1.toString();
        java.lang.String str8 = mutableBoolean1.toString();
        boolean boolean9 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test139");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.String str5 = mutableBoolean1.toString();
        java.lang.Boolean boolean6 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue(true);
        java.lang.Class<?> wildcardClass9 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test140");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        java.lang.String str3 = mutableBoolean1.toString();
        boolean boolean4 = mutableBoolean1.isTrue();
        java.lang.Class<?> wildcardClass5 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test141");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean5 = mutableBoolean0.getValue();
        mutableBoolean0.setValue(true);
        java.lang.Boolean boolean8 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test142");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean7 = mutableBoolean1.getValue();
        java.lang.String str8 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test143");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean1.isTrue();
        java.lang.String str5 = mutableBoolean1.toString();
        java.lang.String str6 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "true" + "'", str5.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "true" + "'", str6.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test144");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        boolean boolean7 = mutableBoolean1.isFalse();
        boolean boolean8 = mutableBoolean1.isTrue();
        boolean boolean9 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test145");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test146");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        boolean boolean2 = mutableBoolean0.isTrue();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test147");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue(false);
        mutableBoolean0.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test148");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        boolean boolean5 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean8 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test149");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.String str7 = mutableBoolean0.toString();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "true" + "'", str7.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test150");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.String str4 = mutableBoolean1.toString();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        java.lang.Class<?> wildcardClass6 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test151");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.String str4 = mutableBoolean1.toString();
        java.lang.Class<?> wildcardClass5 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test152");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        java.lang.Boolean boolean7 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test153");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        boolean boolean6 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test154");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = mutableBoolean1.isFalse();
        boolean boolean9 = mutableBoolean1.equals((java.lang.Object) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test155");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.String str4 = mutableBoolean0.toString();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test156");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test157");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        java.lang.Class<?> wildcardClass6 = mutableBoolean2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test158");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.isFalse();
        boolean boolean7 = mutableBoolean0.equals((java.lang.Object) "false");
        boolean boolean8 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test159");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean4 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean5 = mutableBoolean4.isTrue();
        int int6 = mutableBoolean3.compareTo(mutableBoolean4);
        boolean boolean7 = mutableBoolean4.booleanValue();
        int int8 = mutableBoolean0.compareTo(mutableBoolean4);
        boolean boolean9 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test160");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean5 = mutableBoolean0.getValue();
        mutableBoolean0.setValue(true);
        boolean boolean8 = mutableBoolean0.isTrue();
        java.lang.Class<?> wildcardClass9 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test161");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        mutableBoolean1.setValue(false);
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
            System.out.format("%n%s%n", "MutableBoolean0.test162");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        java.lang.String str6 = mutableBoolean0.toString();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean9 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test163");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue((java.lang.Boolean) false);
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
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test164");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue(false);
        boolean boolean7 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test165");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean7 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        java.lang.String str9 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "true" + "'", str9.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test166");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        boolean boolean4 = mutableBoolean0.booleanValue();
        mutableBoolean0.setValue(false);
        java.lang.String str7 = mutableBoolean0.toString();
        boolean boolean8 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test167");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue(false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test168");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean6 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        int int7 = mutableBoolean1.compareTo(mutableBoolean6);
        java.lang.String str8 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test169");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        mutableBoolean0.setValue(false);
        java.lang.Boolean boolean3 = mutableBoolean0.getValue();
        java.lang.Boolean boolean4 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test170");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean4 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean5 = mutableBoolean4.isTrue();
        int int6 = mutableBoolean3.compareTo(mutableBoolean4);
        boolean boolean7 = mutableBoolean4.booleanValue();
        int int8 = mutableBoolean0.compareTo(mutableBoolean4);
        java.lang.Class<?> wildcardClass9 = mutableBoolean4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test171");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Boolean boolean7 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test172");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean1.isTrue();
        java.lang.String str5 = mutableBoolean1.toString();
        java.lang.Class<?> wildcardClass6 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "true" + "'", str5.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test173");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean7 = mutableBoolean2.getValue();
        java.lang.Boolean boolean8 = mutableBoolean2.toBoolean();
        boolean boolean9 = mutableBoolean2.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test174");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue(false);
        java.lang.String str7 = mutableBoolean1.toString();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test175");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        boolean boolean7 = mutableBoolean0.booleanValue();
        boolean boolean8 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test176");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.String str5 = mutableBoolean0.toString();
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        boolean boolean7 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "true" + "'", str5.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test177");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        boolean boolean5 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean6 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test178");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean2.isFalse();
        mutableBoolean2.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test179");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        mutableBoolean0.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test180");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean4 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean5 = mutableBoolean4.isTrue();
        int int6 = mutableBoolean3.compareTo(mutableBoolean4);
        boolean boolean7 = mutableBoolean4.booleanValue();
        int int8 = mutableBoolean0.compareTo(mutableBoolean4);
        java.lang.Boolean boolean9 = mutableBoolean4.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test181");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.String str5 = mutableBoolean1.toString();
        boolean boolean6 = mutableBoolean1.isFalse();
        boolean boolean7 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        boolean boolean9 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test182");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean4 = mutableBoolean3.isTrue();
        java.lang.String str5 = mutableBoolean3.toString();
        java.lang.Boolean boolean6 = mutableBoolean3.getValue();
        int int7 = mutableBoolean0.compareTo(mutableBoolean3);
        boolean boolean8 = mutableBoolean0.isTrue();
        boolean boolean9 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test183");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.String str2 = mutableBoolean0.toString();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        boolean boolean7 = mutableBoolean0.booleanValue();
        boolean boolean8 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test184");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.isFalse();
        boolean boolean6 = mutableBoolean0.isTrue();
        boolean boolean7 = mutableBoolean0.booleanValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = mutableBoolean0.compareTo(mutableBoolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test185");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test186");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        boolean boolean5 = mutableBoolean1.booleanValue();
        java.lang.String str6 = mutableBoolean1.toString();
        java.lang.String str7 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test187");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        mutableBoolean1.setValue(false);
        java.lang.String str6 = mutableBoolean1.toString();
        boolean boolean7 = mutableBoolean1.isTrue();
        mutableBoolean1.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test188");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.String str5 = mutableBoolean1.toString();
        java.lang.Boolean boolean6 = mutableBoolean1.toBoolean();
        boolean boolean7 = mutableBoolean1.isFalse();
        boolean boolean8 = mutableBoolean1.isFalse();
        java.lang.Class<?> wildcardClass9 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test189");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean7 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        boolean boolean9 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test190");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        boolean boolean5 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.isTrue();
        boolean boolean7 = mutableBoolean1.isFalse();
        mutableBoolean1.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
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
            System.out.format("%n%s%n", "MutableBoolean0.test191");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        boolean boolean5 = mutableBoolean1.isTrue();
        boolean boolean6 = mutableBoolean1.booleanValue();
        java.lang.String str7 = mutableBoolean1.toString();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test192");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean2.isFalse();
        boolean boolean7 = mutableBoolean2.isFalse();
        mutableBoolean2.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test193");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.String str5 = mutableBoolean1.toString();
        boolean boolean6 = mutableBoolean1.isFalse();
        java.lang.String str7 = mutableBoolean1.toString();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        java.lang.Class<?> wildcardClass9 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test194");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.isTrue();
        java.lang.Class<?> wildcardClass5 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test195");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean4 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean5 = mutableBoolean4.isTrue();
        int int6 = mutableBoolean3.compareTo(mutableBoolean4);
        boolean boolean7 = mutableBoolean4.booleanValue();
        int int8 = mutableBoolean0.compareTo(mutableBoolean4);
        boolean boolean9 = mutableBoolean4.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test196");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        java.lang.String str6 = mutableBoolean1.toString();
        boolean boolean7 = mutableBoolean1.isFalse();
        boolean boolean8 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test197");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.booleanValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        boolean boolean4 = mutableBoolean1.isFalse();
        mutableBoolean1.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test198");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        java.lang.String str6 = mutableBoolean2.toString();
        mutableBoolean2.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test199");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean4 = mutableBoolean3.booleanValue();
        java.lang.Boolean boolean5 = mutableBoolean3.getValue();
        boolean boolean6 = mutableBoolean3.isFalse();
        int int7 = mutableBoolean0.compareTo(mutableBoolean3);
        mutableBoolean0.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test200");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean4 = mutableBoolean3.isTrue();
        java.lang.String str5 = mutableBoolean3.toString();
        java.lang.Boolean boolean6 = mutableBoolean3.getValue();
        int int7 = mutableBoolean0.compareTo(mutableBoolean3);
        mutableBoolean0.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test201");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test202");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass7 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test203");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.isFalse();
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        java.lang.String str6 = mutableBoolean0.toString();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Boolean boolean9 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test204");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Boolean boolean7 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean8 = mutableBoolean0.getValue();
        java.lang.Boolean boolean9 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test205");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        boolean boolean7 = mutableBoolean0.booleanValue();
        boolean boolean8 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean9 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test206");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean4 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean5 = mutableBoolean4.booleanValue();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) boolean5);
        boolean boolean7 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test207");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.String str5 = mutableBoolean1.toString();
        boolean boolean6 = mutableBoolean1.isFalse();
        boolean boolean7 = mutableBoolean1.booleanValue();
        java.lang.String str8 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test208");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        mutableBoolean1.setValue(true);
        boolean boolean9 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test209");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean4 = mutableBoolean3.isTrue();
        java.lang.String str5 = mutableBoolean3.toString();
        java.lang.Boolean boolean6 = mutableBoolean3.getValue();
        int int7 = mutableBoolean0.compareTo(mutableBoolean3);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test210");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue(true);
        java.lang.Boolean boolean7 = mutableBoolean0.toBoolean();
        java.lang.String str8 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "true" + "'", str8.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test211");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean4 = mutableBoolean0.getValue();
        boolean boolean5 = mutableBoolean0.booleanValue();
        java.lang.Class<?> wildcardClass6 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test212");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean6 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean7 = mutableBoolean6.booleanValue();
        java.lang.Class<?> wildcardClass8 = mutableBoolean6.getClass();
        boolean boolean9 = mutableBoolean1.equals((java.lang.Object) mutableBoolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test213");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.String str5 = mutableBoolean1.toString();
        boolean boolean6 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean7 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean8 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean9 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test214");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.String str5 = mutableBoolean0.toString();
        boolean boolean6 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean9 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "true" + "'", str5.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test215");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        boolean boolean5 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean6 = mutableBoolean1.toBoolean();
        boolean boolean7 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test216");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.String str4 = mutableBoolean0.toString();
        boolean boolean5 = mutableBoolean0.isFalse();
        java.lang.String str6 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test217");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Boolean boolean8 = mutableBoolean0.toBoolean();
        boolean boolean9 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test218");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        boolean boolean5 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean8 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test219");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.String str5 = mutableBoolean1.toString();
        java.lang.Boolean boolean6 = mutableBoolean1.toBoolean();
        boolean boolean7 = mutableBoolean1.isFalse();
        java.lang.String str8 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test220");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean4 = mutableBoolean3.booleanValue();
        int int5 = mutableBoolean1.compareTo(mutableBoolean3);
        boolean boolean7 = mutableBoolean1.equals((java.lang.Object) 0);
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        boolean boolean9 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test221");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        boolean boolean4 = mutableBoolean0.booleanValue();
        boolean boolean5 = mutableBoolean0.isTrue();
        java.lang.String str6 = mutableBoolean0.toString();
        java.lang.String str7 = mutableBoolean0.toString();
        java.lang.Class<?> wildcardClass8 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test222");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.booleanValue();
        java.lang.Class<?> wildcardClass5 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test223");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.String str5 = mutableBoolean1.toString();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test224");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.String str5 = mutableBoolean0.toString();
        boolean boolean6 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass9 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "true" + "'", str5.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test225");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        java.lang.Class<?> wildcardClass5 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test226");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.isFalse();
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        java.lang.String str6 = mutableBoolean0.toString();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass9 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test227");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        boolean boolean7 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue(false);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test228");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        mutableBoolean0.setValue(false);
        java.lang.Boolean boolean3 = mutableBoolean0.getValue();
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.String str5 = mutableBoolean0.toString();
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test229");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableBoolean0.equals(obj4);
        mutableBoolean0.setValue(true);
        java.lang.Boolean boolean8 = mutableBoolean0.toBoolean();
        boolean boolean9 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test230");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test231");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isTrue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass6 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test232");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.String str5 = mutableBoolean0.toString();
        boolean boolean6 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean9 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "true" + "'", str5.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test233");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test234");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        boolean boolean7 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue((java.lang.Boolean) false);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test235");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test236");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        boolean boolean7 = mutableBoolean1.isTrue();
        java.lang.String str8 = mutableBoolean1.toString();
        java.lang.Boolean boolean9 = mutableBoolean1.toBoolean();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test237");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        java.lang.String str5 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test238");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        java.lang.String str7 = mutableBoolean1.toString();
        boolean boolean8 = mutableBoolean1.isFalse();
        java.lang.Class<?> wildcardClass9 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "true" + "'", str7.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test239");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean6 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        int int7 = mutableBoolean1.compareTo(mutableBoolean6);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test240");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        java.lang.String str6 = mutableBoolean0.toString();
        boolean boolean7 = mutableBoolean0.isTrue();
        java.lang.String str8 = mutableBoolean0.toString();
        java.lang.String str9 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test241");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        boolean boolean7 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue(true);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test242");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.String str5 = mutableBoolean0.toString();
        mutableBoolean0.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test243");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        java.lang.String str6 = mutableBoolean2.toString();
        mutableBoolean2.setValue((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass9 = mutableBoolean2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test244");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isTrue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.isTrue();
        boolean boolean7 = mutableBoolean1.isTrue();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test245");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean0.booleanValue();
        boolean boolean7 = mutableBoolean0.booleanValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test246");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        java.lang.String str6 = mutableBoolean2.toString();
        mutableBoolean2.setValue((java.lang.Boolean) false);
        boolean boolean9 = mutableBoolean2.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test247");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        mutableBoolean1.setValue(false);
        java.lang.String str6 = mutableBoolean1.toString();
        boolean boolean7 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean8 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test248");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        mutableBoolean0.setValue(true);
        java.lang.Boolean boolean6 = mutableBoolean0.toBoolean();
        boolean boolean8 = mutableBoolean0.equals((java.lang.Object) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test249");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        java.lang.String str3 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        boolean boolean6 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test250");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean4 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean5 = mutableBoolean4.booleanValue();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) boolean5);
        boolean boolean7 = mutableBoolean1.booleanValue();
        boolean boolean8 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test251");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        java.lang.Boolean boolean7 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test252");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        boolean boolean5 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.isTrue();
        java.lang.String str7 = mutableBoolean1.toString();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test253");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean0.getValue();
        boolean boolean5 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test254");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        java.lang.Boolean boolean7 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test255");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        java.lang.String str3 = mutableBoolean1.toString();
        java.lang.String str4 = mutableBoolean1.toString();
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
            System.out.format("%n%s%n", "MutableBoolean0.test256");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        boolean boolean4 = mutableBoolean0.booleanValue();
        mutableBoolean0.setValue(false);
        java.lang.String str7 = mutableBoolean0.toString();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test257");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.String str2 = mutableBoolean0.toString();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        boolean boolean7 = mutableBoolean0.isFalse();
        java.lang.String str8 = mutableBoolean0.toString();
        boolean boolean9 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test258");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        mutableBoolean0.setValue(true);
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        mutableBoolean0.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test259");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean7 = mutableBoolean2.getValue();
        boolean boolean8 = mutableBoolean2.booleanValue();
        boolean boolean9 = mutableBoolean2.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test260");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test261");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        mutableBoolean1.setValue(true);
        java.lang.String str9 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "true" + "'", str9.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test262");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        mutableBoolean1.setValue(false);
        java.lang.String str6 = mutableBoolean1.toString();
        boolean boolean7 = mutableBoolean1.isTrue();
        boolean boolean8 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean9 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test263");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        java.lang.Boolean boolean7 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue(false);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test264");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        boolean boolean2 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test265");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        mutableBoolean0.setValue(false);
        java.lang.Boolean boolean9 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test266");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        mutableBoolean0.setValue(false);
        mutableBoolean0.setValue(false);
        boolean boolean5 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test267");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.isFalse();
        boolean boolean7 = mutableBoolean0.equals((java.lang.Object) "false");
        java.lang.String str8 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test268");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.String str5 = mutableBoolean1.toString();
        java.lang.Boolean boolean6 = mutableBoolean1.toBoolean();
        boolean boolean7 = mutableBoolean1.isFalse();
        boolean boolean8 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean9 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test269");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean7 = mutableBoolean1.booleanValue();
        boolean boolean8 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean9 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test270");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        java.lang.String str7 = mutableBoolean0.toString();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test271");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test272");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        boolean boolean4 = mutableBoolean0.equals((java.lang.Object) (-1));
        boolean boolean5 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test273");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean6 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        int int7 = mutableBoolean1.compareTo(mutableBoolean6);
        boolean boolean8 = mutableBoolean1.isTrue();
        boolean boolean9 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test274");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean0.getValue();
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
            System.out.format("%n%s%n", "MutableBoolean0.test275");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        java.lang.Boolean boolean2 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean5 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean6 = mutableBoolean5.booleanValue();
        boolean boolean7 = mutableBoolean5.isTrue();
        boolean boolean8 = mutableBoolean5.isTrue();
        boolean boolean9 = mutableBoolean1.equals((java.lang.Object) mutableBoolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test276");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        java.lang.Boolean boolean3 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Class<?> wildcardClass5 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test277");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.String str8 = mutableBoolean0.toString();
        java.lang.Class<?> wildcardClass9 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test278");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Boolean boolean7 = mutableBoolean0.toBoolean();
        java.lang.Class<?> wildcardClass8 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test279");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean4 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test280");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean0.booleanValue();
        boolean boolean8 = mutableBoolean0.equals((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass9 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test281");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue(true);
        boolean boolean5 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test282");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        boolean boolean7 = mutableBoolean1.booleanValue();
        boolean boolean8 = mutableBoolean1.isTrue();
        java.lang.Class<?> wildcardClass9 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test283");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isTrue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass8 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test284");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) (byte) -1);
        mutableBoolean1.setValue(false);
        java.lang.Class<?> wildcardClass9 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test285");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test286");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.String str5 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test287");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean4 = mutableBoolean0.getValue();
        java.lang.Class<?> wildcardClass5 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test288");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.String str2 = mutableBoolean0.toString();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        boolean boolean7 = mutableBoolean0.booleanValue();
        java.lang.Class<?> wildcardClass8 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test289");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        java.lang.Class<?> wildcardClass3 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test290");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.String str4 = mutableBoolean0.toString();
        boolean boolean5 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test291");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean2.booleanValue();
        mutableBoolean2.setValue((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass9 = mutableBoolean2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test292");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = mutableBoolean1.getValue();
        java.lang.String str8 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test293");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isFalse();
        boolean boolean3 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.String str5 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "true" + "'", str5.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test294");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean7 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test295");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isTrue();
        java.lang.String str3 = mutableBoolean1.toString();
        java.lang.String str4 = mutableBoolean1.toString();
        java.lang.Class<?> wildcardClass5 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test296");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        java.lang.String str3 = mutableBoolean0.toString();
        java.lang.Class<?> wildcardClass4 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test297");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean4 = mutableBoolean3.booleanValue();
        int int5 = mutableBoolean1.compareTo(mutableBoolean3);
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(false);
        boolean boolean9 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test298");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        java.lang.String str6 = mutableBoolean2.toString();
        boolean boolean7 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean8 = mutableBoolean2.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test299");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean7 = mutableBoolean0.isFalse();
        boolean boolean8 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean9 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test300");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.String str4 = mutableBoolean1.toString();
        java.lang.String str5 = mutableBoolean1.toString();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test301");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.String str8 = mutableBoolean0.toString();
        java.lang.Class<?> wildcardClass9 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "true" + "'", str8.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test302");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue(false);
        java.lang.Boolean boolean5 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test303");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isFalse();
        boolean boolean3 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test304");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean7 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test305");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue(false);
        java.lang.String str7 = mutableBoolean1.toString();
        java.lang.Boolean boolean8 = mutableBoolean1.toBoolean();
        boolean boolean9 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test306");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.String str5 = mutableBoolean0.toString();
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        boolean boolean7 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean8 = mutableBoolean0.toBoolean();
        boolean boolean9 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "true" + "'", str5.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test307");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean7 = mutableBoolean1.getValue();
        boolean boolean8 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test308");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue(true);
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
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test309");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = mutableBoolean1.compareTo(mutableBoolean7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test310");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(false);
        boolean boolean8 = mutableBoolean1.isFalse();
        java.lang.Class<?> wildcardClass9 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test311");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        mutableBoolean0.setValue(true);
        java.lang.String str6 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "true" + "'", str6.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test312");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.String str5 = mutableBoolean0.toString();
        mutableBoolean0.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "true" + "'", str5.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test313");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        java.lang.String str2 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "true" + "'", str2.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test314");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        boolean boolean5 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean6 = mutableBoolean1.toBoolean();
        java.lang.String str7 = mutableBoolean1.toString();
        boolean boolean8 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test315");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        boolean boolean4 = mutableBoolean0.booleanValue();
        boolean boolean5 = mutableBoolean0.isTrue();
        java.lang.Class<?> wildcardClass6 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test316");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableBoolean0.equals(obj4);
        mutableBoolean0.setValue(true);
        java.lang.Boolean boolean8 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean9 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test317");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean6 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test318");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        boolean boolean5 = mutableBoolean1.booleanValue();
        java.lang.String str6 = mutableBoolean1.toString();
        boolean boolean7 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test319");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean4 = mutableBoolean0.getValue();
        boolean boolean5 = mutableBoolean0.booleanValue();
        mutableBoolean0.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test320");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isFalse();
        boolean boolean4 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test321");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.String str5 = mutableBoolean1.toString();
        java.lang.Boolean boolean6 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue(true);
        boolean boolean9 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test322");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        boolean boolean7 = mutableBoolean1.isFalse();
        boolean boolean8 = mutableBoolean1.isTrue();
        java.lang.String str9 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test323");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        mutableBoolean0.setValue(false);
        java.lang.Boolean boolean3 = mutableBoolean0.getValue();
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.String str5 = mutableBoolean0.toString();
        boolean boolean6 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean7 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test324");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isTrue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean1.toBoolean();
        boolean boolean7 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test325");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.isFalse();
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Class<?> wildcardClass5 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test326");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.String str5 = mutableBoolean0.toString();
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        boolean boolean7 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean8 = mutableBoolean0.toBoolean();
        boolean boolean9 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "true" + "'", str5.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test327");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        boolean boolean5 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.isTrue();
        boolean boolean7 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test328");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean0.booleanValue();
        boolean boolean8 = mutableBoolean0.equals((java.lang.Object) (-1.0f));
        boolean boolean9 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test329");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        java.lang.Class<?> wildcardClass4 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test330");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.String str2 = mutableBoolean0.toString();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        mutableBoolean0.setValue(false);
        java.lang.Class<?> wildcardClass9 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test331");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue(false);
        java.lang.Class<?> wildcardClass7 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test332");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        boolean boolean4 = mutableBoolean0.equals((java.lang.Object) (-1));
        java.lang.String str5 = mutableBoolean0.toString();
        boolean boolean6 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test333");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test334");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean4 = mutableBoolean3.booleanValue();
        java.lang.Boolean boolean5 = mutableBoolean3.getValue();
        boolean boolean6 = mutableBoolean3.isFalse();
        int int7 = mutableBoolean0.compareTo(mutableBoolean3);
        mutableBoolean0.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test335");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.booleanValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test336");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean7 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test337");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean2 = mutableBoolean1.booleanValue();
        boolean boolean3 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test338");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        boolean boolean5 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.isTrue();
        boolean boolean7 = mutableBoolean1.booleanValue();
        boolean boolean8 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean9 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test339");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) 10.0f);
        boolean boolean7 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean8 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test340");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.isFalse();
        boolean boolean7 = mutableBoolean1.isTrue();
        java.lang.String str8 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test341");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableBoolean0.equals(obj4);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        mutableBoolean0.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test342");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        java.lang.String str3 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        boolean boolean6 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean7 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test343");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean5 = mutableBoolean0.getValue();
        mutableBoolean0.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test344");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        boolean boolean7 = mutableBoolean1.isTrue();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test345");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean7 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean8 = mutableBoolean0.getValue();
        boolean boolean9 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test346");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.isFalse();
        boolean boolean6 = mutableBoolean0.isTrue();
        boolean boolean7 = mutableBoolean0.booleanValue();
        boolean boolean8 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test347");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue(false);
        boolean boolean8 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test348");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.isFalse();
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean0.getValue();
        java.lang.Class<?> wildcardClass6 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test349");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        mutableBoolean1.setValue(true);
        boolean boolean9 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test350");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        java.lang.Boolean boolean3 = mutableBoolean1.toBoolean();
        boolean boolean4 = mutableBoolean1.isTrue();
        boolean boolean5 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test351");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        java.lang.String str6 = mutableBoolean1.toString();
        java.lang.Boolean boolean7 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test352");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Class<?> wildcardClass5 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test353");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        boolean boolean5 = mutableBoolean1.isFalse();
        java.lang.String str6 = mutableBoolean1.toString();
        boolean boolean7 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test354");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test355");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        java.lang.Boolean boolean3 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test356");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test357");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isTrue();
        boolean boolean5 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean6 = mutableBoolean0.toBoolean();
        java.lang.String str7 = mutableBoolean0.toString();
        boolean boolean8 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test358");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        boolean boolean7 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean8 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test359");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean5 = mutableBoolean0.getValue();
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test360");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Boolean boolean8 = mutableBoolean0.getValue();
        java.lang.Class<?> wildcardClass9 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test361");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.booleanValue();
        mutableBoolean0.setValue(false);
        java.lang.Boolean boolean8 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test362");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean8 = mutableBoolean0.isTrue();
        boolean boolean9 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test363");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        mutableBoolean0.setValue(true);
        boolean boolean5 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test364");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean7 = mutableBoolean2.getValue();
        boolean boolean8 = mutableBoolean2.isTrue();
        boolean boolean9 = mutableBoolean2.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test365");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = mutableBoolean1.compareTo(mutableBoolean5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
            System.out.format("%n%s%n", "MutableBoolean0.test366");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        java.lang.String str7 = mutableBoolean1.toString();
        java.lang.String str8 = mutableBoolean1.toString();
        boolean boolean9 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "true" + "'", str7.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "true" + "'", str8.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test367");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        java.lang.String str7 = mutableBoolean1.toString();
        boolean boolean8 = mutableBoolean1.isTrue();
        java.lang.Class<?> wildcardClass9 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "true" + "'", str7.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test368");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.isFalse();
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean0.getValue();
        boolean boolean6 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test369");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean5 = mutableBoolean0.getValue();
        mutableBoolean0.setValue(true);
        boolean boolean8 = mutableBoolean0.isTrue();
        java.lang.String str9 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "true" + "'", str9.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test370");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableBoolean0.equals(obj4);
        java.lang.String str6 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test371");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        boolean boolean5 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        boolean boolean7 = mutableBoolean1.isFalse();
        boolean boolean9 = mutableBoolean1.equals((java.lang.Object) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test372");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test373");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test374");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean7 = mutableBoolean1.getValue();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        java.lang.Class<?> wildcardClass9 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test375");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue(true);
        boolean boolean7 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test376");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean9 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test377");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean7 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test378");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean2.isFalse();
        java.lang.Boolean boolean7 = mutableBoolean2.toBoolean();
        boolean boolean8 = mutableBoolean2.isFalse();
        boolean boolean9 = mutableBoolean2.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test379");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        boolean boolean5 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test380");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        mutableBoolean0.setValue(false);
        java.lang.Boolean boolean3 = mutableBoolean0.getValue();
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        boolean boolean5 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test381");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        mutableBoolean0.setValue(false);
        java.lang.Boolean boolean3 = mutableBoolean0.getValue();
        boolean boolean4 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean7 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test382");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.String str7 = mutableBoolean0.toString();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "true" + "'", str7.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test383");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        java.lang.Boolean boolean2 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean5 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test384");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        boolean boolean7 = mutableBoolean1.booleanValue();
        boolean boolean8 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test385");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        mutableBoolean0.setValue(false);
        java.lang.Boolean boolean3 = mutableBoolean0.getValue();
        boolean boolean4 = mutableBoolean0.booleanValue();
        boolean boolean5 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue(false);
        mutableBoolean0.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test386");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        boolean boolean7 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test387");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean4 = mutableBoolean3.booleanValue();
        boolean boolean5 = mutableBoolean3.isFalse();
        boolean boolean6 = mutableBoolean3.isTrue();
        boolean boolean7 = mutableBoolean3.isFalse();
        int int8 = mutableBoolean0.compareTo(mutableBoolean3);
        java.lang.Class<?> wildcardClass9 = mutableBoolean3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test388");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.isTrue();
        boolean boolean5 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test389");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean4 = mutableBoolean0.getValue();
        boolean boolean5 = mutableBoolean0.isFalse();
        boolean boolean6 = mutableBoolean0.isTrue();
        java.lang.String str7 = mutableBoolean0.toString();
        boolean boolean8 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test390");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.String str4 = mutableBoolean1.toString();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) 0);
        mutableBoolean1.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test391");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isTrue();
        boolean boolean5 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass8 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test392");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        boolean boolean7 = mutableBoolean1.isTrue();
        boolean boolean8 = mutableBoolean1.isTrue();
        java.lang.Class<?> wildcardClass9 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test393");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        mutableBoolean1.setValue(false);
        mutableBoolean1.setValue(true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test394");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        java.lang.Boolean boolean2 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        mutableBoolean1.setValue(true);
        mutableBoolean1.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test395");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isTrue();
        boolean boolean5 = mutableBoolean0.booleanValue();
        mutableBoolean0.setValue(true);
        java.lang.String str8 = mutableBoolean0.toString();
        boolean boolean9 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "true" + "'", str8.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test396");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean3 = mutableBoolean0.getValue();
        boolean boolean4 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test397");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.String str8 = mutableBoolean0.toString();
        boolean boolean9 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "true" + "'", str8.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test398");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean4 = mutableBoolean3.booleanValue();
        java.lang.Boolean boolean5 = mutableBoolean3.getValue();
        boolean boolean6 = mutableBoolean3.isFalse();
        int int7 = mutableBoolean0.compareTo(mutableBoolean3);
        java.lang.String str8 = mutableBoolean3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test399");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.isFalse();
        boolean boolean6 = mutableBoolean0.isTrue();
        java.lang.Class<?> wildcardClass7 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test400");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test401");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        java.lang.Boolean boolean3 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean7 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test402");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        mutableBoolean1.setValue((java.lang.Boolean) true);
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
            System.out.format("%n%s%n", "MutableBoolean0.test403");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test404");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        boolean boolean4 = mutableBoolean0.booleanValue();
        mutableBoolean0.setValue(false);
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean9 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test405");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isFalse();
        mutableBoolean1.setValue(false);
        java.lang.Class<?> wildcardClass5 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test406");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        java.lang.String str3 = mutableBoolean1.toString();
        boolean boolean4 = mutableBoolean1.booleanValue();
        java.lang.String str5 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test407");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean2 = mutableBoolean1.booleanValue();
        boolean boolean3 = mutableBoolean1.isTrue();
        boolean boolean4 = mutableBoolean1.isTrue();
        java.lang.Class<?> wildcardClass5 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test408");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        java.lang.String str4 = mutableBoolean1.toString();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        boolean boolean6 = mutableBoolean1.isFalse();
        boolean boolean7 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test409");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean4 = mutableBoolean0.getValue();
        boolean boolean5 = mutableBoolean0.isFalse();
        boolean boolean6 = mutableBoolean0.isFalse();
        boolean boolean7 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean8 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test410");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean4 = mutableBoolean3.booleanValue();
        java.lang.Boolean boolean5 = mutableBoolean3.getValue();
        boolean boolean6 = mutableBoolean3.isFalse();
        int int7 = mutableBoolean0.compareTo(mutableBoolean3);
        boolean boolean8 = mutableBoolean3.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test411");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.String str5 = mutableBoolean1.toString();
        boolean boolean6 = mutableBoolean1.isFalse();
        boolean boolean7 = mutableBoolean1.isTrue();
        boolean boolean8 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test412");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        boolean boolean4 = mutableBoolean0.equals((java.lang.Object) (-1));
        java.lang.String str5 = mutableBoolean0.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = mutableBoolean0.equals(obj6);
        java.lang.Class<?> wildcardClass8 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test413");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        java.lang.String str4 = mutableBoolean1.toString();
        boolean boolean5 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test414");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        mutableBoolean0.setValue(true);
        mutableBoolean0.setValue(true);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = mutableBoolean0.compareTo(mutableBoolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test415");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean5 = mutableBoolean0.isFalse();
        boolean boolean6 = mutableBoolean0.booleanValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test416");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        java.lang.String str3 = mutableBoolean1.toString();
        java.lang.Class<?> wildcardClass4 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test417");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        java.lang.String str6 = mutableBoolean1.toString();
        java.lang.Boolean boolean7 = mutableBoolean1.getValue();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test418");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.String str2 = mutableBoolean1.toString();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test419");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean7 = mutableBoolean0.isFalse();
        java.lang.Class<?> wildcardClass8 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test420");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test421");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean4 = mutableBoolean0.getValue();
        boolean boolean5 = mutableBoolean0.isFalse();
        boolean boolean6 = mutableBoolean0.isTrue();
        java.lang.String str7 = mutableBoolean0.toString();
        java.lang.String str8 = mutableBoolean0.toString();
        java.lang.String str9 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test422");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        java.lang.String str6 = mutableBoolean1.toString();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean9 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "true" + "'", str6.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test423");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean7 = mutableBoolean1.getValue();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        boolean boolean9 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test424");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        mutableBoolean0.setValue(true);
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean9 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test425");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean2.isFalse();
        boolean boolean7 = mutableBoolean2.isFalse();
        boolean boolean8 = mutableBoolean2.isTrue();
        java.lang.Boolean boolean9 = mutableBoolean2.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test426");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.String str7 = mutableBoolean0.toString();
        boolean boolean8 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "true" + "'", str7.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test427");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean7 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        java.lang.Boolean boolean9 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test428");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.String str4 = mutableBoolean0.toString();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test429");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        java.lang.String str6 = mutableBoolean0.toString();
        boolean boolean7 = mutableBoolean0.isTrue();
        java.lang.String str8 = mutableBoolean0.toString();
        boolean boolean9 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test430");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        java.lang.String str2 = mutableBoolean1.toString();
        boolean boolean3 = mutableBoolean1.isFalse();
        boolean boolean4 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "true" + "'", str2.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test431");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean5 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        java.lang.String str7 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test432");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.isFalse();
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        java.lang.String str6 = mutableBoolean0.toString();
        java.lang.String str7 = mutableBoolean0.toString();
        boolean boolean8 = mutableBoolean0.isTrue();
        java.lang.String str9 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test433");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        java.lang.Boolean boolean9 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test434");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        boolean boolean6 = mutableBoolean2.equals((java.lang.Object) (-1));
        java.lang.String str7 = mutableBoolean2.toString();
        java.lang.String str8 = mutableBoolean2.toString();
        boolean boolean9 = mutableBoolean1.equals((java.lang.Object) mutableBoolean2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test435");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.String str5 = mutableBoolean0.toString();
        boolean boolean6 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean7 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test436");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        java.lang.Boolean boolean3 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        java.lang.String str7 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "true" + "'", str7.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test437");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        boolean boolean5 = mutableBoolean0.isFalse();
        java.lang.Class<?> wildcardClass6 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test438");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean4 = mutableBoolean3.isTrue();
        java.lang.String str5 = mutableBoolean3.toString();
        java.lang.Boolean boolean6 = mutableBoolean3.getValue();
        int int7 = mutableBoolean0.compareTo(mutableBoolean3);
        boolean boolean8 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean9 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test439");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        boolean boolean5 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean6 = mutableBoolean1.toBoolean();
        java.lang.Class<?> wildcardClass7 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test440");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        java.lang.Boolean boolean7 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test441");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        boolean boolean5 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean6 = mutableBoolean1.toBoolean();
        java.lang.String str7 = mutableBoolean1.toString();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        java.lang.Boolean boolean9 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test442");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean0.getValue();
        boolean boolean6 = mutableBoolean0.equals((java.lang.Object) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test443");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        java.lang.String str3 = mutableBoolean1.toString();
        boolean boolean4 = mutableBoolean1.booleanValue();
        boolean boolean5 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test444");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean2 = mutableBoolean1.booleanValue();
        boolean boolean3 = mutableBoolean1.isTrue();
        boolean boolean4 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        boolean boolean6 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean7 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test445");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        mutableBoolean0.setValue(true);
        boolean boolean5 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test446");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean2 = mutableBoolean1.booleanValue();
        boolean boolean3 = mutableBoolean1.isTrue();
        boolean boolean4 = mutableBoolean1.isTrue();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test447");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isTrue();
        java.lang.String str3 = mutableBoolean1.toString();
        java.lang.Class<?> wildcardClass4 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test448");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        boolean boolean5 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.booleanValue();
        boolean boolean7 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test449");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        boolean boolean5 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.isTrue();
        java.lang.String str7 = mutableBoolean1.toString();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        boolean boolean9 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test450");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.String str5 = mutableBoolean1.toString();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test451");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        java.lang.String str7 = mutableBoolean1.toString();
        java.lang.String str8 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "true" + "'", str7.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "true" + "'", str8.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test452");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.String str6 = mutableBoolean1.toString();
        java.lang.Boolean boolean7 = mutableBoolean1.toBoolean();
        boolean boolean8 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test453");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean3.setValue((java.lang.Boolean) false);
        boolean boolean6 = mutableBoolean3.isFalse();
        boolean boolean7 = mutableBoolean3.booleanValue();
        java.lang.Boolean boolean8 = mutableBoolean3.toBoolean();
        int int9 = mutableBoolean1.compareTo(mutableBoolean3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test454");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.booleanValue();
        boolean boolean6 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean7 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test455");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean7 = mutableBoolean1.isFalse();
        boolean boolean8 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test456");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isTrue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test457");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.String str5 = mutableBoolean0.toString();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean8 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test458");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test459");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isTrue();
        boolean boolean5 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean6 = mutableBoolean0.toBoolean();
        java.lang.Class<?> wildcardClass7 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test460");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) (byte) -1);
        mutableBoolean1.setValue(false);
        boolean boolean9 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test461");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean2 = mutableBoolean1.isFalse();
        mutableBoolean1.setValue(false);
        boolean boolean5 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test462");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.String str5 = mutableBoolean1.toString();
        boolean boolean6 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean7 = mutableBoolean1.toBoolean();
        boolean boolean8 = mutableBoolean1.isTrue();
        boolean boolean9 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test463");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isTrue();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test464");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        java.lang.String str2 = mutableBoolean1.toString();
        boolean boolean3 = mutableBoolean1.isFalse();
        java.lang.String str4 = mutableBoolean1.toString();
        java.lang.String str5 = mutableBoolean1.toString();
        mutableBoolean1.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "true" + "'", str2.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "true" + "'", str5.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test465");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean2 = mutableBoolean1.booleanValue();
        boolean boolean3 = mutableBoolean1.isTrue();
        boolean boolean4 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        boolean boolean6 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean7 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test466");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        java.lang.String str3 = mutableBoolean1.toString();
        mutableBoolean1.setValue(true);
        java.lang.Boolean boolean6 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test467");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean7 = mutableBoolean1.getValue();
        java.lang.Boolean boolean8 = mutableBoolean1.toBoolean();
        boolean boolean9 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test468");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean2 = mutableBoolean1.isFalse();
        mutableBoolean1.setValue(false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean5 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean6 = mutableBoolean5.isTrue();
        boolean boolean7 = mutableBoolean5.isTrue();
        java.lang.Boolean boolean8 = mutableBoolean5.toBoolean();
        int int9 = mutableBoolean1.compareTo(mutableBoolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test469");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        java.lang.Boolean boolean3 = mutableBoolean1.getValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = mutableBoolean1.compareTo(mutableBoolean4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test470");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.isFalse();
        boolean boolean4 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean9 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test471");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean2.toBoolean();
        mutableBoolean2.setValue((java.lang.Boolean) false);
        boolean boolean8 = mutableBoolean1.equals((java.lang.Object) mutableBoolean2);
        java.lang.String str9 = mutableBoolean2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test472");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.String str4 = mutableBoolean0.toString();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        java.lang.String str6 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test473");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.isFalse();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean9 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test474");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        java.lang.String str6 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test475");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.String str5 = mutableBoolean1.toString();
        boolean boolean6 = mutableBoolean1.isFalse();
        java.lang.String str7 = mutableBoolean1.toString();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        boolean boolean9 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test476");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean2.isFalse();
        boolean boolean7 = mutableBoolean2.isFalse();
        java.lang.Class<?> wildcardClass8 = mutableBoolean2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test477");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        java.lang.Boolean boolean3 = mutableBoolean1.getValue();
        boolean boolean4 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test478");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.booleanValue();
        boolean boolean4 = mutableBoolean0.isTrue();
        boolean boolean5 = mutableBoolean0.booleanValue();
        boolean boolean6 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test479");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.String str4 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test480");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean2.isFalse();
        java.lang.Boolean boolean7 = mutableBoolean2.getValue();
        mutableBoolean2.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test481");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isTrue();
        java.lang.String str3 = mutableBoolean1.toString();
        java.lang.String str4 = mutableBoolean1.toString();
        boolean boolean5 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test482");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        mutableBoolean1.setValue(false);
        boolean boolean6 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test483");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean1.isTrue();
        java.lang.String str5 = mutableBoolean1.toString();
        boolean boolean6 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "true" + "'", str5.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test484");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        boolean boolean4 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean5 = mutableBoolean0.getValue();
        boolean boolean6 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test485");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        mutableBoolean1.setValue(false);
        java.lang.String str6 = mutableBoolean1.toString();
        boolean boolean7 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        java.lang.Boolean boolean9 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test486");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test487");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableBoolean0.equals(obj4);
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test488");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.String str2 = mutableBoolean0.toString();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test489");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        boolean boolean5 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean6 = mutableBoolean1.toBoolean();
        java.lang.String str7 = mutableBoolean1.toString();
        java.lang.Class<?> wildcardClass8 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test490");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean1.isTrue();
        boolean boolean5 = mutableBoolean1.isFalse();
        java.lang.Class<?> wildcardClass6 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test491");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean0.booleanValue();
        java.lang.String str7 = mutableBoolean0.toString();
        java.lang.String str8 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test492");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        java.lang.Class<?> wildcardClass5 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test493");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean0.booleanValue();
        java.lang.String str7 = mutableBoolean0.toString();
        boolean boolean8 = mutableBoolean0.isTrue();
        boolean boolean9 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test494");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        boolean boolean5 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.isTrue();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test495");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        boolean boolean5 = mutableBoolean1.isTrue();
        boolean boolean6 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test496");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        java.lang.String str2 = mutableBoolean1.toString();
        boolean boolean3 = mutableBoolean1.isFalse();
        java.lang.String str4 = mutableBoolean1.toString();
        java.lang.String str5 = mutableBoolean1.toString();
        boolean boolean6 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean7 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "true" + "'", str2.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "true" + "'", str5.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test497");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean7 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean8 = mutableBoolean0.getValue();
        java.lang.Boolean boolean9 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test498");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue(false);
        mutableBoolean0.setValue(true);
        java.lang.String str7 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "true" + "'", str7.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test499");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.String str5 = mutableBoolean1.toString();
        boolean boolean6 = mutableBoolean1.isFalse();
        boolean boolean7 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        java.lang.Boolean boolean9 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.test500");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        mutableBoolean0.setValue(false);
        java.lang.Boolean boolean3 = mutableBoolean0.getValue();
        boolean boolean4 = mutableBoolean0.isTrue();
        boolean boolean5 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }
}

