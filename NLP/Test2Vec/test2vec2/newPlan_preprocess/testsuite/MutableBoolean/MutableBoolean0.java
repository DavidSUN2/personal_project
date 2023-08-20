package MutableBoolean;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableBoolean0 {

    public static boolean debug = false;

    @Test
    public void MutableBoolean001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean001");
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
    public void MutableBoolean002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean002");
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
    public void MutableBoolean003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean003");
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
    public void MutableBoolean004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean004");
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
    public void MutableBoolean005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean005");
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
    public void MutableBoolean006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean006");
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
    public void MutableBoolean007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean007");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass2 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableBoolean008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean008");
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
    public void MutableBoolean009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean009");
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
    public void MutableBoolean010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean010");
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
    public void MutableBoolean011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean011");
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
    public void MutableBoolean012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean012");
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
    public void MutableBoolean013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean013");
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
    public void MutableBoolean014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean014");
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
    public void MutableBoolean015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean015");
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
    public void MutableBoolean016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean016");
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
    public void MutableBoolean017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean017");
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
    public void MutableBoolean018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean018");
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
    public void MutableBoolean019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean019");
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
    public void MutableBoolean020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean020");
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
    public void MutableBoolean021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean021");
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
    public void MutableBoolean022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean022");
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
    public void MutableBoolean023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean023");
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
    public void MutableBoolean024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean024");
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
    public void MutableBoolean025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean025");
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
    public void MutableBoolean026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean026");
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
    public void MutableBoolean027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean027");
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
    public void MutableBoolean028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean028");
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
    public void MutableBoolean029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean029");
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
    public void MutableBoolean030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean030");
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
    public void MutableBoolean031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean031");
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
    public void MutableBoolean032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean032");
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
    public void MutableBoolean033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean033");
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
    public void MutableBoolean034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean034");
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
    public void MutableBoolean035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean035");
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
    public void MutableBoolean036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean036");
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
    public void MutableBoolean037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean037");
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
    public void MutableBoolean038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean038");
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
    public void MutableBoolean039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean039");
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
    public void MutableBoolean040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean040");
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
    public void MutableBoolean041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean041");
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
    public void MutableBoolean042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean042");
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
    public void MutableBoolean043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean043");
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
    public void MutableBoolean044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean044");
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
    public void MutableBoolean045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean045");
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
    public void MutableBoolean046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean046");
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
    public void MutableBoolean047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean047");
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
    public void MutableBoolean048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean048");
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
    public void MutableBoolean049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean049");
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
    public void MutableBoolean050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean050");
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
    public void MutableBoolean051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean051");
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
    public void MutableBoolean052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean052");
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
    public void MutableBoolean053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean053");
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
    public void MutableBoolean054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean054");
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
    public void MutableBoolean055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean055");
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
    public void MutableBoolean056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean056");
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
    public void MutableBoolean057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean057");
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
    public void MutableBoolean058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean058");
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
    public void MutableBoolean059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean059");
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
    public void MutableBoolean060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean060");
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
    public void MutableBoolean061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean061");
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
    public void MutableBoolean062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean062");
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
    public void MutableBoolean063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean063");
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
    public void MutableBoolean064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean064");
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
    public void MutableBoolean065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean065");
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
    public void MutableBoolean066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean066");
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
    public void MutableBoolean067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean067");
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
    public void MutableBoolean068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean068");
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
    public void MutableBoolean069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean069");
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
    public void MutableBoolean070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean070");
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
    public void MutableBoolean071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean071");
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
    public void MutableBoolean072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean072");
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
    public void MutableBoolean073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean073");
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
    public void MutableBoolean074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean074");
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
    public void MutableBoolean075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean075");
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
    public void MutableBoolean076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean076");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        java.lang.String str6 = mutableBoolean1.toString();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean7 = null;
        // The following exception was thrown during execution in MutableBoolean generation
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
    public void MutableBoolean077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean077");
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
    public void MutableBoolean078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean078");
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
    public void MutableBoolean079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean079");
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
    public void MutableBoolean080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean080");
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
    public void MutableBoolean081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean081");
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
    public void MutableBoolean082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean082");
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
    public void MutableBoolean083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean083");
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
    public void MutableBoolean084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean084");
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
    public void MutableBoolean085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean085");
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
    public void MutableBoolean086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean086");
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
    public void MutableBoolean087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean087");
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
    public void MutableBoolean088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean088");
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
    public void MutableBoolean089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean089");
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
    public void MutableBoolean090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean090");
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
    public void MutableBoolean091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean091");
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
    public void MutableBoolean092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean092");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        mutableBoolean1.setValue(false);
    }

    @Test
    public void MutableBoolean093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean093");
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
    public void MutableBoolean094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean094");
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
    public void MutableBoolean095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean095");
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
    public void MutableBoolean096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean096");
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
    public void MutableBoolean097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean097");
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
    public void MutableBoolean098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean098");
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
    public void MutableBoolean099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean099");
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
    public void MutableBoolean100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean100");
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
    public void MutableBoolean101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean101");
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
    public void MutableBoolean102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean102");
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
    public void MutableBoolean103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean103");
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
    public void MutableBoolean104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean104");
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
    public void MutableBoolean105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean105");
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
    public void MutableBoolean106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean106");
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
    public void MutableBoolean107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean107");
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
    public void MutableBoolean108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean108");
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
    public void MutableBoolean109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean109");
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
    public void MutableBoolean110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean110");
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
    public void MutableBoolean111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean111");
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
    public void MutableBoolean112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean112");
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
    public void MutableBoolean113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean113");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        boolean boolean7 = mutableBoolean1.booleanValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean8 = null;
        // The following exception was thrown during execution in MutableBoolean generation
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
    public void MutableBoolean114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean114");
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
    public void MutableBoolean115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean115");
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
    public void MutableBoolean116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean116");
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
    public void MutableBoolean117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean117");
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
    public void MutableBoolean118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean118");
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
    public void MutableBoolean119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean119");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean0.equals((java.lang.Object) (byte) 1);
        java.lang.Boolean boolean3 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
    }

    @Test
    public void MutableBoolean120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean120");
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
    public void MutableBoolean121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean121");
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
    public void MutableBoolean122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean122");
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
    public void MutableBoolean123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean123");
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
    public void MutableBoolean124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean124");
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
    public void MutableBoolean125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean125");
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
    public void MutableBoolean126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean126");
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
    public void MutableBoolean127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean127");
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
    public void MutableBoolean128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean128");
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
    public void MutableBoolean129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean129");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        mutableBoolean0.setValue(false);
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
    }

    @Test
    public void MutableBoolean130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean130");
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
    public void MutableBoolean131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean131");
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
    public void MutableBoolean132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean132");
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
    public void MutableBoolean133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean133");
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
    public void MutableBoolean134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean134");
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
    public void MutableBoolean135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean135");
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
    public void MutableBoolean136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean136");
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
    public void MutableBoolean137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean137");
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
    public void MutableBoolean138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean138");
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
    public void MutableBoolean139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean139");
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
    public void MutableBoolean140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean140");
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
    public void MutableBoolean141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean141");
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
    public void MutableBoolean142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean142");
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
    public void MutableBoolean143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean143");
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
    public void MutableBoolean144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean144");
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
    public void MutableBoolean145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean145");
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
    public void MutableBoolean146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean146");
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
    public void MutableBoolean147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean147");
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
    public void MutableBoolean148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean148");
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
    public void MutableBoolean149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean149");
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
    public void MutableBoolean150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean150");
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
    public void MutableBoolean151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean151");
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
    public void MutableBoolean152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean152");
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
    public void MutableBoolean153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean153");
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
    public void MutableBoolean154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean154");
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
    public void MutableBoolean155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean155");
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
    public void MutableBoolean156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean156");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void MutableBoolean157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean157");
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
    public void MutableBoolean158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean158");
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
    public void MutableBoolean159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean159");
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
    public void MutableBoolean160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean160");
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
    public void MutableBoolean161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean161");
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
    public void MutableBoolean162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean162");
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
    public void MutableBoolean163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean163");
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
    public void MutableBoolean164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean164");
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
    public void MutableBoolean165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean165");
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
    public void MutableBoolean166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean166");
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
    public void MutableBoolean167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean167");
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
    public void MutableBoolean168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean168");
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
    public void MutableBoolean169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean169");
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
    public void MutableBoolean170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean170");
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
    public void MutableBoolean171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean171");
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
    public void MutableBoolean172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean172");
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
    public void MutableBoolean173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean173");
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
    public void MutableBoolean174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean174");
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
    public void MutableBoolean175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean175");
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
    public void MutableBoolean176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean176");
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
    public void MutableBoolean177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean177");
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
    public void MutableBoolean178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean178");
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
    public void MutableBoolean179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean179");
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
    public void MutableBoolean180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean180");
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
    public void MutableBoolean181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean181");
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
    public void MutableBoolean182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean182");
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
    public void MutableBoolean183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean183");
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
    public void MutableBoolean184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean184");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.isFalse();
        boolean boolean6 = mutableBoolean0.isTrue();
        boolean boolean7 = mutableBoolean0.booleanValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean8 = null;
        // The following exception was thrown during execution in MutableBoolean generation
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
    public void MutableBoolean185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean185");
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
    public void MutableBoolean186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean186");
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
    public void MutableBoolean187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean187");
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
    public void MutableBoolean188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean188");
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
    public void MutableBoolean189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean189");
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
    public void MutableBoolean190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean190");
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
    public void MutableBoolean191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean191");
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
    public void MutableBoolean192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean192");
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
    public void MutableBoolean193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean193");
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
    public void MutableBoolean194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean194");
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
    public void MutableBoolean195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean195");
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
    public void MutableBoolean196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean196");
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
    public void MutableBoolean197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean197");
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
    public void MutableBoolean198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean198");
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
    public void MutableBoolean199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean199");
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
    public void MutableBoolean200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean200");
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
    public void MutableBoolean201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean201");
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
    public void MutableBoolean202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean202");
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
    public void MutableBoolean203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean203");
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
    public void MutableBoolean204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean204");
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
    public void MutableBoolean205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean205");
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
    public void MutableBoolean206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean206");
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
    public void MutableBoolean207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean207");
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
    public void MutableBoolean208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean208");
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
    public void MutableBoolean209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean209");
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
    public void MutableBoolean210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean210");
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
    public void MutableBoolean211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean211");
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
    public void MutableBoolean212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean212");
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
    public void MutableBoolean213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean213");
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
    public void MutableBoolean214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean214");
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
    public void MutableBoolean215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean215");
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
    public void MutableBoolean216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean216");
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
    public void MutableBoolean217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean217");
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
    public void MutableBoolean218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean218");
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
    public void MutableBoolean219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean219");
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
    public void MutableBoolean220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean220");
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
    public void MutableBoolean221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean221");
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
    public void MutableBoolean222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean222");
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
    public void MutableBoolean223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean223");
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
    public void MutableBoolean224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean224");
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
    public void MutableBoolean225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean225");
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
    public void MutableBoolean226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean226");
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
    public void MutableBoolean227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean227");
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
    public void MutableBoolean228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean228");
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
    public void MutableBoolean229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean229");
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
    public void MutableBoolean230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean230");
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
    public void MutableBoolean231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean231");
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
    public void MutableBoolean232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean232");
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
    public void MutableBoolean233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean233");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void MutableBoolean234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean234");
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
    public void MutableBoolean235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean235");
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
    public void MutableBoolean236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean236");
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
    public void MutableBoolean237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean237");
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
    public void MutableBoolean238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean238");
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
    public void MutableBoolean239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean239");
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
    public void MutableBoolean240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean240");
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
    public void MutableBoolean241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean241");
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
    public void MutableBoolean242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean242");
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
    public void MutableBoolean243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean243");
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
    public void MutableBoolean244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean244");
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
    public void MutableBoolean245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean245");
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
    public void MutableBoolean246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean246");
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
    public void MutableBoolean247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean247");
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
    public void MutableBoolean248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean248");
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
    public void MutableBoolean249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean249");
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
    public void MutableBoolean250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean250");
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
    public void MutableBoolean251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean251");
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
    public void MutableBoolean252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean252");
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
    public void MutableBoolean253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean253");
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
    public void MutableBoolean254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean254");
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
    public void MutableBoolean255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean255");
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
    public void MutableBoolean256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean256");
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
    public void MutableBoolean257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean257");
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
    public void MutableBoolean258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean258");
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
    public void MutableBoolean259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean259");
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
    public void MutableBoolean260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean260");
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
    public void MutableBoolean261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean261");
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
    public void MutableBoolean262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean262");
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
    public void MutableBoolean263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean263");
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
    public void MutableBoolean264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean264");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        boolean boolean2 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void MutableBoolean265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean265");
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
    public void MutableBoolean266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean266");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        mutableBoolean0.setValue(false);
        mutableBoolean0.setValue(false);
        boolean boolean5 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void MutableBoolean267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean267");
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
    public void MutableBoolean268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean268");
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
    public void MutableBoolean269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean269");
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
    public void MutableBoolean270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean270");
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
    public void MutableBoolean271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean271");
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
    public void MutableBoolean272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean272");
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
    public void MutableBoolean273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean273");
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
    public void MutableBoolean274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean274");
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
    public void MutableBoolean275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean275");
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
    public void MutableBoolean276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean276");
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
    public void MutableBoolean277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean277");
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
    public void MutableBoolean278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean278");
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
    public void MutableBoolean279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean279");
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
    public void MutableBoolean280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean280");
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
    public void MutableBoolean281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean281");
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
    public void MutableBoolean282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean282");
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
    public void MutableBoolean283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean283");
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
    public void MutableBoolean284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean284");
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
    public void MutableBoolean285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean285");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
    }

    @Test
    public void MutableBoolean286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean286");
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
    public void MutableBoolean287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean287");
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
    public void MutableBoolean288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean288");
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
    public void MutableBoolean289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean289");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        java.lang.Class<?> wildcardClass3 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableBoolean290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean290");
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
    public void MutableBoolean291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean291");
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
    public void MutableBoolean292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean292");
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
    public void MutableBoolean293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean293");
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
    public void MutableBoolean294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean294");
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
    public void MutableBoolean295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean295");
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
    public void MutableBoolean296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean296");
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
    public void MutableBoolean297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean297");
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
    public void MutableBoolean298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean298");
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
    public void MutableBoolean299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean299");
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
    public void MutableBoolean300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean300");
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
    public void MutableBoolean301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean301");
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
    public void MutableBoolean302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean302");
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
    public void MutableBoolean303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean303");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isFalse();
        boolean boolean3 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void MutableBoolean304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean304");
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
    public void MutableBoolean305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean305");
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
    public void MutableBoolean306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean306");
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
    public void MutableBoolean307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean307");
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
    public void MutableBoolean308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean308");
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
    public void MutableBoolean309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean309");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean7 = null;
        // The following exception was thrown during execution in MutableBoolean generation
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
    public void MutableBoolean310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean310");
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
    public void MutableBoolean311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean311");
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
    public void MutableBoolean312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean312");
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
    public void MutableBoolean313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean313");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        java.lang.String str2 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "true" + "'", str2.equals("true"));
    }

    @Test
    public void MutableBoolean314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean314");
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
    public void MutableBoolean315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean315");
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
    public void MutableBoolean316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean316");
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
    public void MutableBoolean317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean317");
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
    public void MutableBoolean318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean318");
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
    public void MutableBoolean319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean319");
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
    public void MutableBoolean320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean320");
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
    public void MutableBoolean321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean321");
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
    public void MutableBoolean322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean322");
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
    public void MutableBoolean323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean323");
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
    public void MutableBoolean324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean324");
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
    public void MutableBoolean325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean325");
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
    public void MutableBoolean326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean326");
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
    public void MutableBoolean327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean327");
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
    public void MutableBoolean328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean328");
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
    public void MutableBoolean329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean329");
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
    public void MutableBoolean330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean330");
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
    public void MutableBoolean331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean331");
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
    public void MutableBoolean332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean332");
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
    public void MutableBoolean333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean333");
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
    public void MutableBoolean334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean334");
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
    public void MutableBoolean335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean335");
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
    public void MutableBoolean336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean336");
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
    public void MutableBoolean337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean337");
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
    public void MutableBoolean338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean338");
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
    public void MutableBoolean339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean339");
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
    public void MutableBoolean340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean340");
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
    public void MutableBoolean341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean341");
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
    public void MutableBoolean342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean342");
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
    public void MutableBoolean343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean343");
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
    public void MutableBoolean344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean344");
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
    public void MutableBoolean345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean345");
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
    public void MutableBoolean346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean346");
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
    public void MutableBoolean347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean347");
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
    public void MutableBoolean348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean348");
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
    public void MutableBoolean349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean349");
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
    public void MutableBoolean350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean350");
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
    public void MutableBoolean351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean351");
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
    public void MutableBoolean352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean352");
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
    public void MutableBoolean353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean353");
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
    public void MutableBoolean354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean354");
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
    public void MutableBoolean355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean355");
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
    public void MutableBoolean356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean356");
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
    public void MutableBoolean357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean357");
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
    public void MutableBoolean358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean358");
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
    public void MutableBoolean359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean359");
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
    public void MutableBoolean360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean360");
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
    public void MutableBoolean361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean361");
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
    public void MutableBoolean362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean362");
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
    public void MutableBoolean363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean363");
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
    public void MutableBoolean364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean364");
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
    public void MutableBoolean365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean365");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean5 = null;
        // The following exception was thrown during execution in MutableBoolean generation
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
    public void MutableBoolean366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean366");
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
    public void MutableBoolean367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean367");
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
    public void MutableBoolean368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean368");
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
    public void MutableBoolean369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean369");
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
    public void MutableBoolean370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean370");
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
    public void MutableBoolean371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean371");
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
    public void MutableBoolean372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean372");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableBoolean373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean373");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void MutableBoolean374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean374");
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
    public void MutableBoolean375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean375");
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
    public void MutableBoolean376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean376");
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
    public void MutableBoolean377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean377");
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
    public void MutableBoolean378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean378");
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
    public void MutableBoolean379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean379");
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
    public void MutableBoolean380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean380");
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
    public void MutableBoolean381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean381");
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
    public void MutableBoolean382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean382");
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
    public void MutableBoolean383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean383");
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
    public void MutableBoolean384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean384");
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
    public void MutableBoolean385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean385");
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
    public void MutableBoolean386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean386");
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
    public void MutableBoolean387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean387");
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
    public void MutableBoolean388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean388");
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
    public void MutableBoolean389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean389");
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
    public void MutableBoolean390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean390");
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
    public void MutableBoolean391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean391");
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
    public void MutableBoolean392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean392");
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
    public void MutableBoolean393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean393");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        mutableBoolean1.setValue(false);
        mutableBoolean1.setValue(true);
    }

    @Test
    public void MutableBoolean394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean394");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        java.lang.Boolean boolean2 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        mutableBoolean1.setValue(true);
        mutableBoolean1.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
    }

    @Test
    public void MutableBoolean395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean395");
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
    public void MutableBoolean396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean396");
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
    public void MutableBoolean397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean397");
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
    public void MutableBoolean398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean398");
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
    public void MutableBoolean399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean399");
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
    public void MutableBoolean400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean400");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void MutableBoolean401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean401");
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
    public void MutableBoolean402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean402");
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
    public void MutableBoolean403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean403");
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
    public void MutableBoolean404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean404");
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
    public void MutableBoolean405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean405");
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
    public void MutableBoolean406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean406");
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
    public void MutableBoolean407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean407");
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
    public void MutableBoolean408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean408");
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
    public void MutableBoolean409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean409");
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
    public void MutableBoolean410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean410");
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
    public void MutableBoolean411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean411");
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
    public void MutableBoolean412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean412");
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
    public void MutableBoolean413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean413");
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
    public void MutableBoolean414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean414");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        mutableBoolean0.setValue(true);
        mutableBoolean0.setValue(true);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean8 = null;
        // The following exception was thrown during execution in MutableBoolean generation
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
    public void MutableBoolean415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean415");
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
    public void MutableBoolean416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean416");
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
    public void MutableBoolean417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean417");
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
    public void MutableBoolean418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean418");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.String str2 = mutableBoolean1.toString();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
    }

    @Test
    public void MutableBoolean419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean419");
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
    public void MutableBoolean420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean420");
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
    public void MutableBoolean421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean421");
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
    public void MutableBoolean422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean422");
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
    public void MutableBoolean423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean423");
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
    public void MutableBoolean424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean424");
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
    public void MutableBoolean425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean425");
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
    public void MutableBoolean426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean426");
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
    public void MutableBoolean427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean427");
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
    public void MutableBoolean428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean428");
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
    public void MutableBoolean429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean429");
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
    public void MutableBoolean430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean430");
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
    public void MutableBoolean431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean431");
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
    public void MutableBoolean432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean432");
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
    public void MutableBoolean433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean433");
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
    public void MutableBoolean434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean434");
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
    public void MutableBoolean435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean435");
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
    public void MutableBoolean436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean436");
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
    public void MutableBoolean437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean437");
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
    public void MutableBoolean438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean438");
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
    public void MutableBoolean439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean439");
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
    public void MutableBoolean440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean440");
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
    public void MutableBoolean441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean441");
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
    public void MutableBoolean442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean442");
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
    public void MutableBoolean443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean443");
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
    public void MutableBoolean444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean444");
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
    public void MutableBoolean445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean445");
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
    public void MutableBoolean446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean446");
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
    public void MutableBoolean447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean447");
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
    public void MutableBoolean448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean448");
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
    public void MutableBoolean449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean449");
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
    public void MutableBoolean450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean450");
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
    public void MutableBoolean451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean451");
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
    public void MutableBoolean452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean452");
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
    public void MutableBoolean453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean453");
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
    public void MutableBoolean454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean454");
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
    public void MutableBoolean455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean455");
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
    public void MutableBoolean456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean456");
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
    public void MutableBoolean457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean457");
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
    public void MutableBoolean458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean458");
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
    public void MutableBoolean459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean459");
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
    public void MutableBoolean460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean460");
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
    public void MutableBoolean461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean461");
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
    public void MutableBoolean462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean462");
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
    public void MutableBoolean463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean463");
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
    public void MutableBoolean464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean464");
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
    public void MutableBoolean465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean465");
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
    public void MutableBoolean466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean466");
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
    public void MutableBoolean467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean467");
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
    public void MutableBoolean468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean468");
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
    public void MutableBoolean469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean469");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        java.lang.Boolean boolean3 = mutableBoolean1.getValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean4 = null;
        // The following exception was thrown during execution in MutableBoolean generation
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
    public void MutableBoolean470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean470");
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
    public void MutableBoolean471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean471");
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
    public void MutableBoolean472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean472");
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
    public void MutableBoolean473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean473");
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
    public void MutableBoolean474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean474");
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
    public void MutableBoolean475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean475");
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
    public void MutableBoolean476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean476");
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
    public void MutableBoolean477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean477");
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
    public void MutableBoolean478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean478");
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
    public void MutableBoolean479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean479");
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
    public void MutableBoolean480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean480");
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
    public void MutableBoolean481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean481");
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
    public void MutableBoolean482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean482");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        mutableBoolean1.setValue(false);
        boolean boolean6 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void MutableBoolean483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean483");
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
    public void MutableBoolean484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean484");
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
    public void MutableBoolean485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean485");
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
    public void MutableBoolean486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean486");
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
    public void MutableBoolean487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean487");
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
    public void MutableBoolean488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean488");
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
    public void MutableBoolean489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean489");
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
    public void MutableBoolean490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean490");
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
    public void MutableBoolean491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean491");
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
    public void MutableBoolean492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean492");
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
    public void MutableBoolean493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean493");
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
    public void MutableBoolean494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean494");
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
    public void MutableBoolean495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean495");
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
    public void MutableBoolean496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean496");
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
    public void MutableBoolean497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean497");
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
    public void MutableBoolean498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean498");
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
    public void MutableBoolean499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean499");
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
    public void MutableBoolean500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean0.MutableBoolean500");
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

