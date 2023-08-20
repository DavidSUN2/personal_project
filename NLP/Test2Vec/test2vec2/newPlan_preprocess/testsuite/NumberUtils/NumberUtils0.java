package NumberUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NumberUtils0 {

    public static boolean debug = false;

    @Test
    public void NumberUtils001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils001");
        java.lang.Short short0 = org.apache.commons.lang3.math.NumberUtils.SHORT_ZERO;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 0 + "'", short0.equals((short) 0));
    }

    @Test
    public void NumberUtils002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils002");
        java.lang.Long long0 = org.apache.commons.lang3.math.NumberUtils.LONG_ZERO;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 0L + "'", long0.equals(0L));
    }

    @Test
    public void NumberUtils003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils003");
        java.lang.Byte byte0 = org.apache.commons.lang3.math.NumberUtils.BYTE_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 1 + "'", byte0.equals((byte) 1));
    }

    @Test
    public void NumberUtils004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils004");
        java.lang.Long long0 = org.apache.commons.lang3.math.NumberUtils.LONG_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0.equals(1L));
    }

    @Test
    public void NumberUtils005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils005");
        // The following exception was thrown during execution in NumberUtils generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils006");
        // The following exception was thrown during execution in NumberUtils generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length string");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils007");
        java.lang.Short short0 = org.apache.commons.lang3.math.NumberUtils.SHORT_MINUS_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) -1 + "'", short0.equals((short) -1));
    }

    @Test
    public void NumberUtils008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils008");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) -1, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils009");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 10, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils010");
        // The following exception was thrown during execution in NumberUtils generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils011");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1, 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils012");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void NumberUtils013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils013");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void NumberUtils014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils014");
        // The following exception was thrown during execution in NumberUtils generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils015");
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
    public void NumberUtils016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils016");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 100, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils017");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100L, (double) 100, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void NumberUtils018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils018");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 10, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils019");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void NumberUtils020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils020");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void NumberUtils021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils021");
        java.lang.Byte byte0 = org.apache.commons.lang3.math.NumberUtils.BYTE_ZERO;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0.equals((byte) 0));
    }

    @Test
    public void NumberUtils022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils022");
        java.lang.Float float0 = org.apache.commons.lang3.math.NumberUtils.FLOAT_ZERO;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0.equals(0.0f));
    }

    @Test
    public void NumberUtils023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils023");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100L, (double) (short) 10, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils024");
        java.lang.Float float0 = org.apache.commons.lang3.math.NumberUtils.FLOAT_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0.equals(1.0f));
    }

    @Test
    public void NumberUtils025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils025");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void NumberUtils026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils026");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) ' ', (double) 0.0f, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void NumberUtils027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils027");
        java.lang.Integer int0 = org.apache.commons.lang3.math.NumberUtils.INTEGER_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0.equals(1));
    }

    @Test
    public void NumberUtils028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils028");
        java.lang.Double double0 = org.apache.commons.lang3.math.NumberUtils.DOUBLE_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0.equals(1.0d));
    }

    @Test
    public void NumberUtils029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils029");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void NumberUtils030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils030");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '#', (long) (-1), (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils031");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(32.0d, (double) (byte) 1, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void NumberUtils032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils032");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void NumberUtils033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils033");
        java.lang.Short short0 = org.apache.commons.lang3.math.NumberUtils.SHORT_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 1 + "'", short0.equals((short) 1));
    }

    @Test
    public void NumberUtils034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils034");
        // The following exception was thrown during execution in NumberUtils generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils035");
        org.apache.commons.lang3.math.NumberUtils numberUtils0 = new org.apache.commons.lang3.math.NumberUtils();
    }

    @Test
    public void NumberUtils036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils036");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) (-1L), 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils037");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 0, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils038");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void NumberUtils039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils039");
        double[] doubleArray0 = new double[] {};
        // The following exception was thrown during execution in NumberUtils generation
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
    public void NumberUtils040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils040");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 100, (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils041");
        java.lang.Integer int0 = org.apache.commons.lang3.math.NumberUtils.INTEGER_ZERO;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0.equals(0));
    }

    @Test
    public void NumberUtils042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils042");
        java.lang.Double double0 = org.apache.commons.lang3.math.NumberUtils.DOUBLE_MINUS_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + (-1.0d) + "'", double0.equals((-1.0d)));
    }

    @Test
    public void NumberUtils043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils043");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, (int) (short) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils044");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 100, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils045");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 0, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils046");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void NumberUtils047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils047");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void NumberUtils048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils048");
        java.lang.Long long0 = org.apache.commons.lang3.math.NumberUtils.LONG_MINUS_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1L) + "'", long0.equals((-1L)));
    }

    @Test
    public void NumberUtils049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils049");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void NumberUtils050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils050");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void NumberUtils051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils051");
        // The following exception was thrown during execution in NumberUtils generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils052");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) ' ', (float) (short) 10, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void NumberUtils053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils053");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!", (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void NumberUtils054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils054");
        java.lang.Byte byte0 = org.apache.commons.lang3.math.NumberUtils.BYTE_MINUS_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) -1 + "'", byte0.equals((byte) -1));
    }

    @Test
    public void NumberUtils055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils055");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void NumberUtils056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils056");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils057");
        // The following exception was thrown during execution in NumberUtils generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils058");
        // The following exception was thrown during execution in NumberUtils generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils059");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void NumberUtils060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils060");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void NumberUtils061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils061");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 35, 10L, (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void NumberUtils062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils062");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1.0f), (double) (short) 100, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils063");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void NumberUtils064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils064");
        // The following exception was thrown during execution in NumberUtils generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils065");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void NumberUtils066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils066");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void NumberUtils067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils067");
        double[] doubleArray0 = new double[] {};
        // The following exception was thrown during execution in NumberUtils generation
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
    public void NumberUtils068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils068");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void NumberUtils069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils069");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 10, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils070");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) -1, (double) (short) 0, (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils071");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils072");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void NumberUtils073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils073");
        long[] longArray0 = new long[] {};
        // The following exception was thrown during execution in NumberUtils generation
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
    public void NumberUtils074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils074");
        // The following exception was thrown during execution in NumberUtils generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length string");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils075");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 1, (long) (byte) 100, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void NumberUtils076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils076");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 1, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils077");
        java.lang.Float float0 = org.apache.commons.lang3.math.NumberUtils.FLOAT_MINUS_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + (-1.0f) + "'", float0.equals((-1.0f)));
    }

    @Test
    public void NumberUtils078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils078");
        // The following exception was thrown during execution in NumberUtils generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils079");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0.0f, (double) ' ', 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils080");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, (int) '#', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils081");
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
    public void NumberUtils082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils082");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100.0f, 0.0d, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils083");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 100, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils084");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void NumberUtils085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils085");
        java.lang.Integer int0 = org.apache.commons.lang3.math.NumberUtils.INTEGER_MINUS_ONE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0.equals((-1)));
    }

    @Test
    public void NumberUtils086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils086");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils087");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void NumberUtils088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils088");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) '#', 0.0f, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils089");
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
    public void NumberUtils090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils090");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void NumberUtils091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils091");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!", (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void NumberUtils092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils092");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void NumberUtils093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils093");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!", (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void NumberUtils094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils094");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) -1, (double) (byte) -1, (double) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils095");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void NumberUtils096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils096");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(10.0f, (float) 32, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void NumberUtils097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils097");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 100, (-1L), (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils098");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 100, 35, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils099");
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
    public void NumberUtils100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils100");
        java.lang.Double double0 = org.apache.commons.lang3.math.NumberUtils.DOUBLE_ZERO;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0.equals(0.0d));
    }

    @Test
    public void NumberUtils101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils101");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) 100, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils102");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void NumberUtils103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils103");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) 1, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils104");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void NumberUtils105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils105");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void NumberUtils106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils106");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 1, (long) '4', (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void NumberUtils107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils107");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void NumberUtils108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils108");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void NumberUtils109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils109");
        // The following exception was thrown during execution in NumberUtils generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils110");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 10, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils111");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(32, 32, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void NumberUtils112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils112");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 100, 1.0f, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void NumberUtils113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils113");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 32, (float) 100L, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void NumberUtils114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils114");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 0, (int) (byte) 1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils115");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1, 1L, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils116");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(32, (int) (byte) 1, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils117");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 0, (long) ' ', (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils118");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 35, (double) 52L, (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void NumberUtils119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils119");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 1, (long) 10, (long) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void NumberUtils120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils120");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void NumberUtils121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils121");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 0, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils122");
        // The following exception was thrown during execution in NumberUtils generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils123");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void NumberUtils124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils124");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0L, (double) 10, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils125");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void NumberUtils126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils126");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 10, (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils127");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 10, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void NumberUtils128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils128");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(32.0d, 32.0d, (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils129");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 0, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils130");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) ' ', (long) 0, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void NumberUtils131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils131");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 10, 1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils132");
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
    public void NumberUtils133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils133");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) 10, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils134");
        // The following exception was thrown during execution in NumberUtils generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils135");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 0L, (float) 0, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils136");
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
    public void NumberUtils137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils137");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) -1, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils138");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 100, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils139");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) ' ', 32, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils140");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1, (double) 32, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void NumberUtils141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils141");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 1, (int) '4', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils142");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void NumberUtils143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils143");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 100L, 100.0f, 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void NumberUtils144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils144");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(52L, (long) 32, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void NumberUtils145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils145");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void NumberUtils146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils146");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 0L, 100.0f, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils147");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 100, (int) (byte) 1, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils148");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10L, (double) ' ', (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void NumberUtils149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils149");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils150");
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
    public void NumberUtils151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils151");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!", (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void NumberUtils152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils152");
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
    public void NumberUtils153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils153");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 0, (int) (short) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils154");
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
    public void NumberUtils155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils155");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void NumberUtils156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils156");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void NumberUtils157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils157");
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
    public void NumberUtils158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils158");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (-1L), (long) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void NumberUtils159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils159");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void NumberUtils160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils160");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) ' ', (int) (short) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void NumberUtils161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils161");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!", (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void NumberUtils162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils162");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0, (double) 100L, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils163");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void NumberUtils164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils164");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void NumberUtils165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils165");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void NumberUtils166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils166");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 10, (long) (short) 0, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils167");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!", (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void NumberUtils168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils168");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!", (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void NumberUtils169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils169");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0L, (double) (-1L), 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils170");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 1, (double) 10L, (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils171");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void NumberUtils172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils172");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '#', (long) (byte) 0, (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils173");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) -1, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils174");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void NumberUtils175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils175");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void NumberUtils176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils176");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void NumberUtils177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils177");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!", (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void NumberUtils178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils178");
        long[] longArray0 = null;
        // The following exception was thrown during execution in NumberUtils generation
        try {
            long long1 = org.apache.commons.lang3.math.NumberUtils.max(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils179");
        int[] intArray0 = new int[] {};
        // The following exception was thrown during execution in NumberUtils generation
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
    public void NumberUtils180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils180");
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
    public void NumberUtils181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils181");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 35, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils182");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void NumberUtils183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils183");
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
    public void NumberUtils184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils184");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1.0f, (double) 32.0f, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void NumberUtils185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils185");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', 32, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void NumberUtils186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils186");
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
    public void NumberUtils187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils187");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 1, (int) (short) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils188");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void NumberUtils189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils189");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 100, (int) (short) 1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils190");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in NumberUtils generation
        try {
            short short1 = org.apache.commons.lang3.math.NumberUtils.max(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils191");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void NumberUtils192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils192");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in NumberUtils generation
        try {
            byte byte1 = org.apache.commons.lang3.math.NumberUtils.max(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils193");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) (short) 1, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils194");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1L, (double) 0.0f, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils195");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void NumberUtils196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils196");
        int[] intArray0 = null;
        // The following exception was thrown during execution in NumberUtils generation
        try {
            int int1 = org.apache.commons.lang3.math.NumberUtils.max(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils197");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 1, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils198");
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
    public void NumberUtils199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils199");
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
    public void NumberUtils200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils200");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((-1), 10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils201");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void NumberUtils202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils202");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void NumberUtils203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils203");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((-1L), (-1L), (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils204");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void NumberUtils205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils205");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) -1, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils206");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 100, (float) 'a', 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils207");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 32, (long) (short) 1, (long) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void NumberUtils208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils208");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) -1, (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils209");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '#', 32L, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils210");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void NumberUtils211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils211");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 0, 0L, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils212");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) -1, (long) 0, (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils213");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 1, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils214");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) 100, (double) 100, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils215");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 10, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils216");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 100, (float) 52, (float) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void NumberUtils217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils217");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in NumberUtils generation
        try {
            double double1 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils218");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 100, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils219");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 100, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils220");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 100, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils221");
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
    public void NumberUtils222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils222");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) 0, (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils223");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, 52, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void NumberUtils224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils224");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 10, (float) 100, (float) 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils225");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void NumberUtils226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils226");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void NumberUtils227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils227");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 'a', (float) 1, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void NumberUtils228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils228");
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
    public void NumberUtils229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils229");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '#', (long) (short) 10, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils230");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) -1, (double) 52L, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils231");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) '#', (-1.0d), (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void NumberUtils232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils232");
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
    public void NumberUtils233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils233");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) -1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils234");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void NumberUtils235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils235");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void NumberUtils236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils236");
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
    public void NumberUtils237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils237");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 100, 35.0f, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils238");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void NumberUtils239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils239");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 0, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils240");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(35.0d, (double) '4', 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void NumberUtils241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils241");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!", (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void NumberUtils242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils242");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void NumberUtils243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils243");
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
    public void NumberUtils244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils244");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!", (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void NumberUtils245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils245");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 0, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils246");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 100, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils247");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 1.0d, (double) 52L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void NumberUtils248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils248");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 100L, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils249");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 32L, 32.0f, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void NumberUtils250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils250");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 100, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils251");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils252");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) 10, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils253");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(35.0d, (double) (short) 1, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void NumberUtils254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils254");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '#', (long) 52, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void NumberUtils255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils255");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '#', (int) (short) -1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils256");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) ' ', (long) 0, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils257");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void NumberUtils258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils258");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void NumberUtils259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils259");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) (byte) 0, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils260");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (-1), (long) '4', (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils261");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 10, (double) 1L, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void NumberUtils262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils262");
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
    public void NumberUtils263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils263");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) -1, 0.0d, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils264");
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
    public void NumberUtils265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils265");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils266");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) (byte) 100, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils267");
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
    public void NumberUtils268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils268");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils269");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(32, 10, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils270");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 0, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils271");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void NumberUtils272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils272");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void NumberUtils273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils273");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 100, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils274");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 100, (long) 32, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils275");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void NumberUtils276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils276");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '#', (int) (byte) 100, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils277");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', 10, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void NumberUtils278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils278");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) ' ', (float) ' ', 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void NumberUtils279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils279");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void NumberUtils280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils280");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 100, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils281");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 100, (long) (byte) -1, (long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils282");
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
    public void NumberUtils283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils283");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void NumberUtils284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils284");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 1, 0, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils285");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) -1, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils286");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 1, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils287");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) -1, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils288");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!", (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void NumberUtils289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils289");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils290");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(100.0f, (float) '4', 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils291");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (-1L), 1.0f, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void NumberUtils292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils292");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void NumberUtils293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils293");
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
    public void NumberUtils294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils294");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) '4', (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils295");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 52, (long) (byte) 1, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils296");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 10, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils297");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 32, (long) 10, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void NumberUtils298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils298");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 10, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils299");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(10.0f, (float) 32, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils300");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils301");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) -1, (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils302");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 100, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils303");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) '#', (float) (byte) 1, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void NumberUtils304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils304");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 10, 10.0f, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void NumberUtils305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils305");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void NumberUtils306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils306");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1), (double) (short) 10, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils307");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 100.0d, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils308");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) -1, (int) (byte) 100, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils309");
        int[] intArray0 = null;
        // The following exception was thrown during execution in NumberUtils generation
        try {
            int int1 = org.apache.commons.lang3.math.NumberUtils.min(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils310");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) (byte) 0, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils311");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 100, (long) (short) 100, 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils312");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 1L, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils313");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(1.0f, (float) '4', (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils314");
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
    public void NumberUtils315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils315");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 10, (float) 52L, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void NumberUtils316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils316");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 10, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils317");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void NumberUtils318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils318");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 32, (float) 0L, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils319");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) 0, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils320");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 100, (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils321");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void NumberUtils322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils322");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 100, (long) 1, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils323");
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
    public void NumberUtils324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils324");
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
    public void NumberUtils325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils325");
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
    public void NumberUtils326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils326");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void NumberUtils327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils327");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void NumberUtils328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils328");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 52L, (float) 32L, (float) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void NumberUtils329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils329");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) 1, (double) 97.0f, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void NumberUtils330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils330");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 52.0f, (double) (byte) 10, (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void NumberUtils331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils331");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) (byte) 100, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils332");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!", (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void NumberUtils333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils333");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(10.0f, (float) 52, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void NumberUtils334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils334");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) 100, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils335");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(100L, (long) 0, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils336");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100, (double) ' ', (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils337");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '4', (int) '4', 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void NumberUtils338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils338");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 100, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils339");
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
    public void NumberUtils340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils340");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils341");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) -1, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils342");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in NumberUtils generation
        try {
            byte byte1 = org.apache.commons.lang3.math.NumberUtils.min(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils343");
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
    public void NumberUtils344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils344");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void NumberUtils345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils345");
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
    public void NumberUtils346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils346");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 0, (double) 32, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils347");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 10, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils348");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1), (double) (byte) 0, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils349");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 10, 10L, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void NumberUtils350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils350");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(10.0d, (double) 100L, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void NumberUtils351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils351");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(10, (int) (byte) 0, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils352");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(10.0f, (float) (byte) 0, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils353");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void NumberUtils354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils354");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(100L, (long) (byte) 10, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils355");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10L, (double) 0L, (double) 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void NumberUtils356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils356");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((-1), (int) (short) 1, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils357");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '#', 52, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils358");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(100, (int) (byte) 1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils359");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void NumberUtils360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils360");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(100.0d, (double) 1.0f, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void NumberUtils361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils361");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void NumberUtils362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils362");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void NumberUtils363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils363");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100L, (double) (byte) 100, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils364");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) -1, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils365");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(10.0f, (float) (byte) -1, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils366");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void NumberUtils367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils367");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(32L, (long) (-1), (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void NumberUtils368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils368");
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
    public void NumberUtils369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils369");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) -1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils370");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(10, (int) (short) 10, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils371");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 32L, (float) 32, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void NumberUtils372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils372");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) '#', (long) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils373");
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
    public void NumberUtils374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils374");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 97L, 32.0d, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void NumberUtils375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils375");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", (float) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void NumberUtils376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils376");
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
    public void NumberUtils377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils377");
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
    public void NumberUtils378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils378");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) -1, 52.0f, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils379");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void NumberUtils380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils380");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void NumberUtils381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils381");
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
    public void NumberUtils382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils382");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 10, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils383");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) (byte) 10, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils384");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void NumberUtils385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils385");
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
    public void NumberUtils386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils386");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 0, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils387");
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
    public void NumberUtils388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils388");
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
    public void NumberUtils389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils389");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) 10, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils390");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(35.0f, (float) 0L, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void NumberUtils391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils391");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) -1, 52, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void NumberUtils392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils392");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(52, 35, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils393");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils394");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 10, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils395");
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
    public void NumberUtils396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils396");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void NumberUtils397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils397");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) -1, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils398");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 1, (float) 52L, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void NumberUtils399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils399");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 1, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils400");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void NumberUtils401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils401");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 52L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void NumberUtils402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils402");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 32, (float) 32, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void NumberUtils403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils403");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void NumberUtils404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils404");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0.0f, 0.0d, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils405");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 97L, (float) 1L, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void NumberUtils406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils406");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) ' ', (long) (byte) 1, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void NumberUtils407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils407");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(10.0d, (double) 0L, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils408");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 10, (int) (byte) 10, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils409");
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
    public void NumberUtils410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils410");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) '#', 0.0f, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils411");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) ' ', (long) ' ', (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void NumberUtils412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils412");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 1, (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils413");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, (int) (byte) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils414");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 10, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils415");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void NumberUtils416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils416");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, (int) (byte) 100, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils417");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 35, (long) (byte) 10, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void NumberUtils418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils418");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void NumberUtils419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils419");
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
    public void NumberUtils420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils420");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 0, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils421");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100L, (double) (short) 100, (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils422");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(52.0f, (float) 32, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void NumberUtils423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils423");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(97L, (long) 1, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void NumberUtils424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils424");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void NumberUtils425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils425");
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
    public void NumberUtils426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils426");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 97.0f, (double) 97L, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void NumberUtils427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils427");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 10, (short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils428");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 52, (double) 0L, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void NumberUtils429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils429");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) (byte) 0, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils430");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 52L, 0.0d, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils431");
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
    public void NumberUtils432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils432");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) -1, 0L, 35L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void NumberUtils433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils433");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void NumberUtils434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils434");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(52.0d, (double) (short) 1, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void NumberUtils435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils435");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, 0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils436");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(52.0d, 100.0d, (double) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils437");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils438");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1.0f, 10.0f, (float) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void NumberUtils439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils439");
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
    public void NumberUtils440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils440");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 100, (float) (-1L), (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils441");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 10, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils442");
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
    public void NumberUtils443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils443");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(32L, 0L, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils444");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) -1, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils445");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void NumberUtils446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils446");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) ' ', 10, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils447");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(10.0d, (double) ' ', (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void NumberUtils448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils448");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!", (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void NumberUtils449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils449");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!", (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void NumberUtils450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils450");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) -1, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils451");
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
    public void NumberUtils452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils452");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void NumberUtils453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils453");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(1.0d, 0.0d, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils454");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 1, 0.0d, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils455");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 0, 10, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils456");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1L, 100.0f, (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils457");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1, (float) 10L, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void NumberUtils458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils458");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 100, (long) 'a', (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void NumberUtils459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils459");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 97L, (float) (byte) 100, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils460");
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
    public void NumberUtils461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils461");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 0, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils462");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 0, (int) (short) 1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils463");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 35, (long) (short) 1, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void NumberUtils464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils464");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 32, (float) 52L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void NumberUtils465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils465");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 1, (long) 'a', (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void NumberUtils466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils466");
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
    public void NumberUtils467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils467");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) 'a', 1, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils468");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(35L, (long) 100, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils469");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 10, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils470");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) '#', 0.0d, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils471");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 52L, (double) 10, (double) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void NumberUtils472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils472");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 10, 10, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils473");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 10, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils474");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void NumberUtils475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils475");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 97L, (double) 1L, (double) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void NumberUtils476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils476");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) 1, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils477");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void NumberUtils478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils478");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 100, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils479");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) ' ', 0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils480");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void NumberUtils481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils481");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void NumberUtils482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils482");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 1, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils483");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 100, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils484");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 10, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils485");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, (int) (short) 0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils486");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void NumberUtils487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils487");
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
    public void NumberUtils488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils488");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void NumberUtils489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils489");
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
    public void NumberUtils490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils490");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void NumberUtils491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils491");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(10, (int) (short) 0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils492");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 100, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils493");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void NumberUtils494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils494");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1, 97L, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void NumberUtils495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils495");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 1, (float) 1L, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void NumberUtils496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils496");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(35, (int) (byte) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void NumberUtils497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils497");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 100, 52.0f, (float) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void NumberUtils498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils498");
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
    public void NumberUtils499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils499");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils0.NumberUtils500");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }
}

