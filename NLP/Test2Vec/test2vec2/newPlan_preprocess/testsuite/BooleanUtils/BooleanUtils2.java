package BooleanUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BooleanUtils2 {

    public static boolean debug = false;

    @Test
    public void BooleanUtils1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1001");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) (-1), (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3.equals((-1)));
    }

    @Test
    public void BooleanUtils1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1002");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("no", "hi!", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1003");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean9 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void BooleanUtils1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1004");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 97, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void BooleanUtils1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1005");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Class<?> wildcardClass9 = booleanArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BooleanUtils1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1006");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("off", "off", "no", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1007");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
    }

    @Test
    public void BooleanUtils1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1008");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 52, (java.lang.Integer) 32, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1009");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 35, (java.lang.Integer) 1, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1010");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void BooleanUtils1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1011");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1012");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 52, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4.equals(52));
    }

    @Test
    public void BooleanUtils1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1013");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(100, (int) '4', 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1014");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "false", "false", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1015");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        java.lang.Class<?> wildcardClass8 = booleanArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BooleanUtils1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1016");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 0, (int) (byte) 10, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1017");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (short) 100, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void BooleanUtils1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1018");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1019");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("on", "", "on", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1020");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 32, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1021");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "yes", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1022");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 1, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void BooleanUtils1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1023");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
    }

    @Test
    public void BooleanUtils1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1024");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, 35, (int) (short) 100, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void BooleanUtils1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1025");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 1, 35, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1026");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 0, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1027");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(0, 97, 35, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1028");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "false", "hi!", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1029");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1030");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, 100, (int) ' ', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void BooleanUtils1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1031");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (short) -1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1032");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 10, (int) '#', (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1033");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) -1, 0, 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void BooleanUtils1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1034");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 0, (int) (short) 100, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1035");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean9 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    public void BooleanUtils1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1036");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false", "false", "", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1037");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, 10, (int) (byte) 100, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void BooleanUtils1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1038");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "on", "", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1039");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(97, (int) '#', 32, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1040");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "hi!", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1041");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "false", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
    }

    @Test
    public void BooleanUtils1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1042");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1043");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("off", "", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1044");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1045");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    public void BooleanUtils1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1046");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "yes", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "no" + "'", str3.equals("no"));
    }

    @Test
    public void BooleanUtils1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1047");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 10, (java.lang.Integer) 32, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4.equals(32));
    }

    @Test
    public void BooleanUtils1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1048");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1049");
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { true, true, false, true, false };
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray5);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void BooleanUtils1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1050");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (byte) 1, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void BooleanUtils1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1051");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void BooleanUtils1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1052");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "on", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "yes" + "'", str3.equals("yes"));
    }

    @Test
    public void BooleanUtils1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1053");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 0, (int) (short) 0, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void BooleanUtils1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1054");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 97, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1055");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 52, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1056");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3.equals((-1)));
    }

    @Test
    public void BooleanUtils1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1057");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '4', 0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void BooleanUtils1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1058");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(52, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1059");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (-1), (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void BooleanUtils1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1060");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "yes", "false", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1061");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 35, (int) (short) -1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BooleanUtils1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1062");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "off", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
    }

    @Test
    public void BooleanUtils1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1063");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1064");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "false", "off", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1065");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "true", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
    }

    @Test
    public void BooleanUtils1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1066");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("on", "false", "hi!", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1067");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 100, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1068");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 0, (int) (short) 1, 52, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1069");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "true", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1070");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "true", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1071");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 35, (java.lang.Integer) 97, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1072");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1073");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "off", "on", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1074");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "off", "off", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1075");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 35, (java.lang.Integer) 0, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1076");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 52, (java.lang.Integer) (-1), (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1077");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "false", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1078");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "yes", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1079");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) -1, (int) (byte) -1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BooleanUtils1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1080");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 32, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3.equals(32));
    }

    @Test
    public void BooleanUtils1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1081");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
    }

    @Test
    public void BooleanUtils1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1082");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void BooleanUtils1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1083");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(0, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1084");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 32, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void BooleanUtils1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1085");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) -1, 97, (int) ' ', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1086");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4.equals(97));
    }

    @Test
    public void BooleanUtils1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1087");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, false };
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray2);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray2);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray2);
        java.lang.Class<?> wildcardClass8 = booleanArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BooleanUtils1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1088");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1089");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 0, 100, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void BooleanUtils1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1090");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 52, (java.lang.Integer) 52, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4.equals(52));
    }

    @Test
    public void BooleanUtils1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1091");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "yes", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1092");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("true", "on", "no", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1093");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(32, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1094");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 100, (int) (short) -1, (int) '4', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1095");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(0, 100, (int) (short) 0, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1096");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "yes", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1097");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1098");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) '4', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void BooleanUtils1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1099");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 32, (java.lang.Integer) 10, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void BooleanUtils1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1100");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) '4', (int) (byte) -1, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void BooleanUtils1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1101");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 32, (java.lang.Integer) (-1), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1102");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void BooleanUtils1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1103");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1104");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 97, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
    }

    @Test
    public void BooleanUtils1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1105");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "yes", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "on" + "'", str3.equals("on"));
    }

    @Test
    public void BooleanUtils1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1106");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("off", "yes", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1107");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) (-1), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1108");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "hi!", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1109");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void BooleanUtils1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1110");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1111");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1112");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (byte) 100, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1113");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 1, (int) (short) -1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BooleanUtils1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1114");
        boolean[] booleanArray1 = new boolean[] { true };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void BooleanUtils1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1115");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1116");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "false", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
    }

    @Test
    public void BooleanUtils1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1117");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3.equals((-1)));
    }

    @Test
    public void BooleanUtils1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1118");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    public void BooleanUtils1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1119");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 10, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1120");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Class<?> wildcardClass4 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BooleanUtils1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1121");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) -1, 100, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void BooleanUtils1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1122");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(0, (int) (byte) 0, (int) (byte) -1, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1123");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 97, (java.lang.Integer) 97, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4.equals(97));
    }

    @Test
    public void BooleanUtils1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1124");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "on", "on", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "on" + "'", str4.equals("on"));
    }

    @Test
    public void BooleanUtils1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1125");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 0, (java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3.equals(52));
    }

    @Test
    public void BooleanUtils1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1126");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1127");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("off", "no", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1128");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean9 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1129");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) ' ', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BooleanUtils1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1130");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("on", "on", "yes", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1131");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) 1, 10, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1132");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
    }

    @Test
    public void BooleanUtils1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1133");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "no", "true", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "no" + "'", str4.equals("no"));
    }

    @Test
    public void BooleanUtils1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1134");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((-1), (int) (byte) 100, (int) (byte) 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1135");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(0, (int) '4', (int) '#', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1136");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "false", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1137");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 1, (int) (short) 10, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void BooleanUtils1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1138");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "yes", "false", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1139");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "off", "true", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
    }

    @Test
    public void BooleanUtils1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1140");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1141");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Class<?> wildcardClass9 = booleanArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BooleanUtils1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1142");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1143");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 52, (java.lang.Integer) 0, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1144");
        boolean[] booleanArray1 = new boolean[] { true };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
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
    public void BooleanUtils1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1145");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "false", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
    }

    @Test
    public void BooleanUtils1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1146");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "no", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1147");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean9 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1148");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 10, (int) (short) 10, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1149");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "hi!", "yes", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1150");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1151");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1152");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (short) -1, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void BooleanUtils1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1153");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("false", "on", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1154");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 97, (java.lang.Integer) 52, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4.equals(97));
    }

    @Test
    public void BooleanUtils1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1155");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "true", "true", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
    }

    @Test
    public void BooleanUtils1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1156");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(1, 10, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1157");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 100, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1158");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 52, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1159");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) '#', 100, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1160");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "yes", "on", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "on" + "'", str4.equals("on"));
    }

    @Test
    public void BooleanUtils1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1161");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 100, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1162");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(0, (int) (byte) 0, 32, 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1163");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    public void BooleanUtils1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1164");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "no", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "off" + "'", str3.equals("off"));
    }

    @Test
    public void BooleanUtils1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1165");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1166");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    public void BooleanUtils1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1167");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1168");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("on", "", "on", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1169");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 52, (java.lang.Integer) 35, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4.equals(52));
    }

    @Test
    public void BooleanUtils1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1170");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "false", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1171");
        boolean[] booleanArray0 = new boolean[] {};
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean1 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray0);
    }

    @Test
    public void BooleanUtils1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1172");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1173");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 52, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3.equals(52));
    }

    @Test
    public void BooleanUtils1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1174");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 1, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1175");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(100, 0, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1176");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "yes", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1177");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("no", "no", "yes", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1178");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Class<?> wildcardClass7 = booleanArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BooleanUtils1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1179");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 100, 1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1180");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "off", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "off" + "'", str3.equals("off"));
    }

    @Test
    public void BooleanUtils1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1181");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1182");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1183");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) (-1), (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
    }

    @Test
    public void BooleanUtils1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1184");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1185");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1186");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) ' ', (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1187");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1188");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1189");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(32, (int) (short) 0, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1190");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "yes", "false", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void BooleanUtils1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1191");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1192");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1193");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1, (int) (byte) -1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1194");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 35, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1195");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(97, (int) ' ', (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1196");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 1, 100, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void BooleanUtils1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1197");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 10, 35, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void BooleanUtils1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1198");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(10, (int) (byte) 10, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1199");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1200");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 52, (java.lang.Integer) 100, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4.equals(52));
    }

    @Test
    public void BooleanUtils1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1201");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1202");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("no", "no", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1203");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((-1), 52, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1204");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1205");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 32, (int) (short) 10, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void BooleanUtils1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1206");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 52, (java.lang.Integer) 10, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void BooleanUtils1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1207");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
    }

    @Test
    public void BooleanUtils1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1208");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
    }

    @Test
    public void BooleanUtils1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1209");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1210");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1211");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("hi!", "", "on", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1212");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 35, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1213");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 32, (java.lang.Integer) 100, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4.equals(32));
    }

    @Test
    public void BooleanUtils1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1214");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "no", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "no" + "'", str3.equals("no"));
    }

    @Test
    public void BooleanUtils1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1215");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 32, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3.equals(32));
    }

    @Test
    public void BooleanUtils1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1216");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 1, (int) (byte) 100, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1217");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) ' ', (int) '#', (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1218");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, 0, 97, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void BooleanUtils1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1219");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(100, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1220");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 97, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3.equals(35));
    }

    @Test
    public void BooleanUtils1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1221");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 1, (java.lang.Integer) 32, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1222");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Class<?> wildcardClass6 = booleanArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BooleanUtils1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1223");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
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
    }

    @Test
    public void BooleanUtils1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1224");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, 32, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void BooleanUtils1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1225");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (short) 10, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1226");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "on", "yes", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1227");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1228");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(97, (int) (byte) 10, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1229");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1230");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(0, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1231");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 52, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1232");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 10, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3.equals(10));
    }

    @Test
    public void BooleanUtils1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1233");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (byte) 0, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BooleanUtils1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1234");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1235");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, 32, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void BooleanUtils1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1236");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    public void BooleanUtils1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1237");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "false", "off", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1238");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "off", "true", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1239");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "no", "no", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1240");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("false", "", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1241");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1242");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 32, (java.lang.Integer) 52, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1243");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(10, (int) '4', (int) (short) 0, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1244");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 0, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1245");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1246");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(35, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1247");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "off", "hi!", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1248");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "off", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1249");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (byte) 10, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1250");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) -1, (int) (short) 0, (-1), (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1251");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    public void BooleanUtils1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1252");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1, (int) (short) -1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1253");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1254");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(35, 10, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1255");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
    }

    @Test
    public void BooleanUtils1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1256");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 10, (int) (short) 1, (int) (byte) 10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1257");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "on" + "'", str3.equals("on"));
    }

    @Test
    public void BooleanUtils1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1258");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("off", "on", "", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1259");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 32, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1260");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 10, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1261");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false", "no", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1262");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1263");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "false", "true", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
    }

    @Test
    public void BooleanUtils1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1264");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "no", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1265");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("true", "off", "true", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1266");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "yes", "off", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1267");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1268");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1269");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) 'a', (int) (short) 1, (int) (short) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1270");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "off", "yes", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1271");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Class<?> wildcardClass4 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BooleanUtils1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1272");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(10, 52, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1273");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    public void BooleanUtils1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1274");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1275");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 10, (-1), 97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1276");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "off", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "off" + "'", str3.equals("off"));
    }

    @Test
    public void BooleanUtils1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1277");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1278");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 52, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1279");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (short) 0, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BooleanUtils1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1280");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "off", "hi!", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1281");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 97, (java.lang.Integer) 97, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4.equals(97));
    }

    @Test
    public void BooleanUtils1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1282");
        java.lang.Boolean[] booleanArray5 = new java.lang.Boolean[] { true, false, false, false, false };
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray5);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
    }

    @Test
    public void BooleanUtils1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1283");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    public void BooleanUtils1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1284");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean9 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1285");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) '4', 0, 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void BooleanUtils1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1286");
        boolean[] booleanArray1 = new boolean[] { true };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
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
    public void BooleanUtils1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1287");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 35, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1288");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "no", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
    }

    @Test
    public void BooleanUtils1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1289");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (byte) -1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BooleanUtils1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1290");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 10, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3.equals(10));
    }

    @Test
    public void BooleanUtils1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1291");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Class<?> wildcardClass9 = booleanArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BooleanUtils1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1292");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(1, 0, (int) (short) 1, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1293");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "hi!", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1294");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
    }

    @Test
    public void BooleanUtils1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1295");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "false", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void BooleanUtils1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1296");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1297");
        boolean[] booleanArray1 = new boolean[] { true };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void BooleanUtils1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1298");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "", "no", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1299");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void BooleanUtils1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1300");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    public void BooleanUtils1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1301");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean9 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void BooleanUtils1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1302");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1303");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (byte) 10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1304");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(97, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1305");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) '#', 1, (int) (short) 0, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1306");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(32, (int) (short) -1, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1307");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "false", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1308");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (-1), 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BooleanUtils1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1309");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1310");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("true", "on", "yes", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1311");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1312");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
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
    public void BooleanUtils1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1313");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "yes", "no", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "no" + "'", str4.equals("no"));
    }

    @Test
    public void BooleanUtils1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1314");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 52, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1315");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, false };
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray2);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray2);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray2);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
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
    public void BooleanUtils1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1316");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 100, (java.lang.Integer) 32, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
    }

    @Test
    public void BooleanUtils1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1317");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 35, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BooleanUtils1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1318");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    public void BooleanUtils1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1319");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 1, 0, (int) '#', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1320");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean9 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1321");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "hi!", "", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1322");
        boolean[] booleanArray1 = new boolean[] { true };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
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
    public void BooleanUtils1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1323");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 100, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1324");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 0, (java.lang.Integer) 52, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1325");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 52, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1326");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
    }

    @Test
    public void BooleanUtils1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1327");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 100, (java.lang.Integer) 52, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
    }

    @Test
    public void BooleanUtils1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1328");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 0, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1329");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4.equals(97));
    }

    @Test
    public void BooleanUtils1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1330");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "true", "yes", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1331");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, 35, 0, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void BooleanUtils1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1332");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "", "", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1333");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 10, 52, 1, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1334");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 32, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3.equals(32));
    }

    @Test
    public void BooleanUtils1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1335");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1336");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(0, (int) (short) 100, 97, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1337");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 32, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void BooleanUtils1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1338");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "on", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1339");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (byte) 100, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BooleanUtils1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1340");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 52, (java.lang.Integer) 0, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1341");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    public void BooleanUtils1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1342");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "hi!", "", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1343");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) -1, (int) (byte) 10, 52, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1344");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 10, (int) (short) 100, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void BooleanUtils1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1345");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 32, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1346");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 97, (java.lang.Integer) 32, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1347");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    public void BooleanUtils1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1348");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 97, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1349");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(35, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1350");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1351");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (byte) 1, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BooleanUtils1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1352");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(100, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1353");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "on", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1354");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean9 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    public void BooleanUtils1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1355");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "false", "false", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void BooleanUtils1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1356");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean9 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void BooleanUtils1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1357");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void BooleanUtils1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1358");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 32, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3.equals(97));
    }

    @Test
    public void BooleanUtils1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1359");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("hi!", "false", "true", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1360");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("true", "on", "true", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1361");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 10, (java.lang.Integer) 32, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1362");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1363");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1364");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("false", "off", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1365");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 32, 0, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void BooleanUtils1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1366");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) '#', 0, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1367");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 10, 0, 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void BooleanUtils1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1368");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) (-1), (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3.equals((-1)));
    }

    @Test
    public void BooleanUtils1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1369");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 35, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1370");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "hi!", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1371");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, false };
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray2);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray2);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray2);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6.equals(false));
    }

    @Test
    public void BooleanUtils1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1372");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Class<?> wildcardClass8 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
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
    public void BooleanUtils1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1373");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Class<?> wildcardClass7 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BooleanUtils1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1374");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 52, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1375");
        boolean[] booleanArray1 = new boolean[] { true };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
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
    public void BooleanUtils1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1376");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 52, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1377");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean9 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    public void BooleanUtils1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1378");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (short) 100, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1379");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1380");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Class<?> wildcardClass9 = booleanArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BooleanUtils1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1381");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("true", "on", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1382");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 97, (java.lang.Integer) (-1), (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1383");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 0, 32, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void BooleanUtils1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1384");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1385");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1386");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1387");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("false", "no", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1388");
        boolean[] booleanArray1 = new boolean[] { true };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void BooleanUtils1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1389");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 97, (java.lang.Integer) 32, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1390");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, 100, (int) (short) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void BooleanUtils1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1391");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 0, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3.equals(35));
    }

    @Test
    public void BooleanUtils1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1392");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "false", "hi!", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1393");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("off", "true", "no", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1394");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1395");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("true", "", "true", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1396");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 35, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1397");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    public void BooleanUtils1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1398");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) ' ', (int) ' ', 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void BooleanUtils1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1399");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) '#', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void BooleanUtils1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1400");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean9 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1401");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 0, 52, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1402");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "hi!", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "yes" + "'", str3.equals("yes"));
    }

    @Test
    public void BooleanUtils1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1403");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, false };
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray2);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray2);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray2);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray2);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
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
    public void BooleanUtils1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1404");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 32, (java.lang.Integer) (-1), (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4.equals(32));
    }

    @Test
    public void BooleanUtils1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1405");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "no", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1406");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 97, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1407");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "true", "true", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1408");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 52, (java.lang.Integer) 32, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4.equals(52));
    }

    @Test
    public void BooleanUtils1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1409");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 52, (java.lang.Integer) 0, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1410");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 97, (java.lang.Integer) (-1), (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1411");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean9 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void BooleanUtils1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1412");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1413");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
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
    public void BooleanUtils1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1414");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 0, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1415");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1416");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false", "no", "true", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1417");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1418");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "off", "yes", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1419");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) 10, (int) ' ', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void BooleanUtils1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1420");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1421");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 0, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1422");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Class<?> wildcardClass9 = booleanArray1.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BooleanUtils1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1423");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "yes", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "yes" + "'", str3.equals("yes"));
    }

    @Test
    public void BooleanUtils1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1424");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 100, 32, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void BooleanUtils1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1425");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 1, (java.lang.Integer) 35, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1426");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(100, (int) (byte) 10, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1427");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Class<?> wildcardClass9 = booleanArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BooleanUtils1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1428");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("false", "true", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1429");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    public void BooleanUtils1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1430");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1431");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Class<?> wildcardClass9 = booleanArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void BooleanUtils1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1432");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 97, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1433");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) '4', 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1434");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void BooleanUtils1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1435");
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { true, false, false, false, true, true };
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8.equals(false));
    }

    @Test
    public void BooleanUtils1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1436");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, 97, 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void BooleanUtils1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1437");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Class<?> wildcardClass8 = booleanArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void BooleanUtils1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1438");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(32, (int) (short) -1, 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1439");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    public void BooleanUtils1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1440");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 97, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3.equals(97));
    }

    @Test
    public void BooleanUtils1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1441");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("true", "", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1442");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, false };
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray2);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray2);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray2);
        java.lang.Class<?> wildcardClass6 = booleanArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void BooleanUtils1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1443");
        boolean[] booleanArray1 = new boolean[] { true };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
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
    public void BooleanUtils1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1444");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) ' ', (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1445");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "off", "on", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "on" + "'", str4.equals("on"));
    }

    @Test
    public void BooleanUtils1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1446");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "yes", "true", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
    }

    @Test
    public void BooleanUtils1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1447");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 97, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1448");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "off", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1449");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1450");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1451");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) (-1), (java.lang.Integer) 52, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1452");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "false", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1453");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(32, (int) (short) -1, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1454");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 97, 100, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void BooleanUtils1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1455");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 35, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3.equals(35));
    }

    @Test
    public void BooleanUtils1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1456");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 32, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BooleanUtils1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1457");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1458");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("off", "true", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1459");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 100, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void BooleanUtils1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1460");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (short) 1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BooleanUtils1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1461");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 0, (int) (short) 10, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void BooleanUtils1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1462");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1463");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 100, (int) 'a', (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1464");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "false", "on", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "on" + "'", str4.equals("on"));
    }

    @Test
    public void BooleanUtils1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1465");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "false", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "no" + "'", str3.equals("no"));
    }

    @Test
    public void BooleanUtils1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1466");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, 10, 35, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void BooleanUtils1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1467");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 35, (java.lang.Integer) 97, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4.equals(97));
    }

    @Test
    public void BooleanUtils1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1468");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "hi!", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1469");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 52, (java.lang.Integer) 32, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1470");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "off", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1471");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) '4', 35, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void BooleanUtils1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1472");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 35, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1473");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    }

    @Test
    public void BooleanUtils1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1474");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Class<?> wildcardClass7 = booleanArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BooleanUtils1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1475");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean9 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    public void BooleanUtils1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1476");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 10, (int) (short) 0, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1477");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1478");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 35, (java.lang.Integer) 1, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1479");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("false", "yes", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1480");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) -1, (int) (byte) 1, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1481");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 10, (int) (short) 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void BooleanUtils1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1482");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(97, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1483");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (short) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BooleanUtils1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1484");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
    }

    @Test
    public void BooleanUtils1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1485");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 97, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1486");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 97, (java.lang.Integer) 1, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1487");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 0, 52, (int) (byte) 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1488");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "on", "off", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1489");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, 32, 100, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void BooleanUtils1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1490");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, 32, (int) (byte) 10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void BooleanUtils1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1491");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) 'a', (int) 'a', (int) (short) -1, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1492");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "true", "false", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1493");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 100, 35, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void BooleanUtils1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1494");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) '4', (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1495");
        boolean[] booleanArray3 = new boolean[] { true, true, true };
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray3);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void BooleanUtils1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1496");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 97, (java.lang.Integer) 1, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1497");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
    }

    @Test
    public void BooleanUtils1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1498");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Class<?> wildcardClass7 = booleanArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void BooleanUtils1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1499");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils2.BooleanUtils1500");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "false", "true", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
    }
}

