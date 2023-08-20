package BooleanUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BooleanUtils0 {

    public static boolean debug = false;

    @Test
    public void BooleanUtils0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0001");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0002");
        java.lang.Integer int1 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1.equals(0));
    }

    @Test
    public void BooleanUtils0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0003");
        java.lang.Boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.or(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0004");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void BooleanUtils0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0005");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0006");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void BooleanUtils0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0007");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringOnOff(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "off" + "'", str1.equals("off"));
    }

    @Test
    public void BooleanUtils0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0008");
        java.lang.Integer int1 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1.equals(0));
    }

    @Test
    public void BooleanUtils0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0009");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 0, 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0010");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0011");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringYesNo(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "no" + "'", str1.equals("no"));
    }

    @Test
    public void BooleanUtils0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0012");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.negate((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0013");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "", "", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0014");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isFalse((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0015");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringYesNo((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "yes" + "'", str1.equals("yes"));
    }

    @Test
    public void BooleanUtils0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0016");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "false" + "'", str1.equals("false"));
    }

    @Test
    public void BooleanUtils0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0017");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (short) 100, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0018");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "false", "hi!", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0019");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1, (-1), (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0020");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isTrue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0021");
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
    public void BooleanUtils0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0022");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (byte) -1, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void BooleanUtils0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0023");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void BooleanUtils0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0024");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringYesNo((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "no" + "'", str1.equals("no"));
    }

    @Test
    public void BooleanUtils0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0025");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BooleanUtils0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0026");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0027");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "true" + "'", str1.equals("true"));
    }

    @Test
    public void BooleanUtils0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0028");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("no", "no", "no", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0029");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
    }

    @Test
    public void BooleanUtils0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0030");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isFalse((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0031");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isTrue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0032");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringOnOff((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "on" + "'", str1.equals("on"));
    }

    @Test
    public void BooleanUtils0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0033");
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
    public void BooleanUtils0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0034");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("on", "", "off", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0035");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 0, (int) (byte) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0036");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0037");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringYesNo(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "yes" + "'", str1.equals("yes"));
    }

    @Test
    public void BooleanUtils0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0038");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("off", "off", "off", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0039");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "", "false", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0040");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "on", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0041");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0042");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) 'a', (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0043");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0044");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0045");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0046");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0047");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0048");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0049");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isNotTrue((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0050");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0051");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("off", "true", "yes", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0052");
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
    public void BooleanUtils0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0053");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isNotFalse((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0054");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.negate((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0055");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0056");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringOnOff((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "off" + "'", str1.equals("off"));
    }

    @Test
    public void BooleanUtils0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0057");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0058");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0059");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "no", "true", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0060");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "yes", "no", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "no" + "'", str4.equals("no"));
    }

    @Test
    public void BooleanUtils0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0061");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("false", "off", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0062");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) '#', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void BooleanUtils0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0063");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 1, (int) (short) 1, (int) (short) -1, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0064");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0065");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(0, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0066");
        int int1 = org.apache.commons.lang3.BooleanUtils.toInteger(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void BooleanUtils0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0067");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 100, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0068");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isNotTrue((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0069");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(1, (int) (short) 0, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0070");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0071");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0072");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "", "", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0073");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0074");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) ' ', 1, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0075");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0076");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "hi!", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void BooleanUtils0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0077");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0078");
        java.lang.Integer int1 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1.equals(1));
    }

    @Test
    public void BooleanUtils0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0079");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0080");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "on", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
    }

    @Test
    public void BooleanUtils0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0081");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0082");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "false", "yes", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void BooleanUtils0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0083");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringTrueFalse((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "true" + "'", str1.equals("true"));
    }

    @Test
    public void BooleanUtils0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0084");
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void BooleanUtils0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0085");
        java.lang.Boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0086");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void BooleanUtils0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0087");
        int int1 = org.apache.commons.lang3.BooleanUtils.toInteger(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void BooleanUtils0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0088");
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void BooleanUtils0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0089");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4.equals(32));
    }

    @Test
    public void BooleanUtils0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0090");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "false", "hi!", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0091");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "no", "no", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0092");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0093");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0094");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
    }

    @Test
    public void BooleanUtils0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0095");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.isNotFalse((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0096");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (short) 10, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void BooleanUtils0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0097");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "on", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void BooleanUtils0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0098");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(0, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0099");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (byte) 100, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0100");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(100, (int) (byte) 10, (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0101");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (byte) 100, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0102");
        java.lang.Boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.and(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0103");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0104");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0105");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 0, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0106");
        org.apache.commons.lang3.BooleanUtils booleanUtils0 = new org.apache.commons.lang3.BooleanUtils();
        java.lang.Class<?> wildcardClass1 = booleanUtils0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void BooleanUtils0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0107");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0108");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0109");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0110");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0111");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0112");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 1, (int) (byte) -1, (int) (short) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0113");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) '#', (int) '4', 0, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0114");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "yes", "true", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
    }

    @Test
    public void BooleanUtils0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0115");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "no", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0116");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 0, (int) (short) -1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BooleanUtils0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0117");
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
    public void BooleanUtils0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0118");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "no", "", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0119");
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void BooleanUtils0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0120");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0121");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) -1, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0122");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "hi!", "on", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0123");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 10, (int) (byte) 1, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0124");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) ' ', (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0125");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0126");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "false", "on", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0127");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) ' ', (int) (short) 100, (int) (byte) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0128");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "true", "no", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "no" + "'", str4.equals("no"));
    }

    @Test
    public void BooleanUtils0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0129");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "false", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "yes" + "'", str3.equals("yes"));
    }

    @Test
    public void BooleanUtils0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0130");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0131");
        java.lang.Integer int1 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1.equals(1));
    }

    @Test
    public void BooleanUtils0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0132");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "yes", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "yes" + "'", str3.equals("yes"));
    }

    @Test
    public void BooleanUtils0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0133");
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
    public void BooleanUtils0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0134");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0135");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 10, (int) 'a', 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0136");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) -1, (int) (short) 1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0137");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((-1), (int) (short) 10, (int) 'a', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0138");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) '4', (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0139");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "no", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void BooleanUtils0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0140");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("off", "hi!", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0141");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0142");
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
    public void BooleanUtils0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0143");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 32, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0144");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0145");
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
    public void BooleanUtils0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0146");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0147");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0148");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0149");
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
    public void BooleanUtils0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0150");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 0, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0151");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BooleanUtils0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0152");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "no", "no", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "no" + "'", str4.equals("no"));
    }

    @Test
    public void BooleanUtils0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0153");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 0, (int) (short) 0, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void BooleanUtils0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0154");
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void BooleanUtils0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0155");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 32, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0156");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (short) 0, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0157");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 32, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0158");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 1, (int) ' ', (int) '4', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0159");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0160");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) -1, (int) (short) 10, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0161");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 10, (java.lang.Integer) 32, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4.equals(32));
    }

    @Test
    public void BooleanUtils0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0162");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) 'a', (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0163");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0164");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0165");
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
    public void BooleanUtils0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0166");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0167");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 100, (int) (short) 1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0168");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "on", "yes", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "on" + "'", str4.equals("on"));
    }

    @Test
    public void BooleanUtils0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0169");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0170");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (byte) 0, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void BooleanUtils0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0171");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0172");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0173");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringTrueFalse((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "false" + "'", str1.equals("false"));
    }

    @Test
    public void BooleanUtils0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0174");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0175");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 10, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
    }

    @Test
    public void BooleanUtils0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0176");
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
    public void BooleanUtils0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0177");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 0, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0178");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "on", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "on" + "'", str3.equals("on"));
    }

    @Test
    public void BooleanUtils0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0179");
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
    public void BooleanUtils0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0180");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0181");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 100, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3.equals(10));
    }

    @Test
    public void BooleanUtils0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0182");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0183");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "no", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0184");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 32, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0185");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, 10, 100, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void BooleanUtils0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0186");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 1, 10, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0187");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "true", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "yes" + "'", str3.equals("yes"));
    }

    @Test
    public void BooleanUtils0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0188");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0189");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 32, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3.equals(32));
    }

    @Test
    public void BooleanUtils0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0190");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void BooleanUtils0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0191");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "no", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "no" + "'", str4.equals("no"));
    }

    @Test
    public void BooleanUtils0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0192");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(32, (int) (short) 1, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0193");
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
    public void BooleanUtils0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0194");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0195");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 35, (java.lang.Integer) 32, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0196");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "hi!", "true", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0197");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "yes", "", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0198");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "false", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0199");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) (-1), (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3.equals(35));
    }

    @Test
    public void BooleanUtils0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0200");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0201");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("true", "on", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0202");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0203");
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
    public void BooleanUtils0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0204");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 0, (int) '4', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0205");
        java.lang.String str1 = org.apache.commons.lang3.BooleanUtils.toStringOnOff(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "on" + "'", str1.equals("on"));
    }

    @Test
    public void BooleanUtils0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0206");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false", "", "true", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0207");
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
    public void BooleanUtils0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0208");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0209");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "on", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "on" + "'", str4.equals("on"));
    }

    @Test
    public void BooleanUtils0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0210");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) -1, 0, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void BooleanUtils0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0211");
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
    public void BooleanUtils0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0212");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 1, (int) (byte) 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void BooleanUtils0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0213");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0214");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (short) 1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BooleanUtils0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0215");
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
    public void BooleanUtils0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0216");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "off", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
    }

    @Test
    public void BooleanUtils0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0217");
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
    public void BooleanUtils0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0218");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) (-1), (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3.equals((-1)));
    }

    @Test
    public void BooleanUtils0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0219");
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
    public void BooleanUtils0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0220");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "false", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0221");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 100, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BooleanUtils0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0222");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((-1), (int) (short) 1, (int) (byte) 1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0223");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0224");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) -1, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0225");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "off", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "yes" + "'", str3.equals("yes"));
    }

    @Test
    public void BooleanUtils0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0226");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0227");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 35, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3.equals(35));
    }

    @Test
    public void BooleanUtils0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0228");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (short) 100, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0229");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("hi!", "hi!", "true", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0230");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "yes", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0231");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0232");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0233");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void BooleanUtils0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0234");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "no", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "no" + "'", str3.equals("no"));
    }

    @Test
    public void BooleanUtils0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0235");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0236");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 35, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0237");
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
    public void BooleanUtils0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0238");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "yes", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0239");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0240");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3.equals((-1)));
    }

    @Test
    public void BooleanUtils0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0241");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0242");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0243");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false", "off", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0244");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0245");
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
    public void BooleanUtils0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0246");
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
    public void BooleanUtils0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0247");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("false", "true", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0248");
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
    public void BooleanUtils0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0249");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "hi!", "", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0250");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "false", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void BooleanUtils0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0251");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("off", "true", "off", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0252");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0253");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("on", "false", "no", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0254");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 35, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3.equals(10));
    }

    @Test
    public void BooleanUtils0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0255");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "yes", "yes", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0256");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0257");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 0, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0258");
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
    public void BooleanUtils0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0259");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0260");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 10, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0261");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, 10, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0262");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((-1), (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0263");
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
    public void BooleanUtils0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0264");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "false", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
    }

    @Test
    public void BooleanUtils0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0265");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 100, (int) ' ', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0266");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 100, (int) ' ', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void BooleanUtils0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0267");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) -1, 35, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BooleanUtils0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0268");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 1, (java.lang.Integer) 32, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0269");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 32, (int) (short) 1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0270");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 10, 100, (int) (short) 10, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0271");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "yes", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void BooleanUtils0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0272");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "true", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0273");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 32, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0274");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 10, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3.equals(32));
    }

    @Test
    public void BooleanUtils0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0275");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 0, (int) 'a', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void BooleanUtils0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0276");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "false", "yes", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0277");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "no", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "no" + "'", str3.equals("no"));
    }

    @Test
    public void BooleanUtils0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0278");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0279");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "yes", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0280");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 100, 35, (int) '4', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0281");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 1, (int) '4', 32, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0282");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "true", "off", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0283");
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
    public void BooleanUtils0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0284");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0285");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 100, 97, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0286");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "true", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
    }

    @Test
    public void BooleanUtils0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0287");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 35, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0288");
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
    public void BooleanUtils0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0289");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0290");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "yes", "true", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0291");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 100, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3.equals((-1)));
    }

    @Test
    public void BooleanUtils0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0292");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) '#', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void BooleanUtils0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0293");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 32, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BooleanUtils0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0294");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 32, (java.lang.Integer) 35, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0295");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, 35, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void BooleanUtils0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0296");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0297");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 35, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0298");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0299");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "on", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "on" + "'", str3.equals("on"));
    }

    @Test
    public void BooleanUtils0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0300");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 0, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0301");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("true", "true", "yes", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0302");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) 'a', (int) '#', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void BooleanUtils0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0303");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '4', 1, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0304");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 10, (java.lang.Integer) 97, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0305");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0306");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) -1, 35, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void BooleanUtils0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0307");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "yes", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0308");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0309");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 35, (java.lang.Integer) 35, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0310");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(97, 97, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0311");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) 'a', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BooleanUtils0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0312");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0313");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0314");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0315");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0316");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(97, (int) 'a', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0317");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0318");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 32, (int) (byte) 10, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void BooleanUtils0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0319");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (byte) 1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void BooleanUtils0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0320");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0321");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "no", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0322");
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
    public void BooleanUtils0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0323");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 97, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0324");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0325");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "no", "off", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "no" + "'", str4.equals("no"));
    }

    @Test
    public void BooleanUtils0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0326");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0327");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0328");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (short) 100, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0329");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("no", "", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0330");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(0, 0, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0331");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(35, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0332");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "on", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "on" + "'", str3.equals("on"));
    }

    @Test
    public void BooleanUtils0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0333");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("no", "no", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0334");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "hi!", "no", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0335");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) ' ', 97, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0336");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 1, (int) (byte) 1, (int) (short) 1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0337");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false", "off", "off", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0338");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "off", "false", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0339");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0340");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "on", "off", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0341");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0342");
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
    public void BooleanUtils0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0343");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "true", "hi!", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0344");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 0, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0345");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0346");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1, (int) (byte) 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0347");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) 'a', 10, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void BooleanUtils0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0348");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0349");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "off", "", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0350");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, 1, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BooleanUtils0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0351");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(10, (int) (byte) 100, (int) (byte) 1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0352");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) '#', 97, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0353");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 35, (java.lang.Integer) 100, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0354");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0355");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "false", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
    }

    @Test
    public void BooleanUtils0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0356");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0357");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (-1), (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0358");
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
    public void BooleanUtils0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0359");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0360");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) '#', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void BooleanUtils0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0361");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("true", "", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0362");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "false", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void BooleanUtils0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0363");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "yes", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0364");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(97, 100, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0365");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) -1, (int) '#', (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0366");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) 'a', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0367");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0368");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0369");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0370");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0371");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, 0, (int) (short) -1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void BooleanUtils0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0372");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "off", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0373");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 0, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0374");
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
    public void BooleanUtils0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0375");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 100, 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void BooleanUtils0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0376");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0377");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 1, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
    }

    @Test
    public void BooleanUtils0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0378");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (short) -1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void BooleanUtils0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0379");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) '4', (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0380");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "true", "no", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
    }

    @Test
    public void BooleanUtils0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0381");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("no", "hi!", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0382");
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
    public void BooleanUtils0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0383");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 1, (int) (short) -1, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0384");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0385");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "", "true", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0386");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "true", "off", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0387");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0388");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean(35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0389");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 100, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
    }

    @Test
    public void BooleanUtils0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0390");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("no", "yes", "yes", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0391");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "off", "", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0392");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "true", "no", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "no" + "'", str4.equals("no"));
    }

    @Test
    public void BooleanUtils0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0393");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "on", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "on" + "'", str3.equals("on"));
    }

    @Test
    public void BooleanUtils0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0394");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0395");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 32, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0396");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false", "no", "off", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0397");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) 'a', (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0398");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 10, (int) '#', (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0399");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0400");
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
    public void BooleanUtils0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0401");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "hi!", "on", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0402");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0403");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0404");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "off", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0405");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void BooleanUtils0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0406");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (-1), (int) ' ', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BooleanUtils0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0407");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(10, (int) (short) 1, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0408");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "false", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void BooleanUtils0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0409");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 10, (int) (short) 1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0410");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(0, (int) (short) 10, (int) (byte) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0411");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0412");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) 32, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0413");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0414");
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
    public void BooleanUtils0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0415");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("hi!", "no", "yes", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0416");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0417");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 100, 10, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0418");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 10, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3.equals(10));
    }

    @Test
    public void BooleanUtils0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0419");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0420");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) 'a', (-1), (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BooleanUtils0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0421");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 97, (java.lang.Integer) 32, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0422");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 35, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3.equals(35));
    }

    @Test
    public void BooleanUtils0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0423");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 100, 32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0424");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 0, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
    }

    @Test
    public void BooleanUtils0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0425");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "false", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0426");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void BooleanUtils0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0427");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 35, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3.equals(35));
    }

    @Test
    public void BooleanUtils0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0428");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean1 = org.apache.commons.lang3.BooleanUtils.or(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0429");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0430");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0431");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "yes", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0432");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, 97, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void BooleanUtils0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0433");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
    }

    @Test
    public void BooleanUtils0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0434");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1.equals(false));
    }

    @Test
    public void BooleanUtils0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0435");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 97, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3.equals(97));
    }

    @Test
    public void BooleanUtils0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0436");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 0, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3.equals(97));
    }

    @Test
    public void BooleanUtils0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0437");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("no", "no", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0438");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("off", "on", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0439");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "", "hi!", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0440");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "true", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0441");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0442");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 97, (java.lang.Integer) 35, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0443");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "false", "false", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void BooleanUtils0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0444");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) 'a', (int) 'a', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void BooleanUtils0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0445");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("true", "on", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0446");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false", "off", "no", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0447");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 0, 0, (int) '4', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0448");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0449");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 1, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3.equals(32));
    }

    @Test
    public void BooleanUtils0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0450");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0451");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0452");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0453");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (short) -1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void BooleanUtils0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0454");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 0, 35, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0455");
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
    public void BooleanUtils0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0456");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0457");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "no", "yes", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0458");
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
    public void BooleanUtils0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0459");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(0, (int) '4', 97, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0460");
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
    public void BooleanUtils0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0461");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) '4', 1, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0462");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "false", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
    }

    @Test
    public void BooleanUtils0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0463");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) ' ', 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0464");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0465");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "hi!", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0466");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 1, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0467");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 0, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0468");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 0, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0469");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 100, (int) (byte) 10, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void BooleanUtils0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0470");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 97, (java.lang.Integer) 32, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4.equals(97));
    }

    @Test
    public void BooleanUtils0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0471");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) -1, (-1), (int) '4', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0472");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0473");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "on", "off", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0474");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) (-1), (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0475");
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
    public void BooleanUtils0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0476");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (short) 10, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0477");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (byte) 100, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0478");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(100, (int) 'a', 32, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0479");
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
    public void BooleanUtils0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0480");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "on", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void BooleanUtils0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0481");
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
    public void BooleanUtils0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0482");
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
    public void BooleanUtils0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0483");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void BooleanUtils0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0484");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0485");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("hi!", "yes", "true", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0486");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0487");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0488");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3.equals((-1)));
    }

    @Test
    public void BooleanUtils0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0489");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0490");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 100, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
    }

    @Test
    public void BooleanUtils0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0491");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "hi!", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "no" + "'", str3.equals("no"));
    }

    @Test
    public void BooleanUtils0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0492");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "true", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0493");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '4', 1, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0494");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0495");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "no", "on", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "on" + "'", str4.equals("on"));
    }

    @Test
    public void BooleanUtils0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0496");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "no", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0497");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) 'a', (-1), 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BooleanUtils0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0498");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "off", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void BooleanUtils0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0499");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(97, 10, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils0.BooleanUtils0500");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(10, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

