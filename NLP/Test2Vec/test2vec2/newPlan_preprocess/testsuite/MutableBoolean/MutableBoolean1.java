package MutableBoolean;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableBoolean1 {

    public static boolean debug = false;

    @Test
    public void MutableBoolean501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean501");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        boolean boolean5 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        boolean boolean7 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean502");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableBoolean503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean503");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        boolean boolean7 = mutableBoolean1.isTrue();
        mutableBoolean1.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableBoolean504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean504");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isFalse();
        java.lang.String str3 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
    }

    @Test
    public void MutableBoolean505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean505");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean4 = mutableBoolean0.getValue();
        boolean boolean5 = mutableBoolean0.booleanValue();
        java.lang.String str6 = mutableBoolean0.toString();
        mutableBoolean0.setValue((java.lang.Boolean) true);
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
    }

    @Test
    public void MutableBoolean506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean506");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) 10.0f);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean507");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isTrue();
        java.lang.String str3 = mutableBoolean1.toString();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean5 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean5.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean8 = mutableBoolean5.getValue();
        boolean boolean9 = mutableBoolean1.equals((java.lang.Object) mutableBoolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean508");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.String str5 = mutableBoolean0.toString();
        boolean boolean6 = mutableBoolean0.isFalse();
        java.lang.Class<?> wildcardClass7 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean509");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        java.lang.Boolean boolean1 = mutableBoolean0.toBoolean();
        boolean boolean2 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
    }

    @Test
    public void MutableBoolean510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean510");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue(true);
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
    public void MutableBoolean511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean511");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue(false);
        java.lang.String str6 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
    }

    @Test
    public void MutableBoolean512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean512");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        boolean boolean4 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean5 = mutableBoolean0.getValue();
        boolean boolean6 = mutableBoolean0.isFalse();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void MutableBoolean513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean513");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.String str5 = mutableBoolean1.toString();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass8 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean514");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean2.isFalse();
        boolean boolean7 = mutableBoolean2.isFalse();
        mutableBoolean2.setValue(true);
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
    public void MutableBoolean515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean515");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        java.lang.Boolean boolean7 = mutableBoolean1.toBoolean();
        java.lang.Class<?> wildcardClass8 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean516");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        java.lang.Boolean boolean7 = mutableBoolean0.getValue();
        boolean boolean8 = mutableBoolean0.isFalse();
        java.lang.String str9 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void MutableBoolean517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean517");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean3 = mutableBoolean0.getValue();
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void MutableBoolean518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean518");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) (byte) -1);
        java.lang.String str7 = mutableBoolean1.toString();
        java.lang.String str8 = mutableBoolean1.toString();
        boolean boolean9 = mutableBoolean1.booleanValue();
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
    public void MutableBoolean519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean519");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.isFalse();
        boolean boolean6 = mutableBoolean0.isTrue();
        boolean boolean7 = mutableBoolean0.isTrue();
        boolean boolean8 = mutableBoolean0.booleanValue();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean520");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.booleanValue();
        boolean boolean4 = mutableBoolean0.isTrue();
        boolean boolean5 = mutableBoolean0.booleanValue();
        java.lang.String str6 = mutableBoolean0.toString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
    }

    @Test
    public void MutableBoolean521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean521");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        mutableBoolean0.setValue(false);
        java.lang.Boolean boolean9 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean522");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue(false);
        java.lang.String str7 = mutableBoolean1.toString();
        java.lang.Boolean boolean8 = mutableBoolean1.toBoolean();
        boolean boolean9 = mutableBoolean1.isTrue();
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
    public void MutableBoolean523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean523");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        boolean boolean5 = mutableBoolean0.booleanValue();
        java.lang.Class<?> wildcardClass6 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean524");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isTrue();
        boolean boolean3 = mutableBoolean0.isTrue();
        java.lang.String str4 = mutableBoolean0.toString();
        boolean boolean5 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableBoolean525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean525");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.String str2 = mutableBoolean0.toString();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean4 = mutableBoolean0.getValue();
        boolean boolean5 = mutableBoolean0.isFalse();
        java.lang.Class<?> wildcardClass6 = mutableBoolean0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean526");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean3 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
    }

    @Test
    public void MutableBoolean527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean527");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isTrue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean6 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean7 = mutableBoolean6.isTrue();
        java.lang.String str8 = mutableBoolean6.toString();
        int int9 = mutableBoolean1.compareTo(mutableBoolean6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableBoolean528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean528");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean2 = mutableBoolean1.isFalse();
        mutableBoolean1.setValue(false);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableBoolean529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean529");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        mutableBoolean0.setValue(false);
        java.lang.Boolean boolean3 = mutableBoolean0.getValue();
        boolean boolean4 = mutableBoolean0.booleanValue();
        boolean boolean5 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue(false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableBoolean530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean530");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isFalse();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean4 = mutableBoolean3.booleanValue();
        java.lang.Boolean boolean5 = mutableBoolean3.toBoolean();
        mutableBoolean3.setValue(false);
        int int8 = mutableBoolean1.compareTo(mutableBoolean3);
        boolean boolean9 = mutableBoolean3.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean531");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        boolean boolean7 = mutableBoolean1.isFalse();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean532");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.isTrue();
        java.lang.String str4 = mutableBoolean2.toString();
        boolean boolean5 = mutableBoolean2.isTrue();
        java.lang.String str6 = mutableBoolean2.toString();
        java.lang.Class<?> wildcardClass7 = mutableBoolean2.getClass();
        boolean boolean8 = mutableBoolean1.equals((java.lang.Object) wildcardClass7);
        boolean boolean9 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean533");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.String str5 = mutableBoolean0.toString();
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        boolean boolean7 = mutableBoolean0.isFalse();
        boolean boolean8 = mutableBoolean0.isFalse();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean534");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean4 = mutableBoolean3.booleanValue();
        int int5 = mutableBoolean1.compareTo(mutableBoolean3);
        java.lang.Boolean boolean6 = mutableBoolean3.getValue();
        java.lang.Boolean boolean7 = mutableBoolean3.toBoolean();
        mutableBoolean3.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
    }

    @Test
    public void MutableBoolean535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean535");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        boolean boolean5 = mutableBoolean0.booleanValue();
        boolean boolean6 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean536");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        boolean boolean4 = mutableBoolean0.booleanValue();
        boolean boolean5 = mutableBoolean0.isTrue();
        java.lang.String str6 = mutableBoolean0.toString();
        java.lang.String str7 = mutableBoolean0.toString();
        mutableBoolean0.setValue(false);
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
    }

    @Test
    public void MutableBoolean537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean537");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Class<?> wildcardClass3 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableBoolean538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean538");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        boolean boolean4 = mutableBoolean0.booleanValue();
        boolean boolean5 = mutableBoolean0.isTrue();
        java.lang.String str6 = mutableBoolean0.toString();
        boolean boolean7 = mutableBoolean0.booleanValue();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean539");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        boolean boolean5 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean6 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
    }

    @Test
    public void MutableBoolean540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean540");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        java.lang.Boolean boolean3 = mutableBoolean0.getValue();
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        boolean boolean5 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        mutableBoolean0.setValue(true);
        boolean boolean9 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean541");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        boolean boolean5 = mutableBoolean1.booleanValue();
        java.lang.Class<?> wildcardClass6 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean542");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isTrue();
        boolean boolean5 = mutableBoolean0.booleanValue();
        boolean boolean6 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean543");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean7 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean544");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableBoolean0.equals(obj4);
        boolean boolean6 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean545");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Boolean boolean8 = mutableBoolean0.getValue();
        java.lang.Boolean boolean9 = mutableBoolean0.toBoolean();
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
    public void MutableBoolean546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean546");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        java.lang.Boolean boolean2 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean5 = mutableBoolean1.isTrue();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        boolean boolean9 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean547");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        boolean boolean5 = mutableBoolean1.isTrue();
        boolean boolean6 = mutableBoolean1.isTrue();
        boolean boolean7 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean8 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void MutableBoolean548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean548");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean2 = mutableBoolean1.booleanValue();
        boolean boolean3 = mutableBoolean1.isTrue();
        boolean boolean4 = mutableBoolean1.isTrue();
        boolean boolean5 = mutableBoolean1.isTrue();
        mutableBoolean1.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void MutableBoolean549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean549");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isFalse();
        boolean boolean3 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.String str6 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "true" + "'", str6.equals("true"));
    }

    @Test
    public void MutableBoolean550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean550");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        java.lang.String str6 = mutableBoolean2.toString();
        boolean boolean7 = mutableBoolean2.isTrue();
        java.lang.Boolean boolean8 = mutableBoolean2.toBoolean();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean551");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        java.lang.String str2 = mutableBoolean1.toString();
        boolean boolean3 = mutableBoolean1.isFalse();
        java.lang.String str4 = mutableBoolean1.toString();
        java.lang.Class<?> wildcardClass5 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "true" + "'", str2.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableBoolean552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean552");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean0.booleanValue();
        mutableBoolean0.setValue(true);
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
    }

    @Test
    public void MutableBoolean553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean553");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        boolean boolean6 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean9 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean554");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        boolean boolean5 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        boolean boolean7 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean555");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        boolean boolean5 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.isFalse();
        mutableBoolean1.setValue(false);
        java.lang.Boolean boolean9 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean556");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        java.lang.Boolean boolean7 = mutableBoolean0.getValue();
        boolean boolean8 = mutableBoolean0.isTrue();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean557");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean0.getValue();
        mutableBoolean0.setValue(false);
        java.lang.Boolean boolean8 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void MutableBoolean558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean558");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        boolean boolean5 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void MutableBoolean559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean559");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean2 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean3 = mutableBoolean1.getValue();
        java.lang.String str4 = mutableBoolean1.toString();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
    }

    @Test
    public void MutableBoolean560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean560");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        java.lang.String str2 = mutableBoolean1.toString();
        boolean boolean3 = mutableBoolean1.isFalse();
        boolean boolean4 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "true" + "'", str2.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableBoolean561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean561");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        java.lang.String str6 = mutableBoolean2.toString();
        boolean boolean7 = mutableBoolean2.booleanValue();
        mutableBoolean2.setValue(true);
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
    }

    @Test
    public void MutableBoolean562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean562");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        boolean boolean4 = mutableBoolean0.equals((java.lang.Object) (-1));
        java.lang.String str5 = mutableBoolean0.toString();
        mutableBoolean0.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
    }

    @Test
    public void MutableBoolean563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean563");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean7 = mutableBoolean1.getValue();
        java.lang.Boolean boolean8 = mutableBoolean1.toBoolean();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean564");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean5 = mutableBoolean0.getValue();
        mutableBoolean0.setValue(true);
        java.lang.String str8 = mutableBoolean0.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "true" + "'", str8.equals("true"));
    }

    @Test
    public void MutableBoolean565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean565");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean6 = mutableBoolean0.booleanValue();
        boolean boolean7 = mutableBoolean0.isTrue();
        java.lang.Class<?> wildcardClass8 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean566");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.String str4 = mutableBoolean1.toString();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        java.lang.String str6 = mutableBoolean1.toString();
        java.lang.Boolean boolean7 = mutableBoolean1.getValue();
        java.lang.Class<?> wildcardClass8 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean567");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean8 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean9 = mutableBoolean0.toBoolean();
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
    public void MutableBoolean568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean568");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) 10.0f);
        boolean boolean7 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
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
    public void MutableBoolean569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean569");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        java.lang.Boolean boolean7 = mutableBoolean0.getValue();
        boolean boolean8 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean570");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.String str5 = mutableBoolean0.toString();
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        boolean boolean7 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean8 = mutableBoolean0.getValue();
        java.lang.Boolean boolean9 = mutableBoolean0.toBoolean();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void MutableBoolean571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean571");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean7 = mutableBoolean1.booleanValue();
        boolean boolean8 = mutableBoolean1.isFalse();
        java.lang.String str9 = mutableBoolean1.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void MutableBoolean572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean572");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean7 = mutableBoolean0.toBoolean();
        boolean boolean8 = mutableBoolean0.isTrue();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "false" + "'", str9.equals("false"));
    }

    @Test
    public void MutableBoolean573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean573");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean7 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void MutableBoolean574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean574");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        java.lang.Boolean boolean3 = mutableBoolean0.getValue();
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        boolean boolean5 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        mutableBoolean0.setValue(true);
        boolean boolean9 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean575");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.String str2 = mutableBoolean0.toString();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean4 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass7 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean576");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        boolean boolean3 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean4 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void MutableBoolean577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean577");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        mutableBoolean0.setValue(false);
        java.lang.Boolean boolean3 = mutableBoolean0.getValue();
        boolean boolean4 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean7 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean578");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.isFalse();
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean0.getValue();
        java.lang.String str6 = mutableBoolean0.toString();
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
    }

    @Test
    public void MutableBoolean579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean579");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableBoolean0.equals(obj4);
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableBoolean580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean580");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean6 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean7 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
    }

    @Test
    public void MutableBoolean581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean581");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isTrue();
        boolean boolean5 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean6 = mutableBoolean0.toBoolean();
        boolean boolean7 = mutableBoolean0.booleanValue();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean582");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        boolean boolean5 = mutableBoolean1.booleanValue();
        java.lang.String str6 = mutableBoolean1.toString();
        mutableBoolean1.setValue((java.lang.Boolean) false);
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
    }

    @Test
    public void MutableBoolean583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean583");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.String str2 = mutableBoolean0.toString();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        boolean boolean7 = mutableBoolean0.isTrue();
        boolean boolean8 = mutableBoolean0.isFalse();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void MutableBoolean584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean584");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        boolean boolean3 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Boolean boolean6 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
    }

    @Test
    public void MutableBoolean585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean585");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean2.isTrue();
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
    }

    @Test
    public void MutableBoolean586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean586");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.booleanValue();
        boolean boolean7 = mutableBoolean1.isTrue();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean587");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableBoolean0.equals(obj4);
        mutableBoolean0.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableBoolean588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean588");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.String str4 = mutableBoolean1.toString();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        java.lang.Boolean boolean6 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
    }

    @Test
    public void MutableBoolean589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean589");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        java.lang.String str3 = mutableBoolean1.toString();
        mutableBoolean1.setValue(true);
        mutableBoolean1.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
    }

    @Test
    public void MutableBoolean590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean590");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isTrue();
        boolean boolean3 = mutableBoolean0.isTrue();
        java.lang.String str4 = mutableBoolean0.toString();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean7 = mutableBoolean0.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean591");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isTrue();
        boolean boolean5 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean6 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean7 = mutableBoolean0.toBoolean();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean592");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean6 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        int int7 = mutableBoolean1.compareTo(mutableBoolean6);
        boolean boolean8 = mutableBoolean1.booleanValue();
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
    public void MutableBoolean593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean593");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean0.isFalse();
        boolean boolean5 = mutableBoolean0.booleanValue();
        mutableBoolean0.setValue(false);
        boolean boolean8 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean594");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        java.lang.String str7 = mutableBoolean0.toString();
        mutableBoolean0.setValue(false);
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
    public void MutableBoolean595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean595");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue(true);
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
    public void MutableBoolean596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean596");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.booleanValue();
        boolean boolean7 = mutableBoolean1.isTrue();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void MutableBoolean597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean597");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue(false);
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        java.lang.String str6 = mutableBoolean1.toString();
        java.lang.Boolean boolean7 = mutableBoolean1.getValue();
        java.lang.Class<?> wildcardClass8 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean598");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(false);
        boolean boolean5 = mutableBoolean1.isFalse();
        boolean boolean6 = mutableBoolean1.booleanValue();
        boolean boolean7 = mutableBoolean1.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean599");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.String str4 = mutableBoolean1.toString();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) 0);
        boolean boolean7 = mutableBoolean1.isTrue();
        java.lang.Object obj8 = null;
        boolean boolean9 = mutableBoolean1.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean600");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean0.getValue();
        mutableBoolean0.setValue(false);
        boolean boolean8 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void MutableBoolean601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean601");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue(false);
        boolean boolean6 = mutableBoolean0.booleanValue();
        java.lang.String str7 = mutableBoolean0.toString();
        java.lang.Class<?> wildcardClass8 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableBoolean602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean602");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue(true);
        java.lang.String str5 = mutableBoolean1.toString();
        java.lang.String str6 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "true" + "'", str5.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "true" + "'", str6.equals("true"));
    }

    @Test
    public void MutableBoolean603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean603");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isTrue();
        boolean boolean5 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean6 = mutableBoolean0.toBoolean();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
    }

    @Test
    public void MutableBoolean604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean604");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        mutableBoolean1.setValue(false);
        java.lang.String str7 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
    }

    @Test
    public void MutableBoolean605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean605");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        boolean boolean7 = mutableBoolean1.isFalse();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void MutableBoolean606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean606");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        boolean boolean4 = mutableBoolean1.booleanValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean6 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        int int7 = mutableBoolean1.compareTo(mutableBoolean6);
        java.lang.Boolean boolean8 = mutableBoolean1.getValue();
        java.lang.Boolean boolean9 = mutableBoolean1.getValue();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean607");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.booleanValue();
        boolean boolean4 = mutableBoolean0.booleanValue();
        boolean boolean5 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
    }

    @Test
    public void MutableBoolean608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean608");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        boolean boolean7 = mutableBoolean1.isFalse();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean609");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean2 = mutableBoolean1.booleanValue();
        boolean boolean3 = mutableBoolean1.isTrue();
        boolean boolean4 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        boolean boolean6 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean7 = mutableBoolean1.toBoolean();
        boolean boolean8 = mutableBoolean1.isFalse();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean610");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.booleanValue();
        boolean boolean4 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean5 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
    }

    @Test
    public void MutableBoolean611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean611");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean7 = mutableBoolean0.isFalse();
        boolean boolean8 = mutableBoolean0.isFalse();
        java.lang.String str9 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "true" + "'", str9.equals("true"));
    }

    @Test
    public void MutableBoolean612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean612");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.String str4 = mutableBoolean0.toString();
        boolean boolean5 = mutableBoolean0.isFalse();
        boolean boolean6 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean613");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        boolean boolean4 = mutableBoolean0.equals((java.lang.Object) (-1));
        java.lang.String str5 = mutableBoolean0.toString();
        java.lang.String str6 = mutableBoolean0.toString();
        java.lang.Class<?> wildcardClass7 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean614");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.isFalse();
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        java.lang.String str6 = mutableBoolean0.toString();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        java.lang.Boolean boolean9 = mutableBoolean0.toBoolean();
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
    public void MutableBoolean615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean615");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        boolean boolean5 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.String str8 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
    }

    @Test
    public void MutableBoolean616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean616");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean4 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean5 = mutableBoolean4.booleanValue();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) boolean5);
        boolean boolean7 = mutableBoolean1.booleanValue();
        java.lang.String str8 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "false" + "'", str8.equals("false"));
    }

    @Test
    public void MutableBoolean617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean617");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        boolean boolean5 = mutableBoolean1.booleanValue();
        boolean boolean6 = mutableBoolean1.isTrue();
        java.lang.Object obj7 = null;
        boolean boolean8 = mutableBoolean1.equals(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean618");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean3 = mutableBoolean0.getValue();
        mutableBoolean0.setValue(false);
        boolean boolean6 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean619");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        mutableBoolean0.setValue(false);
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        java.lang.Boolean boolean4 = mutableBoolean3.toBoolean();
        mutableBoolean3.setValue((java.lang.Boolean) true);
        mutableBoolean3.setValue((java.lang.Boolean) false);
        int int9 = mutableBoolean0.compareTo(mutableBoolean3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableBoolean620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean620");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        mutableBoolean1.setValue(false);
        java.lang.Boolean boolean6 = mutableBoolean1.toBoolean();
        boolean boolean7 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableBoolean621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean621");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        java.lang.String str3 = mutableBoolean1.toString();
        boolean boolean4 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
    }

    @Test
    public void MutableBoolean622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean622");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.booleanValue();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean623");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean4 = mutableBoolean0.getValue();
        boolean boolean5 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) true);
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
    }

    @Test
    public void MutableBoolean624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean624");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        java.lang.String str7 = mutableBoolean1.toString();
        boolean boolean8 = mutableBoolean1.isFalse();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "true" + "'", str9.equals("true"));
    }

    @Test
    public void MutableBoolean625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean625");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        boolean boolean7 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean626");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean5 = mutableBoolean0.isFalse();
        boolean boolean6 = mutableBoolean0.booleanValue();
        boolean boolean7 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableBoolean627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean627");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean3 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean4 = mutableBoolean3.booleanValue();
        java.lang.Boolean boolean5 = mutableBoolean3.getValue();
        boolean boolean6 = mutableBoolean3.isFalse();
        int int7 = mutableBoolean0.compareTo(mutableBoolean3);
        java.lang.Boolean boolean8 = mutableBoolean3.toBoolean();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void MutableBoolean628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean628");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        java.lang.String str3 = mutableBoolean0.toString();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean4 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean5 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean6 = mutableBoolean5.isTrue();
        int int7 = mutableBoolean4.compareTo(mutableBoolean5);
        java.lang.Boolean boolean8 = mutableBoolean4.getValue();
        boolean boolean9 = mutableBoolean0.equals((java.lang.Object) boolean8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean629");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.String str5 = mutableBoolean0.toString();
        boolean boolean6 = mutableBoolean0.booleanValue();
        java.lang.String str7 = mutableBoolean0.toString();
        boolean boolean8 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean9 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "false" + "'", str7.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean630");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean2 = mutableBoolean1.booleanValue();
        boolean boolean3 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
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
    public void MutableBoolean631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean631");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        mutableBoolean0.setValue(true);
        boolean boolean5 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue(true);
        mutableBoolean0.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableBoolean632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean632");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.String str5 = mutableBoolean1.toString();
        java.lang.Class<?> wildcardClass6 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean633");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.String str4 = mutableBoolean1.toString();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.String str6 = mutableBoolean1.toString();
        boolean boolean7 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableBoolean634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean634");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
    }

    @Test
    public void MutableBoolean635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean635");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        java.lang.Boolean boolean1 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean6 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
    }

    @Test
    public void MutableBoolean636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean636");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean5 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        java.lang.Class<?> wildcardClass7 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean637");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        boolean boolean4 = mutableBoolean1.isFalse();
        boolean boolean5 = mutableBoolean1.booleanValue();
        java.lang.String str6 = mutableBoolean1.toString();
        mutableBoolean1.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "false" + "'", str6.equals("false"));
    }

    @Test
    public void MutableBoolean638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean638");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        java.lang.String str5 = mutableBoolean1.toString();
        boolean boolean6 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean7 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean8 = mutableBoolean1.toBoolean();
        boolean boolean9 = mutableBoolean1.isTrue();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean639");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        java.lang.String str1 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "false" + "'", str1.equals("false"));
    }

    @Test
    public void MutableBoolean640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean640");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        java.lang.Boolean boolean3 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean4 = mutableBoolean0.getValue();
        boolean boolean5 = mutableBoolean0.isFalse();
        java.lang.Class<?> wildcardClass6 = mutableBoolean0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableBoolean641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean641");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        mutableBoolean0.setValue(false);
        java.lang.Boolean boolean3 = mutableBoolean0.getValue();
        boolean boolean4 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableBoolean642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean642");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        boolean boolean6 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void MutableBoolean643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean643");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        java.lang.Boolean boolean2 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean5 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean6 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
    }

    @Test
    public void MutableBoolean644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean644");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        boolean boolean5 = mutableBoolean1.isFalse();
        boolean boolean6 = mutableBoolean1.isFalse();
        java.lang.Boolean boolean7 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void MutableBoolean645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean645");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean2 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean3 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean2.toBoolean();
        int int5 = mutableBoolean0.compareTo(mutableBoolean2);
        boolean boolean6 = mutableBoolean2.booleanValue();
        java.lang.Boolean boolean7 = mutableBoolean2.getValue();
        boolean boolean8 = mutableBoolean2.booleanValue();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean646");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        java.lang.String str4 = mutableBoolean1.toString();
        boolean boolean5 = mutableBoolean1.isFalse();
        boolean boolean6 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void MutableBoolean647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean647");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean3 = mutableBoolean1.toBoolean();
        boolean boolean4 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableBoolean648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean648");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean4 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean5 = mutableBoolean4.booleanValue();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) boolean5);
        boolean boolean7 = mutableBoolean1.booleanValue();
        mutableBoolean1.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean649");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        boolean boolean4 = mutableBoolean1.isTrue();
        java.lang.String str5 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
    }

    @Test
    public void MutableBoolean650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean650");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        java.lang.String str5 = mutableBoolean0.toString();
        boolean boolean6 = mutableBoolean0.isTrue();
        java.lang.Object obj7 = null;
        boolean boolean8 = mutableBoolean0.equals(obj7);
        java.lang.Boolean boolean9 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean651");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isTrue();
        java.lang.String str3 = mutableBoolean1.toString();
        java.lang.String str4 = mutableBoolean1.toString();
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean7 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean652");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        mutableBoolean0.setValue(true);
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        boolean boolean7 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableBoolean653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean653");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isFalse();
        boolean boolean4 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
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
    public void MutableBoolean654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean654");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.isFalse();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean5 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean6 = mutableBoolean5.booleanValue();
        boolean boolean7 = mutableBoolean5.isFalse();
        boolean boolean8 = mutableBoolean0.equals((java.lang.Object) boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean655");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        java.lang.String str2 = mutableBoolean0.toString();
        java.lang.Boolean boolean3 = mutableBoolean0.getValue();
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        boolean boolean5 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue(false);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void MutableBoolean656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean656");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        boolean boolean6 = mutableBoolean0.booleanValue();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean657");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        boolean boolean4 = mutableBoolean0.isFalse();
        java.lang.Boolean boolean5 = mutableBoolean0.getValue();
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
    }

    @Test
    public void MutableBoolean658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean658");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) false);
        boolean boolean2 = mutableBoolean1.booleanValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.String str4 = mutableBoolean1.toString();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        boolean boolean6 = mutableBoolean1.booleanValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableBoolean659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean659");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        boolean boolean7 = mutableBoolean1.isTrue();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean660");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isTrue();
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        java.lang.String str6 = mutableBoolean0.toString();
        boolean boolean7 = mutableBoolean0.isFalse();
        mutableBoolean0.setValue(false);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void MutableBoolean661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean661");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isTrue();
        java.lang.String str3 = mutableBoolean1.toString();
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void MutableBoolean662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean662");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean0.isTrue();
        boolean boolean5 = mutableBoolean0.isTrue();
        mutableBoolean0.setValue((java.lang.Boolean) true);
        boolean boolean8 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void MutableBoolean663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean663");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        mutableBoolean0.setValue(true);
        java.lang.Boolean boolean6 = mutableBoolean0.getValue();
        boolean boolean7 = mutableBoolean0.isFalse();
        boolean boolean8 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void MutableBoolean664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean664");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        mutableBoolean1.setValue((java.lang.Boolean) true);
        boolean boolean4 = mutableBoolean1.isTrue();
        java.lang.Boolean boolean5 = mutableBoolean1.getValue();
        java.lang.Boolean boolean6 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
    }

    @Test
    public void MutableBoolean665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean665");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        boolean boolean3 = mutableBoolean0.booleanValue();
        boolean boolean4 = mutableBoolean0.isTrue();
        java.lang.String str5 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "false" + "'", str5.equals("false"));
    }

    @Test
    public void MutableBoolean666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean666");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.toBoolean();
        boolean boolean4 = mutableBoolean0.equals((java.lang.Object) (-1));
        java.lang.Boolean boolean5 = mutableBoolean0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
    }

    @Test
    public void MutableBoolean667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean667");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.String str4 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
    }

    @Test
    public void MutableBoolean668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean668");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void MutableBoolean669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean669");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isFalse();
        mutableBoolean1.setValue(false);
        mutableBoolean1.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableBoolean670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean670");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        boolean boolean2 = mutableBoolean0.isFalse();
        boolean boolean3 = mutableBoolean0.isFalse();
        java.lang.String str4 = mutableBoolean0.toString();
        java.lang.Boolean boolean5 = mutableBoolean0.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
    }

    @Test
    public void MutableBoolean671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean671");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean1 = mutableBoolean0.booleanValue();
        java.lang.Boolean boolean2 = mutableBoolean0.getValue();
        mutableBoolean0.setValue((java.lang.Boolean) false);
        mutableBoolean0.setValue(false);
        boolean boolean7 = mutableBoolean0.booleanValue();
        boolean boolean8 = mutableBoolean0.isTrue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableBoolean672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean672");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean6 = mutableBoolean1.getValue();
        java.lang.Boolean boolean7 = mutableBoolean1.toBoolean();
        boolean boolean8 = mutableBoolean1.booleanValue();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void MutableBoolean673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean673");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isTrue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        boolean boolean5 = mutableBoolean1.isTrue();
        java.lang.String str6 = mutableBoolean1.toString();
        java.lang.Boolean boolean7 = mutableBoolean1.toBoolean();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "true" + "'", str6.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
    }

    @Test
    public void MutableBoolean674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean674");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        mutableBoolean0.setValue(false);
        mutableBoolean0.setValue(false);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableBoolean0.equals(obj5);
        mutableBoolean0.setValue((java.lang.Boolean) false);
        boolean boolean9 = mutableBoolean0.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableBoolean675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean675");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        boolean boolean3 = mutableBoolean1.booleanValue();
        java.lang.Boolean boolean4 = mutableBoolean1.toBoolean();
        boolean boolean6 = mutableBoolean1.equals((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass7 = mutableBoolean1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableBoolean676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean676");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(false);
        java.lang.Boolean boolean2 = mutableBoolean1.getValue();
        java.lang.Boolean boolean3 = mutableBoolean1.toBoolean();
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue((java.lang.Boolean) false);
        mutableBoolean1.setValue(true);
        boolean boolean9 = mutableBoolean1.isFalse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableBoolean677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean677");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        java.lang.Boolean boolean5 = mutableBoolean1.toBoolean();
        mutableBoolean1.setValue(false);
        mutableBoolean1.setValue((java.lang.Boolean) true);
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
    public void MutableBoolean678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean678");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean();
        boolean boolean2 = mutableBoolean1.isTrue();
        int int3 = mutableBoolean0.compareTo(mutableBoolean1);
        java.lang.Boolean boolean4 = mutableBoolean0.toBoolean();
        java.lang.Boolean boolean5 = mutableBoolean0.getValue();
        mutableBoolean0.setValue(true);
        java.lang.Boolean boolean8 = mutableBoolean0.toBoolean();
        java.lang.Class<?> wildcardClass9 = mutableBoolean0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableBoolean679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.MutableBoolean679");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        java.lang.String str2 = mutableBoolean1.toString();
        java.lang.String str3 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "true" + "'", str2.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
    }
}

