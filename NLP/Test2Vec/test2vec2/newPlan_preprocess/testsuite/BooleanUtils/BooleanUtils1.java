package BooleanUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BooleanUtils1 {

    public static boolean debug = false;

    @Test
    public void BooleanUtils0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0501");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0502");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 1, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0503");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void BooleanUtils0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0504");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "no", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void BooleanUtils0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0505");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 10, 35, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0506");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 0, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0507");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (byte) 1, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BooleanUtils0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0508");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, 97, (int) (byte) -1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void BooleanUtils0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0509");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) 0, (int) (short) 1, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void BooleanUtils0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0510");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 35, (java.lang.Integer) 1, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0511");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("true", "yes", "hi!", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0512");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 97, (java.lang.Integer) 100, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4.equals(97));
    }

    @Test
    public void BooleanUtils0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0513");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (short) 0, 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void BooleanUtils0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0514");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0515");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (short) 100, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0516");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 32, (java.lang.Integer) 32, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0517");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) -1, (int) (short) -1, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BooleanUtils0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0518");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "on", "false", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "on" + "'", str4.equals("on"));
    }

    @Test
    public void BooleanUtils0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0519");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(97, (int) 'a', (int) '#', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0520");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 32, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void BooleanUtils0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0521");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 0, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0522");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "no", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "no" + "'", str3.equals("no"));
    }

    @Test
    public void BooleanUtils0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0523");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) 'a', 32, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0524");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0525");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0526");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 10, 0, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0527");
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { true, false, false, false, false, true };
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean9 = org.apache.commons.lang3.BooleanUtils.and(booleanArray6);
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
    public void BooleanUtils0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0528");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    public void BooleanUtils0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0529");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "true", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0530");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 32, (-1), 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BooleanUtils0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0531");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 35, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3.equals(35));
    }

    @Test
    public void BooleanUtils0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0532");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0533");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "true", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
    }

    @Test
    public void BooleanUtils0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0534");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("true", "false", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0535");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void BooleanUtils0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0536");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "yes", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0537");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void BooleanUtils0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0538");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "true", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0539");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0540");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 0, (int) (short) 10, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0541");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "off", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0542");
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { true, false, false, false, true, true };
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        java.lang.Boolean boolean9 = org.apache.commons.lang3.BooleanUtils.and(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void BooleanUtils0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0543");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "off", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "off" + "'", str3.equals("off"));
    }

    @Test
    public void BooleanUtils0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0544");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 97, (java.lang.Integer) 10, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void BooleanUtils0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0545");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "off", "on", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0546");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0547");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0548");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0549");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 0, (int) (byte) 1, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0550");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 1, (int) (short) 10, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void BooleanUtils0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0551");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) '4', (int) (short) 100, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0552");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "hi!", "false", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0553");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 100, (int) (short) 100, (int) (short) 0, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0554");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("no", "", "no", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0555");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (short) 0, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void BooleanUtils0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0556");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "false", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0557");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0558");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 10, (int) '4', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void BooleanUtils0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0559");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0560");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((-1), (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0561");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 1, (java.lang.Integer) 97, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4.equals(97));
    }

    @Test
    public void BooleanUtils0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0562");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0563");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (byte) 1, 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BooleanUtils0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0564");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 100, (int) (short) 0, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void BooleanUtils0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0565");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 35, (int) ' ', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void BooleanUtils0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0566");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(100, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0567");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 1, (java.lang.Integer) 35, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0568");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "", "", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0569");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0570");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "on", "no", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0571");
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { true, false, false, false, false, true };
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray6);
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
    public void BooleanUtils0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0572");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "yes", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0573");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("false", "yes", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0574");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(97, (int) (short) 10, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0575");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0576");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (short) 1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void BooleanUtils0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0577");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    public void BooleanUtils0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0578");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "", "hi!", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0579");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(0, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0580");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 35, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0581");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "on", "on", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "on" + "'", str4.equals("on"));
    }

    @Test
    public void BooleanUtils0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0582");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 35, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3.equals(35));
    }

    @Test
    public void BooleanUtils0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0583");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 100, 32, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void BooleanUtils0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0584");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0585");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) -1, (int) (byte) 100, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0586");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) ' ', 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0587");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 97, (java.lang.Integer) 52, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0588");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 32, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0589");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) ' ', (int) (short) 10, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0590");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0591");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean1 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0592");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(0, (int) ' ', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0593");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(1, (int) '#', 32, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0594");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Class<?> wildcardClass5 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
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
    public void BooleanUtils0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0595");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) ' ', (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0596");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 0, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3.equals(32));
    }

    @Test
    public void BooleanUtils0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0597");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "hi!", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void BooleanUtils0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0598");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 52, (java.lang.Integer) 32, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0599");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void BooleanUtils0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0600");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) 'a', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void BooleanUtils0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0601");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("false", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0602");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("true", "true", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0603");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) -1, (int) (short) 100, (int) (short) -1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0604");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "on", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0605");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0606");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "true", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
    }

    @Test
    public void BooleanUtils0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0607");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0608");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) (-1), (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3.equals(10));
    }

    @Test
    public void BooleanUtils0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0609");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 100, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0610");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
    }

    @Test
    public void BooleanUtils0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0611");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 0, (int) (byte) 0, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0612");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 100, 32, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0613");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void BooleanUtils0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0614");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("off", "no", "true", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0615");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0616");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0617");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0618");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0619");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("on", "no", "", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0620");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    public void BooleanUtils0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0621");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 10, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0622");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0623");
        boolean[] booleanArray6 = new boolean[] { true, false, true, false, false, false };
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray6);
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
    public void BooleanUtils0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0624");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) ' ', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void BooleanUtils0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0625");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void BooleanUtils0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0626");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0627");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0628");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 10, 100, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0629");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0630");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0631");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void BooleanUtils0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0632");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "false", "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void BooleanUtils0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0633");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(0, (int) (short) 0, (int) (byte) 100, 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0634");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Class<?> wildcardClass5 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
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
    public void BooleanUtils0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0635");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0636");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 1, (int) (byte) 100, (int) (short) -1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0637");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 52, 0, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void BooleanUtils0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0638");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0639");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BooleanUtils0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0640");
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { true, false, false, false, false, true };
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        java.lang.Boolean boolean9 = org.apache.commons.lang3.BooleanUtils.or(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void BooleanUtils0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0641");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 32, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3.equals(32));
    }

    @Test
    public void BooleanUtils0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0642");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0643");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0644");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(1, (int) '4', 52, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0645");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0646");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "yes", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0647");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("on", "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0648");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0649");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("true", "hi!", "no", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0650");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0651");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (short) 0, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BooleanUtils0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0652");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 52, (int) '#', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void BooleanUtils0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0653");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("true", "", "false", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0654");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(100, (int) (byte) 100, (int) (byte) 0, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0655");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0656");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 35, (java.lang.Integer) (-1), (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0657");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 32, (java.lang.Integer) 100, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0658");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 52, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0659");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "on", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0660");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void BooleanUtils0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0661");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) ' ', 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void BooleanUtils0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0662");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 32, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0663");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("true", "off", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0664");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) 97, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0665");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("hi!", "true", "yes", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0666");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0667");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 35, (java.lang.Integer) 35, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0668");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 35, (java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3.equals(52));
    }

    @Test
    public void BooleanUtils0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0669");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "yes", "on", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0670");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 32, (java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3.equals(32));
    }

    @Test
    public void BooleanUtils0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0671");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    public void BooleanUtils0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0672");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "no", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "no" + "'", str4.equals("no"));
    }

    @Test
    public void BooleanUtils0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0673");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 97, (java.lang.Integer) (-1), (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0674");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(0, (int) '4', 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0675");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("on", "", "true", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0676");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0677");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) ' ', 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0678");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 52, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0679");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 0, (int) (short) 1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0680");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) '4', 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void BooleanUtils0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0681");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    public void BooleanUtils0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0682");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0683");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4.equals(32));
    }

    @Test
    public void BooleanUtils0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0684");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 100, 1, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0685");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("no", "on", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0686");
        java.lang.Boolean[] booleanArray0 = new java.lang.Boolean[] {};
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.and(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array is empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray0);
    }

    @Test
    public void BooleanUtils0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0687");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 52, (java.lang.Integer) 0, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0688");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 1, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3.equals(1));
    }

    @Test
    public void BooleanUtils0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0689");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 97, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0690");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 97, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0691");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0692");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 10, 100, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0693");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("on", "true", "off", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0694");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 10, (java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3.equals(10));
    }

    @Test
    public void BooleanUtils0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0695");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "yes", "off");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "yes" + "'", str3.equals("yes"));
    }

    @Test
    public void BooleanUtils0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0696");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "off", "off", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0697");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "true", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
    }

    @Test
    public void BooleanUtils0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0698");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
    }

    @Test
    public void BooleanUtils0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0699");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 35, (java.lang.Integer) 1, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0700");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "false", "", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0701");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 97, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0702");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 1, 0, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0703");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "hi!", "on", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0704");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0705");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) -1, (int) (byte) 10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BooleanUtils0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0706");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0707");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 32, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0708");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0709");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 52, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0710");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 52, (java.lang.Integer) 10, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0711");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(97, (int) (byte) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0712");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 0, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }

    @Test
    public void BooleanUtils0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0713");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 35, (java.lang.Integer) 1, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0714");
        java.lang.Boolean[] booleanArray2 = new java.lang.Boolean[] { false, false };
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray2);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray2);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray2);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray2);
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
    public void BooleanUtils0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0715");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "on", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "on" + "'", str3.equals("on"));
    }

    @Test
    public void BooleanUtils0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0716");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "hi!", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void BooleanUtils0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0717");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 97, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0718");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0719");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(32, 52, 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0720");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0721");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 52, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0722");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(0, 32, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0723");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 10, (int) 'a', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void BooleanUtils0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0724");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0725");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    public void BooleanUtils0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0726");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) '#', (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0727");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 32, (java.lang.Integer) (-1), (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0728");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) '#', (int) (byte) 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0729");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "false", "yes", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0730");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0731");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false", "no", "", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0732");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0733");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(10, (int) (byte) 10, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0734");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) 'a', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0735");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 100, (-1), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0736");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BooleanUtils0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0737");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (short) -1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void BooleanUtils0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0738");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "true", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
    }

    @Test
    public void BooleanUtils0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0739");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0740");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) (-1), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0741");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) ' ', 100, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0742");
        boolean[] booleanArray1 = new boolean[] { true };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Class<?> wildcardClass4 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void BooleanUtils0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0743");
        java.lang.Boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1.equals(true));
    }

    @Test
    public void BooleanUtils0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0744");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (byte) 1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BooleanUtils0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0745");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(1, 52, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0746");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0747");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "false", "hi!", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void BooleanUtils0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0748");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((-1), (-1), (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0749");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 0, (int) '#', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void BooleanUtils0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0750");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("off", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0751");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) ' ', (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0752");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 97, (java.lang.Integer) 10, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0753");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9.equals(false));
    }

    @Test
    public void BooleanUtils0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0754");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "on", "off", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "off" + "'", str4.equals("off"));
    }

    @Test
    public void BooleanUtils0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0755");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "off", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "on" + "'", str3.equals("on"));
    }

    @Test
    public void BooleanUtils0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0756");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (short) -1, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0757");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("hi!", "on", "yes", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0758");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0759");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 35, (java.lang.Integer) 35, (java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0760");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("hi!", "false", "hi!", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0761");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "yes", "hi!", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0762");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 32, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0763");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(100, 35, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0764");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (-1), 100, 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void BooleanUtils0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0765");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("off", "on", "false", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0766");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "no", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0767");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "yes", "off", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0768");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "true", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0769");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 10, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3.equals(97));
    }

    @Test
    public void BooleanUtils0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0770");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 1, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0771");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void BooleanUtils0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0772");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "false", "", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0773");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 97, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0774");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0775");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0776");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "hi!", "on", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0777");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 35, (java.lang.Integer) 0, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0778");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "off", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0779");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0780");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
    }

    @Test
    public void BooleanUtils0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0781");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) -1, (int) '#', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void BooleanUtils0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0782");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("true", "no", "true", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0783");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 97, (java.lang.Integer) 10, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0784");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(1, (int) (short) 100, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0785");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 35, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0786");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (short) 0, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BooleanUtils0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0787");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0788");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0789");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) ' ', 35, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0790");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "false", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
    }

    @Test
    public void BooleanUtils0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0791");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0792");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 100, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0793");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 35, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0794");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 97, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0795");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 100, (java.lang.Integer) 97, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
    }

    @Test
    public void BooleanUtils0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0796");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) (-1), (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3.equals(32));
    }

    @Test
    public void BooleanUtils0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0797");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 10, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0798");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("hi!", "false", "yes", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0799");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(10, (int) (byte) 10, (int) (byte) 1, 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0800");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(0, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0801");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "no", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0802");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "hi!", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0803");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "no", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0804");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, 35, (int) (short) -1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void BooleanUtils0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0805");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0806");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "false", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "on" + "'", str3.equals("on"));
    }

    @Test
    public void BooleanUtils0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0807");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 97, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3.equals(97));
    }

    @Test
    public void BooleanUtils0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0808");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 35, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3.equals(35));
    }

    @Test
    public void BooleanUtils0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0809");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "false", "off", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0810");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "no", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
    }

    @Test
    public void BooleanUtils0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0811");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 32, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0812");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    public void BooleanUtils0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0813");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0814");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(10, (-1), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0815");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 100, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BooleanUtils0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0816");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0817");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0818");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "no", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "no" + "'", str4.equals("no"));
    }

    @Test
    public void BooleanUtils0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0819");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0820");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 0, (-1), (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0821");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("true", "", "no", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0822");
        boolean[] booleanArray1 = new boolean[] { true };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Class<?> wildcardClass3 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void BooleanUtils0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0823");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    public void BooleanUtils0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0824");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "no", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0825");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0826");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((-1), 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0827");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("false", "false", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0828");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "no", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "no" + "'", str3.equals("no"));
    }

    @Test
    public void BooleanUtils0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0829");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 10, 0, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void BooleanUtils0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0830");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean1 = org.apache.commons.lang3.BooleanUtils.and(booleanArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0831");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 35, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void BooleanUtils0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0832");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(32, (int) (byte) 1, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0833");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 97, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0834");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0835");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        java.lang.Boolean boolean9 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
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
    public void BooleanUtils0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0836");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 52, (java.lang.Integer) 1, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0837");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0838");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0839");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) '#', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void BooleanUtils0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0840");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void BooleanUtils0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0841");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "false", "true", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void BooleanUtils0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0842");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "true", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0843");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 32, (java.lang.Integer) (-1), (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4.equals(32));
    }

    @Test
    public void BooleanUtils0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0844");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("true", "hi!", "hi!", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0845");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 1, (int) (short) 100, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0846");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "on", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
    }

    @Test
    public void BooleanUtils0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0847");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) (-1), (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0848");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 35, (int) '4', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void BooleanUtils0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0849");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("true", "on", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0850");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0851");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, 1, 32, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0852");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "yes", "", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0853");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 32, (java.lang.Integer) 10, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4.equals(32));
    }

    @Test
    public void BooleanUtils0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0854");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0855");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0856");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    public void BooleanUtils0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0857");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(35, (int) '4', (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0858");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "", "no", "yes");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0859");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 32, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0860");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (byte) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BooleanUtils0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0861");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 97, (java.lang.Integer) 97, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0862");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0863");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "yes", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "true" + "'", str3.equals("true"));
    }

    @Test
    public void BooleanUtils0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0864");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) (-1), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0865");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 0, 35, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0866");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 32, (java.lang.Integer) 52, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4.equals(52));
    }

    @Test
    public void BooleanUtils0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0867");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 32, (java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3.equals(52));
    }

    @Test
    public void BooleanUtils0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0868");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
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
    public void BooleanUtils0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0869");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0870");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 10, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0871");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(100, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0872");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0873");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0874");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0875");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false", "no", "", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0876");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0877");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("no", "off", "yes", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0878");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, 97, (int) ' ', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void BooleanUtils0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0879");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "on", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "on" + "'", str3.equals("on"));
    }

    @Test
    public void BooleanUtils0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0880");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0881");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("no", "on", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0882");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 35, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3.equals((-1)));
    }

    @Test
    public void BooleanUtils0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0883");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, 0, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BooleanUtils0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0884");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 1, (int) (short) 1, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void BooleanUtils0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0885");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(10, 100, 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0886");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 1, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0887");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) -1, 0, (int) (short) 10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0888");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (byte) 100, 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0889");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) -1, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0890");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0891");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("hi!", "yes", "off", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0892");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("off", "on", "off", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0893");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 100, 52, 32, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0894");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 100, (int) (short) -1, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0895");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("true", "hi!", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0896");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 10, (int) '#', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void BooleanUtils0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0897");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, (int) (byte) -1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BooleanUtils0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0898");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
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
    }

    @Test
    public void BooleanUtils0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0899");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 100, 1, (int) (byte) 1, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void BooleanUtils0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0900");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 97, (java.lang.Integer) 1, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4.equals(97));
    }

    @Test
    public void BooleanUtils0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0901");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 0, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0902");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0903");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 52, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0904");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("off", "off", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0905");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(0, (int) (byte) 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0906");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (byte) 100, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0907");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) '4', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void BooleanUtils0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0908");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0909");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 52, (java.lang.Integer) 52, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4.equals(52));
    }

    @Test
    public void BooleanUtils0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0910");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 100, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0911");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, (int) '#', (int) (byte) 10, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void BooleanUtils0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0912");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 32, (java.lang.Integer) 35, (java.lang.Integer) 32, (java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0913");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0914");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (byte) 10, (int) (byte) 1, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0915");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "off", "true", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "true" + "'", str4.equals("true"));
    }

    @Test
    public void BooleanUtils0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0916");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, 10, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void BooleanUtils0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0917");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 52, (java.lang.Integer) 35, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4.equals(52));
    }

    @Test
    public void BooleanUtils0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0918");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    public void BooleanUtils0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0919");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "false", "off", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0920");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 32, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0921");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "hi!", "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void BooleanUtils0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0922");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(0, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0923");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("yes", "", "no", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0924");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, (int) (byte) 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void BooleanUtils0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0925");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 35, (java.lang.Integer) 1, (java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0926");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 1, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void BooleanUtils0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0927");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0928");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("off", "false", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0929");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        java.lang.Class<?> wildcardClass3 = booleanArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void BooleanUtils0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0930");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "false", "false");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "false" + "'", str3.equals("false"));
    }

    @Test
    public void BooleanUtils0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0931");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) ' ', 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0932");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(true, 100, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0933");
        int int3 = org.apache.commons.lang3.BooleanUtils.toInteger(false, 100, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void BooleanUtils0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0934");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 97, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0935");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "true", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "no" + "'", str3.equals("no"));
    }

    @Test
    public void BooleanUtils0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0936");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(0, (int) ' ', 97, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0937");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0938");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) false, 100, (int) (byte) 0, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void BooleanUtils0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0939");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("no", "false", "true", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0940");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
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
    public void BooleanUtils0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0941");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void BooleanUtils0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0942");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "false", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void BooleanUtils0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0943");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("on", "no", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0944");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    public void BooleanUtils0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0945");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) (short) 0, (-1), (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0946");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) true, "", "off", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void BooleanUtils0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0947");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0948");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 52, (java.lang.Integer) 52, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4.equals(52));
    }

    @Test
    public void BooleanUtils0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0949");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((-1), (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0950");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((int) ' ', (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0951");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("off", "no", "yes", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0952");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) (-1), (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0953");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0954");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "hi!", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0955");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { false, true, false, false };
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.and(booleanArray4);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray4);
        java.lang.Boolean boolean9 = org.apache.commons.lang3.BooleanUtils.or(booleanArray4);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9.equals(true));
    }

    @Test
    public void BooleanUtils0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0956");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    public void BooleanUtils0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0957");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("false", "false", "no");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void BooleanUtils0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0958");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 52, (java.lang.Integer) 52, (java.lang.Integer) 0, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0959");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(97, 0, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0960");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 32, (java.lang.Integer) 97, (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4.equals(97));
    }

    @Test
    public void BooleanUtils0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0961");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void BooleanUtils0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0962");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { true };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2.equals(true));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3.equals(true));
    }

    @Test
    public void BooleanUtils0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0963");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(100, (int) '4', 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0964");
        java.lang.Boolean[] booleanArray6 = new java.lang.Boolean[] { true, false, false, false, true, true };
        java.lang.Boolean boolean7 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray6);
        java.lang.Boolean boolean8 = org.apache.commons.lang3.BooleanUtils.and(booleanArray6);
        java.lang.Boolean boolean9 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray6);
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
    public void BooleanUtils0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0965");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("no", "hi!", "false", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0966");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    public void BooleanUtils0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0967");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("hi!", "off", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0968");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
    }

    @Test
    public void BooleanUtils0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0969");
        boolean boolean1 = org.apache.commons.lang3.BooleanUtils.toBoolean(52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void BooleanUtils0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0970");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 1, (java.lang.Integer) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0971");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(97, 32, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0972");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(false, (java.lang.Integer) 10, (java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3.equals(52));
    }

    @Test
    public void BooleanUtils0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0973");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(false, "off", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void BooleanUtils0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0974");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean("yes", "", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0975");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((int) (short) 1, (-1), (int) (byte) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0976");
        int int4 = org.apache.commons.lang3.BooleanUtils.toInteger((java.lang.Boolean) true, 97, 52, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void BooleanUtils0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0977");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
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
    public void BooleanUtils0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0978");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean6 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    public void BooleanUtils0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0979");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 52, (java.lang.Integer) 100, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0980");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("false", "on", "false", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0981");
        java.lang.Boolean[] booleanArray1 = new java.lang.Boolean[] { false };
        java.lang.Boolean boolean2 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        java.lang.Boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        java.lang.Boolean boolean5 = org.apache.commons.lang3.BooleanUtils.xor(booleanArray1);
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
    public void BooleanUtils0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0982");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("", "", "no", "true");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0983");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0984");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.and(booleanArray1);
        boolean boolean4 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
        boolean boolean5 = org.apache.commons.lang3.BooleanUtils.or(booleanArray1);
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
    public void BooleanUtils0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0985");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) 1, (java.lang.Integer) 32, (java.lang.Integer) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4.equals(32));
    }

    @Test
    public void BooleanUtils0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0986");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 32, (java.lang.Integer) 0, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0987");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) (-1), (java.lang.Integer) 97, (java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4.equals(97));
    }

    @Test
    public void BooleanUtils0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0988");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) false, (java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0989");
        boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(10, 32, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void BooleanUtils0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0990");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject("off", "off", "no", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4.equals(true));
    }

    @Test
    public void BooleanUtils0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0991");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(0, 52, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0992");
        java.lang.Integer int4 = org.apache.commons.lang3.BooleanUtils.toIntegerObject((java.lang.Boolean) true, (java.lang.Integer) 35, (java.lang.Integer) (-1), (java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4.equals(35));
    }

    @Test
    public void BooleanUtils0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0993");
        java.lang.String str3 = org.apache.commons.lang3.BooleanUtils.toString(true, "off", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "off" + "'", str3.equals("off"));
    }

    @Test
    public void BooleanUtils0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0994");
        java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(10, (int) 'a', (int) (short) 10, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4.equals(false));
    }

    @Test
    public void BooleanUtils0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0995");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            java.lang.Boolean boolean4 = org.apache.commons.lang3.BooleanUtils.toBooleanObject(100, 35, 52, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0996");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean(97, 32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0997");
        // The following exception was thrown during execution in BooleanUtils generation
        try {
            boolean boolean3 = org.apache.commons.lang3.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 0, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void BooleanUtils0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0998");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "true", "yes", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yes" + "'", str4.equals("yes"));
    }

    @Test
    public void BooleanUtils0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils0999");
        java.lang.String str4 = org.apache.commons.lang3.BooleanUtils.toString((java.lang.Boolean) false, "", "false", "on");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "false" + "'", str4.equals("false"));
    }

    @Test
    public void BooleanUtils1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooleanUtils1.BooleanUtils1000");
        java.lang.Integer int3 = org.apache.commons.lang3.BooleanUtils.toIntegerObject(true, (java.lang.Integer) 0, (java.lang.Integer) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
    }
}

