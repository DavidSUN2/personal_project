
package MutableBoolean;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableBoolean1 {

    public static boolean debug = false;

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test501");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test502");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test503");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test504");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isFalse();
        java.lang.String str3 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test505");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test506");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test507");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test508");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test509");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test510");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test511");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test512");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test513");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test514");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test515");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test516");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test517");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test518");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test519");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test520");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test521");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test522");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test523");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test524");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test525");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test526");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test527");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test528");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        boolean boolean2 = mutableBoolean1.isFalse();
        mutableBoolean1.setValue(false);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test529");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test530");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test531");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test532");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test533");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test534");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test535");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test536");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test537");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test538");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test539");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test540");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test541");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test542");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test543");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test544");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test545");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test546");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test547");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test548");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test549");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test550");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test551");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test552");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test553");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test554");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test555");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test556");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test557");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test558");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test559");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test560");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test561");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test562");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test563");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test564");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test565");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test566");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test567");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test568");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test569");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test570");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test571");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test572");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test573");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test574");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test575");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test576");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test577");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test578");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test579");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test580");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test581");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test582");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test583");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test584");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test585");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test586");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test587");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test588");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test589");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test590");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test591");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test592");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test593");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test594");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test595");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test596");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test597");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test598");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test599");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test600");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test601");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test602");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test603");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test604");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test605");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test606");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test607");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test608");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test609");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test610");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test611");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test612");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test613");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test614");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test615");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test616");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test617");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test618");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test619");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test620");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test621");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test622");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test623");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test624");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test625");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test626");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test627");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test628");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test629");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test630");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test631");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test632");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test633");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test634");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test635");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test636");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test637");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test638");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test639");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean0 = new org.apache.commons.lang3.mutable.MutableBoolean();
        java.lang.String str1 = mutableBoolean0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "false" + "'", str1.equals("false"));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test640");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test641");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test642");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test643");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test644");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test645");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test646");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test647");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test648");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test649");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test650");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test651");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test652");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test653");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test654");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test655");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test656");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test657");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test658");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test659");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test660");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test661");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test662");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test663");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test664");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test665");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test666");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test667");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test668");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean(true);
        mutableBoolean1.setValue((java.lang.Boolean) false);
        java.lang.Boolean boolean4 = mutableBoolean1.getValue();
        mutableBoolean1.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test669");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        boolean boolean2 = mutableBoolean1.isFalse();
        mutableBoolean1.setValue(false);
        mutableBoolean1.setValue(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test670");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test671");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test672");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test673");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test674");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test675");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test676");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test677");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test678");
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
    public void MutableBoolean() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableBoolean1.test679");
        org.apache.commons.lang3.mutable.MutableBoolean mutableBoolean1 = new org.apache.commons.lang3.mutable.MutableBoolean((java.lang.Boolean) true);
        java.lang.String str2 = mutableBoolean1.toString();
        java.lang.String str3 = mutableBoolean1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "true" + "'", str2.equals("true"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
    }
}

