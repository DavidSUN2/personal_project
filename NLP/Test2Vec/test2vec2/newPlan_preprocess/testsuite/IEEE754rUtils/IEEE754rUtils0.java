package IEEE754rUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IEEE754rUtils0 {

    public static boolean debug = false;

    @Test
    public void IEEE754rUtils001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils001");
        org.apache.commons.lang3.math.IEEE754rUtils iEEE754rUtils0 = new org.apache.commons.lang3.math.IEEE754rUtils();
    }

    @Test
    public void IEEE754rUtils002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils002");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 10, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils003");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 10, (float) 100L, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils004");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0d, (double) (short) -1, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils005");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, (float) 0, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils006");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 10, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils007");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) 1L, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils008");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0.0f, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils009");
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
    public void IEEE754rUtils010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils010");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, 97.0f, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils011");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10.0f, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils012");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1L, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils013");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0d, (double) 0L, (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils014");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 1L, (float) 0L, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils015");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 'a', 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils016");
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
    public void IEEE754rUtils017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils017");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '4', (double) (byte) 100, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils018");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 10, (double) (byte) 10, (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils019");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '4', (double) (byte) 1, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils020");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100, (double) (-1.0f), (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils021");
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
    public void IEEE754rUtils022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils022");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 100, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils023");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0f), (float) (byte) 1, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils024");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0L, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils025");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 1L, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils026");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils027");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0f, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils028");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0.0f, (double) ' ', (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils029");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void IEEE754rUtils030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils030");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 'a', (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils031");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) (byte) 0, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void IEEE754rUtils032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils032");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 97.0f, (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils033");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils034");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '#', (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils035");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 100, 1.0f, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils036");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0f, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils037");
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
    public void IEEE754rUtils038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils038");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 97.0f, (double) (byte) 0, (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils039");
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
    public void IEEE754rUtils040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils040");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0, (float) 100, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils041");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(10.0d, (double) ' ', (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils042");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils043");
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
    public void IEEE754rUtils044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils044");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0f, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils045");
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
    public void IEEE754rUtils046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils046");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils047");
        float[] floatArray0 = new float[] {};
        // The following exception was thrown during execution in IEEE754rUtils generation
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
    public void IEEE754rUtils048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils048");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 'a', 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils049");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10.0f, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils050");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10L, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils051");
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
    public void IEEE754rUtils052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils052");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 1, (double) (byte) -1, 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils053");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 10, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils054");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, (float) (-1L), 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void IEEE754rUtils055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils055");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, (float) 100L, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils056");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0f, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils057");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils058");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) -1, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils059");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0f, (float) '#', (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils060");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils061");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 10, (float) (short) -1, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils062");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 1, (float) (short) 100, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils063");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils064");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0f, (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils065");
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
    public void IEEE754rUtils066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils066");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) -1, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils067");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0f, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils068");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0L, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils069");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0L, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils070");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(10.0d, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils071");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 1, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils072");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) -1, (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils073");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils074");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0, (double) 100L, (double) 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils075");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 10, (float) (short) 0, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils076");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) -1, (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils077");
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
    public void IEEE754rUtils078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils078");
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
    public void IEEE754rUtils079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils079");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '4', (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void IEEE754rUtils080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils080");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 10, 97.0f, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils081");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0L, (double) (-1), (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils082");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 100, (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils083");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 0, 52.0d, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils084");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0d, (double) (byte) 1, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils085");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0d, (double) (short) 0, (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils086");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 1, (float) (-1L), (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils087");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 0, (-1.0d), (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils088");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0L, (double) 100L, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils089");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in IEEE754rUtils generation
        try {
            float float1 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void IEEE754rUtils090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils090");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0d), 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils091");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((-1.0d), (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils092");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '#', 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void IEEE754rUtils093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils093");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) ' ', (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils094");
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
    public void IEEE754rUtils095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils095");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 10, (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils096");
        float[] floatArray0 = new float[] {};
        // The following exception was thrown during execution in IEEE754rUtils generation
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
    public void IEEE754rUtils097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils097");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils098");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1.0f), (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils099");
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
    public void IEEE754rUtils100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils100");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100, (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils101");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10L, 35.0d, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils102");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10, (float) (-1L), (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils103");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) -1, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils104");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0L, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils105");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils106");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0f, (float) 100L, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils107");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100L, (float) '#', 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils108");
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
    public void IEEE754rUtils109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils109");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 1, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils110");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils111");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0, 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void IEEE754rUtils112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils112");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) '#', (float) (short) 0, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void IEEE754rUtils113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils113");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) ' ', (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils114");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0d, (double) 10, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils115");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 35.0f, (double) 10, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils116");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, 1.0d, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils117");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0L, (float) 100L, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils118");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils119");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, 0.0f, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils120");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0d), (double) 100.0f, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils121");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 35.0f, (double) 100L, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils122");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 10, (float) (byte) -1, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils123");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 1L, (float) (short) 10, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils124");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(35.0d, (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void IEEE754rUtils125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils125");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 100L, (float) 'a', (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils126");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 100, 100.0f, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils127");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 1, 52.0f, (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils128");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0d, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void IEEE754rUtils129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils129");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0d, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils130");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10.0f, (double) (byte) 10, (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils131");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 1, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils132");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10L, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils133");
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
    public void IEEE754rUtils134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils134");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in IEEE754rUtils generation
        try {
            double double1 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void IEEE754rUtils135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils135");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) -1, (float) (byte) -1, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils136");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils137");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 10, (double) 100, (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils138");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils139");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1L), (double) '#', (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils140");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(10.0f, (float) '#', 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils141");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils142");
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
    public void IEEE754rUtils143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils143");
        double[] doubleArray0 = new double[] {};
        // The following exception was thrown during execution in IEEE754rUtils generation
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
    public void IEEE754rUtils144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils144");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0.0f, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils145");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 'a', 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void IEEE754rUtils146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils146");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) -1, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils147");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10, (double) 0, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils148");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 1, (double) (byte) 10, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils149");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0d, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils150");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0f, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils151");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 1, (float) 0L, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils152");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 100, (float) (byte) 0, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils153");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) -1, 0.0f, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils154");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) ' ', (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void IEEE754rUtils155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils155");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0, (double) 97.0f, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils156");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0L, (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils157");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils158");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils159");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(52.0f, 0.0f, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils160");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 100, 10.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils161");
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
    public void IEEE754rUtils162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils162");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 10, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils163");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100L, (double) '4', 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils164");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 100, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils165");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) -1, 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils166");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100L, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils167");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils168");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 0, (float) (short) 100, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils169");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10L, (double) (short) 0, (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils170");
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
    public void IEEE754rUtils171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils171");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils172");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '#', (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils173");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void IEEE754rUtils174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils174");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 'a', (float) (byte) -1, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils175");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) -1, (float) 'a', (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils176");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) 1.0f, 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils177");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10L, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils178");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 100, (float) (-1), (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils179");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10, (double) 100.0f, (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils180");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 10, 97.0f, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils181");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 1, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils182");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0, (float) 10L, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils183");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 0, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils184");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(35.0d, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils185");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 0, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils186");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1), 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils187");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 32.0f, (double) 32.0f, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils188");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) '4', (float) (byte) 1, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils189");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0, 52.0f, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils190");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 97.0f, (double) (byte) 10, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils191");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0L, (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils192");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 97.0f, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils193");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 1, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils194");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 100, (float) 0L, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils195");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0L, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils196");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0L, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils197");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0f, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils198");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0f), (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils199");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100L, (double) 0L, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils200");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(35.0f, (float) 100, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils201");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 0, 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils202");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0d), 0.0d, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils203");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils204");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils205");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 100, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils206");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0f), 52.0f, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils207");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, (float) (-1), 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils208");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 32.0f, (double) (byte) 10, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils209");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 52.0f, (double) 10L, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils210");
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
    public void IEEE754rUtils211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils211");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 35.0f, (double) 1L, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils212");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0, 10.0f, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils213");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100, (double) (short) 100, (double) 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils214");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils215");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0f, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void IEEE754rUtils216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils216");
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
    public void IEEE754rUtils217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils217");
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
    public void IEEE754rUtils218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils218");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) 1L, (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils219");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils220");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0d, (double) (short) 100, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils221");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils222");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 100, (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils223");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 1L, 0.0f, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils224");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 35.0f, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void IEEE754rUtils225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils225");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '#', (float) (byte) 1, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils226");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0d, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils227");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1L), (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils228");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils229");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 'a', (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils230");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) 0L, (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils231");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) -1, 97.0f, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils232");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils233");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 100, (float) (short) 100, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void IEEE754rUtils234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils234");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 'a', 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils235");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 32.0f, 1.0d, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils236");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10.0f, 97.0d, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils237");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '#', (double) (short) 100, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils238");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', (float) 1L, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils239");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100.0f, 0.0d, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils240");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0f, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils241");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0f, (float) ' ', 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils242");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 10, (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils243");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) -1, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils244");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1), (float) (byte) -1, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils245");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '4', (float) (short) 0, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils246");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1L, (double) (byte) -1, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils247");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1), (float) (-1L), (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils248");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0f, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils249");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10, (double) (byte) 1, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils250");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 1, (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils251");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 0, (double) (-1L), (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils252");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 0, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils253");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(100.0f, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils254");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1L, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils255");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 100, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils256");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) -1, 100.0f, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils257");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 1L, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils258");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 1, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils259");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 1, (double) (byte) 0, 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils260");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1L), (double) (byte) 1, (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils261");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10, (float) 10L, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils262");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(52.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils263");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(32.0f, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils264");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(32.0d, (-1.0d), (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils265");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 100, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils266");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1L), 97.0d, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils267");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils268");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) ' ', (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils269");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 32.0f, (double) 52.0f, (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils270");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, (double) (short) 100, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils271");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 1, (float) 'a', (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils272");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) -1, 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils273");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) ' ', 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils274");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils275");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', (float) 100, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils276");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 0, (double) (byte) -1, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils277");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 10, (float) '4', (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils278");
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
    public void IEEE754rUtils279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils279");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 10, (double) 0L, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils280");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1L, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils281");
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
    public void IEEE754rUtils282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils282");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(10.0f, (float) 1L, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void IEEE754rUtils283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils283");
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
    public void IEEE754rUtils284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils284");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) -1, (double) 10L, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils285");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 52.0f, (-1.0d), (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils286");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) -1, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils287");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 10, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils288");
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
    public void IEEE754rUtils289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils289");
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
    public void IEEE754rUtils290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils290");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) 10L, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils291");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) ' ', (float) 10L, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils292");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1.0f, (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void IEEE754rUtils293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils293");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 10, (float) 1, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils294");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 10, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils295");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils296");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils297");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 10, (float) 100, (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils298");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(10.0d, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils299");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100, 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void IEEE754rUtils300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils300");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '4', (double) '4', 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils301");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) -1, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils302");
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
    public void IEEE754rUtils303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils303");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1L), 0.0f, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils304");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0L, (double) (short) 1, (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils305");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 0, (float) (short) 0, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils306");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0f, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils307");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils308");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '#', 0.0d, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils309");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 100, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils310");
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
    public void IEEE754rUtils311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils311");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0, (double) 100.0f, (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils312");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(10.0d, (double) 1L, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils313");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils314");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 1, (float) 1, (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils315");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1), 97.0f, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils316");
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
    public void IEEE754rUtils317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils317");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) -1, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils318");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) (-1), (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils319");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 100, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void IEEE754rUtils320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils320");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 100, (double) 1, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils321");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(32.0d, (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void IEEE754rUtils322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils322");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 10, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils323");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, 32.0d, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils324");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0d, (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils325");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100L, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void IEEE754rUtils326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils326");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) -1, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils327");
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
    public void IEEE754rUtils328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils328");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0f, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils329");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 100, (float) (byte) 10, (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils330");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (-1), (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils331");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1.0f), (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils332");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0d, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils333");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100.0f, (-1.0d), (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils334");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(10.0f, 100.0f, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils335");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils336");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0f, 0.0f, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils337");
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
    public void IEEE754rUtils338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils338");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils339");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0f, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils340");
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
    public void IEEE754rUtils341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils341");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, (double) (short) 10, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils342");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0f), (float) (byte) 100, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils343");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, 0.0f, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils344");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1L), (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils345");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0f), (float) (byte) 1, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils346");
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
    public void IEEE754rUtils347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils347");
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
    public void IEEE754rUtils348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils348");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 52.0f, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils349");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(10.0d, (double) ' ', 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils350");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', (float) (short) 1, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils351");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 'a', 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils352");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 1L, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils353");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils354");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100L, (double) 0L, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils355");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) '#', (double) (-1L), (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils356");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0d, (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils357");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1.0f, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils358");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '#', (float) (-1L), (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils359");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0d, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils360");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1, (double) (byte) 100, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils361");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(10.0d, (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils362");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1L, 1.0d, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils363");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(10.0f, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils364");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, (double) 100L, (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils365");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 0, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils366");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0f, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils367");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '4', 35.0d, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils368");
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
    public void IEEE754rUtils369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils369");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, (double) (-1.0f), (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils370");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100.0f, (double) (short) 0, 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils371");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(32.0f, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils372");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) -1, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils373");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '#', (double) 100, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils374");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (-1), (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils375");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils376");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(35.0f, 100.0f, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void IEEE754rUtils377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils377");
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
    public void IEEE754rUtils378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils378");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 100, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils379");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 1L, (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils380");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 1, (double) (byte) 100, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils381");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1.0f), (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void IEEE754rUtils382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils382");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0f), (float) 'a', (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils383");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0, (double) 35.0f, 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils384");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 97.0f, 0.0d, (double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils385");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(52.0d, (double) 0L, (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils386");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 35.0f, 32.0d, (double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils387");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '#', (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils388");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(52.0f, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils389");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 1, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils390");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0d, (double) 10L, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils391");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 10L, (float) (byte) 0, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils392");
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
    public void IEEE754rUtils393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils393");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0d, 97.0d, 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils394");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10L, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils395");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 10L, 0.0f, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils396");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0d, (double) (byte) -1, 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils397");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (-1L), (float) (byte) 100, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils398");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0f, (float) (byte) 1, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils399");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) ' ', (float) 0L, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void IEEE754rUtils400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils400");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100.0f, (double) (short) 10, (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils401");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 1L, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils402");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 10, (float) (byte) 1, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils403");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) 'a', (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils404");
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
    public void IEEE754rUtils405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils405");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 10, 32.0d, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void IEEE754rUtils406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils406");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) -1, (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils407");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 100, (double) 97.0f, (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils408");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils409");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) '4', 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils410");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) '#', (double) '4', (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils411");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 10, 32.0f, (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void IEEE754rUtils412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils412");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) ' ', (float) '4', (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils413");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 1, 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void IEEE754rUtils414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils414");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) ' ', (float) '4', (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils415");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(1.0d, (double) (short) 0, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils416");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils417");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0f, (float) '4', (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils418");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 0, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils419");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 1, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils420");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0f, (float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils421");
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
    public void IEEE754rUtils422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils422");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 'a', (float) (short) 10, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils423");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10.0f, (double) '4', 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void IEEE754rUtils424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils424");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) ' ', 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils425");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) -1, (-1.0d), (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils426");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '#', (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void IEEE754rUtils427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils427");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1, (double) 1L, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils428");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, (double) 97.0f, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils429");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 1, (float) 100L, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils430");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(10.0d, (double) 97.0f, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils431");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 10, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils432");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(10.0d, (double) 1.0f, (double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils433");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 32.0f, (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void IEEE754rUtils434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils434");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) (-1), (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils435");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils436");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils437");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) '#', (double) (short) 1, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void IEEE754rUtils438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils438");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10, 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void IEEE754rUtils439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils439");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1L), (double) 97.0f, (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils440");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 97.0f, 52.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils441");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 32.0f, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void IEEE754rUtils442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils442");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 1, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils443");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 97.0f, (double) '#', (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void IEEE754rUtils444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils444");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 35.0f, (double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void IEEE754rUtils445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils445");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 100, (float) ' ', (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils446");
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
    public void IEEE754rUtils447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils447");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 52.0f, (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void IEEE754rUtils448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils448");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 100, 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils449");
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
    public void IEEE754rUtils450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils450");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) 'a', (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils451");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) '#', (float) ' ', (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void IEEE754rUtils452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils452");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 1, (double) (byte) 0, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils453");
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
    public void IEEE754rUtils454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils454");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1.0f), (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils455");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(32.0f, (float) 1, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils456");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) -1, (float) 1, 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils457");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(52.0f, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils458");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) -1, (double) (byte) -1, (double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils459");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(10.0f, (float) 100L, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils460");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (-1), (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils461");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(32.0f, (float) (short) 100, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void IEEE754rUtils462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils462");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils463");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void IEEE754rUtils464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils464");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 10, (double) (byte) 1, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils465");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0L, (float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils466");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0f, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void IEEE754rUtils467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils467");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 10, (double) 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils468");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100, 0.0d, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils469");
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
    public void IEEE754rUtils470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils470");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 1, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils471");
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
    public void IEEE754rUtils472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils472");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(52.0f, 0.0f, (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils473");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, (float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils474");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1, (double) 0.0f, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils475");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) '4', (double) 35.0f, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void IEEE754rUtils476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils476");
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
    public void IEEE754rUtils477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils477");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0.0f, (double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils478");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils479");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100.0f, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void IEEE754rUtils480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils480");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 100, (float) '4', (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void IEEE754rUtils481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils481");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 0, (float) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void IEEE754rUtils482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils482");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1.0f, (double) (short) 0, 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void IEEE754rUtils483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils483");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0f, 35.0f, (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils484");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(10.0f, (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils485");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 1, (float) 0, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void IEEE754rUtils486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils486");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10L, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils487");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, (float) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void IEEE754rUtils488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils488");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 0, (double) 1L, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void IEEE754rUtils489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils489");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 0L, 52.0f, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void IEEE754rUtils490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils490");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) -1, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils491");
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
    public void IEEE754rUtils492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils492");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0d, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void IEEE754rUtils493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils493");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 1L, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void IEEE754rUtils494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils494");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 'a', (float) ' ', (float) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void IEEE754rUtils495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils495");
        double[] doubleArray0 = new double[] {};
        // The following exception was thrown during execution in IEEE754rUtils generation
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
    public void IEEE754rUtils496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils496");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (byte) 0, (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void IEEE754rUtils497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils497");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0d), (double) (-1L), (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void IEEE754rUtils498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils498");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 100, 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void IEEE754rUtils499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils499");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, (double) (byte) -1, 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void IEEE754rUtils500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.IEEE754rUtils500");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 10, (float) (short) 1, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }
}

