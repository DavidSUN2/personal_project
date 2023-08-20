package IEEE754rUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IEEE754rUtils0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test01");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 'a', (double) (byte) 100, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test02");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((-1.0f), (float) 'a', (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test03");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, (float) (short) 100, (float) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test04");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(1.0d, (double) '#', (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test05");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) -1, (double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test06");
        org.apache.commons.lang3.math.IEEE754rUtils iEEE754rUtils0 = new org.apache.commons.lang3.math.IEEE754rUtils();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test07");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0L, 0.0f, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test08");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 10, (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test09");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, 0.0d, (double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test10");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 0L, (float) (byte) -1, (float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test11");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0L, (double) 100.0f, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test12");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 'a', (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test13");
        double[] doubleArray5 = new double[] { '#', 10L, 100, 0, 10 };
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test14");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0d, 0.0d, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test15");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) ' ', (double) 100.0f, (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test16");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(10.0f, (float) (byte) 1, 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test17");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0f, (float) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test18");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 100, (-1.0f), (float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test19");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100L, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test20");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test21");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 0, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test22");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) ' ', (float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test23");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, 0.0f, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test24");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) ' ', 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test25");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10L, (double) 1.0f, (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test26");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1.0f, 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test27");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 100L, (float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test28");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 100, (double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test29");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) -1, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test30");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (-1L), 10.0f, (float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test31");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test32");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(0.0f, (float) (-1), (float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test33");
        float[] floatArray2 = new float[] { 100, 10L };
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray2);
        java.lang.Class<?> wildcardClass6 = floatArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test34");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (byte) 1, (double) (short) 10, (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test35");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 10, (double) (short) 0, 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test36");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 100, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test37");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (short) 10, (float) (short) 100, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test38");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) -1, (float) '4', 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test39");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (-1L), 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test40");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0f, (float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test41");
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
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test42");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) -1, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test43");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 1.0f, (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test44");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0d, (-1.0d), (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test45");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0.0f, (double) (short) 0, (double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test46");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) ' ', 97.0f, (float) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test47");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10.0f, (double) 100L, (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test48");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min(10.0d, (double) 0, (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test49");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(97.0f, (float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test50");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0.0f, 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test51");
        double[] doubleArray5 = new double[] { '#', 10L, 100, 0, 10 };
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test52");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 100, (double) (byte) 1, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test53");
        float[] floatArray2 = new float[] { 100, 10L };
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray2);
        java.lang.Class<?> wildcardClass5 = floatArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test54");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(97.0d, (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test55");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 1, (float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test56");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (byte) 1, (float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test57");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 10, (-1.0f), (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test58");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 52.0f, (double) (-1), (double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test59");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 97.0f, (double) 100, (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test60");
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
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test61");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 'a', 32.0f, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test62");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 100, (float) 10, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test63");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 10, (-1.0d), (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test64");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min(0.0d, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test65");
        double[] doubleArray5 = new double[] { '#', 10L, 100, 0, 10 };
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test66");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10L, (float) 1L, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test67");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0f, (float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test68");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (byte) 0, (float) (short) 100, 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test69");
        float float2 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) '#', (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test70");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) (short) 0, (float) 1, (float) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test71");
        double[] doubleArray5 = new double[] { '#', 10L, 100, 0, 10 };
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test72");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) 10L, (float) 1L, (float) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test73");
        float[] floatArray2 = new float[] { 100, 10L };
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray2);
        java.lang.Class<?> wildcardClass5 = floatArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test74");
        double[] doubleArray5 = new double[] { '#', 10L, 100, 0, 10 };
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test75");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 97.0f, (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test76");
        float[] floatArray6 = new float[] { 0.0f, 'a', 1, 10L, (byte) 0, 100.0f };
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test77");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max((float) 10, (float) 'a', (float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test78");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 0L, (double) (-1), (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test79");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.max(52.0d, (double) 52.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test80");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 100L, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test81");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 1, 97.0d, (double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test82");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) (short) 10, (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test83");
        double[] doubleArray5 = new double[] { '#', 10L, 100, 0, 10 };
        double double6 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.IEEE754rUtils.max(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(doubleArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test84");
        double double2 = org.apache.commons.lang3.math.IEEE754rUtils.min((double) 10L, (double) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test85");
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.min((float) (-1L), (float) 'a', (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test86");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 10.0f, (double) 32.0f, (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test87");
        float[] floatArray2 = new float[] { 100, 10L };
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray2);
        float float6 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray2);
        float float7 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test88");
        float[] floatArray2 = new float[] { 100, 10L };
        float float3 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.IEEE754rUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.IEEE754rUtils.min(floatArray2);
        java.lang.Class<?> wildcardClass6 = floatArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(floatArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test89");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max(100.0d, (double) (-1.0f), (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test90");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 10, 0.0d, (double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test91");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) 32.0f, (double) 1.0f, (double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IEEE754rUtils0.test92");
        double double3 = org.apache.commons.lang3.math.IEEE754rUtils.max((double) (short) 1, 0.0d, 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }
}

