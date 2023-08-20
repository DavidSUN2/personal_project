
package BooleanUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BooleanUtils0 {

    public static boolean debug = false;

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test01");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test02");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test03");
        java.lang.Integer int1 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1.equals(0));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test04");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test05");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test06");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test07");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringYesNo((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "no" + "'", str1.equals("no"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test08");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("no", "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test09");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test10");
        java.lang.Boolean[] booleanArray0 = new java.lang.Boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray0);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test11");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test12");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) 'a', (int) (short) 100, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test13");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringOnOff(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "off" + "'", str1.equals("off"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test14");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test15");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "no", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test16");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.negate((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test17");
        org.apache.commons.lang3.BooleanUtils booleanUtils0 = new org.apache.commons.lang3.BooleanUtils();
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test18");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isNotTrue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test19");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringOnOff(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "on" + "'", str1.equals("on"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test20");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isTrue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test21");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test22");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) ' ', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test23");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 0, 0, (int) (byte) -1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test24");
        boolean[] booleanArray4 = new boolean[] { true, false, false, true };
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Class<?> wildcardClass8 = booleanArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test25");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, false, true, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test26");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isFalse((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test27");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringTrueFalse((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "false" + "'", str1.equals("false"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test28");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test29");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringYesNo((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "yes" + "'", str1.equals("yes"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test30");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 10, (int) (short) 100, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test31");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test32");
        int int1 = org.apache.commons.lang3.BooleanUtils.toInteger(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test33");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test34");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "on", "yes", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test35");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 100, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test36");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "yes", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "yes" + "'", str3.equals("yes"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test37");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.negate((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test38");
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test39");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isNotTrue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test40");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test41");
        java.lang.Integer int1 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1.equals(1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test42");
        java.lang.Integer int1 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1.equals(1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test43");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test44");
        boolean[] booleanArray4 = new boolean[] { true, false, false, true };
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test45");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test46");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringOnOff((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "off" + "'", str1.equals("off"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test47");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("no", "no", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test48");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test49");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test50");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "false", "", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test51");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test52");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(0, 0, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test53");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 1, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test54");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test55");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test56");
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test57");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 100, 100, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test58");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test59");
        boolean[] booleanArray4 = new boolean[] { true, false, true, false };
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test60");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test61");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test62");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) -1, (int) (short) -1, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test63");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isTrue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test64");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isNotFalse((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test65");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test66");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test67");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringYesNo(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "yes" + "'", str1.equals("yes"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test68");
        boolean[] booleanArray4 = new boolean[] { true, false, false, true };
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        boolean boolean9 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test69");
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { true, true, true, false, false };
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray5);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test70");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringTrueFalse((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "true" + "'", str1.equals("true"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test71");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "on", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test72");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "no", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test73");
        boolean[] booleanArray4 = new boolean[] { true, false, false, true };
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Class<?> wildcardClass6 = booleanArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test74");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test75");
        boolean[] booleanArray4 = new boolean[] { true, false, false, true };
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        boolean boolean9 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test76");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "no", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "no" + "'", str3.equals("no"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test77");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 10, 100, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test78");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 0, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
    }
}

