
package IEEE754rUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IEEE754rUtils0 {

    public static boolean debug = false;

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test001");
        org.apache.commons.lang3.math.IEEE754rUtils iEEE754rUtils0 = new org.apache.commons.lang3.math.IEEE754rUtils();
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test002");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 10, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test003");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 10, (float) 100L, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test004");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0d, (double) (short) -1, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test005");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, (float) 0, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test006");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 10, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test007");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) 1L, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test008");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0.0f, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test009");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test010");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, 97.0f, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test011");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10.0f, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test012");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1L, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test013");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0d, (double) 0L, (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test014");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 1L, (float) 0L, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test015");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 'a', 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test016");
        double[] doubleArray4 = new double[] { 1L, (byte) -1, (-1), 1 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test017");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '4', (double) (byte) 100, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test018");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 10, (double) (byte) 10, (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test019");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '4', (double) (byte) 1, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test020");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100, (double) (-1.0f), (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test021");
        double[] doubleArray4 = new double[] { 1L, (byte) -1, (-1), 1 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test022");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 100, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test023");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0f), (float) (byte) 1, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test024");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0L, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test025");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 1L, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test026");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test027");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0f, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test028");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0.0f, (double) ' ', (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test029");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test030");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 'a', (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test031");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) (byte) 0, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test032");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 97.0f, (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test033");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test034");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '#', (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test035");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 100, 1.0f, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test036");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0f, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test037");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        java.lang.Class<?> wildcardClass8 = doubleArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test038");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 97.0f, (double) (byte) 0, (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test039");
        float[] floatArray6 = new float[] { (short) 1, 'a', (byte) 1, 1, 0, (byte) -1 };
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray6);
        float float9 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test040");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0, (float) 100, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test041");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(10.0d, (double) ' ', (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test042");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test043");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test044");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0f, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test045");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test046");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test047");
        float[] floatArray0 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            float float1 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test048");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 'a', 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test049");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10.0f, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test050");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10L, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test051");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test052");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 1, (double) (byte) -1, 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test053");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 10, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test054");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, (float) (-1L), 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test055");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, (float) 100L, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test056");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0f, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test057");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test058");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) -1, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test059");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0f, (float) '#', (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test060");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test061");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 10, (float) (short) -1, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test062");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 1, (float) (short) 100, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test063");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test064");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0f, (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test065");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test066");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) -1, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test067");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0f, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test068");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0L, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test069");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0L, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test070");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(10.0d, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test071");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 1, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test072");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) -1, (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test073");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test074");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0, (double) 100L, (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test075");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 10, (float) (short) 0, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test076");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) -1, (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test077");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test078");
        float[] floatArray1 = new float[] { (byte) -1 };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        java.lang.Class<?> wildcardClass3 = floatArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test079");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '4', (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test080");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 10, 97.0f, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test081");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0L, (double) (-1), (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test082");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 100, (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test083");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 0, 52.0d, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test084");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0d, (double) (byte) 1, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test085");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0d, (double) (short) 0, (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test086");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 1, (float) (-1L), (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test087");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 0, (-1.0d), (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test088");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0L, (double) 100L, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test089");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float1 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test090");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0d), 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test091");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((-1.0d), (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test092");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '#', 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test093");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) ' ', (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test094");
        float[] floatArray3 = new float[] { 0.0f, 97.0f, 0.0f };
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        java.lang.Class<?> wildcardClass5 = floatArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test095");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 10, (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test096");
        float[] floatArray0 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            float float1 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray0);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test097");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test098");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1.0f), (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test099");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double9 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test100");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100, (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test101");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10L, 35.0d, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test102");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10, (float) (-1L), (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test103");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) -1, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test104");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0L, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test105");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test106");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0f, (float) 100L, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test107");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100L, (float) '#', 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test108");
        double[] doubleArray5 = new double[] { (byte) 10, 52.0f, 0.0d, 10.0f, 0.0d };
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test109");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 1, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test110");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test111");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0, 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test112");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) '#', (float) (short) 0, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test113");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) ' ', (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test114");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0d, (double) 10, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test115");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 35.0f, (double) 10, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test116");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, 1.0d, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test117");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0L, (float) 100L, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test118");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test119");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, 0.0f, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test120");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0d), (double) 100.0f, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test121");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 35.0f, (double) 100L, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test122");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 10, (float) (byte) -1, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test123");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 1L, (float) (short) 10, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test124");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(35.0d, (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test125");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 100L, (float) 'a', (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test126");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 100, 100.0f, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test127");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 1, 52.0f, (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test128");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0d, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test129");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0d, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test130");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10.0f, (double) (byte) 10, (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test131");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 1, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test132");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10L, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test133");
        float[] floatArray6 = new float[] { (short) 1, 'a', (byte) 1, 1, 0, (byte) -1 };
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray6);
        java.lang.Class<?> wildcardClass9 = floatArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test134");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test135");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) -1, (float) (byte) -1, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test136");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test137");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 10, (double) 100, (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test138");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test139");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1L), (double) '#', (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test140");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(10.0f, (float) '#', 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test141");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test142");
        float[] floatArray3 = new float[] { 0.0f, 97.0f, 0.0f };
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray3);
        float float9 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 97.0f + "'", float5 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test143");
        double[] doubleArray0 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test144");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0.0f, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test145");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 'a', 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test146");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) -1, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test147");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10, (double) 0, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test148");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 1, (double) (byte) 10, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test149");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0d, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test150");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0f, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test151");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 1, (float) 0L, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test152");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 100, (float) (byte) 0, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test153");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) -1, 0.0f, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test154");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) ' ', (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test155");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0, (double) 97.0f, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test156");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0L, (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test157");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test158");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test159");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(52.0f, 0.0f, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test160");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 100, 10.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test161");
        float[] floatArray1 = new float[] { (byte) -1 };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        java.lang.Class<?> wildcardClass4 = floatArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test162");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 10, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test163");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100L, (double) '4', 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test164");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 100, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test165");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) -1, 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test166");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100L, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test167");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test168");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 0, (float) (short) 100, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test169");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10L, (double) (short) 0, (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test170");
        float[] floatArray5 = new float[] { 1.0f, (-1), 100L, '4', 100.0f };
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray5);
        java.lang.Class<?> wildcardClass7 = floatArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test171");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test172");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '#', (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test173");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test174");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 'a', (float) (byte) -1, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test175");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) -1, (float) 'a', (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test176");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) 1.0f, 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test177");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10L, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test178");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 100, (float) (-1), (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test179");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10, (double) 100.0f, (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test180");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 10, 97.0f, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test181");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 1, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test182");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0, (float) 10L, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test183");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 0, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test184");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(35.0d, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test185");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 0, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test186");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1), 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test187");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 32.0f, (double) 32.0f, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test188");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) '4', (float) (byte) 1, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test189");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0, 52.0f, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test190");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 97.0f, (double) (byte) 10, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test191");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0L, (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test192");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 97.0f, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test193");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 1, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test194");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 100, (float) 0L, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test195");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0L, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test196");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0L, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test197");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0f, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test198");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0f), (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test199");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100L, (double) 0L, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test200");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(35.0f, (float) 100, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test201");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 0, 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test202");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0d), 0.0d, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test203");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test204");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test205");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 100, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test206");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0f), 52.0f, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test207");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, (float) (-1), 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test208");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 32.0f, (double) (byte) 10, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test209");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 52.0f, (double) 10L, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test210");
        double[] doubleArray4 = new double[] { 1L, (byte) -1, (-1), 1 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test211");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 35.0f, (double) 1L, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test212");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0, 10.0f, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test213");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100, (double) (short) 100, (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test214");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test215");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0f, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test216");
        float[] floatArray6 = new float[] { (short) 1, 'a', (byte) 1, 1, 0, (byte) -1 };
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray6);
        java.lang.Class<?> wildcardClass8 = floatArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test217");
        float[] floatArray3 = new float[] { 0.0f, 97.0f, 0.0f };
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        java.lang.Class<?> wildcardClass6 = floatArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 97.0f + "'", float5 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test218");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) 1L, (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test219");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test220");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0d, (double) (short) 100, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test221");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test222");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 100, (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test223");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 1L, 0.0f, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test224");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 35.0f, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test225");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '#', (float) (byte) 1, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test226");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0d, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test227");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1L), (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test228");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test229");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 'a', (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test230");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) 0L, (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test231");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) -1, 97.0f, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test232");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test233");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 100, (float) (short) 100, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test234");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 'a', 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test235");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 32.0f, 1.0d, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test236");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10.0f, 97.0d, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test237");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '#', (double) (short) 100, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test238");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', (float) 1L, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test239");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100.0f, 0.0d, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test240");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0f, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test241");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0f, (float) ' ', 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test242");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 10, (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test243");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) -1, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test244");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1), (float) (byte) -1, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test245");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '4', (float) (short) 0, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test246");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1L, (double) (byte) -1, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test247");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1), (float) (-1L), (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test248");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0f, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test249");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10, (double) (byte) 1, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test250");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 1, (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test251");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 0, (double) (-1L), (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test252");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 0, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test253");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0f, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test254");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1L, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test255");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 100, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test256");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) -1, 100.0f, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test257");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 1L, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test258");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 1, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test259");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 1, (double) (byte) 0, 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test260");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1L), (double) (byte) 1, (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test261");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10, (float) 10L, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test262");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(52.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test263");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(32.0f, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test264");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(32.0d, (-1.0d), (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test265");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 100, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test266");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1L), 97.0d, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test267");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test268");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) ' ', (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test269");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 32.0f, (double) 52.0f, (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test270");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, (double) (short) 100, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test271");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 1, (float) 'a', (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test272");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) -1, 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test273");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) ' ', 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test274");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test275");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', (float) 100, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test276");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 0, (double) (byte) -1, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test277");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 10, (float) '4', (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test278");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double9 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test279");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 10, (double) 0L, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test280");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1L, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test281");
        float[] floatArray3 = new float[] { 0.0f, 97.0f, 0.0f };
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray3);
        java.lang.Class<?> wildcardClass6 = floatArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test282");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(10.0f, (float) 1L, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test283");
        float[] floatArray5 = new float[] { 1.0f, (-1), 100L, '4', 100.0f };
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray5);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray5);
        java.lang.Class<?> wildcardClass8 = floatArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test284");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) -1, (double) 10L, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test285");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 52.0f, (-1.0d), (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test286");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) -1, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test287");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 10, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test288");
        float[] floatArray6 = new float[] { (short) 1, 'a', (byte) 1, 1, 0, (byte) -1 };
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray6);
        float float9 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test289");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
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
            System.out.format("%n%s%n", "IEEE754rUtils0.test290");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) 10L, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test291");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) ' ', (float) 10L, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test292");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1.0f, (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test293");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 10, (float) 1, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test294");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 10, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test295");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test296");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test297");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 10, (float) 100, (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test298");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(10.0d, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test299");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100, 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test300");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '4', (double) '4', 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test301");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) -1, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test302");
        float[] floatArray3 = new float[] { 0.0f, 97.0f, 0.0f };
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray3);
        java.lang.Class<?> wildcardClass9 = floatArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 97.0f + "'", float5 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test303");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1L), 0.0f, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test304");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0L, (double) (short) 1, (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test305");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 0, (float) (short) 0, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test306");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0f, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test307");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test308");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '#', 0.0d, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test309");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 100, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test310");
        float[] floatArray1 = new float[] { (byte) -1 };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        java.lang.Class<?> wildcardClass5 = floatArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test311");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0, (double) 100.0f, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test312");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(10.0d, (double) 1L, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test313");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test314");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 1, (float) 1, (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test315");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1), 97.0f, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test316");
        float[] floatArray6 = new float[] { (short) 1, 'a', (byte) 1, 1, 0, (byte) -1 };
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray6);
        float float9 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test317");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) -1, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test318");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) (-1), (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test319");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 100, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test320");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 100, (double) 1, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test321");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(32.0d, (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test322");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 10, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test323");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, 32.0d, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test324");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0d, (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test325");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100L, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test326");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) -1, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test327");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test328");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0f, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test329");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 100, (float) (byte) 10, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test330");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (-1), (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test331");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1.0f), (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test332");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0d, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test333");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100.0f, (-1.0d), (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test334");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(10.0f, 100.0f, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test335");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test336");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0f, 0.0f, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test337");
        float[] floatArray6 = new float[] { (short) 1, 'a', (byte) 1, 1, 0, (byte) -1 };
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray6);
        float float9 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test338");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test339");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0f, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test340");
        float[] floatArray3 = new float[] { 0.0f, 97.0f, 0.0f };
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 97.0f + "'", float5 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test341");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, (double) (short) 10, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test342");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0f), (float) (byte) 100, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test343");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, 0.0f, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test344");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1L), (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test345");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0f), (float) (byte) 1, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test346");
        float[] floatArray3 = new float[] { 0.0f, 97.0f, 0.0f };
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray3);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test347");
        double[] doubleArray5 = new double[] { (byte) 10, 52.0f, 0.0d, 10.0f, 0.0d };
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test348");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 52.0f, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test349");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(10.0d, (double) ' ', 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test350");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', (float) (short) 1, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test351");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 'a', 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test352");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 1L, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test353");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test354");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100L, (double) 0L, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test355");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) '#', (double) (-1L), (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test356");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0d, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test357");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1.0f, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test358");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '#', (float) (-1L), (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test359");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0d, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test360");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1, (double) (byte) 100, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test361");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(10.0d, (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test362");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1L, 1.0d, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test363");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(10.0f, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test364");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, (double) 100L, (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test365");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 0, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test366");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0f, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test367");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '4', 35.0d, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test368");
        float[] floatArray1 = new float[] { ' ' };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
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
            System.out.format("%n%s%n", "IEEE754rUtils0.test369");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, (double) (-1.0f), (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test370");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100.0f, (double) (short) 0, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test371");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(32.0f, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test372");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) -1, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test373");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '#', (double) 100, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test374");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (-1), (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test375");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test376");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(35.0f, 100.0f, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test377");
        float[] floatArray3 = new float[] { 0.0f, 97.0f, 0.0f };
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray3);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test378");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 100, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test379");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 1L, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test380");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 1, (double) (byte) 100, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test381");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1.0f), (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test382");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0f), (float) 'a', (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test383");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0, (double) 35.0f, 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test384");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 97.0f, 0.0d, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test385");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(52.0d, (double) 0L, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test386");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 35.0f, 32.0d, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test387");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '#', (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test388");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(52.0f, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test389");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 1, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test390");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0d, (double) 10L, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test391");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 10L, (float) (byte) 0, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test392");
        double[] doubleArray5 = new double[] { (byte) 10, 52.0f, 0.0d, 10.0f, 0.0d };
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test393");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0d, 97.0d, 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test394");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10L, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test395");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 10L, 0.0f, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test396");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0d, (double) (byte) -1, 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test397");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (-1L), (float) (byte) 100, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test398");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0f, (float) (byte) 1, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test399");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) ' ', (float) 0L, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test400");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100.0f, (double) (short) 10, (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test401");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 1L, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test402");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 10, (float) (byte) 1, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test403");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) 'a', (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test404");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
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
            System.out.format("%n%s%n", "IEEE754rUtils0.test405");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 10, 32.0d, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test406");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) -1, (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test407");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 100, (double) 97.0f, (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test408");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test409");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) '4', 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test410");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) '#', (double) '4', (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test411");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 10, 32.0f, (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test412");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) ' ', (float) '4', (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test413");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 1, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test414");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) ' ', (float) '4', (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test415");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0d, (double) (short) 0, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test416");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test417");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0f, (float) '4', (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test418");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 0, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test419");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 1, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test420");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0f, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test421");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
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
            System.out.format("%n%s%n", "IEEE754rUtils0.test422");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 'a', (float) (short) 10, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test423");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10.0f, (double) '4', 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test424");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) ' ', 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test425");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) -1, (-1.0d), (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test426");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '#', (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test427");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1, (double) 1L, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test428");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, (double) 97.0f, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test429");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 1, (float) 100L, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test430");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(10.0d, (double) 97.0f, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test431");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 10, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test432");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(10.0d, (double) 1.0f, (double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test433");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 32.0f, (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test434");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) (-1), (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test435");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test436");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test437");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '#', (double) (short) 1, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test438");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test439");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1L), (double) 97.0f, (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test440");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 97.0f, 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test441");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 32.0f, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test442");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 1, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test443");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 97.0f, (double) '#', (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test444");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 35.0f, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test445");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 100, (float) ' ', (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test446");
        float[] floatArray1 = new float[] { (byte) -1 };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        java.lang.Class<?> wildcardClass6 = floatArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test447");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 52.0f, (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test448");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 100, 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test449");
        double[] doubleArray4 = new double[] { 'a', 100L, (byte) 10, (byte) 0 };
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray4);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray4);
        java.lang.Class<?> wildcardClass8 = doubleArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test450");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) 'a', (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test451");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) '#', (float) ' ', (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test452");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 1, (double) (byte) 0, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test453");
        float[] floatArray1 = new float[] { (byte) -1 };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test454");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1.0f), (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test455");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(32.0f, (float) 1, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test456");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) -1, (float) 1, 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test457");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(52.0f, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test458");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) -1, (double) (byte) -1, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test459");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(10.0f, (float) 100L, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test460");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1), (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test461");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0f, (float) (short) 100, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test462");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test463");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test464");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 10, (double) (byte) 1, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test465");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0L, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test466");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0f, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test467");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 10, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test468");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100, 0.0d, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test469");
        float[] floatArray3 = new float[] { 0.0f, 97.0f, 0.0f };
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray3);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray3);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray3);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray3);
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
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test470");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 1, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test471");
        double[] doubleArray1 = new double[] { 10 };
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray1);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray1);
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
            System.out.format("%n%s%n", "IEEE754rUtils0.test472");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(52.0f, 0.0f, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test473");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test474");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1, (double) 0.0f, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test475");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) '4', (double) 35.0f, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test476");
        double[] doubleArray5 = new double[] { (byte) 10, 52.0f, 0.0d, 10.0f, 0.0d };
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test477");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0.0f, (double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test478");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test479");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100.0f, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test480");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 100, (float) '4', (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test481");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 0, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test482");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1.0f, (double) (short) 0, 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test483");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0f, 35.0f, (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test484");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(10.0f, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test485");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 1, (float) 0, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test486");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10L, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test487");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test488");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0, (double) 1L, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test489");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0L, 52.0f, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test490");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) -1, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test491");
        float[] floatArray1 = new float[] { (byte) -1 };
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray1);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
        float float8 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray1);
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
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test492");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0d, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test493");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 1L, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test494");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', (float) ' ', (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test495");
        double[] doubleArray0 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray0);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test496");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 0, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test497");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0d), (double) (-1L), (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test498");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 100, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test499");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, (double) (byte) -1, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test500");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 10, (float) (short) 1, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }
}

