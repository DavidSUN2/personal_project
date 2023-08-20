package IEEE754rUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IEEE754rUtils1 {

    public static boolean debug = false;

    @Test
    public void IEEE754rUtils501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils501");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10.0f, 52.0d, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils502");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0f, 100.0f, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils503");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils504");
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
    public void IEEE754rUtils505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils505");
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
    public void IEEE754rUtils506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils506");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) -1, (float) 1, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils507");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 10, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils508");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, 35.0f, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils509");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 35.0f, (-1.0d), (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils510");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) -1, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils511");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0L, (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils512");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 0, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils513");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '#', (float) (short) -1, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils514");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 1, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils515");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0L, (float) (short) 1, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils516");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100L, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils517");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 1, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils518");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1), (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils519");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 52.0f, (double) (byte) 1, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils520");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 0, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils521");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in IEEE754rUtils generation
        try {
            float float1 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void IEEE754rUtils522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils522");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 'a', (double) (short) 1, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils523");
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
    public void IEEE754rUtils524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils524");
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
    public void IEEE754rUtils525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils525");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0f, (float) (byte) -1, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils526");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(10.0f, 32.0f, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void IEEE754rUtils527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils527");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1.0f, (double) 10L, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils528");
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
    public void IEEE754rUtils529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils529");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '#', (double) (short) 10, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils530");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1, 0.0d, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils531");
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
    public void IEEE754rUtils532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils532");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1), 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils533");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '4', (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils534");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 10L, (-1.0f), (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils535");
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
    public void IEEE754rUtils536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils536");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 0, (float) 'a', (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils537");
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
    public void IEEE754rUtils538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils538");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0f, (float) 1, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils539");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 1, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils540");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 0, (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils541");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 10, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void IEEE754rUtils542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils542");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1L), 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils543");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(35.0f, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils544");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils545");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((-1.0d), (double) (short) 10, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils546");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 0, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils547");
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
    public void IEEE754rUtils548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils548");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 0, (double) 10.0f, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils549");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0.0f, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils550");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 10, (double) '4', (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils551");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0, 32.0d, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils552");
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
    public void IEEE754rUtils553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils553");
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
    public void IEEE754rUtils554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils554");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0d, (double) ' ', 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils555");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils556");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10L, (float) '#', (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void IEEE754rUtils557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils557");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, 100.0d, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils558");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '#', 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void IEEE754rUtils559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils559");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 1, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils560");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(35.0d, (double) 1, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils561");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 0, (double) 97.0f, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils562");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1.0f, (double) 100.0f, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils563");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 10, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils564");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 10, (float) '#', (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils565");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 32.0f, (double) (byte) 10, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils566");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) -1, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils567");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0L, (double) ' ', (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils568");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils569");
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
    public void IEEE754rUtils570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils570");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 10, (float) (short) -1, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils571");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils572");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0d, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils573");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1, (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils574");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (-1), (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils575");
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
    public void IEEE754rUtils576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils576");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) -1, 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils577");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(32.0d, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils578");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils579");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0L, 1.0d, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils580");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils581");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0f, (float) (byte) 100, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils582");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0L, (double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils583");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 100, (double) (short) -1, (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils584");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils585");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1.0f, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils586");
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
    public void IEEE754rUtils587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils587");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1, (double) 10.0f, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils588");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1, 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void IEEE754rUtils589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils589");
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
    public void IEEE754rUtils590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils590");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 100, (float) ' ', (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils591");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(35.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void IEEE754rUtils592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils592");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 100, (float) (short) -1, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils593");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils594");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 10L, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils595");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0d), (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils596");
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
    public void IEEE754rUtils597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils597");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0d, (double) 0, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils598");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 10L, (float) (short) -1, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils599");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 1, (float) 0L, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils600");
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
    public void IEEE754rUtils601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils601");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 0, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils602");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 0, (float) 0L, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils603");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) (byte) 10, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils604");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 32.0f, 35.0d, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils605");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0d, 35.0d, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils606");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 100, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils607");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils608");
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
    public void IEEE754rUtils609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils609");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10.0f, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils610");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 10, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils611");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(10.0d, 100.0d, (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils612");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils613");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1L), 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils614");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(52.0f, 1.0f, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils615");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1.0f, 0.0d, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils616");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1.0f), (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils617");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100L, (double) (-1L), 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils618");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '#', (float) '#', (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils619");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '#', 35.0d, (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils620");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1.0f, 1.0d, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils621");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1), (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils622");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) ' ', (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void IEEE754rUtils623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils623");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(32.0f, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils624");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(35.0d, (double) (byte) 0, (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils625");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(35.0f, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils626");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) -1, (float) (short) 0, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils627");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 'a', (double) 1, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils628");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) '4', (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils629");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 1, (float) (short) 100, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils630");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 1, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils631");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils632");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) -1, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils633");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils634");
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
    public void IEEE754rUtils635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils635");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0d, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils636");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0d, (double) (byte) 0, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils637");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 52.0f, (double) (short) -1, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils638");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) 'a', (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils639");
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
    public void IEEE754rUtils640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils640");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) -1, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils641");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils642");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0d, (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void IEEE754rUtils643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils643");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100.0f, (double) 0L, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils644");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils645");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(52.0d, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils646");
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
    public void IEEE754rUtils647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils647");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 100, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils648");
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
    public void IEEE754rUtils649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils649");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10.0f, (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils650");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils651");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 52.0f, (double) (byte) 0, (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils652");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 0, (double) '4', (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils653");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0f, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils654");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, 0.0f, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils655");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils656");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils657");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 0, (float) (byte) 10, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils658");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) -1, (float) (byte) 1, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils659");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 1, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils660");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 0, 32.0d, 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils661");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 'a', (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils662");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 1, (float) (byte) 10, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils663");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0d, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils664");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) '4', (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils665");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils666");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(35.0f, (float) 0L, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils667");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 1L, (float) (short) 100, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils668");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0d, (double) 10.0f, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils669");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 1, 1.0f, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils670");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, (float) (-1), (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils671");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0d, (double) 52.0f, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils672");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0d, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils673");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, (float) 10L, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils674");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0f, 32.0f, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils675");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((-1.0d), 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void IEEE754rUtils676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils676");
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
    public void IEEE754rUtils677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils677");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0, 0.0d, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils678");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((-1.0d), (double) (short) 1, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils679");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 10, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils680");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((-1.0f), 97.0f, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils681");
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
    public void IEEE754rUtils682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils682");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) '#', (-1.0f), (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void IEEE754rUtils683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils683");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) ' ', (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils684");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 0, 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils685");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 100, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils686");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 100, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils687");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 100, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils688");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1), (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils689");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 10, (float) 100L, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils690");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100, (float) 1L, (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils691");
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
    public void IEEE754rUtils692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils692");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0d, (double) 52.0f, 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils693");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '#', (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils694");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 100, 0.0f, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils695");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 0, (double) 32.0f, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils696");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((-1.0d), (double) (short) -1, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils697");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0.0f, (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils698");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1L, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils699");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0f, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils700");
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
    public void IEEE754rUtils701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils701");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0d, (double) (byte) 100, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils702");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 35.0f, (double) 32.0f, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils703");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100L, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils704");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0d, (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils705");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) '4', (float) (short) 10, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils706");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0f), (float) (byte) -1, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils707");
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
    public void IEEE754rUtils708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils708");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(10.0d, (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils709");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 1, 0.0f, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils710");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 10, (float) (byte) 100, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils711");
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
    public void IEEE754rUtils712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils712");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) -1, (double) 100, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils713");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 1, (double) ' ', 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils714");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0d, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils715");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 1, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils716");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10, 0.0d, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils717");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((-1.0d), 1.0d, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils718");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 100, (double) ' ', (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils719");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils720");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 10, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils721");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 10, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils722");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0d, (double) (byte) 100, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils723");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10L, (double) '#', (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils724");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) -1, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils725");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 100, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils726");
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
    public void IEEE754rUtils727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils727");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0f, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils728");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0d, 100.0d, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils729");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1.0f, (double) 0.0f, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils730");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 35.0f, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils731");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(35.0d, (double) 0L, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils732");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils733");
        double[] doubleArray5 = new double[] { 52.0f, ' ', 10.0f, 35.0f, 52.0d };
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void IEEE754rUtils734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils734");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils735");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 35.0f, 1.0d, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils736");
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
    public void IEEE754rUtils737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils737");
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
    public void IEEE754rUtils738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils738");
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
    public void IEEE754rUtils739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils739");
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
    public void IEEE754rUtils740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils740");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1.0f), (double) (-1), (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils741");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) -1, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils742");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils743");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0d, 97.0d, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils744");
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
    public void IEEE754rUtils745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils745");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 97.0f, (double) 1, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils746");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils747");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10L, (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils748");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) -1, (float) (byte) 1, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils749");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0d, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils750");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 1, (double) (short) 10, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils751");
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
    public void IEEE754rUtils752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils752");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0f, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils753");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) (-1), (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils754");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 10, (float) ' ', 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils755");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1), 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils756");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100L, 10.0d, 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils757");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) ' ', (float) 100L, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils758");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((-1.0f), 0.0f, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils759");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 1, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils760");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1L), (float) (byte) 1, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils761");
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
    public void IEEE754rUtils762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils762");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10L, 97.0f, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils763");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10L, (float) (short) 100, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils764");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils765");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) 35.0f, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils766");
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
    public void IEEE754rUtils767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils767");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) -1, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils768");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0f), (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils769");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 100, (float) (byte) 10, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils770");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, (float) 'a', 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils771");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 97.0f, (double) (byte) 0, (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils772");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1L), (double) (short) 100, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils773");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0.0f, (double) 1L, 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils774");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1), 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils775");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils776");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) -1, 32.0f, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils777");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '4', 35.0f, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils778");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1.0f, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils779");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 10, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils780");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils781");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10, (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils782");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(35.0f, (float) (-1), (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void IEEE754rUtils783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils783");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(35.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils784");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(32.0d, (double) 100, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils785");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils786");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 1, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils787");
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
    public void IEEE754rUtils788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils788");
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
    public void IEEE754rUtils789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils789");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0f, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils790");
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
    public void IEEE754rUtils791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils791");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0d, 32.0d, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils792");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', (float) (-1), (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils793");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 52.0f, (double) 97.0f, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils794");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((-1.0d), (double) (short) 1, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils795");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1L), (float) (byte) 100, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils796");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils797");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 97.0f, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils798");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0L, 10.0d, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils799");
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
    public void IEEE754rUtils800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils800");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10, (float) (byte) 10, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils801");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils802");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0L, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils803");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 97.0f, (double) (byte) 0, (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils804");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 100, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils805");
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
    public void IEEE754rUtils806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils806");
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
    public void IEEE754rUtils807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils807");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1), (double) 1, (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils808");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0f, (float) '4', (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils809");
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
    public void IEEE754rUtils810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils810");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10, (float) 0, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils811");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, 32.0d, (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils812");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils813");
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
    public void IEEE754rUtils814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils814");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(35.0f, (float) 10L, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils815");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, 100.0f, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils816");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0f, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils817");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0f, (float) 1, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils818");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 10, (float) '4', (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils819");
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
    public void IEEE754rUtils820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils820");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1L), (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void IEEE754rUtils821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils821");
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
    public void IEEE754rUtils822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils822");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 1, (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils823");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1), (double) 10.0f, 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils824");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) '4', 97.0f, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils825");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0d, (double) 10.0f, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils826");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils827");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100L, (double) (byte) 1, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils828");
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
    public void IEEE754rUtils829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils829");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 97.0f, (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils830");
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
    public void IEEE754rUtils831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils831");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils832");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 100, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils833");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10.0f, (double) 1, (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils834");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0d), (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils835");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10L, 100.0d, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils836");
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
    public void IEEE754rUtils837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils837");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils838");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) -1, (float) (short) 0, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils839");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 10, 0.0f, 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils840");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils841");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 10, (double) 0.0f, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils842");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 100, (float) '#', (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils843");
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
    public void IEEE754rUtils844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils844");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 'a', (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils845");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '4', (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils846");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0.0f, 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils847");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1), (double) 32.0f, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils848");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0f, 32.0f, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void IEEE754rUtils849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils849");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, (double) (-1L), (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils850");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0f, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils851");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1), (double) 0, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils852");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100.0f, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils853");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 32.0f, (double) (-1.0f), (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils854");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0d, (double) ' ', (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils855");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 1, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils856");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0L, 0.0f, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils857");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 100, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils858");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0f, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils859");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(32.0d, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void IEEE754rUtils860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils860");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 1, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils861");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 10, (float) (byte) 1, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils862");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 35.0f, (double) (byte) 100, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils863");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1, (-1.0d), (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils864");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 1, (float) (short) 1, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils865");
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
    public void IEEE754rUtils866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils866");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0, (float) 100L, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils867");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 100, (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils868");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 100, (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils869");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (-1L), 52.0f, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils870");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 0, 35.0f, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils871");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 100, (double) 0L, 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils872");
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
    public void IEEE754rUtils873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils873");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) -1, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils874");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0f, (float) 0L, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils875");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 10, (double) (short) 100, (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils876");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(52.0d, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils877");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 0, (float) '#', (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils878");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) '4', (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils879");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1L), (double) 100.0f, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils880");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(10.0d, (double) (-1), (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils881");
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
    public void IEEE754rUtils882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils882");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1.0f, 100.0d, (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils883");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils884");
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
    public void IEEE754rUtils885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils885");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0d, (double) 100L, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils886");
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
    public void IEEE754rUtils887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils887");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0f, (float) 1L, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils888");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1), 1.0f, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils889");
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
    public void IEEE754rUtils890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils890");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10, (double) (-1), (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils891");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 1, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils892");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1.0f, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils893");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils894");
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
    public void IEEE754rUtils895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils895");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) -1, (double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils896");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 1, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils897");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100L, 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void IEEE754rUtils898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils1.IEEE754rUtils898");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 1, (float) ' ', 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }
}

