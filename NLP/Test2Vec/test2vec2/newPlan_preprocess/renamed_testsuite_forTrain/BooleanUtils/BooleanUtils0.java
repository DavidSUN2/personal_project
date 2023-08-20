
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
            System.out.format("%n%s%n", "BooleanUtils0.test0001");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0002");
        java.lang.Integer int1 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1.equals(0));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0003");
        java.lang.Boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.or(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0004");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0005");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0006");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0007");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringOnOff(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "off" + "'", str1.equals("off"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0008");
        java.lang.Integer int1 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1.equals(0));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0009");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 0, 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0010");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0011");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringYesNo(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "no" + "'", str1.equals("no"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0012");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.negate((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0013");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "", "", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0014");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isFalse((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0015");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringYesNo((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "yes" + "'", str1.equals("yes"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0016");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "false" + "'", str1.equals("false"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0017");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (short) 100, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0018");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "false", "hi!", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0019");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1, (-1), (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0020");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isTrue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0021");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Class<?> wildcardClass3 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0022");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (byte) -1, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0023");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0024");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringYesNo((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "no" + "'", str1.equals("no"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0025");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0026");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0027");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "true" + "'", str1.equals("true"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0028");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("no", "no", "no", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0029");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0030");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isFalse((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0031");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isTrue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0032");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringOnOff((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "on" + "'", str1.equals("on"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0033");
        boolean[] booleanArray6 = new boolean[] { true, false, true, false, false, false };
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        java.lang.Class<?> wildcardClass8 = booleanArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0034");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("on", "", "off", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0035");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 0, (int) (byte) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0036");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0037");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringYesNo(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "yes" + "'", str1.equals("yes"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0038");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("off", "off", "off", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0039");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "", "false", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0040");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "on", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0041");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0042");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) 'a', (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0043");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0044");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0045");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0046");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0047");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0048");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0049");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isNotTrue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0050");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0051");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("off", "true", "yes", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0052");
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { true, false, false, false, false, true };
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        java.lang.Class<?> wildcardClass8 = booleanArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0053");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isNotFalse((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0054");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.negate((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0055");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0056");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringOnOff((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "off" + "'", str1.equals("off"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0057");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0058");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0059");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "no", "true", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0060");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "yes", "no", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "no" + "'", str4.equals("no"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0061");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("false", "off", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0062");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) '#', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0063");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 1, (int) (short) 1, (int) (short) -1, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0064");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(0, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0066");
        int int1 = org.apache.commons.lang3.BooleanUtils.toInteger(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0067");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 100, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0068");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isNotTrue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0069");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(1, (int) (short) 0, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0070");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0071");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0072");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "", "", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0073");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0074");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) ' ', 1, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0075");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0076");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "hi!", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0077");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0078");
        java.lang.Integer int1 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1.equals(1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0079");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0080");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "on", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0081");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0082");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "false", "yes", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0083");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringTrueFalse((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "true" + "'", str1.equals("true"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0084");
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0085");
        java.lang.Boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0086");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0087");
        int int1 = org.apache.commons.lang3.BooleanUtils.toInteger(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0088");
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0089");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4.equals(32));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0090");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "false", "hi!", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0091");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "no", "no", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0092");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0093");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0094");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0095");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isNotFalse((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0096");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (short) 10, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0097");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "on", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0098");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(0, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0099");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (byte) 100, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(100, (int) (byte) 10, (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0101");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (byte) 100, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0102");
        java.lang.Boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.and(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0103");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0104");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0105");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 0, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0106");
        org.apache.commons.lang3.BooleanUtils booleanUtils0 = new org.apache.commons.lang3.BooleanUtils();
        java.lang.Class<?> wildcardClass1 = booleanUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0107");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0108");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0109");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0110");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0111");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0112");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 1, (int) (byte) -1, (int) (short) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0113");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) '#', (int) '4', 0, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0114");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "yes", "true", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0115");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "no", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0116");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 0, (int) (short) -1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0117");
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { true, false, false, false, false, true };
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray6);
        java.lang.Boolean boolean9 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0118");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "no", "", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0119");
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0120");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) -1, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0122");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "hi!", "on", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0123");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 10, (int) (byte) 1, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0124");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) ' ', (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0125");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0126");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "false", "on", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0127");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) ' ', (int) (short) 100, (int) (byte) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0128");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "true", "no", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "no" + "'", str4.equals("no"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0129");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "false", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "yes" + "'", str3.equals("yes"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0130");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0131");
        java.lang.Integer int1 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1.equals(1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0132");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "yes", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "yes" + "'", str3.equals("yes"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0133");
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { true, false, false, false, false, true };
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        java.lang.Class<?> wildcardClass9 = booleanArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0134");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0135");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 10, (int) 'a', 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0136");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) -1, (int) (short) 1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0137");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((-1), (int) (short) 10, (int) 'a', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0138");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) '4', (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0139");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "no", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0140");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("off", "hi!", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0141");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0142");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Class<?> wildcardClass9 = booleanArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0143");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 32, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0144");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0145");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Class<?> wildcardClass6 = booleanArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0146");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0147");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0148");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0149");
        boolean[] booleanArray6 = new boolean[] { true, false, true, false, false, false };
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        java.lang.Class<?> wildcardClass9 = booleanArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0150");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 0, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0151");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0152");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "no", "no", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "no" + "'", str4.equals("no"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0153");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 0, (int) (short) 0, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0154");
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0155");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 32, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0156");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (short) 0, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0157");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 32, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0158");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 1, (int) ' ', (int) '4', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0159");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0160");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) -1, (int) (short) 10, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0161");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 10, (java.lang.Integer) 32, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4.equals(32));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) 'a', (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0163");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0164");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0165");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean9 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0166");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0167");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 100, (int) (short) 1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0168");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "on", "yes", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "on" + "'", str4.equals("on"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0169");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0170");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (byte) 0, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0171");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0172");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0173");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringTrueFalse((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "false" + "'", str1.equals("false"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0174");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0175");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 10, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0176");
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { true, false, false, false, false, true };
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        java.lang.Boolean boolean9 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0177");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 0, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0178");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "on", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "on" + "'", str3.equals("on"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0179");
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { true, false, false, false, false, true };
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean9 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0180");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0181");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 100, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3.equals(10));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0182");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0183");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "no", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0184");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 32, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0185");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, 10, 100, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0186");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 1, 10, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0187");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "true", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "yes" + "'", str3.equals("yes"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0188");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0189");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 32, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3.equals(32));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0190");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0191");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "no", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "no" + "'", str4.equals("no"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0192");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(32, (int) (short) 1, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0193");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Class<?> wildcardClass8 = booleanArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0194");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0195");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 35, (java.lang.Integer) 32, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0196");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "hi!", "true", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0197");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "yes", "", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0198");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "false", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0199");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) (-1), (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3.equals(35));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0200");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0201");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("true", "on", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0202");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0203");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Class<?> wildcardClass6 = booleanArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0204");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 0, (int) '4', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0205");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringOnOff(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "on" + "'", str1.equals("on"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0206");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false", "", "true", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0207");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Class<?> wildcardClass7 = booleanArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0208");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0209");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "on", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "on" + "'", str4.equals("on"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0210");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) -1, 0, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0211");
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { true, false, false, false, true, true };
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray6);
        java.lang.Class<?> wildcardClass8 = booleanArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0212");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 1, (int) (byte) 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0213");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0214");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (short) 1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0215");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Class<?> wildcardClass5 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0216");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "off", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0217");
        boolean[] booleanArray6 = new boolean[] { true, false, true, false, false, false };
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0218");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) (-1), (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3.equals((-1)));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0219");
        boolean[] booleanArray6 = new boolean[] { true, false, true, false, false, false };
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.BooleanUtils.and(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
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
            System.out.format("%n%s%n", "BooleanUtils0.test0220");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "false", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0221");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 100, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0222");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((-1), (int) (short) 1, (int) (byte) 1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0223");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0224");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) -1, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0225");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "off", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "yes" + "'", str3.equals("yes"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0226");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0227");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 35, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3.equals(35));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0228");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (short) 100, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0229");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("hi!", "hi!", "true", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0230");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "yes", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0231");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0232");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0233");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0234");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "no", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "no" + "'", str3.equals("no"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0235");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0236");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 35, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0237");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Class<?> wildcardClass7 = booleanArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0238");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "yes", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0239");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0240");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3.equals((-1)));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0241");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0242");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0243");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false", "off", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0244");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0245");
        boolean[] booleanArray6 = new boolean[] { true, false, true, false, false, false };
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.BooleanUtils.and(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0246");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        java.lang.Boolean boolean9 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0247");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("false", "true", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0248");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        java.lang.Class<?> wildcardClass9 = booleanArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0249");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "hi!", "", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0250");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "false", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0251");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("off", "true", "off", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0252");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0253");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("on", "false", "no", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0254");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 35, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3.equals(10));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0255");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "yes", "yes", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0256");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0257");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 0, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0258");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean9 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0259");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0260");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 10, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0261");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, 10, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0262");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((-1), (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0263");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0264");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "false", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0265");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 100, (int) ' ', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0266");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 100, (int) ' ', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0267");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) -1, 35, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0268");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 1, (java.lang.Integer) 32, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0269");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 32, (int) (short) 1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0270");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 10, 100, (int) (short) 10, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0271");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "yes", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0272");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "true", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0273");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 32, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0274");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 10, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3.equals(32));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0275");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 0, (int) 'a', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0276");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "false", "yes", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0277");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "no", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "no" + "'", str3.equals("no"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0278");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0279");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "yes", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0280");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 100, 35, (int) '4', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0281");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 1, (int) '4', 32, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0282");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "true", "off", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0283");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Class<?> wildcardClass7 = booleanArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0284");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0285");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 100, 97, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0286");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "true", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0287");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 35, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0288");
        boolean[] booleanArray6 = new boolean[] { true, false, true, false, false, false };
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.BooleanUtils.and(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0289");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0290");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "yes", "true", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0291");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 100, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3.equals((-1)));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0292");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) '#', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0293");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 32, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0294");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 32, (java.lang.Integer) 35, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0295");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, 35, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0296");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0297");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 35, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0298");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0299");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "on", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "on" + "'", str3.equals("on"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0300");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 0, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0301");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("true", "true", "yes", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0302");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) 'a', (int) '#', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0303");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '4', 1, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0304");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 10, (java.lang.Integer) 97, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0305");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0306");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) -1, 35, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0307");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "yes", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0308");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0309");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 35, (java.lang.Integer) 35, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0310");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(97, 97, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0311");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) 'a', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0312");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0313");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0314");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0315");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0316");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(97, (int) 'a', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0317");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0318");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 32, (int) (byte) 10, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0319");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (byte) 1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0320");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0321");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "no", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0322");
        boolean[] booleanArray6 = new boolean[] { true, false, true, false, false, false };
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray6);
        java.lang.Class<?> wildcardClass9 = booleanArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0323");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 97, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0324");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0325");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "no", "off", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "no" + "'", str4.equals("no"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0326");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0327");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0328");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (short) 100, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0329");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("no", "", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0330");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(0, 0, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0331");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(35, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0332");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "on", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "on" + "'", str3.equals("on"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0333");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("no", "no", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0334");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "hi!", "no", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0335");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) ' ', 97, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0336");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 1, (int) (byte) 1, (int) (short) 1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0337");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false", "off", "off", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0338");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "off", "false", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0339");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0340");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "on", "off", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0341");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0342");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        java.lang.Class<?> wildcardClass8 = booleanArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0343");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "true", "hi!", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0344");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 0, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0345");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0346");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1, (int) (byte) 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0347");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) 'a', 10, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0348");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0349");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "off", "", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0350");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, 1, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0351");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(10, (int) (byte) 100, (int) (byte) 1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0352");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) '#', 97, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0353");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 35, (java.lang.Integer) 100, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0354");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0355");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "false", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0356");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0357");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (-1), (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0358");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Class<?> wildcardClass3 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0359");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0360");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) '#', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0361");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("true", "", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0362");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "false", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0363");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "yes", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0364");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(97, 100, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0365");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) -1, (int) '#', (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0366");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) 'a', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0367");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0368");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0369");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0370");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0371");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, 0, (int) (short) -1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0372");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "off", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0373");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 0, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0374");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Class<?> wildcardClass6 = booleanArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0375");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 100, 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0376");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0377");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 1, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0378");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (short) -1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0379");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) '4', (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0380");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "true", "no", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0381");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("no", "hi!", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0382");
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { true, false, false, false, true, true };
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray6);
        java.lang.Boolean boolean9 = org.apache.commons.lang3.BooleanUtils.and(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0383");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 1, (int) (short) -1, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0384");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0385");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "", "true", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0386");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "true", "off", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0387");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0388");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean(35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0389");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 100, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0390");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("no", "yes", "yes", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0391");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "off", "", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0392");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "true", "no", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "no" + "'", str4.equals("no"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0393");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "on", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "on" + "'", str3.equals("on"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0394");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0395");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 32, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0396");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false", "no", "off", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0397");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) 'a', (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0398");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 10, (int) '#', (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0399");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0400");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Class<?> wildcardClass6 = booleanArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0401");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "hi!", "on", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0402");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0403");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0404");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "off", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0405");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0406");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (-1), (int) ' ', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0407");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(10, (int) (short) 1, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0408");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "false", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0409");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 10, (int) (short) 1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0410");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(0, (int) (short) 10, (int) (byte) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0411");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0412");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) 32, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0413");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0414");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        java.lang.Class<?> wildcardClass8 = booleanArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0415");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("hi!", "no", "yes", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0416");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0417");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 100, 10, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0418");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 10, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3.equals(10));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0419");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0420");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) 'a', (-1), (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0421");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 97, (java.lang.Integer) 32, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0422");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 35, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3.equals(35));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0423");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 100, 32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0424");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 0, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0425");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "false", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0426");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0427");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 35, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3.equals(35));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0428");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.lang3.BooleanUtils.or(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0429");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0430");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0431");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "yes", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0432");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, 97, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0433");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0434");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0435");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 97, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3.equals(97));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0436");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 0, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3.equals(97));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0437");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("no", "no", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0438");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("off", "on", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0439");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "", "hi!", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0440");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "true", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0441");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0442");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 97, (java.lang.Integer) 35, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0443");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "false", "false", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0444");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) 'a', (int) 'a', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0445");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("true", "on", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0446");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false", "off", "no", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0447");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 0, 0, (int) '4', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0448");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0449");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 1, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3.equals(32));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0450");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0451");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0452");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0453");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (short) -1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0454");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 0, 35, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0455");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
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
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0456");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0457");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "no", "yes", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0458");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        java.lang.Boolean boolean9 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0459");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(0, (int) '4', 97, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0460");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
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
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0461");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) '4', 1, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0462");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "false", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0463");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) ' ', 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0464");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0465");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "hi!", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0466");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 1, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0467");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 0, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0468");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 0, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0469");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 100, (int) (byte) 10, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0470");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 97, (java.lang.Integer) 32, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4.equals(97));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0471");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) -1, (-1), (int) '4', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0472");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0473");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "on", "off", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0474");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) (-1), (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0475");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Class<?> wildcardClass6 = booleanArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0476");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (short) 10, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0477");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (byte) 100, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0478");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(100, (int) 'a', 32, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0479");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0480");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "on", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0481");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Class<?> wildcardClass4 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0482");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Class<?> wildcardClass6 = booleanArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0483");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0484");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0485");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("hi!", "yes", "true", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0486");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0487");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0488");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3.equals((-1)));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0489");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0490");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 100, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0491");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "hi!", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "no" + "'", str3.equals("no"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0492");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "true", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0493");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '4', 1, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0494");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0495");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "no", "on", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "on" + "'", str4.equals("on"));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0496");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "no", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0497");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) 'a', (-1), 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0498");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "off", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0499");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(97, 10, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.test0500");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(10, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

