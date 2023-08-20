package NumberUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NumberUtils1 {

    public static boolean debug = false;

    @Test
    public void NumberUtils501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils501");
        long[] longArray2 = new long[] { 0, (byte) 100 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.Class<?> wildcardClass6 = longArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumberUtils502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils502");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in NumberUtils generation
        try {
            float float1 = org.apache.commons.lang3.math.NumberUtils.min(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils503");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', 0, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void NumberUtils504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils504");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) '#', (float) 97L, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void NumberUtils505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils505");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(10, (int) (byte) 0, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils506");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) -1, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils507");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 0, (int) (byte) 10, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils508");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(52, (int) 'a', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void NumberUtils509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils509");
        int[] intArray1 = new int[] { ' ' };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void NumberUtils510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils510");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 100, (double) (byte) 0, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils511");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", (float) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void NumberUtils512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils512");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 'a', (-1L), (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils513");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 0, (float) (short) 0, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void NumberUtils514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils514");
        long[] longArray2 = new long[] { 0, (byte) 100 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void NumberUtils515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils515");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '#', (long) 100, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils516");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 1, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils517");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0.0f, (double) 0, (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils518");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 35, (long) ' ', (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void NumberUtils519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils519");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) 10, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils520");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(10.0d, (double) (byte) 100, (double) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils521");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) -1, (long) 35, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils522");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils523");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 0, (int) (byte) 10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils524");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void NumberUtils525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils525");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 97.0f, 1.0d, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils526");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 10.0f, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void NumberUtils527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils527");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (short) 10, (byte) 100 };
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void NumberUtils528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils528");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 1, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils529");
        short[] shortArray6 = new short[] { (byte) 1, (byte) 100, (short) 100, (short) 1, (byte) 0, (byte) 0 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void NumberUtils530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils530");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((-1.0f), (float) 'a', (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void NumberUtils531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils531");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void NumberUtils532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils532");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 0L, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void NumberUtils533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils533");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void NumberUtils534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils534");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 0, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils535");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) -1, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils536");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 1, (short) -1, (byte) 1, (short) 10 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
    }

    @Test
    public void NumberUtils537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils537");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void NumberUtils538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils538");
        int[] intArray4 = new int[] { ' ', (short) 0, (short) 10, (-1) };
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray4);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray4);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray4);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void NumberUtils539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils539");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100, 1.0d, (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void NumberUtils540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils540");
        double[] doubleArray5 = new double[] { (byte) 0, (short) -1, (-1.0d), (byte) 10, (short) -1 };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void NumberUtils541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils541");
        int[] intArray1 = new int[] { ' ' };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void NumberUtils542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils542");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 0, (long) 'a', 52L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils543");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 35.0f, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils544");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void NumberUtils545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils545");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void NumberUtils546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils546");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void NumberUtils547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils547");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, (int) '#', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils548");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) -1, 0, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils549");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 1, 10L, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils550");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) ' ', 35, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils551");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
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
    public void NumberUtils552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils552");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void NumberUtils553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils553");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void NumberUtils554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils554");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void NumberUtils555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils555");
        int[] intArray1 = new int[] { ' ' };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
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
    public void NumberUtils556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils556");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) (byte) 0, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils557");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 52, (double) 10L, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void NumberUtils558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils558");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) (byte) 10, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils559");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) 100, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils560");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 100, (float) 32L, (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils561");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 10.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils562");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void NumberUtils563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils563");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void NumberUtils564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils564");
        float[] floatArray2 = new float[] { (-1L), '#' };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 35.0f + "'", float5 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.0f + "'", float7 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 35.0f + "'", float9 == 35.0f);
    }

    @Test
    public void NumberUtils565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils565");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 0, (long) (short) 0, (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils566");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
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
    public void NumberUtils567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils567");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 32.0f, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void NumberUtils568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils568");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) '4', (float) (short) -1, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils569");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) (byte) 0, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils570");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) -1, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils571");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0L, 97.0d, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils572");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((-1.0f), 0.0f, (float) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils573");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void NumberUtils574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils574");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) ' ', (int) (byte) 0, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void NumberUtils575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils575");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void NumberUtils576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils576");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10.0f, 0.0d, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils577");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) -1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils578");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 10, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils579");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(10.0d, (double) 100.0f, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils580");
        float[] floatArray2 = new float[] { (-1L), '#' };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 35.0f + "'", float5 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.0f + "'", float7 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 35.0f + "'", float8 == 35.0f);
    }

    @Test
    public void NumberUtils581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils581");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1, (double) (byte) 0, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils582");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void NumberUtils583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils583");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 10, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils584");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 0, (long) 35, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils585");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 10, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils586");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) -1, 1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils587");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils588");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(10.0f, 97.0f, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void NumberUtils589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils589");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void NumberUtils590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils590");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (short) 10, (byte) 100 };
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.Class<?> wildcardClass8 = shortArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumberUtils591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils591");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 0, 10.0f, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils592");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 1, (short) -1, (byte) 1, (short) 10 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
    }

    @Test
    public void NumberUtils593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils593");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void NumberUtils594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils594");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) (-1.0f), (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils595");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 1, (float) (short) 100, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils596");
        int[] intArray1 = new int[] { ' ' };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
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
    public void NumberUtils597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils597");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-1), (float) 35, (float) 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils598");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) '#', 0.0f, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void NumberUtils599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils599");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) (byte) 100, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils600");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 10, 97L, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void NumberUtils601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils601");
        long[] longArray2 = new long[] { 0, (byte) 100 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void NumberUtils602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils602");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void NumberUtils603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils603");
        float[] floatArray3 = new float[] { (byte) -1, (byte) -1, 0.0f };
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void NumberUtils604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils604");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 35, (float) 100L, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils605");
        int[] intArray4 = new int[] { ' ', (short) 0, (short) 10, (-1) };
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray4);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray4);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray4);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray4);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void NumberUtils606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils606");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 0, 0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils607");
        short[] shortArray6 = new short[] { (byte) 1, (byte) 100, (short) 100, (short) 1, (byte) 0, (byte) 0 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void NumberUtils608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils608");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 10, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils609");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
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
    }

    @Test
    public void NumberUtils610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils610");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 32, 32.0d, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils611");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void NumberUtils612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils612");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void NumberUtils613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils613");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void NumberUtils614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils614");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils615");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 0, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils616");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 100, (long) (byte) -1, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils617");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils618");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(1L, (long) (short) 100, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils619");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(32, 0, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void NumberUtils620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils620");
        long[] longArray2 = new long[] { 0, (byte) 100 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void NumberUtils621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils621");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) 'a', 1, 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void NumberUtils622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils622");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) -1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.Class<?> wildcardClass7 = byteArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumberUtils623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils623");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 52, (long) (short) 100, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void NumberUtils624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils624");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, 32, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void NumberUtils625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils625");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 35, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void NumberUtils626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils626");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
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
    }

    @Test
    public void NumberUtils627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils627");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 10, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils628");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0L, 52.0d, 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void NumberUtils629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils629");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void NumberUtils630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils630");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 100, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils631");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void NumberUtils632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils632");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils633");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 100, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils634");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 52, (double) 10.0f, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils635");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) -1, 1.0d, (double) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils636");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(52, (int) '#', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils637");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, (int) (byte) 10, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils638");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 1, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils639");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) 0, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils640");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) -1, (float) (short) 1, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils641");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 10, (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils642");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 32L, (float) 35, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void NumberUtils643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils643");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 10, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils644");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1, (long) (-1), (long) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils645");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, (int) (byte) 10, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils646");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
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
    }

    @Test
    public void NumberUtils647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils647");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, (int) (byte) -1, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils648");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in NumberUtils generation
        try {
            short short1 = org.apache.commons.lang3.math.NumberUtils.min(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils649");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void NumberUtils650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils650");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 10, 52.0f, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void NumberUtils651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils651");
        float[] floatArray3 = new float[] { (byte) -1, (byte) -1, 0.0f };
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void NumberUtils652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils652");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 10, (int) (byte) 1, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils653");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 100, (long) ' ', 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils654");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 1, 32, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils655");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 10, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils656");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(52, 100, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void NumberUtils657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils657");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils658");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, 52, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void NumberUtils659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils659");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void NumberUtils660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils660");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 10, (long) (-1), 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils661");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 0, 1.0d, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils662");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 1, (double) 52L, (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void NumberUtils663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils663");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0.0f, 100.0d, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils664");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) -1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils665");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 10, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils666");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 100, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils667");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) ' ', 35.0f, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils668");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, 1, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils669");
        int[] intArray1 = new int[] { ' ' };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void NumberUtils670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils670");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void NumberUtils671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils671");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void NumberUtils672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils672");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 97, (float) 1, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void NumberUtils673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils673");
        int[] intArray1 = new int[] { (short) 100 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils674");
        long[] longArray2 = new long[] { (byte) 100, (byte) 0 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void NumberUtils675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils675");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
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
    public void NumberUtils676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils676");
        long[] longArray2 = new long[] { (byte) 100, (byte) 0 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void NumberUtils677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils677");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 35L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void NumberUtils678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils678");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, 100, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils679");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10, (double) 10, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void NumberUtils680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils680");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 32, 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils681");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void NumberUtils682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils682");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) -1, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils683");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10.0f, (double) 32, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void NumberUtils684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils684");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) ' ', (float) 52, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void NumberUtils685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils685");
        long[] longArray3 = new long[] { (-1L), (short) 10, (short) 0 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.Class<?> wildcardClass6 = longArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumberUtils686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils686");
        int[] intArray4 = new int[] { 0, 1, (byte) 10, 32 };
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray4);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray4);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void NumberUtils687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils687");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void NumberUtils688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils688");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 35L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void NumberUtils689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils689");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 32L, (double) 35, (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void NumberUtils690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils690");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 1, (short) -1, (byte) 1, (short) 10 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void NumberUtils691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils691");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) (byte) 10, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils692");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 97, (float) 32, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void NumberUtils693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils693");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 1, (-1), 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils694");
        long[] longArray2 = new long[] { (byte) 100, (byte) 0 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void NumberUtils695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils695");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
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
    }

    @Test
    public void NumberUtils696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils696");
        long[] longArray3 = new long[] { (-1L), (short) 10, (short) 0 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void NumberUtils697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils697");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.Class<?> wildcardClass4 = byteArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void NumberUtils698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils698");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, 0, 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void NumberUtils699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils699");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 97L, 97.0f, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void NumberUtils700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils700");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
    }

    @Test
    public void NumberUtils701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils701");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 10, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils702");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils703");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(35.0d, (double) 52L, 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void NumberUtils704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils704");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 10, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils705");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils706");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(97.0d, (-1.0d), 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils707");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, (int) (byte) -1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils708");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) -1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(byteArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
    }

    @Test
    public void NumberUtils709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils709");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (short) 10, (byte) 100 };
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
    }

    @Test
    public void NumberUtils710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils710");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
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
    public void NumberUtils711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils711");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(52.0f, (float) (short) 0, (float) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils712");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100, (double) (short) 1, (double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils713");
        long[] longArray2 = new long[] { 0, (byte) 100 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void NumberUtils714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils714");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 10, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils715");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
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
    public void NumberUtils716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils716");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 10, (double) (short) 0, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils717");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 0, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils718");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (short) 10, (byte) 100 };
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.Class<?> wildcardClass8 = shortArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumberUtils719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils719");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 1, (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils720");
        long[] longArray2 = new long[] { 0, (byte) 100 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void NumberUtils721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils721");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 10, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils722");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 10, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils723");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) '4', (float) 52, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void NumberUtils724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils724");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 1, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils725");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 52, 100.0f, (float) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils726");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) -1, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils727");
        long[] longArray2 = new long[] { 0, (byte) 100 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void NumberUtils728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils728");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 1, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils729");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void NumberUtils730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils730");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '#', 0L, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void NumberUtils731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils731");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10L, (double) (byte) 100, (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils732");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 0, (float) (-1), (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils733");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 35, (long) 32, (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void NumberUtils734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils734");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) 10, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils735");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void NumberUtils736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils736");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
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
    public void NumberUtils737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils737");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1L), (double) 10, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils738");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(32.0f, (float) '#', (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void NumberUtils739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils739");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void NumberUtils740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils740");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, (int) (byte) -1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils741");
        int[] intArray1 = new int[] { 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils742");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(35.0f, (float) 100, (float) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void NumberUtils743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils743");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void NumberUtils744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils744");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) -1, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils745");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 1, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils746");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((-1), 0, 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void NumberUtils747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils747");
        long[] longArray2 = new long[] { (byte) 100, (byte) 0 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void NumberUtils748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils748");
        long[] longArray2 = new long[] { (byte) 100, (byte) 0 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void NumberUtils749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils749");
        short[] shortArray6 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 100, (short) 10, (byte) 100 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
    }

    @Test
    public void NumberUtils750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils750");
        float[] floatArray3 = new float[] { (byte) -1, (byte) -1, 0.0f };
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void NumberUtils751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils751");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 32L, (double) (byte) 100, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils752");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 10, 52L, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void NumberUtils753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils753");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, (int) (short) 0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils754");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) 'a', (-1), (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils755");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
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
    public void NumberUtils756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils756");
        long[] longArray2 = new long[] { 0, (byte) 100 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void NumberUtils757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils757");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) -1, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils758");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 0, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils759");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void NumberUtils760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils760");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils761");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 10, (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils762");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) 'a', 100, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils763");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void NumberUtils764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils764");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) -1, (float) (byte) 0, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils765");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 1, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils766");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 0, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils767");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) 100, (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils768");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 32.0f, (double) 10L, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils769");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
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
    }

    @Test
    public void NumberUtils770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils770");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void NumberUtils771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils771");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(100L, 97L, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils772");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 0, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils773");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 0, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils774");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void NumberUtils775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils775");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (-1), 52.0f, (float) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void NumberUtils776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils776");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) ' ', (int) (short) 1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils777");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
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
    public void NumberUtils778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils778");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) -1, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils779");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) 0, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils780");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 10, (long) (short) 100, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void NumberUtils781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils781");
        int[] intArray1 = new int[] { ' ' };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void NumberUtils782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils782");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 100, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils783");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) '#', (float) 0, (float) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils784");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) '4', (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils785");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 1, (int) (byte) 100, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils786");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils787");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0, (double) 'a', (double) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void NumberUtils788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils788");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) -1, (int) (short) -1, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils789");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 100, (long) (byte) 0, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils790");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) -1, 0.0f, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils791");
        long[] longArray2 = new long[] { 0, (byte) 100 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.Class<?> wildcardClass4 = longArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(longArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void NumberUtils792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils792");
        float[] floatArray3 = new float[] { 10.0f, (byte) 0, (short) 1 };
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void NumberUtils793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils793");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 0, (float) (-1L), (float) 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void NumberUtils794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils794");
        int[] intArray1 = new int[] { ' ' };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void NumberUtils795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils795");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 10, (-1L), (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void NumberUtils796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils796");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) '#', (double) 52, (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void NumberUtils797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils797");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 1, (int) (short) -1, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils798");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(10, 32, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void NumberUtils799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils799");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void NumberUtils800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils800");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 52, (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils801");
        float[] floatArray2 = new float[] { (-1L), '#' };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 35.0f + "'", float6 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.0f + "'", float7 == 35.0f);
    }

    @Test
    public void NumberUtils802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils802");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void NumberUtils803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.NumberUtils803");
        short[] shortArray4 = new short[] { (byte) 10, (byte) -1, (short) 10, (byte) 100 };
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(shortArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }
}

