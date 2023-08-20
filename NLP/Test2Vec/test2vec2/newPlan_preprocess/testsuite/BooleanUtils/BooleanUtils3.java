package BooleanUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BooleanUtils3 {

    public static boolean debug = false;

    @Test
    public void BooleanUtils1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils3.BooleanUtils1501");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) 'a', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils3.BooleanUtils1502");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("hi!", "false", "", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils3.BooleanUtils1503");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean9 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
    public void BooleanUtils1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils3.BooleanUtils1504");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "false", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "off" + "'", str3.equals("off"));
    }

    @Test
    public void BooleanUtils1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils3.BooleanUtils1505");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 52, (java.lang.Integer) 35, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils3.BooleanUtils1506");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Class<?> wildcardClass8 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

