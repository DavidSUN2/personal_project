
package NumberUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NumberUtils1 {

    public static boolean debug = false;

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test501");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test502");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float1 = org.apache.commons.lang3.math.NumberUtils.min(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test503");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', 0, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test504");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) '#', (float) 97L, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test505");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(10, (int) (byte) 0, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test506");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) -1, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test507");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 0, (int) (byte) 10, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test508");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(52, (int) 'a', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test509");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test510");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 100, (double) (byte) 0, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test511");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", (float) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test512");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 'a', (-1L), (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test513");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 0, (float) (short) 0, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test514");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test515");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '#', (long) 100, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test516");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 1, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test517");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0.0f, (double) 0, (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test518");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 35, (long) ' ', (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test519");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) 10, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test520");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(10.0d, (double) (byte) 100, (double) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test521");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) -1, (long) 35, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test522");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test523");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 0, (int) (byte) 10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test524");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test525");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 97.0f, 1.0d, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test526");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 10.0f, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test527");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test528");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 1, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test529");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test530");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((-1.0f), (float) 'a', (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test531");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test532");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 0L, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test533");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test534");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 0, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test535");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) -1, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test536");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test537");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test538");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test539");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100, 1.0d, (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test540");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test541");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test542");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 0, (long) 'a', 52L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test543");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 35.0f, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test544");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test545");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test546");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test547");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, (int) '#', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test548");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) -1, 0, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test549");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 1, 10L, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test550");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) ' ', 35, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test551");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test552");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test553");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test554");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test555");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test556");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) (byte) 0, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test557");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 52, (double) 10L, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test558");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) (byte) 10, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test559");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) 100, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test560");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 100, (float) 32L, (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test561");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 10.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test562");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test563");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test564");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test565");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 0, (long) (short) 0, (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test566");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test567");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 32.0f, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test568");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) '4', (float) (short) -1, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test569");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) (byte) 0, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test570");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) -1, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test571");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0L, 97.0d, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test572");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((-1.0f), 0.0f, (float) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test573");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test574");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) ' ', (int) (byte) 0, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test575");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test576");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10.0f, 0.0d, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test577");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) -1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test578");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 10, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test579");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(10.0d, (double) 100.0f, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test580");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test581");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1, (double) (byte) 0, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test582");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test583");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 10, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test584");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 0, (long) 35, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test585");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 10, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test586");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) -1, 1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test587");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test588");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(10.0f, 97.0f, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test589");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test590");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test591");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 0, 10.0f, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test592");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test593");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test594");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) (-1.0f), (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test595");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 1, (float) (short) 100, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test596");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test597");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-1), (float) 35, (float) 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test598");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) '#', 0.0f, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test599");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) (byte) 100, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test600");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 10, 97L, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test601");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test602");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test603");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test604");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 35, (float) 100L, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test605");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test606");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 0, 0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test607");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test608");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 10, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test609");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test610");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 32, 32.0d, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test611");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test612");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test613");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test614");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test615");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 0, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test616");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 100, (long) (byte) -1, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test617");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test618");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(1L, (long) (short) 100, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test619");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(32, 0, 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test620");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test621");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) 'a', 1, 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test622");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test623");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 52, (long) (short) 100, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test624");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, 32, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test625");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 35, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test626");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test627");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 10, (short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test628");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0L, 52.0d, 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test629");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test630");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 100, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test631");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test632");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 0, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test633");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 100, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test634");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 52, (double) 10.0f, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test635");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) -1, 1.0d, (double) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test636");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(52, (int) '#', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test637");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, (int) (byte) 10, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test638");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 1, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test639");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) 0, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test640");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) -1, (float) (short) 1, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test641");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 10, (short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test642");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 32L, (float) 35, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test643");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 10, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test644");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1, (long) (-1), (long) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test645");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, (int) (byte) 10, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test646");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test647");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, (int) (byte) -1, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test648");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang3.math.NumberUtils.min(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test649");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test650");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 10, 52.0f, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test651");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test652");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 10, (int) (byte) 1, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test653");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 100, (long) ' ', 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test654");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 1, 32, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test655");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 10, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test656");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(52, 100, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test657");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test658");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, 52, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test659");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!", (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test660");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 10, (long) (-1), 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test661");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 0, 1.0d, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test662");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 1, (double) 52L, (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test663");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0.0f, 100.0d, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test664");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) -1, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test665");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 10, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test666");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 100, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test667");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) ' ', 35.0f, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test668");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, 1, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test669");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test670");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test671");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test672");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 97, (float) 1, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test673");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test674");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test675");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test676");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test677");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 35L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test678");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, 100, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test679");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10, (double) 10, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test680");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 32, 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test681");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test682");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) -1, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test683");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10.0f, (double) 32, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test684");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) ' ', (float) 52, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test685");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test686");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test687");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test688");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 35L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test689");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 32L, (double) 35, (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test690");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test691");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) (byte) 10, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test692");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 97, (float) 32, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test693");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 1, (-1), 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test694");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test695");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test696");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test697");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test698");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, 0, 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test699");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 97L, 97.0f, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test700");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test701");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 10, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test702");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test703");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(35.0d, (double) 52L, 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test704");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 10, (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test705");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test706");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(97.0d, (-1.0d), 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test707");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, (int) (byte) -1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test708");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test709");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test710");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test711");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(52.0f, (float) (short) 0, (float) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test712");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100, (double) (short) 1, (double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test713");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test714");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 10, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test715");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test716");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 10, (double) (short) 0, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test717");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 0, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test718");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test719");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 1, (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test720");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test721");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 10, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test722");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 10, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test723");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) '4', (float) 52, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test724");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 1, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test725");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 52, 100.0f, (float) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test726");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) -1, (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test727");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test728");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 1, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test729");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test730");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '#', 0L, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test731");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10L, (double) (byte) 100, (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test732");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 0, (float) (-1), (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test733");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 35, (long) 32, (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test734");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) 10, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test735");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test736");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test737");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1L), (double) 10, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test738");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(32.0f, (float) '#', (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test739");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test740");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, (int) (byte) -1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test741");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test742");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(35.0f, (float) 100, (float) 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test743");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test744");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) -1, (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test745");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 1, (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test746");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((-1), 0, 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test747");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test748");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test749");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test750");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test751");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 32L, (double) (byte) 100, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test752");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 10, 52L, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test753");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, (int) (short) 0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test754");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) 'a', (-1), (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test755");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test756");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test757");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) -1, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test758");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 0, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test759");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!", (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test760");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test761");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 10, (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test762");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) 'a', 100, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test763");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test764");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) -1, (float) (byte) 0, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test765");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 1, (short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test766");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 0, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test767");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) 100, (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test768");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 32.0f, (double) 10L, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test769");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test770");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test771");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(100L, 97L, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test772");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 0, (short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test773");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 0, (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test774");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test775");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (-1), 52.0f, (float) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test776");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) ' ', (int) (short) 1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test777");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test778");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) -1, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test779");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) 0, (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test780");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 10, (long) (short) 100, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test781");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test782");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 100, (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test783");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) '#', (float) 0, (float) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test784");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) '4', (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test785");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 1, (int) (byte) 100, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test786");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 1, (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test787");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0, (double) 'a', (double) 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test788");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) -1, (int) (short) -1, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test789");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 100, (long) (byte) 0, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test790");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) -1, 0.0f, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test791");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test792");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test793");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 0, (float) (-1L), (float) 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test794");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test795");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 10, (-1L), (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test796");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) '#', (double) 52, (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test797");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 1, (int) (short) -1, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test798");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(10, 32, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test799");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test800");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 52, (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test801");
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
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test802");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void NumberUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumberUtils1.test803");
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

