
package NumberUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NumberUtils0 {

    public static boolean debug = false;

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test001");
        java.lang.Short short0 = org.apache.commons.lang3.math.NumberUtils.SHORT_ZERO;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 0 + "'", short0.equals((short) 0));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test002");
        java.lang.Long long0 = org.apache.commons.lang3.math.NumberUtils.LONG_ZERO;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 0L + "'", long0.equals(0L));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test003");
        java.lang.Byte byte0 = org.apache.commons.lang3.math.NumberUtils.BYTE_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 1 + "'", byte0.equals((byte) 1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test004");
        java.lang.Long long0 = org.apache.commons.lang3.math.NumberUtils.LONG_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0.equals(1L));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test005");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test006");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length string");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test007");
        java.lang.Short short0 = org.apache.commons.lang3.math.NumberUtils.SHORT_MINUS_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) -1 + "'", short0.equals((short) -1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test008");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) -1, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test009");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 10, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test010");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test011");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1, 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test012");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test013");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test015");
        float[] floatArray3 = new float[] { (byte) -1, (byte) -1, 0.0f };
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.Class<?> wildcardClass5 = floatArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test016");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 100, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test017");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100L, (double) 100, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test018");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 10, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test019");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test020");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test021");
        java.lang.Byte byte0 = org.apache.commons.lang3.math.NumberUtils.BYTE_ZERO;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0.equals((byte) 0));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test022");
        java.lang.Float float0 = org.apache.commons.lang3.math.NumberUtils.FLOAT_ZERO;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0.equals(0.0f));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test023");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100L, (double) (short) 10, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test024");
        java.lang.Float float0 = org.apache.commons.lang3.math.NumberUtils.FLOAT_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0.equals(1.0f));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test025");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test026");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) ' ', (double) 0.0f, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test027");
        java.lang.Integer int0 = org.apache.commons.lang3.math.NumberUtils.INTEGER_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0.equals(1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test028");
        java.lang.Double double0 = org.apache.commons.lang3.math.NumberUtils.DOUBLE_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0.equals(1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test029");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test030");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '#', (long) (-1), (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test031");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(32.0d, (double) (byte) 1, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test032");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test033");
        java.lang.Short short0 = org.apache.commons.lang3.math.NumberUtils.SHORT_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 1 + "'", short0.equals((short) 1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test034");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test035");
        org.apache.commons.lang3.math.NumberUtils numberUtils0 = new org.apache.commons.lang3.math.NumberUtils();
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test036");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) (-1L), 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test037");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 0, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test038");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test039");
        double[] doubleArray0 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test040");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 100, (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test041");
        java.lang.Integer int0 = org.apache.commons.lang3.math.NumberUtils.INTEGER_ZERO;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0.equals(0));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test042");
        java.lang.Double double0 = org.apache.commons.lang3.math.NumberUtils.DOUBLE_MINUS_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + (-1.0d) + "'", double0.equals((-1.0d)));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test043");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, (int) (short) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test044");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 100, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test045");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 0, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test046");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test047");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test048");
        java.lang.Long long0 = org.apache.commons.lang3.math.NumberUtils.LONG_MINUS_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1L) + "'", long0.equals((-1L)));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test049");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test050");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test051");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test052");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) ' ', (float) (short) 10, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test053");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!", (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test054");
        java.lang.Byte byte0 = org.apache.commons.lang3.math.NumberUtils.BYTE_MINUS_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) -1 + "'", byte0.equals((byte) -1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test055");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test056");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test057");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test058");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test059");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test060");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test061");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 35, 10L, (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test062");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1.0f), (double) (short) 100, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test063");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test064");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test065");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test066");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test067");
        double[] doubleArray0 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test068");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test069");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 10, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test070");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) -1, (double) (short) 0, (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test071");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test072");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test073");
        long[] longArray0 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.lang3.math.NumberUtils.min(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test074");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length string");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test075");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 1, (long) (byte) 100, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test076");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 1, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test077");
        java.lang.Float float0 = org.apache.commons.lang3.math.NumberUtils.FLOAT_MINUS_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + (-1.0f) + "'", float0.equals((-1.0f)));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test078");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test079");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0.0f, (double) ' ', 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test080");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, (int) '#', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test081");
        short[] shortArray6 = new short[] { (byte) 1, (byte) 100, (short) 100, (short) 1, (byte) 0, (byte) 0 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test082");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100.0f, 0.0d, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test083");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 100, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test084");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test085");
        java.lang.Integer int0 = org.apache.commons.lang3.math.NumberUtils.INTEGER_MINUS_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0.equals((-1)));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test086");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test087");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test088");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) '#', 0.0f, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test089");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 1, (short) -1, (byte) 1, (short) 10 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.Class<?> wildcardClass7 = shortArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test090");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test091");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!", (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test092");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test093");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!", (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test094");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) -1, (double) (byte) -1, (double) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test095");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test096");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(10.0f, (float) 32, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test097");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 100, (-1L), (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test098");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 100, 35, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test099");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test100");
        java.lang.Double double0 = org.apache.commons.lang3.math.NumberUtils.DOUBLE_ZERO;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0.equals(0.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test101");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) 100, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test102");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test103");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) 1, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test104");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test105");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test106");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 1, (long) '4', (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test107");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test108");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test109");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test110");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 10, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test111");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(32, 32, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test112");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 100, 1.0f, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test113");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 32, (float) 100L, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test114");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 0, (int) (byte) 1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test115");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1, 1L, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test116");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(32, (int) (byte) 1, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test117");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 0, (long) ' ', (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test118");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 35, (double) 52L, (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test119");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 1, (long) 10, (long) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test120");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test121");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 0, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test122");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test123");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test124");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0L, (double) 10, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test125");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test126");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 10, (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test127");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 10, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test128");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(32.0d, 32.0d, (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test129");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 0, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test130");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) ' ', (long) 0, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test131");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 10, 1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test132");
        long[] longArray2 = new long[] { 0, (byte) 100 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test133");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) 10, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test134");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test135");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 0L, (float) 0, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test136");
        long[] longArray2 = new long[] { (byte) 100, (byte) 0 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test137");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) -1, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test138");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 100, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test139");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) ' ', 32, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test140");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1, (double) 32, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test141");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 1, (int) '4', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test142");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test143");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 100L, 100.0f, 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test144");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(52L, (long) 32, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test145");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test146");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 0L, 100.0f, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test147");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 100, (int) (byte) 1, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test148");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10L, (double) ' ', (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test149");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test150");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        java.lang.Class<?> wildcardClass5 = doubleArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test151");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!", (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test152");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, 32, (byte) 1, 1, 100 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test153");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 0, (int) (short) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test154");
        int[] intArray1 = new int[] { ' ' };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.Class<?> wildcardClass3 = intArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test155");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test156");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test157");
        double[] doubleArray5 = new double[] { (byte) 0, (short) -1, (-1.0d), (byte) 10, (short) -1 };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test158");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (-1L), (long) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test159");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test160");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) ' ', (int) (short) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test161");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!", (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test162");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0, (double) 100L, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test163");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test164");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test165");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test166");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 10, (long) (short) 0, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test167");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!", (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test168");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!", (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test169");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0L, (double) (-1L), 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test170");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 1, (double) 10L, (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test171");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test172");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '#', (long) (byte) 0, (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test173");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) -1, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test174");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test175");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test176");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test177");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!", (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test178");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.lang3.math.NumberUtils.max(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test179");
        int[] intArray0 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.math.NumberUtils.max(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test180");
        double[] doubleArray4 = new double[] { (-1.0d), (byte) 1, 100.0f, 100 };
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test181");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 35, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test182");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test183");
        float[] floatArray6 = new float[] { (short) 0, (byte) 10, (byte) 100, '#', 100, 1 };
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test184");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1.0f, (double) 32.0f, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test185");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', 32, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test186");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test187");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 1, (int) (short) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test188");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test189");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 100, (int) (short) 1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test190");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang3.math.NumberUtils.max(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test191");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test192");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte1 = org.apache.commons.lang3.math.NumberUtils.max(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test193");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) (short) 1, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test194");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1L, (double) 0.0f, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test195");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test196");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.math.NumberUtils.max(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test197");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 1, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test198");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, 32, (byte) 1, 1, 100 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test199");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 1, (short) -1, (byte) 1, (short) 10 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test200");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((-1), 10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test201");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test202");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test203");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((-1L), (-1L), (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test204");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test205");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) -1, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test206");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 100, (float) 'a', 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test207");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 32, (long) (short) 1, (long) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test208");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) -1, (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test209");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '#', 32L, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test210");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test211");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 0, 0L, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test212");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) -1, (long) 0, (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test213");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 1, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test214");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) 100, (double) 100, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test215");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 10, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test216");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 100, (float) 52, (float) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test217");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test218");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 100, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test219");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 100, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test220");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 100, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test221");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test222");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) 0, (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test223");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, 52, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test224");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 10, (float) 100, (float) 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test225");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test226");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test227");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 'a', (float) 1, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test228");
        long[] longArray2 = new long[] { 0, (byte) 100 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.Class<?> wildcardClass5 = longArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test229");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '#', (long) (short) 10, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test230");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) -1, (double) 52L, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test231");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) '#', (-1.0d), (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test232");
        float[] floatArray3 = new float[] { (byte) -1, (byte) -1, 0.0f };
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.Class<?> wildcardClass6 = floatArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test233");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) -1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test234");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test235");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test236");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        java.lang.Class<?> wildcardClass6 = doubleArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test237");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 100, 35.0f, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test238");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test239");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 0, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test240");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(35.0d, (double) '4', 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test241");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!", (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test242");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test243");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test244");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!", (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test245");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 0, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test246");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 100, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test247");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 1.0d, (double) 52L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test248");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 100L, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test249");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 32L, 32.0f, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test250");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 100, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test251");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test252");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) 10, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test253");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(35.0d, (double) (short) 1, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test254");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '#', (long) 52, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test255");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '#', (int) (short) -1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test256");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) ' ', (long) 0, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test257");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test258");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test259");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) (byte) 0, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test260");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (-1), (long) '4', (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test261");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 10, (double) 1L, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test262");
        long[] longArray2 = new long[] { 0, (byte) 100 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test263");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) -1, 0.0d, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test264");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 1, (short) -1, (byte) 1, (short) 10 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test265");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test266");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) (byte) 100, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test267");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        java.lang.Class<?> wildcardClass5 = doubleArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test268");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test269");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(32, 10, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test270");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 0, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test271");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test272");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test273");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 100, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test274");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 100, (long) 32, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test275");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test276");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '#', (int) (byte) 100, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test277");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', 10, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test278");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) ' ', (float) ' ', 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test279");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test280");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 100, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test281");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 100, (long) (byte) -1, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test282");
        float[] floatArray3 = new float[] { (byte) -1, (byte) -1, 0.0f };
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        java.lang.Class<?> wildcardClass6 = floatArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test283");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test284");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 1, 0, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test285");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) -1, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test286");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 1, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test287");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) -1, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test288");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!", (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test289");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test290");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(100.0f, (float) '4', 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test291");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (-1L), 1.0f, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test292");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test293");
        float[] floatArray6 = new float[] { (short) 0, (byte) 10, (byte) 100, '#', 100, 1 };
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test294");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) '4', (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test295");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 52, (long) (byte) 1, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test296");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 10, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test297");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 32, (long) 10, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test298");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 10, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test299");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(10.0f, (float) 32, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test300");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test301");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) -1, (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test302");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 100, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test303");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) '#', (float) (byte) 1, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test304");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 10, 10.0f, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test305");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test306");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1), (double) (short) 10, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test307");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 100.0d, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test308");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) -1, (int) (byte) 100, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test309");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.math.NumberUtils.min(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test310");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) (byte) 0, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test311");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 100, (long) (short) 100, 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test312");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 1L, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test313");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(1.0f, (float) '4', (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test314");
        float[] floatArray2 = new float[] { (-1L), '#' };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.Class<?> wildcardClass4 = floatArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test315");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 10, (float) 52L, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test316");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 10, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test317");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test318");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 32, (float) 0L, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test319");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) 0, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test320");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 100, (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test321");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test322");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 100, (long) 1, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test323");
        short[] shortArray6 = new short[] { (byte) 1, (byte) 100, (short) 100, (short) 1, (byte) 0, (byte) 0 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test324");
        int[] intArray1 = new int[] { (short) 100 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test325");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test326");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test327");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test328");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 52L, (float) 32L, (float) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test329");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) 1, (double) 97.0f, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test330");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 52.0f, (double) (byte) 10, (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test331");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) (byte) 100, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test332");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!", (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test333");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(10.0f, (float) 52, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test334");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) 100, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test335");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(100L, (long) 0, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test336");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100, (double) ' ', (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test337");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '4', (int) '4', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test338");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 100, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test339");
        double[] doubleArray5 = new double[] { (byte) 0, (short) -1, (-1.0d), (byte) 10, (short) -1 };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test340");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test341");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) -1, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test342");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte1 = org.apache.commons.lang3.math.NumberUtils.min(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test343");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        java.lang.Class<?> wildcardClass8 = doubleArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test344");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test345");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 1, (short) -1, (byte) 1, (short) 10 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test346");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 0, (double) 32, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test347");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 10, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test348");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1), (double) (byte) 0, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test349");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 10, 10L, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test350");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(10.0d, (double) 100L, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test351");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(10, (int) (byte) 0, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test352");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(10.0f, (float) (byte) 0, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test353");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test354");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(100L, (long) (byte) 10, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test355");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10L, (double) 0L, (double) 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test356");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((-1), (int) (short) 1, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test357");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '#', 52, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test358");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(100, (int) (byte) 1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test359");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test360");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(100.0d, (double) 1.0f, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test361");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test362");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test363");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100L, (double) (byte) 100, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test364");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) -1, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test365");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(10.0f, (float) (byte) -1, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test366");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test367");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(32L, (long) (-1), (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test368");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) -1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test369");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) -1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test370");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(10, (int) (short) 10, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test371");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 32L, (float) 32, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test372");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) '#', (long) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test373");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) -1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.Class<?> wildcardClass9 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test374");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 97L, 32.0d, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test375");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", (float) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test376");
        int[] intArray1 = new int[] { ' ' };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test377");
        long[] longArray1 = new long[] { 10 };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.Class<?> wildcardClass3 = longArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test378");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) -1, 52.0f, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test379");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test380");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test381");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) -1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test382");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 10, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test383");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) (byte) 10, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test384");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test385");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test386");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 0, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test387");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 1, (short) -1, (byte) 1, (short) 10 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test388");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test389");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) 10, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test390");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(35.0f, (float) 0L, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test391");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) -1, 52, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test392");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(52, 35, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test393");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test394");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 10, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test395");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test396");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test397");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) -1, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test398");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 1, (float) 52L, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test399");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 1, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test400");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test401");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 52L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test402");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 32, (float) 32, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test403");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test404");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0.0f, 0.0d, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test405");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 97L, (float) 1L, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test406");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) ' ', (long) (byte) 1, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test407");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(10.0d, (double) 0L, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test408");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 10, (int) (byte) 10, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test409");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (short) 10, (byte) 100 };
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test410");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) '#', 0.0f, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test411");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) ' ', (long) ' ', (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test412");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 1, (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test413");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, (int) (byte) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test414");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 10, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test415");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test416");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, (int) (byte) 100, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test417");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 35, (long) (byte) 10, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test418");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test419");
        int[] intArray1 = new int[] { ' ' };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test420");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 0, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test421");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100L, (double) (short) 100, (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test422");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(52.0f, (float) 32, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test423");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(97L, (long) 1, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test424");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test425");
        float[] floatArray3 = new float[] { 10.0f, (byte) 0, (short) 1 };
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        java.lang.Class<?> wildcardClass5 = floatArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test426");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 97.0f, (double) 97L, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test427");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 10, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test428");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 52, (double) 0L, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test429");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) (byte) 0, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test430");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 52L, 0.0d, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test431");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 1, (short) -1, (byte) 1, (short) 10 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.Class<?> wildcardClass8 = shortArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test432");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) -1, 0L, 35L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test433");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test434");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(52.0d, (double) (short) 1, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test435");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, 0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test436");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(52.0d, 100.0d, (double) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test437");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test438");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1.0f, 10.0f, (float) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test439");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.Class<?> wildcardClass9 = byteArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test440");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 100, (float) (-1L), (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test441");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 10, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test442");
        float[] floatArray3 = new float[] { (byte) -1, (byte) -1, 0.0f };
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        java.lang.Class<?> wildcardClass7 = floatArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test443");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(32L, 0L, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test444");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) -1, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test445");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test446");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) ' ', 10, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test447");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(10.0d, (double) ' ', (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test448");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!", (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test449");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!", (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test450");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) -1, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test451");
        float[] floatArray3 = new float[] { (byte) -1, (byte) -1, 0.0f };
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test452");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test453");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(1.0d, 0.0d, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test454");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 1, 0.0d, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test455");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 0, 10, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test456");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1L, 100.0f, (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test457");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1, (float) 10L, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test458");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 100, (long) 'a', (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test459");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 97L, (float) (byte) 100, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test460");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (short) 10, (byte) 100 };
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test461");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 0, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test462");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 0, (int) (short) 1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test463");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 35, (long) (short) 1, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test464");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 32, (float) 52L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test465");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 1, (long) 'a', (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test466");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test467");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) 'a', 1, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test468");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(35L, (long) 100, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test469");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 10, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test470");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) '#', 0.0d, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test471");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 52L, (double) 10, (double) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test472");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 10, 10, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test473");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 10, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test474");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test475");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 97L, (double) 1L, (double) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test476");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) 1, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test477");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test478");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 100, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test479");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) ' ', 0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test480");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test481");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test482");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 1, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test483");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 100, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test484");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 10, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test485");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, (int) (short) 0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test486");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test487");
        long[] longArray2 = new long[] { (byte) 100, (byte) 0 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.Class<?> wildcardClass6 = longArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test488");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test489");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.Class<?> wildcardClass8 = byteArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test490");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test491");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(10, (int) (short) 0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test492");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 100, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test493");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test494");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1, 97L, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test495");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 1, (float) 1L, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test496");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(35, (int) (byte) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test497");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 100, 52.0f, (float) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test498");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test499");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.test500");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }
}

