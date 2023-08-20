
package IEEE754rUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IEEE754rUtils1 {

    public static boolean debug = false;

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test501");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10.0f, 52.0d, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test502");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0f, 100.0f, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test503");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test504");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test505");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        java.lang.Class<?> wildcardClass5 = doubleArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test506");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) -1, (float) 1, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test507");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 10, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test508");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, 35.0f, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test509");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 35.0f, (-1.0d), (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test510");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) -1, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test511");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0L, (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test512");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 0, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test513");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '#', (float) (short) -1, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test514");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 1, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test515");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0L, (float) (short) 1, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test516");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100L, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test517");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 1, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test518");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1), (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test519");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 52.0f, (double) (byte) 1, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test520");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 0, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test521");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float1 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test522");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 'a', (double) (short) 1, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test523");
        float[] floatArray1 = new float[] { (byte) -1 };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test524");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double9 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
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
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test525");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0f, (float) (byte) -1, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test526");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(10.0f, 32.0f, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test527");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1.0f, (double) 10L, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test528");
        float[] floatArray3 = new float[] { 0.0f, 97.0f, 0.0f };
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray3);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray3);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float9 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 97.0f + "'", float5 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test529");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '#', (double) (short) 10, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test530");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1, 0.0d, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test531");
        double[] doubleArray4 = new double[] { 1L, (byte) -1, (-1), 1 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test532");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1), 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test533");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '4', (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test534");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 10L, (-1.0f), (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test535");
        float[] floatArray1 = new float[] { (byte) -1 };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test536");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 0, (float) 'a', (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test537");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test538");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0f, (float) 1, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test539");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 1, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test540");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 0, (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test541");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 10, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test542");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1L), 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test543");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(35.0f, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test544");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test545");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((-1.0d), (double) (short) 10, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test546");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 0, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test547");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        java.lang.Class<?> wildcardClass6 = doubleArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test548");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 0, (double) 10.0f, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test549");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0.0f, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test550");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 10, (double) '4', (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test551");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0, 32.0d, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test552");
        float[] floatArray1 = new float[] { ' ' };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        java.lang.Class<?> wildcardClass3 = floatArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test553");
        float[] floatArray5 = new float[] { 1.0f, (-1), 100L, '4', 100.0f };
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray5);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray5);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray5);
        float float9 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test554");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0d, (double) ' ', 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test555");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test556");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10L, (float) '#', (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test557");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, 100.0d, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test558");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '#', 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test559");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 1, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test560");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(35.0d, (double) 1, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test561");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 0, (double) 97.0f, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test562");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1.0f, (double) 100.0f, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test563");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 10, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test564");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 10, (float) '#', (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test565");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 32.0f, (double) (byte) 10, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test566");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) -1, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test567");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0L, (double) ' ', (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test568");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test569");
        float[] floatArray1 = new float[] { (byte) -1 };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float9 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test570");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 10, (float) (short) -1, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test571");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test572");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0d, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test573");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1, (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test574");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (-1), (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test575");
        float[] floatArray1 = new float[] { ' ' };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        java.lang.Class<?> wildcardClass6 = floatArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test576");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) -1, 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test577");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(32.0d, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test578");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test579");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0L, 1.0d, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test580");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test581");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0f, (float) (byte) 100, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test582");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0L, (double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test583");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 100, (double) (short) -1, (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test584");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test585");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1.0f, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test586");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double9 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test587");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1, (double) 10.0f, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test588");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1, 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test589");
        float[] floatArray3 = new float[] { 0.0f, 97.0f, 0.0f };
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray3);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 97.0f + "'", float5 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test590");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 100, (float) ' ', (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test591");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(35.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test592");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 100, (float) (short) -1, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test593");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test594");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 10L, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test595");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0d), (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test596");
        double[] doubleArray4 = new double[] { 1L, (byte) -1, (-1), 1 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test597");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0d, (double) 0, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test598");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 10L, (float) (short) -1, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test599");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 1, (float) 0L, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test600");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        java.lang.Class<?> wildcardClass6 = doubleArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test601");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 0, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test602");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 0, (float) 0L, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test603");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) (byte) 10, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test604");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 32.0f, 35.0d, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test605");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0d, 35.0d, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test606");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 100, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test607");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test608");
        float[] floatArray1 = new float[] { ' ' };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        java.lang.Class<?> wildcardClass5 = floatArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test609");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10.0f, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test610");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 10, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test611");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(10.0d, 100.0d, (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test612");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test613");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1L), 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test614");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(52.0f, 1.0f, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test615");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1.0f, 0.0d, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test616");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1.0f), (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test617");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100L, (double) (-1L), 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test618");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '#', (float) '#', (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test619");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '#', 35.0d, (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test620");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1.0f, 1.0d, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test621");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1), (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test622");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) ' ', (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test623");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(32.0f, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test624");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(35.0d, (double) (byte) 0, (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test625");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(35.0f, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test626");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) -1, (float) (short) 0, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test627");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 'a', (double) 1, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test628");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) '4', (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test629");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 1, (float) (short) 100, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test630");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 1, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test631");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test632");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) -1, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test633");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test634");
        float[] floatArray1 = new float[] { (byte) -1 };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test635");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0d, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test636");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0d, (double) (byte) 0, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test637");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 52.0f, (double) (short) -1, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test638");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) 'a', (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test639");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test640");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) -1, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test641");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test642");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0d, (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test643");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100.0f, (double) 0L, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test644");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test645");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(52.0d, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test646");
        double[] doubleArray5 = new double[] { (byte) 10, 52.0f, 0.0d, 10.0f, 0.0d };
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test647");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 100, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test648");
        double[] doubleArray4 = new double[] { 1L, (byte) -1, (-1), 1 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double9 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test649");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10.0f, (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test650");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test651");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 52.0f, (double) (byte) 0, (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test652");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 0, (double) '4', (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test653");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0f, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test654");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, 0.0f, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test655");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test656");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test657");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 0, (float) (byte) 10, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test658");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) -1, (float) (byte) 1, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test659");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 1, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test660");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 0, 32.0d, 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test661");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 'a', (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test662");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 1, (float) (byte) 10, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test663");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0d, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test664");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) '4', (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test665");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test666");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(35.0f, (float) 0L, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test667");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 1L, (float) (short) 100, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test668");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0d, (double) 10.0f, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test669");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 1, 1.0f, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test670");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, (float) (-1), (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test671");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0d, (double) 52.0f, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test672");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0d, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test673");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, (float) 10L, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test674");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0f, 32.0f, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test675");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((-1.0d), 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test676");
        float[] floatArray3 = new float[] { 0.0f, 97.0f, 0.0f };
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray3);
        java.lang.Class<?> wildcardClass7 = floatArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 97.0f + "'", float5 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test677");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0, 0.0d, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test678");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((-1.0d), (double) (short) 1, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test679");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 10, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test680");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((-1.0f), 97.0f, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test681");
        float[] floatArray1 = new float[] { (byte) -1 };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float9 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test682");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) '#', (-1.0f), (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test683");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) ' ', (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test684");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 0, 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test685");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 100, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test686");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 100, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test687");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 100, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test688");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1), (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test689");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 10, (float) 100L, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test690");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100, (float) 1L, (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test691");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double9 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
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
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test692");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0d, (double) 52.0f, 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test693");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '#', (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test694");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 100, 0.0f, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test695");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 0, (double) 32.0f, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test696");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((-1.0d), (double) (short) -1, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test697");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0.0f, (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test698");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1L, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test699");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0f, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test700");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test701");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0d, (double) (byte) 100, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test702");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 35.0f, (double) 32.0f, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test703");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100L, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test704");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0d, (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test705");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) '4', (float) (short) 10, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test706");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0f), (float) (byte) -1, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test707");
        float[] floatArray3 = new float[] { 0.0f, 97.0f, 0.0f };
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray3);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray3);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        java.lang.Class<?> wildcardClass9 = floatArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 97.0f + "'", float5 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test708");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(10.0d, (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test709");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 1, 0.0f, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test710");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 10, (float) (byte) 100, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test711");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        java.lang.Class<?> wildcardClass9 = doubleArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test712");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) -1, (double) 100, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test713");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 1, (double) ' ', 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test714");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0d, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test715");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 1, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test716");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10, 0.0d, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test717");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((-1.0d), 1.0d, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test718");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 100, (double) ' ', (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test719");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test720");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 10, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test721");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 10, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test722");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0d, (double) (byte) 100, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test723");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10L, (double) '#', (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test724");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) -1, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test725");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 100, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test726");
        float[] floatArray1 = new float[] { (byte) -1 };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        java.lang.Class<?> wildcardClass9 = floatArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test727");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0f, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test728");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0d, 100.0d, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test729");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1.0f, (double) 0.0f, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test730");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 35.0f, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test731");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(35.0d, (double) 0L, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test732");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test733");
        double[] doubleArray5 = new double[] { 52.0f, ' ', 10.0f, 35.0f, 52.0d };
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test734");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test735");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 35.0f, 1.0d, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test736");
        float[] floatArray3 = new float[] { 0.0f, 97.0f, 0.0f };
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 97.0f + "'", float5 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test737");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        java.lang.Class<?> wildcardClass8 = doubleArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test738");
        float[] floatArray3 = new float[] { 0.0f, 97.0f, 0.0f };
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray3);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray3);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float9 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 97.0f + "'", float5 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test739");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test740");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1.0f), (double) (-1), (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test741");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) -1, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test742");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test743");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0d, 97.0d, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test744");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        java.lang.Class<?> wildcardClass8 = doubleArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test745");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 97.0f, (double) 1, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test746");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test747");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10L, (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test748");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) -1, (float) (byte) 1, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test749");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0d, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test750");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 1, (double) (short) 10, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test751");
        float[] floatArray1 = new float[] { ' ' };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        java.lang.Class<?> wildcardClass8 = floatArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test752");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0f, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test753");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) (-1), (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test754");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 10, (float) ' ', 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test755");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1), 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test756");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100L, 10.0d, 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test757");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) ' ', (float) 100L, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test758");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((-1.0f), 0.0f, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test759");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 1, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test760");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1L), (float) (byte) 1, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test761");
        float[] floatArray1 = new float[] { ' ' };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test762");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10L, 97.0f, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test763");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10L, (float) (short) 100, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test764");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test765");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) 35.0f, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test766");
        float[] floatArray1 = new float[] { ' ' };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        java.lang.Class<?> wildcardClass7 = floatArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test767");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) -1, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test768");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0f), (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test769");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 100, (float) (byte) 10, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test770");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, (float) 'a', 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test771");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 97.0f, (double) (byte) 0, (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test772");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1L), (double) (short) 100, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test773");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0.0f, (double) 1L, 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test774");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1), 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test775");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test776");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) -1, 32.0f, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test777");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '4', 35.0f, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test778");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1.0f, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test779");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 10, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test780");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test781");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10, (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test782");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(35.0f, (float) (-1), (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test783");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(35.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test784");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(32.0d, (double) 100, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test785");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test786");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 1, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test787");
        double[] doubleArray5 = new double[] { (byte) 10, 52.0f, 0.0d, 10.0f, 0.0d };
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        double double9 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test788");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        java.lang.Class<?> wildcardClass7 = doubleArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test789");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0f, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test790");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double9 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
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
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test791");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0d, 32.0d, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test792");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', (float) (-1), (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test793");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 52.0f, (double) 97.0f, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test794");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((-1.0d), (double) (short) 1, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test795");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1L), (float) (byte) 100, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test796");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test797");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 97.0f, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test798");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0L, 10.0d, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test799");
        float[] floatArray1 = new float[] { ' ' };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test800");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10, (float) (byte) 10, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test801");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test802");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0L, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test803");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 97.0f, (double) (byte) 0, (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test804");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 100, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test805");
        double[] doubleArray4 = new double[] { 1L, (byte) -1, (-1), 1 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        java.lang.Class<?> wildcardClass9 = doubleArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test806");
        float[] floatArray1 = new float[] { ' ' };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        java.lang.Class<?> wildcardClass8 = floatArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test807");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1), (double) 1, (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test808");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0f, (float) '4', (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test809");
        double[] doubleArray5 = new double[] { (byte) 10, 52.0f, 0.0d, 10.0f, 0.0d };
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test810");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10, (float) 0, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test811");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, 32.0d, (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test812");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test813");
        double[] doubleArray4 = new double[] { 1L, (byte) -1, (-1), 1 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double9 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test814");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(35.0f, (float) 10L, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test815");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, 100.0f, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test816");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0f, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test817");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0f, (float) 1, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test818");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 10, (float) '4', (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test819");
        float[] floatArray1 = new float[] { (byte) -1 };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test820");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1L), (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test821");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test822");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 1, (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test823");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1), (double) 10.0f, 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test824");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) '4', 97.0f, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test825");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0d, (double) 10.0f, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test826");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test827");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100L, (double) (byte) 1, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test828");
        float[] floatArray1 = new float[] { ' ' };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test829");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 97.0f, (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test830");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test831");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test832");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 100, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test833");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10.0f, (double) 1, (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test834");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0d), (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test835");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10L, 100.0d, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test836");
        double[] doubleArray5 = new double[] { (byte) 10, 52.0f, 0.0d, 10.0f, 0.0d };
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        double double9 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test837");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test838");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) -1, (float) (short) 0, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test839");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 10, 0.0f, 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test840");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test841");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 10, (double) 0.0f, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test842");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 100, (float) '#', (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test843");
        float[] floatArray5 = new float[] { 1.0f, (-1), 100L, '4', 100.0f };
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray5);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray5);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray5);
        float float9 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test844");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 'a', (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test845");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '4', (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test846");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0.0f, 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test847");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1), (double) 32.0f, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test848");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0f, 32.0f, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test849");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, (double) (-1L), (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test850");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0f, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test851");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1), (double) 0, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test852");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100.0f, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test853");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 32.0f, (double) (-1.0f), (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test854");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0d, (double) ' ', (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test855");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 1, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test856");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0L, 0.0f, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test857");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 100, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test858");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0f, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test859");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(32.0d, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test860");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 1, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test861");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 10, (float) (byte) 1, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test862");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 35.0f, (double) (byte) 100, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test863");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1, (-1.0d), (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test864");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 1, (float) (short) 1, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test865");
        double[] doubleArray4 = new double[] { 1L, (byte) -1, (-1), 1 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double9 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test866");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0, (float) 100L, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test867");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 100, (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test868");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 100, (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test869");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (-1L), 52.0f, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test870");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 0, 35.0f, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test871");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 100, (double) 0L, 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test872");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double9 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test873");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) -1, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test874");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0f, (float) 0L, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test875");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 10, (double) (short) 100, (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test876");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(52.0d, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test877");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 0, (float) '#', (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test878");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) '4', (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test879");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1L), (double) 100.0f, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test880");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(10.0d, (double) (-1), (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test881");
        float[] floatArray1 = new float[] { ' ' };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float9 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 32.0f + "'", float8 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 32.0f + "'", float9 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test882");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1.0f, 100.0d, (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test883");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test884");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double9 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
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
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test885");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0d, (double) 100L, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test886");
        float[] floatArray1 = new float[] { ' ' };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test887");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0f, (float) 1L, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test888");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1), 1.0f, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test889");
        float[] floatArray5 = new float[] { 1.0f, (-1), 100L, '4', 100.0f };
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray5);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray5);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray5);
        java.lang.Class<?> wildcardClass9 = floatArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test890");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10, (double) (-1), (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test891");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 1, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test892");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1.0f, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test893");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test894");
        float[] floatArray1 = new float[] { ' ' };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        java.lang.Class<?> wildcardClass7 = floatArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test895");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) -1, (double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test896");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 1, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test897");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100L, 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.test898");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 1, (float) ' ', 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }
}

