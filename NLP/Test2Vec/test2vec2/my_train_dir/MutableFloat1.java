
package MutableFloat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableFloat1 {

    public static boolean debug = false;

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0501");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-89.0");
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0502");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 10);
        int int2 = mutableFloat1.intValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat4.add(68.0f);
        mutableFloat4.subtract((float) 0);
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0503");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-10.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0504");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        boolean boolean6 = mutableFloat5.isInfinite();
        int int7 = mutableFloat5.intValue();
        java.lang.Class<?> wildcardClass8 = mutableFloat5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0505");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        long long6 = mutableFloat1.longValue();
        mutableFloat1.subtract(25.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0506");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) float3);
        int int5 = mutableFloat4.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0507");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.setValue((java.lang.Number) (short) 0);
        mutableFloat1.subtract(10.0f);
        mutableFloat1.subtract((float) (-31L));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0508");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        boolean boolean5 = mutableFloat1.isInfinite();
        mutableFloat1.setValue((java.lang.Number) (byte) 10);
        java.lang.Float float8 = mutableFloat1.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat9 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) float8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8.equals(10.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0509");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat1.increment();
        mutableFloat1.subtract((float) (short) 100);
        mutableFloat1.setValue((java.lang.Number) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0510");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-1.0");
        mutableFloat1.decrement();
        long long3 = mutableFloat1.longValue();
        java.lang.Class<?> wildcardClass4 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-2L) + "'", long3 == (-2L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0511");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        double double6 = mutableFloat1.doubleValue();
        boolean boolean7 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0512");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 10);
        int int2 = mutableFloat1.intValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        float float4 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0513");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract(0.0f);
        mutableFloat1.add((float) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0514");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        java.lang.Float float4 = mutableFloat0.toFloat();
        mutableFloat0.subtract(10.0f);
        boolean boolean7 = mutableFloat0.isNaN();
        java.lang.Float float8 = mutableFloat0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-110.0f) + "'", float8.equals((-110.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0515");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-1.0");
        boolean boolean2 = mutableFloat1.isInfinite();
        float float3 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0516");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.setValue((float) (short) 1);
        long long5 = mutableFloat1.longValue();
        java.lang.String str6 = mutableFloat1.toString();
        boolean boolean7 = mutableFloat1.isInfinite();
        mutableFloat1.increment();
        byte byte9 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 2 + "'", byte9 == (byte) 2);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0517");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat3.subtract((java.lang.Number) 100L);
        java.lang.Float float6 = mutableFloat3.toFloat();
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat3);
        mutableFloat3.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-100.0f) + "'", float6.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0518");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        boolean boolean3 = mutableFloat0.isNaN();
        short short4 = mutableFloat0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -100 + "'", short4 == (short) -100);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0519");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("32.0");
        mutableFloat1.setValue((float) (byte) -100);
        float float4 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4 == (-100.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0520");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) -89);
        mutableFloat1.decrement();
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0521");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 10);
        int int2 = mutableFloat1.intValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0522");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract(0.0f);
        short short6 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 32 + "'", short6 == (short) 32);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0523");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        mutableFloat1.subtract((float) (byte) -8);
        boolean boolean8 = mutableFloat1.isInfinite();
        java.lang.String str9 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "18.0" + "'", str9.equals("18.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0524");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        mutableFloat1.add((java.lang.Number) (short) 1);
        mutableFloat1.setValue((float) (byte) 101);
        mutableFloat1.subtract((float) 10);
        byte byte8 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 91 + "'", byte8 == (byte) 91);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0525");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-2.0");
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0526");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 1);
        mutableFloat1.setValue((float) '4');
        double double4 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0527");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) -89);
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableFloat1.subtract(number2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0528");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        boolean boolean5 = mutableFloat1.isNaN();
        float float6 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0529");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        java.lang.String str4 = mutableFloat1.toString();
        int int5 = mutableFloat1.intValue();
        boolean boolean6 = mutableFloat1.isNaN();
        long long7 = mutableFloat1.longValue();
        float float8 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.0" + "'", str4.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0530");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        java.lang.String str8 = mutableFloat6.toString();
        java.lang.Float float9 = mutableFloat6.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "100.0" + "'", str8.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9.equals(100.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0531");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.setValue((float) (short) 1);
        long long5 = mutableFloat1.longValue();
        java.lang.String str6 = mutableFloat1.toString();
        boolean boolean7 = mutableFloat1.isInfinite();
        double double8 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0532");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        java.lang.Float float2 = mutableFloat1.getValue();
        mutableFloat1.setValue((float) 'a');
        java.lang.Class<?> wildcardClass5 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0533");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        int int2 = mutableFloat1.intValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str4 = mutableFloat3.toString();
        double double5 = mutableFloat3.doubleValue();
        java.lang.Class<?> wildcardClass6 = mutableFloat3.getClass();
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) wildcardClass6);
        java.lang.Float float8 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8.equals(100.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0534");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 36);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0535");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableFloat5.add(number6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0536");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-100.0f));
        boolean boolean2 = mutableFloat1.isNaN();
        boolean boolean3 = mutableFloat1.isInfinite();
        int int4 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-100) + "'", int4 == (-100));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0537");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean5 = mutableFloat3.equals((java.lang.Object) (byte) 100);
        mutableFloat3.subtract((java.lang.Number) 0);
        boolean boolean8 = mutableFloat1.equals((java.lang.Object) mutableFloat3);
        boolean boolean9 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0538");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat6.subtract((float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0539");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        boolean boolean4 = mutableFloat1.isNaN();
        java.lang.Float float5 = mutableFloat1.toFloat();
        double double6 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0540");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10);
        java.lang.Float float2 = mutableFloat1.toFloat();
        long long3 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0541");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        java.lang.Float float4 = mutableFloat1.getValue();
        mutableFloat1.decrement();
        boolean boolean6 = mutableFloat1.isInfinite();
        byte byte7 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0542");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.add((float) (byte) 0);
        mutableFloat1.setValue((float) (byte) 100);
        float float7 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0543");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        java.lang.String str5 = mutableFloat3.toString();
        long long6 = mutableFloat3.longValue();
        boolean boolean7 = mutableFloat3.isInfinite();
        mutableFloat3.setValue((float) (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1.0" + "'", str5.equals("-1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0544");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat3.setValue((java.lang.Number) mutableFloat6);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0545");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        float float5 = mutableFloat1.floatValue();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0546");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        float float6 = mutableFloat1.floatValue();
        double double7 = mutableFloat1.doubleValue();
        float float8 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0547");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        boolean boolean2 = mutableFloat1.isInfinite();
        mutableFloat1.add((float) 1L);
        byte byte5 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 36 + "'", byte5 == (byte) 36);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0548");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-8.0f));
        long long2 = mutableFloat1.longValue();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8L) + "'", long2 == (-8L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0549");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 25);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0550");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        double double6 = mutableFloat4.doubleValue();
        mutableFloat4.decrement();
        boolean boolean8 = mutableFloat4.isNaN();
        java.lang.Class<?> wildcardClass9 = mutableFloat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0551");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        mutableFloat1.add(10.0f);
        double double8 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 110.0d + "'", double8 == 110.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0552");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        mutableFloat1.add((float) (byte) -8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0553");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        long long3 = mutableFloat1.longValue();
        double double4 = mutableFloat1.doubleValue();
        mutableFloat1.increment();
        long long6 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0554");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Float float5 = mutableFloat4.getValue();
        java.lang.Float float6 = mutableFloat4.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0555");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat1.increment();
        mutableFloat1.subtract((float) '4');
        java.lang.Float float8 = mutableFloat1.toFloat();
        boolean boolean9 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-50.0f) + "'", float8.equals((-50.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0556");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        mutableFloat1.increment();
        mutableFloat1.setValue((float) (byte) 10);
        mutableFloat1.add(0.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0557");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        double double3 = mutableFloat1.doubleValue();
        java.lang.Float float4 = mutableFloat1.toFloat();
        java.lang.Float float5 = mutableFloat1.toFloat();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5.equals(100.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0558");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        byte byte5 = mutableFloat4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0559");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        mutableFloat1.increment();
        int int7 = mutableFloat1.intValue();
        double double8 = mutableFloat1.doubleValue();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0560");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        mutableFloat1.decrement();
        java.lang.Float float4 = mutableFloat1.getValue();
        long long5 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4.equals((-1.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0561");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-100.0f));
        long long2 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-100L) + "'", long2 == (-100L));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0562");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        long long6 = mutableFloat5.longValue();
        boolean boolean7 = mutableFloat5.isNaN();
        mutableFloat1.subtract((java.lang.Number) mutableFloat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0563");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 9);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0564");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.decrement();
        java.lang.Float float5 = mutableFloat1.toFloat();
        mutableFloat1.add((-201.0f));
        float float8 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-201.0f) + "'", float8 == (-201.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0565");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.setValue(0.0f);
        float float4 = mutableFloat1.floatValue();
        long long5 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0566");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        int int4 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0567");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        java.lang.Float float4 = mutableFloat0.toFloat();
        mutableFloat0.subtract(10.0f);
        boolean boolean7 = mutableFloat0.isNaN();
        java.lang.Class<?> wildcardClass8 = mutableFloat0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0568");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        boolean boolean3 = mutableFloat0.isInfinite();
        java.lang.Float float4 = mutableFloat0.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat0);
        mutableFloat0.increment();
        short short7 = mutableFloat0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -99 + "'", short7 == (short) -99);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0569");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(52.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0570");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.Float float3 = mutableFloat1.getValue();
        mutableFloat1.subtract((float) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3.equals(1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0571");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.subtract((-100.0f));
        byte byte4 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0572");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.add((float) (byte) 0);
        float float5 = mutableFloat1.floatValue();
        mutableFloat1.setValue((float) (-100));
        java.lang.Float float8 = mutableFloat1.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat9 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) float8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-100.0f) + "'", float8.equals((-100.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0573");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract(0.0f);
        mutableFloat1.setValue(0.0f);
        mutableFloat1.add((float) (short) -100);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0574");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (byte) 0);
        boolean boolean6 = mutableFloat5.isInfinite();
        boolean boolean7 = mutableFloat5.isInfinite();
        java.lang.Object obj8 = null;
        boolean boolean9 = mutableFloat5.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0575");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        boolean boolean4 = mutableFloat3.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0576");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        java.lang.String str6 = mutableFloat4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "32.0" + "'", str6.equals("32.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0577");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        byte byte4 = mutableFloat3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0578");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100L);
        java.lang.Float float2 = mutableFloat1.toFloat();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2.equals(100.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0579");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        boolean boolean5 = mutableFloat3.isInfinite();
        mutableFloat3.subtract((float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0580");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (byte) 0);
        java.lang.Float float6 = mutableFloat5.getValue();
        java.lang.Float float7 = mutableFloat5.getValue();
        java.lang.String str8 = mutableFloat5.toString();
        float float9 = mutableFloat5.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0.0" + "'", str8.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0581");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str2 = mutableFloat1.toString();
        double double3 = mutableFloat1.doubleValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        java.lang.Float float6 = mutableFloat5.getValue();
        java.lang.Class<?> wildcardClass7 = mutableFloat5.getClass();
        boolean boolean8 = mutableFloat1.equals((java.lang.Object) wildcardClass7);
        int int9 = mutableFloat0.compareTo(mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0.0" + "'", str2.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 35.0f + "'", float6.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0582");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        boolean boolean4 = mutableFloat1.isNaN();
        boolean boolean5 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0583");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        java.lang.String str4 = mutableFloat1.toString();
        mutableFloat1.subtract((float) (-20L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "32.0" + "'", str4.equals("32.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0584");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat1.subtract((-2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0585");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        mutableFloat1.add((java.lang.Number) (short) 1);
        mutableFloat1.setValue((float) (byte) 101);
        mutableFloat1.subtract((float) 10);
        mutableFloat1.increment();
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0586");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0587");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 65L);
        mutableFloat1.subtract((-201.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0588");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long5 = mutableFloat4.longValue();
        mutableFloat4.add((-11.0f));
        int int8 = mutableFloat1.compareTo(mutableFloat4);
        java.lang.String str9 = mutableFloat4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-11.0" + "'", str9.equals("-11.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0589");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        mutableFloat1.add(2.0f);
        mutableFloat1.add((java.lang.Number) (-88));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0590");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        mutableFloat1.increment();
        mutableFloat1.subtract(11.0f);
        java.lang.Class<?> wildcardClass7 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0591");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("197.0");
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0592");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        java.lang.Float float2 = mutableFloat1.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat3.increment();
        short short5 = mutableFloat3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 36 + "'", short5 == (short) 36);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0593");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-100L));
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean5 = mutableFloat3.equals((java.lang.Object) (byte) 100);
        mutableFloat3.add(22.0f);
        float float8 = mutableFloat3.floatValue();
        boolean boolean9 = mutableFloat1.equals((java.lang.Object) mutableFloat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 23.0f + "'", float8 == 23.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0594");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        long long4 = mutableFloat1.longValue();
        long long5 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0595");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        java.lang.String str5 = mutableFloat3.toString();
        java.lang.Class<?> wildcardClass6 = mutableFloat3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1.0" + "'", str5.equals("-1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0596");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableFloat1.setValue(number6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0597");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat2 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat2.subtract((java.lang.Number) 100L);
        java.lang.Float float5 = mutableFloat2.toFloat();
        mutableFloat1.add((java.lang.Number) mutableFloat2);
        byte byte7 = mutableFloat2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-100.0f) + "'", float5.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -100 + "'", byte7 == (byte) -100);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0598");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 1);
        mutableFloat1.setValue((float) '4');
        long long4 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0599");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        java.lang.String str5 = mutableFloat3.toString();
        long long6 = mutableFloat3.longValue();
        boolean boolean7 = mutableFloat3.isInfinite();
        mutableFloat3.add((float) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1.0" + "'", str5.equals("-1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0600");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.Float float2 = mutableFloat1.getValue();
        mutableFloat1.add((float) 'a');
        mutableFloat1.setValue((java.lang.Number) 101L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2.equals(100.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0601");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        short short5 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0602");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.add((float) (byte) 0);
        mutableFloat1.setValue(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0603");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.subtract((float) (short) 0);
        boolean boolean5 = mutableFloat1.isNaN();
        boolean boolean6 = mutableFloat1.isNaN();
        boolean boolean7 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0604");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract(22.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0605");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        boolean boolean5 = mutableFloat3.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat3);
        double double7 = mutableFloat6.doubleValue();
        mutableFloat6.subtract((float) (-3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0606");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        mutableFloat1.subtract((float) 10L);
        float float4 = mutableFloat1.floatValue();
        mutableFloat1.subtract(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 22.0f + "'", float4 == 22.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0607");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.subtract((-100.0f));
        mutableFloat1.subtract((float) ' ');
        mutableFloat1.add((float) (byte) 100);
        java.lang.Float float8 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 168.0f + "'", float8.equals(168.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0608");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        mutableFloat1.increment();
        java.lang.String str3 = mutableFloat1.toString();
        boolean boolean4 = mutableFloat1.isInfinite();
        mutableFloat1.add((float) (-8));
        java.lang.Float float7 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-7.0f) + "'", float7.equals((-7.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0609");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue(0.0f);
        mutableFloat1.increment();
        long long7 = mutableFloat1.longValue();
        boolean boolean8 = mutableFloat1.isNaN();
        byte byte9 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0610");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.decrement();
        mutableFloat1.subtract((-11.0f));
        java.lang.Float float7 = mutableFloat1.getValue();
        double double8 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 11.0f + "'", float7.equals(11.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0611");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue(0.0f);
        boolean boolean6 = mutableFloat1.isInfinite();
        float float7 = mutableFloat1.floatValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        int int9 = mutableFloat8.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0612");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100L);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        java.lang.Float float4 = mutableFloat3.getValue();
        boolean boolean5 = mutableFloat1.equals((java.lang.Object) float4);
        long long6 = mutableFloat1.longValue();
        java.lang.Float float7 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4.equals((-1.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7.equals(100.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0613");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        mutableFloat0.add((float) 0L);
        java.lang.Float float6 = mutableFloat0.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) float6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-100.0f) + "'", float6.equals((-100.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0614");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.subtract((float) 35L);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10.0" + "'", str2.equals("10.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0615");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        boolean boolean5 = mutableFloat1.isNaN();
        double double6 = mutableFloat1.doubleValue();
        mutableFloat1.setValue((float) (-88));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0616");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        java.lang.Float float6 = mutableFloat1.toFloat();
        boolean boolean7 = mutableFloat1.isInfinite();
        boolean boolean8 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0617");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((-100.0f));
        mutableFloat3.subtract(100.0f);
        mutableFloat3.decrement();
        float float7 = mutableFloat3.floatValue();
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-201.0f) + "'", float7 == (-201.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0618");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        mutableFloat1.subtract((float) 10L);
        short short4 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 22 + "'", short4 == (short) 22);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0619");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        boolean boolean6 = mutableFloat5.isInfinite();
        byte byte7 = mutableFloat5.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0620");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        double double2 = mutableFloat1.doubleValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        java.lang.String str5 = mutableFloat4.toString();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        byte byte7 = mutableFloat4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0" + "'", str5.equals("10.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0621");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        mutableFloat0.setValue((float) (byte) 0);
        java.lang.Float float5 = mutableFloat0.toFloat();
        boolean boolean7 = mutableFloat0.equals((java.lang.Object) 1.0d);
        mutableFloat0.subtract((float) (-99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0622");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        boolean boolean5 = mutableFloat3.isInfinite();
        java.lang.String str6 = mutableFloat3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0" + "'", str6.equals("-1.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0623");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat("10.0");
        int int4 = mutableFloat1.compareTo(mutableFloat3);
        long long5 = mutableFloat3.longValue();
        int int6 = mutableFloat3.intValue();
        mutableFloat3.decrement();
        float float8 = mutableFloat3.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 9.0f + "'", float8 == 9.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0624");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        java.lang.Float float6 = mutableFloat1.getValue();
        int int7 = mutableFloat1.intValue();
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableFloat1.setValue(number8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0625");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        mutableFloat1.add(10.0f);
        int int8 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 110 + "'", int8 == 110);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0626");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.add((float) (byte) 0);
        mutableFloat1.setValue((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        mutableFloat1.subtract((java.lang.Number) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0627");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.decrement();
        java.lang.Float float5 = mutableFloat1.getValue();
        boolean boolean6 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0628");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        double double3 = mutableFloat1.doubleValue();
        java.lang.Float float4 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4.equals(1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0629");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.add(22.0f);
        float float6 = mutableFloat1.floatValue();
        mutableFloat1.decrement();
        mutableFloat1.add((float) (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 23.0f + "'", float6 == 23.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0630");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        boolean boolean3 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0631");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        float float6 = mutableFloat4.floatValue();
        boolean boolean7 = mutableFloat4.isInfinite();
        mutableFloat4.setValue((float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0632");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        mutableFloat1.setValue((float) (byte) -1);
        float float6 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0633");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat3.subtract((float) (short) 0);
        mutableFloat3.setValue(0.0f);
        int int8 = mutableFloat1.compareTo(mutableFloat3);
        boolean boolean9 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0634");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-99.0");
        mutableFloat1.decrement();
        mutableFloat1.increment();
        mutableFloat1.subtract((float) (-1L));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0635");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        boolean boolean4 = mutableFloat1.isNaN();
        java.lang.Float float5 = mutableFloat1.toFloat();
        boolean boolean6 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0636");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.decrement();
        java.lang.Float float5 = mutableFloat1.toFloat();
        java.lang.Class<?> wildcardClass6 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0637");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Class<?> wildcardClass7 = mutableFloat6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0638");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        mutableFloat1.add((java.lang.Number) (short) 1);
        mutableFloat1.setValue((float) (byte) 101);
        java.lang.Float float6 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 101.0f + "'", float6.equals(101.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0639");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        double double6 = mutableFloat1.doubleValue();
        java.lang.String str7 = mutableFloat1.toString();
        java.lang.Float float8 = mutableFloat1.toFloat();
        long long9 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1.0" + "'", str7.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0640");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (byte) -8);
        mutableFloat1.add((float) (short) 10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0641");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        mutableFloat0.increment();
        mutableFloat0.setValue((float) (short) 10);
        mutableFloat0.decrement();
        boolean boolean8 = mutableFloat0.isInfinite();
        byte byte9 = mutableFloat0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 9 + "'", byte9 == (byte) 9);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0642");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        boolean boolean4 = mutableFloat1.isInfinite();
        mutableFloat1.subtract((float) ' ');
        mutableFloat1.setValue(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0643");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        float float2 = mutableFloat1.floatValue();
        boolean boolean4 = mutableFloat1.equals((java.lang.Object) (-201.0f));
        byte byte5 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 35 + "'", byte5 == (byte) 35);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0644");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        float float6 = mutableFloat4.floatValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat4);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat4);
        java.lang.String str9 = mutableFloat4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1.0" + "'", str9.equals("1.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0645");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract((float) (short) -89);
        mutableFloat1.setValue(9.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0646");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        java.lang.Float float4 = mutableFloat1.getValue();
        mutableFloat1.decrement();
        mutableFloat1.add((-50.0f));
        short short8 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -50 + "'", short8 == (short) -50);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0647");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0648");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) -100);
        java.lang.Float float2 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100.0f) + "'", float2.equals((-100.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0649");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 2);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0650");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.subtract((float) (byte) 100);
        boolean boolean6 = mutableFloat1.equals((java.lang.Object) 100);
        byte byte7 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0651");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        mutableFloat1.increment();
        mutableFloat1.subtract(11.0f);
        mutableFloat1.increment();
        java.lang.Float float8 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-7.0f) + "'", float8.equals((-7.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0652");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.setValue(0.0f);
        mutableFloat1.decrement();
        java.lang.Float float7 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7.equals((-1.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0653");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        mutableFloat1.subtract(11.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        mutableFloat5.setValue((float) (short) 1);
        mutableFloat1.add((java.lang.Number) mutableFloat5);
        int int9 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0654");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        mutableFloat1.increment();
        byte byte5 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 3 + "'", byte5 == (byte) 3);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0655");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.subtract((-2.0f));
        boolean boolean5 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10.0" + "'", str2.equals("10.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0656");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 30);
        byte byte2 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 30 + "'", byte2 == (byte) 30);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0657");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        float float6 = mutableFloat1.floatValue();
        boolean boolean7 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0658");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.increment();
        long long4 = mutableFloat1.longValue();
        boolean boolean6 = mutableFloat1.equals((java.lang.Object) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 101L + "'", long4 == 101L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0659");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-8));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0660");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        mutableFloat0.add((float) 0L);
        java.lang.Float float6 = mutableFloat0.getValue();
        double double7 = mutableFloat0.doubleValue();
        mutableFloat0.subtract((java.lang.Number) (-99.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-100.0f) + "'", float6.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0661");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.subtract((java.lang.Number) (-2.0d));
        java.lang.Class<?> wildcardClass7 = mutableFloat3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0662");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.add(22.0f);
        float float6 = mutableFloat1.floatValue();
        mutableFloat1.decrement();
        java.lang.String str8 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 23.0f + "'", float6 == 23.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "22.0" + "'", str8.equals("22.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0663");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.add((float) 35L);
        boolean boolean7 = mutableFloat1.isInfinite();
        java.lang.String str8 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "135.0" + "'", str8.equals("135.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0664");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        mutableFloat0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0665");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        mutableFloat4.subtract((float) 10L);
        mutableFloat4.decrement();
        float float9 = mutableFloat4.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-11.0f) + "'", float9 == (-11.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0666");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        mutableFloat1.subtract(99.0f);
        boolean boolean8 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0667");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.Float float2 = mutableFloat1.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.String str5 = mutableFloat4.toString();
        mutableFloat4.subtract(100.0f);
        mutableFloat1.subtract((java.lang.Number) mutableFloat4);
        short short9 = mutableFloat4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0668");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        double double6 = mutableFloat4.doubleValue();
        mutableFloat4.decrement();
        boolean boolean8 = mutableFloat4.isNaN();
        long long9 = mutableFloat4.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0669");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        double double3 = mutableFloat1.doubleValue();
        int int4 = mutableFloat1.intValue();
        short short5 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0670");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        float float3 = mutableFloat1.floatValue();
        byte byte4 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0671");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        boolean boolean1 = mutableFloat0.isInfinite();
        double double2 = mutableFloat0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0672");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        double double3 = mutableFloat1.doubleValue();
        long long4 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0673");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.Float float2 = mutableFloat1.getValue();
        long long3 = mutableFloat1.longValue();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0674");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        mutableFloat1.add((-100.0f));
        mutableFloat1.add(10.0f);
        mutableFloat1.subtract((float) (byte) 0);
        float float9 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-90.0f) + "'", float9 == (-90.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0675");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean5 = mutableFloat3.equals((java.lang.Object) (byte) 100);
        mutableFloat3.subtract((java.lang.Number) 0);
        boolean boolean8 = mutableFloat1.equals((java.lang.Object) mutableFloat3);
        boolean boolean9 = mutableFloat3.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0676");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        int int7 = mutableFloat6.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0677");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        double double6 = mutableFloat4.doubleValue();
        mutableFloat4.decrement();
        float float8 = mutableFloat4.floatValue();
        byte byte9 = mutableFloat4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0678");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        double double6 = mutableFloat4.doubleValue();
        mutableFloat4.decrement();
        float float8 = mutableFloat4.floatValue();
        float float9 = mutableFloat4.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0679");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Float float6 = mutableFloat1.toFloat();
        double double7 = mutableFloat1.doubleValue();
        boolean boolean8 = mutableFloat1.isNaN();
        java.lang.Float float9 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9.equals(100.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0680");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        float float2 = mutableFloat1.floatValue();
        boolean boolean4 = mutableFloat1.equals((java.lang.Object) (-201.0f));
        java.lang.String str5 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "35.0" + "'", str5.equals("35.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0681");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        boolean boolean6 = mutableFloat1.isInfinite();
        boolean boolean7 = mutableFloat1.isInfinite();
        java.lang.Class<?> wildcardClass8 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0682");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.Float float2 = mutableFloat1.getValue();
        mutableFloat1.add((float) 'a');
        java.lang.String str5 = mutableFloat1.toString();
        mutableFloat1.add((float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "197.0" + "'", str5.equals("197.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0683");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        boolean boolean4 = mutableFloat1.isInfinite();
        mutableFloat1.subtract((float) ' ');
        java.lang.Float float7 = mutableFloat1.toFloat();
        double double8 = mutableFloat1.doubleValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat9 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-31.0f) + "'", float7.equals((-31.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-31.0d) + "'", double8 == (-31.0d));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0684");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        double double2 = mutableFloat1.doubleValue();
        java.lang.Float float3 = mutableFloat1.toFloat();
        short short4 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0685");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(68.0f);
        mutableFloat1.increment();
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0686");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        int int4 = mutableFloat3.intValue();
        java.lang.Float float5 = mutableFloat3.getValue();
        mutableFloat3.increment();
        long long7 = mutableFloat3.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0687");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.Float float2 = mutableFloat1.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.String str5 = mutableFloat4.toString();
        mutableFloat4.subtract(100.0f);
        mutableFloat1.subtract((java.lang.Number) mutableFloat4);
        double double9 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0688");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 10);
        mutableFloat5.setValue((java.lang.Number) (byte) 10);
        mutableFloat5.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0689");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 10L);
        double double7 = mutableFloat3.doubleValue();
        mutableFloat3.setValue((float) (-100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0690");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(25.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0691");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        int int2 = mutableFloat1.intValue();
        long long3 = mutableFloat1.longValue();
        mutableFloat1.increment();
        java.lang.Float float5 = mutableFloat1.toFloat();
        int int6 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0692");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        mutableFloat1.subtract((float) (byte) -1);
        java.lang.Float float8 = mutableFloat1.toFloat();
        double double9 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 11.0f + "'", float8.equals(11.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 11.0d + "'", double9 == 11.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0693");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        int int6 = mutableFloat4.intValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        mutableFloat4.add((java.lang.Number) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0694");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        boolean boolean1 = mutableFloat0.isInfinite();
        java.lang.Float float2 = mutableFloat0.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2.equals(0.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0695");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        mutableFloat1.increment();
        mutableFloat1.subtract((java.lang.Number) 0L);
        double double7 = mutableFloat1.doubleValue();
        byte byte8 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3.0d + "'", double7 == 3.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 3 + "'", byte8 == (byte) 3);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0696");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        java.lang.Float float3 = mutableFloat1.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat(1.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0f);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        java.lang.String str8 = mutableFloat6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.0" + "'", str8.equals("1.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0697");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat4);
        mutableFloat5.add((float) (-10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0698");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str4 = mutableFloat3.toString();
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        long long6 = mutableFloat1.longValue();
        int int7 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0699");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.Float float2 = mutableFloat1.getValue();
        long long3 = mutableFloat1.longValue();
        long long4 = mutableFloat1.longValue();
        java.lang.Float float5 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5.equals(100.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0700");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        byte byte6 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0701");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-31L));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0702");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        double double6 = mutableFloat4.doubleValue();
        double double7 = mutableFloat4.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0703");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        boolean boolean2 = mutableFloat1.isInfinite();
        mutableFloat1.add((float) 1L);
        short short5 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 36 + "'", short5 == (short) 36);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0704");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.setValue((float) (short) 1);
        long long5 = mutableFloat1.longValue();
        java.lang.String str6 = mutableFloat1.toString();
        boolean boolean7 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0705");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat1.increment();
        mutableFloat1.subtract((float) (short) 100);
        mutableFloat1.add(110.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0706");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat4);
        java.lang.Class<?> wildcardClass6 = mutableFloat4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0707");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        mutableFloat1.add((-100.0f));
        mutableFloat1.add(10.0f);
        boolean boolean7 = mutableFloat1.isNaN();
        int int8 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-90) + "'", int8 == (-90));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0708");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        int int2 = mutableFloat1.intValue();
        mutableFloat1.subtract((float) 20L);
        mutableFloat1.subtract((float) (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0709");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.add((float) (byte) 0);
        mutableFloat1.setValue((float) (byte) 100);
        double double7 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0710");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        java.lang.String str4 = mutableFloat1.toString();
        int int5 = mutableFloat1.intValue();
        boolean boolean6 = mutableFloat1.isNaN();
        short short7 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.0" + "'", str4.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0711");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.setValue(0.0f);
        float float4 = mutableFloat1.floatValue();
        int int5 = mutableFloat1.intValue();
        boolean boolean6 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0712");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        double double6 = mutableFloat1.doubleValue();
        int int7 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0713");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (short) 10);
        double double2 = mutableFloat1.doubleValue();
        mutableFloat1.decrement();
        boolean boolean4 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0714");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        mutableFloat6.setValue((float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0715");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        mutableFloat1.increment();
        boolean boolean3 = mutableFloat1.isNaN();
        short short4 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0716");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat1.subtract((java.lang.Number) 1L);
        short short9 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 9 + "'", short9 == (short) 9);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0717");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        int int4 = mutableFloat1.intValue();
        int int5 = mutableFloat1.intValue();
        long long6 = mutableFloat1.longValue();
        int int7 = mutableFloat1.intValue();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0718");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        boolean boolean5 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0719");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 10);
        short short2 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0720");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-100L));
        mutableFloat1.decrement();
        mutableFloat1.subtract((float) 202);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0721");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.setValue((java.lang.Number) (short) 0);
        mutableFloat1.subtract(10.0f);
        long long8 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat9 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) long8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-10L) + "'", long8 == (-10L));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0722");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100L);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        java.lang.Float float4 = mutableFloat3.getValue();
        boolean boolean5 = mutableFloat1.equals((java.lang.Object) float4);
        mutableFloat1.setValue((float) (byte) -1);
        int int8 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4.equals((-1.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0723");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        mutableFloat1.subtract((float) (byte) 99);
        mutableFloat1.subtract((float) 3);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0724");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        long long5 = mutableFloat1.longValue();
        java.lang.Float float6 = mutableFloat1.getValue();
        mutableFloat1.decrement();
        mutableFloat1.decrement();
        java.lang.Class<?> wildcardClass9 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0725");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract(0.0f);
        mutableFloat1.decrement();
        java.lang.Float float7 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 31.0f + "'", float7.equals(31.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0726");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        boolean boolean3 = mutableFloat0.isNaN();
        mutableFloat0.increment();
        mutableFloat0.setValue((float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0727");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        int int2 = mutableFloat1.intValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.add((java.lang.Number) 10L);
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0728");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.subtract((java.lang.Number) mutableFloat7);
        double double9 = mutableFloat7.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0729");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        mutableFloat1.add((float) (byte) 10);
        long long7 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0730");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        int int3 = mutableFloat1.intValue();
        boolean boolean4 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0731");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        java.lang.Float float2 = mutableFloat1.getValue();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2.equals((-1.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0732");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.setValue(0.0f);
        float float4 = mutableFloat1.floatValue();
        java.lang.Float float5 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5.equals(0.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0733");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat("-99.0");
        int int8 = mutableFloat4.compareTo(mutableFloat7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0734");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        float float3 = mutableFloat1.floatValue();
        java.lang.Float float4 = mutableFloat1.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4.equals(100.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0735");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        mutableFloat1.add(10.0f);
        java.lang.Float float8 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 110.0f + "'", float8.equals(110.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0736");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        mutableFloat0.increment();
        mutableFloat0.setValue((float) (short) 10);
        mutableFloat0.decrement();
        mutableFloat0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0737");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        mutableFloat1.add(2.0f);
        int int8 = mutableFloat1.intValue();
        int int9 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0738");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        int int2 = mutableFloat1.intValue();
        mutableFloat1.subtract((float) 20L);
        mutableFloat1.setValue((float) 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0739");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        boolean boolean2 = mutableFloat1.isNaN();
        mutableFloat1.subtract((float) (-10L));
        java.lang.Class<?> wildcardClass5 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0740");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.add((-2.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0741");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (byte) -8);
        java.lang.Float float2 = mutableFloat1.toFloat();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.0f) + "'", float2.equals((-8.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0742");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (short) 10);
        double double2 = mutableFloat1.doubleValue();
        mutableFloat1.add(1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0743");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        java.lang.Float float4 = mutableFloat1.getValue();
        mutableFloat1.decrement();
        mutableFloat1.add((-50.0f));
        long long8 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-50L) + "'", long8 == (-50L));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0744");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat2 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((float) 3);
        mutableFloat4.subtract(0.0f);
        mutableFloat2.add((java.lang.Number) 0.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0745");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        java.lang.String str2 = mutableFloat1.toString();
        java.lang.Float float3 = mutableFloat1.getValue();
        mutableFloat1.setValue((float) (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10.0" + "'", str2.equals("10.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3.equals(10.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0746");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 101);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat("-99.0");
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        java.lang.Float float5 = mutableFloat3.toFloat();
        byte byte6 = mutableFloat3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-99.0f) + "'", float5.equals((-99.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -99 + "'", byte6 == (byte) -99);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0747");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        java.lang.Float float4 = mutableFloat1.getValue();
        mutableFloat1.decrement();
        double double6 = mutableFloat1.doubleValue();
        mutableFloat1.decrement();
        short short8 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0748");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        java.lang.Class<?> wildcardClass4 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0749");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.subtract((-100.0f));
        mutableFloat1.subtract((float) ' ');
        int int6 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 68 + "'", int6 == 68);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0750");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        int int6 = mutableFloat4.intValue();
        int int7 = mutableFloat4.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0751");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-11.0");
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0752");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        long long5 = mutableFloat4.longValue();
        float float6 = mutableFloat4.floatValue();
        int int7 = mutableFloat1.compareTo(mutableFloat4);
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0753");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str4 = mutableFloat3.toString();
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        boolean boolean6 = mutableFloat3.isNaN();
        int int7 = mutableFloat3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0754");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        java.lang.Float float4 = mutableFloat1.getValue();
        double double5 = mutableFloat1.doubleValue();
        long long6 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        short short8 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0755");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '4');
        java.lang.Float float2 = mutableFloat1.toFloat();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2.equals(52.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0756");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        boolean boolean5 = mutableFloat3.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat3);
        mutableFloat3.subtract((float) ' ');
        double double9 = mutableFloat3.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-33.0d) + "'", double9 == (-33.0d));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0757");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        double double4 = mutableFloat1.doubleValue();
        short short5 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 2 + "'", short5 == (short) 2);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0758");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        double double2 = mutableFloat1.doubleValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        int int4 = mutableFloat1.intValue();
        short short5 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0759");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.subtract(100.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 100L);
        float float7 = mutableFloat6.floatValue();
        boolean boolean8 = mutableFloat1.equals((java.lang.Object) mutableFloat6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0760");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        long long5 = mutableFloat1.longValue();
        java.lang.Float float6 = mutableFloat1.getValue();
        java.lang.Float float7 = mutableFloat1.getValue();
        boolean boolean8 = mutableFloat1.isNaN();
        java.lang.Float float9 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9.equals(100.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0761");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.subtract((float) (byte) 100);
        boolean boolean6 = mutableFloat1.equals((java.lang.Object) 100);
        int int7 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0762");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        int int4 = mutableFloat1.intValue();
        int int5 = mutableFloat1.intValue();
        long long6 = mutableFloat1.longValue();
        int int7 = mutableFloat1.intValue();
        double double8 = mutableFloat1.doubleValue();
        short short9 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 32 + "'", short9 == (short) 32);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0763");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue(0.0f);
        mutableFloat1.increment();
        boolean boolean7 = mutableFloat1.isInfinite();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0764");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        long long5 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0765");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        java.lang.Float float4 = mutableFloat1.toFloat();
        float float5 = mutableFloat1.floatValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 35.0f + "'", float5 == 35.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0766");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.subtract((java.lang.Number) 100L);
        java.lang.Float float4 = mutableFloat1.toFloat();
        mutableFloat1.add((float) 0L);
        mutableFloat0.setValue((java.lang.Number) 0L);
        boolean boolean8 = mutableFloat0.isInfinite();
        java.lang.String str9 = mutableFloat0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0.0" + "'", str9.equals("0.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0767");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue(0.0f);
        boolean boolean6 = mutableFloat1.isInfinite();
        float float7 = mutableFloat1.floatValue();
        mutableFloat1.setValue((float) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0768");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat3.subtract((java.lang.Number) 100L);
        java.lang.Float float6 = mutableFloat3.toFloat();
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) mutableFloat3);
        long long8 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-100.0f) + "'", float6.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0769");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        java.lang.String str5 = mutableFloat3.toString();
        long long6 = mutableFloat3.longValue();
        boolean boolean7 = mutableFloat3.isInfinite();
        short short8 = mutableFloat3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1.0" + "'", str5.equals("-1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0770");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        mutableFloat0.increment();
        java.lang.String str5 = mutableFloat0.toString();
        int int6 = mutableFloat0.intValue();
        boolean boolean7 = mutableFloat0.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-99.0" + "'", str5.equals("-99.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-99) + "'", int6 == (-99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0771");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        mutableFloat0.setValue((float) (byte) 0);
        mutableFloat0.increment();
        mutableFloat0.subtract((-100.0f));
        double double8 = mutableFloat0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 101.0d + "'", double8 == 101.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0772");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-99.0");
        mutableFloat1.decrement();
        double double3 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3 == (-100.0d));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0773");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean2 = mutableFloat1.isInfinite();
        mutableFloat1.increment();
        boolean boolean4 = mutableFloat1.isInfinite();
        short short5 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 101 + "'", short5 == (short) 101);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0774");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        boolean boolean4 = mutableFloat1.isInfinite();
        mutableFloat1.subtract((float) ' ');
        java.lang.Float float7 = mutableFloat1.toFloat();
        boolean boolean8 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-31.0f) + "'", float7.equals((-31.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0775");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) -89);
        float float2 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-89.0f) + "'", float2 == (-89.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0776");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        boolean boolean4 = mutableFloat1.isInfinite();
        double double5 = mutableFloat1.doubleValue();
        mutableFloat1.increment();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat("22.0");
        int int9 = mutableFloat1.compareTo(mutableFloat8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0777");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        boolean boolean2 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat3.subtract((java.lang.Number) 100L);
        java.lang.Float float6 = mutableFloat3.toFloat();
        java.lang.Float float7 = mutableFloat3.toFloat();
        mutableFloat1.setValue((java.lang.Number) float7);
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-100.0f) + "'", float6.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-100.0f) + "'", float7.equals((-100.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0778");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        float float8 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0779");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat1.decrement();
        java.lang.Float float8 = mutableFloat1.getValue();
        java.lang.Class<?> wildcardClass9 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 99.0f + "'", float8.equals(99.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0780");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        java.lang.Float float4 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4.equals(32.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0781");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        mutableFloat1.add((float) (byte) 2);
        byte byte4 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 2 + "'", byte4 == (byte) 2);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0782");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        double double2 = mutableFloat1.doubleValue();
        mutableFloat1.decrement();
        mutableFloat1.add((float) ' ');
        java.lang.Class<?> wildcardClass6 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0783");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 1);
        long long2 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0784");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        long long4 = mutableFloat1.longValue();
        short short5 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0785");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        float float5 = mutableFloat1.floatValue();
        double double6 = mutableFloat1.doubleValue();
        java.lang.Float float7 = mutableFloat1.getValue();
        mutableFloat1.decrement();
        java.lang.Float float9 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9.equals((-1.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0786");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue(0.0f);
        mutableFloat1.subtract(200.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0787");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.subtract((-100.0f));
        mutableFloat1.add(33.0f);
        mutableFloat1.decrement();
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0788");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        boolean boolean4 = mutableFloat1.isNaN();
        java.lang.Float float5 = mutableFloat1.toFloat();
        java.lang.Float float6 = mutableFloat1.getValue();
        long long7 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (-31L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0789");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.subtract((java.lang.Number) 10L);
        java.lang.Float float5 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-10.0f) + "'", float5.equals((-10.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0790");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.add((java.lang.Number) 30.0f);
        float float5 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 65.0f + "'", float5 == 65.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0791");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        mutableFloat1.add((java.lang.Number) (short) 1);
        boolean boolean4 = mutableFloat1.isInfinite();
        boolean boolean5 = mutableFloat1.isNaN();
        java.lang.Float float6 = mutableFloat1.toFloat();
        byte byte7 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0792");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        boolean boolean5 = mutableFloat1.isInfinite();
        int int6 = mutableFloat1.intValue();
        float float7 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0793");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat2 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        float float3 = mutableFloat1.floatValue();
        float float4 = mutableFloat1.floatValue();
        java.lang.Float float5 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5.equals(10.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0794");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        double double6 = mutableFloat1.doubleValue();
        java.lang.String str7 = mutableFloat1.toString();
        boolean boolean8 = mutableFloat1.isInfinite();
        short short9 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1.0" + "'", str7.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0795");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.setValue(0.0f);
        mutableFloat1.setValue((float) (short) -1);
        java.lang.Float float6 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6.equals((-1.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0796");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.setValue((java.lang.Number) (short) 0);
        boolean boolean6 = mutableFloat1.isNaN();
        boolean boolean7 = mutableFloat1.isNaN();
        mutableFloat1.add((-89.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0797");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((float) '#');
        mutableFloat1.decrement();
        java.lang.Float float5 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-37.0f) + "'", float5.equals((-37.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0798");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.add((float) (short) 35);
        mutableFloat1.add((float) (byte) 65);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0799");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        mutableFloat1.setValue((float) (short) 1);
        mutableFloat1.increment();
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0800");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        java.lang.Float float3 = mutableFloat1.toFloat();
        mutableFloat1.setValue((float) (-100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3.equals(1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0801");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        int int2 = mutableFloat1.intValue();
        long long3 = mutableFloat1.longValue();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0802");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        long long3 = mutableFloat1.longValue();
        mutableFloat1.subtract(10.0f);
        java.lang.Float float6 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-9.0f) + "'", float6.equals((-9.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0803");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        long long3 = mutableFloat1.longValue();
        int int4 = mutableFloat1.intValue();
        mutableFloat1.increment();
        double double6 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0804");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0805");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        java.lang.Float float2 = mutableFloat1.getValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 10);
        boolean boolean5 = mutableFloat4.isInfinite();
        mutableFloat1.subtract((java.lang.Number) mutableFloat4);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0806");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        int int4 = mutableFloat1.intValue();
        int int5 = mutableFloat1.intValue();
        long long6 = mutableFloat1.longValue();
        mutableFloat1.increment();
        byte byte8 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 33 + "'", byte8 == (byte) 33);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0807");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        java.lang.Float float2 = mutableFloat1.getValue();
        long long3 = mutableFloat1.longValue();
        java.lang.String str4 = mutableFloat1.toString();
        java.lang.Float float5 = mutableFloat1.getValue();
        java.lang.String str6 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2.equals((-1.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.0" + "'", str4.equals("-1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5.equals((-1.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0" + "'", str6.equals("-1.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0808");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        long long3 = mutableFloat1.longValue();
        int int4 = mutableFloat1.intValue();
        java.lang.String str5 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1.0" + "'", str5.equals("1.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0809");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.add((java.lang.Number) 30.0f);
        java.lang.String str5 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "65.0" + "'", str5.equals("65.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0810");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue(0.0f);
        mutableFloat1.increment();
        mutableFloat1.add((-8.0f));
        boolean boolean9 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0811");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-8.0f));
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat("-1.0");
        mutableFloat3.decrement();
        long long5 = mutableFloat3.longValue();
        mutableFloat3.increment();
        mutableFloat1.setValue((java.lang.Number) mutableFloat3);
        java.lang.Float float8 = mutableFloat3.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-2L) + "'", long5 == (-2L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8.equals((-1.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0812");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        long long2 = mutableFloat1.longValue();
        float float3 = mutableFloat1.floatValue();
        float float4 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0813");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        mutableFloat1.setValue((float) (short) 1);
        mutableFloat1.setValue((float) 110);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0814");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        int int2 = mutableFloat1.intValue();
        mutableFloat1.subtract(2.0f);
        int int5 = mutableFloat1.intValue();
        long long6 = mutableFloat1.longValue();
        boolean boolean7 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3L) + "'", long6 == (-3L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0815");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        boolean boolean5 = mutableFloat1.isInfinite();
        int int6 = mutableFloat1.intValue();
        java.lang.String str7 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100.0" + "'", str7.equals("100.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0816");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        boolean boolean8 = mutableFloat1.equals((java.lang.Object) mutableFloat7);
        long long9 = mutableFloat7.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0817");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        java.lang.String str5 = mutableFloat3.toString();
        long long6 = mutableFloat3.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) long6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1.0" + "'", str5.equals("-1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0818");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(200.0f);
        java.lang.Class<?> wildcardClass2 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0819");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        long long3 = mutableFloat1.longValue();
        short short4 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0820");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        mutableFloat0.setValue((float) (byte) 0);
        mutableFloat0.increment();
        long long6 = mutableFloat0.longValue();
        long long7 = mutableFloat0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0821");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        mutableFloat1.add((-100.0f));
        mutableFloat1.add(10.0f);
        mutableFloat1.increment();
        mutableFloat1.decrement();
        byte byte9 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -90 + "'", byte9 == (byte) -90);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0822");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        boolean boolean3 = mutableFloat0.isInfinite();
        java.lang.Float float4 = mutableFloat0.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat0);
        mutableFloat5.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0823");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(100.0f);
        int int2 = mutableFloat1.intValue();
        int int3 = mutableFloat1.intValue();
        mutableFloat1.setValue((float) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0824");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        int int4 = mutableFloat1.intValue();
        int int5 = mutableFloat1.intValue();
        long long6 = mutableFloat1.longValue();
        float float7 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0825");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.add((float) (byte) 0);
        float float5 = mutableFloat1.floatValue();
        int int6 = mutableFloat1.intValue();
        mutableFloat1.setValue((float) 3);
        float float9 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 3.0f + "'", float9 == 3.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0826");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        int int2 = mutableFloat1.intValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str4 = mutableFloat3.toString();
        double double5 = mutableFloat3.doubleValue();
        java.lang.Class<?> wildcardClass6 = mutableFloat3.getClass();
        boolean boolean7 = mutableFloat1.equals((java.lang.Object) wildcardClass6);
        float float8 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0827");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) float3);
        java.lang.String str5 = mutableFloat4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2.0" + "'", str5.equals("2.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0828");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        float float3 = mutableFloat1.floatValue();
        mutableFloat1.subtract((float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0829");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0830");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.add((float) (byte) 0);
        float float5 = mutableFloat1.floatValue();
        float float6 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0831");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-90.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0832");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 101);
        java.lang.Float float2 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 101.0f + "'", float2.equals(101.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0833");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        long long3 = mutableFloat1.longValue();
        int int4 = mutableFloat1.intValue();
        long long5 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0834");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.setValue(0.0f);
        float float6 = mutableFloat1.floatValue();
        mutableFloat1.add(99.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0835");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        java.lang.Float float6 = mutableFloat1.getValue();
        java.lang.Float float7 = mutableFloat1.getValue();
        mutableFloat1.subtract((float) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7.equals(1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0836");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean5 = mutableFloat3.equals((java.lang.Object) (byte) 100);
        java.lang.String str6 = mutableFloat3.toString();
        mutableFloat1.setValue((java.lang.Number) mutableFloat3);
        mutableFloat1.setValue((float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0837");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long6 = mutableFloat5.longValue();
        double double7 = mutableFloat5.doubleValue();
        int int8 = mutableFloat5.intValue();
        mutableFloat1.add((java.lang.Number) mutableFloat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0838");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        float float7 = mutableFloat1.floatValue();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0839");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        mutableFloat1.decrement();
        java.lang.Float float4 = mutableFloat1.getValue();
        double double5 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4.equals((-1.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0840");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        boolean boolean5 = mutableFloat1.isNaN();
        float float6 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0841");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        mutableFloat1.setValue((float) (byte) 10);
        float float4 = mutableFloat1.floatValue();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0842");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        double double2 = mutableFloat1.doubleValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.String str4 = mutableFloat3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10.0" + "'", str4.equals("10.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0843");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract(0.0f);
        java.lang.Float float6 = mutableFloat1.getValue();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6.equals(32.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0844");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        int int2 = mutableFloat1.intValue();
        mutableFloat1.subtract(2.0f);
        int int5 = mutableFloat1.intValue();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0845");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.setValue(0.0f);
        boolean boolean6 = mutableFloat1.isInfinite();
        boolean boolean7 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        boolean boolean9 = mutableFloat8.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0846");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.add((float) (byte) 0);
        mutableFloat1.setValue((float) (byte) 100);
        mutableFloat1.increment();
        short short8 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 101 + "'", short8 == (short) 101);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0847");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (-99.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0848");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        mutableFloat1.subtract((float) 10L);
        float float4 = mutableFloat1.floatValue();
        double double5 = mutableFloat1.doubleValue();
        boolean boolean6 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 22.0f + "'", float4 == 22.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 22.0d + "'", double5 == 22.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0849");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        boolean boolean5 = mutableFloat1.isInfinite();
        mutableFloat1.setValue((java.lang.Number) (byte) 9);
        boolean boolean8 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0850");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.setValue(0.0f);
        float float6 = mutableFloat1.floatValue();
        mutableFloat1.add((float) (-100L));
        byte byte9 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -100 + "'", byte9 == (byte) -100);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0851");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.decrement();
        java.lang.Class<?> wildcardClass4 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0852");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        mutableFloat1.add((float) (byte) 1);
        short short8 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 2 + "'", short8 == (short) 2);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0853");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 20L);
        boolean boolean2 = mutableFloat1.isInfinite();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0854");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        double double2 = mutableFloat1.doubleValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        java.lang.String str5 = mutableFloat4.toString();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        double double7 = mutableFloat4.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10.0" + "'", str5.equals("10.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0855");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        java.lang.String str4 = mutableFloat1.toString();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "32.0" + "'", str4.equals("32.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0856");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.add(2.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0857");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        java.lang.Float float5 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5.equals(10.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0858");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.subtract((float) (short) 0);
        boolean boolean5 = mutableFloat1.isNaN();
        mutableFloat1.add((float) 100);
        mutableFloat1.setValue((-110.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0859");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.setValue((float) (short) 1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        boolean boolean6 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0860");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.decrement();
        boolean boolean6 = mutableFloat1.equals((java.lang.Object) 100L);
        java.lang.Float float7 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7.equals(0.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0861");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("101.0");
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 102.0f + "'", float3.equals(102.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0862");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        long long3 = mutableFloat1.longValue();
        double double4 = mutableFloat1.doubleValue();
        double double5 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0863");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.subtract((float) (short) 0);
        boolean boolean5 = mutableFloat1.isNaN();
        mutableFloat1.subtract((-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0864");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        boolean boolean2 = mutableFloat1.isNaN();
        java.lang.Float float3 = mutableFloat1.toFloat();
        mutableFloat1.subtract((float) (byte) 3);
        double double6 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.0d) + "'", double6 == (-3.0d));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0865");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        float float6 = mutableFloat4.floatValue();
        boolean boolean7 = mutableFloat4.isInfinite();
        java.lang.Float float8 = mutableFloat4.getValue();
        boolean boolean9 = mutableFloat4.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0866");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Float float6 = mutableFloat1.getValue();
        mutableFloat1.setValue(11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0867");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat5);
        java.lang.Float float7 = mutableFloat5.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7.equals(100.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0868");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Float float6 = mutableFloat1.getValue();
        boolean boolean7 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0869");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        long long5 = mutableFloat1.longValue();
        java.lang.Float float6 = mutableFloat1.getValue();
        mutableFloat1.decrement();
        boolean boolean8 = mutableFloat1.isNaN();
        int int9 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0870");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        java.lang.Float float6 = mutableFloat4.getValue();
        mutableFloat4.subtract((-201.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6.equals(0.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0871");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) ' ');
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        long long4 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0872");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        java.lang.Float float4 = mutableFloat0.toFloat();
        mutableFloat0.subtract(10.0f);
        byte byte7 = mutableFloat0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -110 + "'", byte7 == (byte) -110);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0873");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long4 = mutableFloat3.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int7 = mutableFloat3.compareTo(mutableFloat6);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        boolean boolean9 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0874");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        short short5 = mutableFloat3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0875");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        mutableFloat1.add((-11.0f));
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0876");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        boolean boolean4 = mutableFloat1.isNaN();
        java.lang.Float float5 = mutableFloat1.toFloat();
        java.lang.Float float6 = mutableFloat1.getValue();
        long long7 = mutableFloat1.longValue();
        short short8 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0877");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        mutableFloat1.add((float) (byte) 10);
        java.lang.Float float7 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 110.0f + "'", float7.equals(110.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0878");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 101L);
        mutableFloat1.setValue((float) 110);
        double double4 = mutableFloat1.doubleValue();
        java.lang.Class<?> wildcardClass5 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 110.0d + "'", double4 == 110.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0879");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str1 = mutableFloat0.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat3.subtract((float) (short) 0);
        java.lang.Float float6 = mutableFloat3.toFloat();
        boolean boolean7 = mutableFloat0.equals((java.lang.Object) mutableFloat3);
        boolean boolean8 = mutableFloat3.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.0" + "'", str1.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 35.0f + "'", float6.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0880");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.subtract((-100.0f));
        java.lang.Float float4 = mutableFloat1.toFloat();
        java.lang.String str5 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0881");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        java.lang.Float float6 = mutableFloat1.toFloat();
        boolean boolean7 = mutableFloat1.isInfinite();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0882");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        double double3 = mutableFloat1.doubleValue();
        java.lang.Float float4 = mutableFloat1.toFloat();
        java.lang.Float float5 = mutableFloat1.toFloat();
        byte byte6 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0883");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((float) '#');
        mutableFloat1.decrement();
        float float5 = mutableFloat1.floatValue();
        float float6 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-37.0f) + "'", float5 == (-37.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-37.0f) + "'", float6 == (-37.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0884");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        long long5 = mutableFloat1.longValue();
        java.lang.Float float6 = mutableFloat1.getValue();
        mutableFloat1.decrement();
        boolean boolean8 = mutableFloat1.isNaN();
        boolean boolean9 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0885");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 10);
        long long2 = mutableFloat1.longValue();
        float float3 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0886");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat4.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0887");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.subtract((java.lang.Number) 10L);
        double double5 = mutableFloat1.doubleValue();
        java.lang.Class<?> wildcardClass6 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-10.0d) + "'", double5 == (-10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0888");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("10.0");
        java.lang.Float float2 = mutableFloat1.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float5 = mutableFloat4.floatValue();
        double double6 = mutableFloat4.doubleValue();
        mutableFloat4.subtract((float) 10L);
        mutableFloat1.setValue((java.lang.Number) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0889");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat5.subtract((float) (byte) 30);
        float float8 = mutableFloat5.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-29.0f) + "'", float8 == (-29.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0890");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-100.0f));
        mutableFloat1.subtract(100.0f);
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableFloat1.equals(obj4);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat7 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        int int8 = mutableFloat7.intValue();
        mutableFloat1.setValue((java.lang.Number) int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0891");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        boolean boolean3 = mutableFloat0.isInfinite();
        java.lang.Float float4 = mutableFloat0.toFloat();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat0);
        boolean boolean6 = mutableFloat0.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0892");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        java.lang.String str5 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat1.add((float) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100.0" + "'", str5.equals("100.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0893");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.setValue((float) (short) 1);
        long long5 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) long5);
        java.lang.Float float7 = mutableFloat6.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7.equals(1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0894");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        java.lang.Float float2 = mutableFloat1.getValue();
        mutableFloat1.decrement();
        java.lang.String str4 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2.equals(35.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34.0" + "'", str4.equals("34.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0895");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue(0.0f);
        mutableFloat1.increment();
        short short7 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0896");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        long long3 = mutableFloat1.longValue();
        long long4 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0897");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-1.0");
        boolean boolean2 = mutableFloat1.isInfinite();
        mutableFloat1.subtract((float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0898");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str1 = mutableFloat0.toString();
        double double2 = mutableFloat0.doubleValue();
        boolean boolean3 = mutableFloat0.isInfinite();
        boolean boolean4 = mutableFloat0.isNaN();
        byte byte5 = mutableFloat0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.0" + "'", str1.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0899");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.subtract((java.lang.Number) 10L);
        long long5 = mutableFloat1.longValue();
        java.lang.Float float6 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-10L) + "'", long5 == (-10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-10.0f) + "'", float6.equals((-10.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0900");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        mutableFloat1.add((float) 1L);
        long long8 = mutableFloat1.longValue();
        java.lang.Class<?> wildcardClass9 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0901");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (byte) 0);
        java.lang.Float float6 = mutableFloat5.getValue();
        java.lang.Float float7 = mutableFloat5.getValue();
        boolean boolean8 = mutableFloat5.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0902");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat("10.0");
        int int4 = mutableFloat1.compareTo(mutableFloat3);
        mutableFloat3.subtract(0.0f);
        java.lang.String str7 = mutableFloat3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10.0" + "'", str7.equals("10.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0903");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.subtract((float) 35L);
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10.0" + "'", str2.equals("10.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0904");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat2 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat2);
        short short4 = mutableFloat3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0905");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        boolean boolean5 = mutableFloat3.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat3);
        mutableFloat6.setValue((float) (byte) -100);
        java.lang.String str9 = mutableFloat6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-100.0" + "'", str9.equals("-100.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0906");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.increment();
        int int3 = mutableFloat1.intValue();
        mutableFloat1.decrement();
        boolean boolean5 = mutableFloat1.isInfinite();
        double double6 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0907");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 110);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0908");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat5.increment();
        mutableFloat5.subtract(1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0909");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.decrement();
        double double5 = mutableFloat1.doubleValue();
        java.lang.Float float6 = mutableFloat1.getValue();
        boolean boolean7 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0910");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) -50);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0911");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        java.lang.Float float3 = mutableFloat1.toFloat();
        mutableFloat1.setValue((float) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3.equals(1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0912");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        int int4 = mutableFloat3.intValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0913");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        mutableFloat1.add(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0914");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        boolean boolean4 = mutableFloat1.isInfinite();
        double double5 = mutableFloat1.doubleValue();
        mutableFloat1.increment();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0915");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        double double2 = mutableFloat1.doubleValue();
        mutableFloat1.subtract((float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0916");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        long long5 = mutableFloat4.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0917");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("135.0");
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0918");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat1.subtract((float) (short) 1);
        java.lang.Class<?> wildcardClass8 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0919");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0920");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.add(2.0f);
        mutableFloat1.setValue((float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0921");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        int int2 = mutableFloat1.intValue();
        long long3 = mutableFloat1.longValue();
        float float4 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0922");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        java.lang.Float float4 = mutableFloat1.getValue();
        mutableFloat1.decrement();
        float float6 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0923");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 101);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0924");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        java.lang.Float float4 = mutableFloat0.toFloat();
        mutableFloat0.subtract(10.0f);
        mutableFloat0.add((float) 68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4.equals((-100.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0925");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat1.setValue((float) (byte) 0);
        java.lang.Float float8 = mutableFloat1.getValue();
        java.lang.Float float9 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9.equals(0.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0926");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        mutableFloat1.increment();
        mutableFloat1.subtract((java.lang.Number) 0L);
        float float7 = mutableFloat1.floatValue();
        mutableFloat1.increment();
        boolean boolean9 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 3.0f + "'", float7 == 3.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0927");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        double double4 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0928");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        boolean boolean5 = mutableFloat1.isInfinite();
        int int6 = mutableFloat1.intValue();
        mutableFloat1.add((float) 32L);
        boolean boolean9 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0929");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.subtract((float) (short) 0);
        boolean boolean5 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Float float7 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7.equals(100.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0930");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 101L);
        mutableFloat1.setValue((float) 110);
        short short4 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 110 + "'", short4 == (short) 110);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0931");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add(68.0f);
        mutableFloat1.subtract((float) 0);
        java.lang.Class<?> wildcardClass6 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0932");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.Float float2 = mutableFloat1.getValue();
        long long3 = mutableFloat1.longValue();
        long long4 = mutableFloat1.longValue();
        double double5 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0933");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(10.0f);
        double double2 = mutableFloat1.doubleValue();
        java.lang.Float float3 = mutableFloat1.toFloat();
        mutableFloat1.subtract((float) (short) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3.equals(10.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0934");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        long long5 = mutableFloat4.longValue();
        float float6 = mutableFloat4.floatValue();
        int int7 = mutableFloat1.compareTo(mutableFloat4);
        java.lang.Float float8 = mutableFloat1.getValue();
        java.lang.Float float9 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9.equals(0.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0935");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.Float float3 = mutableFloat1.getValue();
        java.lang.Float float4 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4.equals(1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0936");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(100.0f);
        long long2 = mutableFloat1.longValue();
        int int3 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0937");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100L);
        long long2 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0938");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-8.0f));
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat("-1.0");
        mutableFloat3.decrement();
        long long5 = mutableFloat3.longValue();
        mutableFloat3.increment();
        mutableFloat1.setValue((java.lang.Number) mutableFloat3);
        int int8 = mutableFloat3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-2L) + "'", long5 == (-2L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0939");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 35);
        mutableFloat1.increment();
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0940");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        int int2 = mutableFloat1.intValue();
        mutableFloat1.subtract((float) 20L);
        long long5 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-20L) + "'", long5 == (-20L));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0941");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        long long5 = mutableFloat4.longValue();
        float float6 = mutableFloat4.floatValue();
        int int7 = mutableFloat1.compareTo(mutableFloat4);
        byte byte8 = mutableFloat4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0942");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        mutableFloat0.setValue((java.lang.Number) (-20L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0943");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        double double3 = mutableFloat1.doubleValue();
        java.lang.Float float4 = mutableFloat1.toFloat();
        mutableFloat1.subtract(0.0f);
        java.lang.Class<?> wildcardClass7 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0944");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat3.subtract((float) (short) 0);
        mutableFloat3.setValue(0.0f);
        int int8 = mutableFloat1.compareTo(mutableFloat3);
        int int9 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0945");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("2.0");
        java.lang.String str2 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2.0" + "'", str2.equals("2.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0946");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-50.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0947");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        mutableFloat0.setValue((float) (byte) 0);
        java.lang.Float float5 = mutableFloat0.toFloat();
        boolean boolean7 = mutableFloat0.equals((java.lang.Object) 1.0d);
        java.lang.Float float8 = mutableFloat0.getValue();
        boolean boolean9 = mutableFloat0.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0948");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        int int3 = mutableFloat1.intValue();
        mutableFloat1.setValue((java.lang.Number) 20.0d);
        boolean boolean6 = mutableFloat1.isNaN();
        long long7 = mutableFloat1.longValue();
        java.lang.Float float8 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 20L + "'", long7 == 20L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 20.0f + "'", float8.equals(20.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0949");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        boolean boolean2 = mutableFloat1.isInfinite();
        mutableFloat1.add((float) 1L);
        mutableFloat1.increment();
        long long6 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 37L + "'", long6 == 37L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0950");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        mutableFloat0.add((float) 0L);
        java.lang.Float float6 = mutableFloat0.getValue();
        long long7 = mutableFloat0.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat8 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat0);
        long long9 = mutableFloat8.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-100.0f) + "'", float6.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-100L) + "'", long7 == (-100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-100L) + "'", long9 == (-100L));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0951");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(1.0f);
        java.lang.Float float2 = mutableFloat1.getValue();
        mutableFloat1.add((java.lang.Number) 10L);
        float float5 = mutableFloat1.floatValue();
        boolean boolean6 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 11.0f + "'", float5 == 11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0952");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        boolean boolean4 = mutableFloat1.isInfinite();
        mutableFloat1.setValue((float) 100);
        java.lang.String str7 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100.0" + "'", str7.equals("100.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0953");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-99L));
        mutableFloat1.setValue((float) (short) 110);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0954");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.Float float2 = mutableFloat1.getValue();
        long long3 = mutableFloat1.longValue();
        long long4 = mutableFloat1.longValue();
        mutableFloat1.add((float) (byte) -3);
        int int7 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0955");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        int int5 = mutableFloat1.compareTo(mutableFloat4);
        int int6 = mutableFloat4.intValue();
        boolean boolean7 = mutableFloat4.isInfinite();
        boolean boolean8 = mutableFloat4.isNaN();
        java.lang.Float float9 = mutableFloat4.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9.equals(1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0956");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 10L);
        float float7 = mutableFloat3.floatValue();
        mutableFloat3.subtract((-37.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0957");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 10);
        int int2 = mutableFloat1.intValue();
        mutableFloat1.add((float) 20L);
        mutableFloat1.subtract((float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0958");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        int int2 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0959");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        java.lang.Float float4 = mutableFloat1.getValue();
        mutableFloat1.decrement();
        double double6 = mutableFloat1.doubleValue();
        mutableFloat1.decrement();
        boolean boolean8 = mutableFloat1.isNaN();
        java.lang.Float float9 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9.equals((-1.0f)));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0960");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        boolean boolean3 = mutableFloat1.isNaN();
        java.lang.String str4 = mutableFloat1.toString();
        int int5 = mutableFloat1.intValue();
        double double6 = mutableFloat1.doubleValue();
        byte byte7 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1.0" + "'", str4.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0961");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 20L);
        mutableFloat1.setValue(23.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0962");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.add((float) 100);
        mutableFloat1.add((-100.0f));
        java.lang.Float float8 = mutableFloat1.toFloat();
        java.lang.Float float9 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9.equals(1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0963");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        long long3 = mutableFloat1.longValue();
        int int4 = mutableFloat1.intValue();
        mutableFloat1.increment();
        mutableFloat1.add((float) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0964");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-1.0");
        mutableFloat1.decrement();
        long long3 = mutableFloat1.longValue();
        mutableFloat1.increment();
        boolean boolean5 = mutableFloat1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-2L) + "'", long3 == (-2L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0965");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.setValue((float) (-10L));
        float float6 = mutableFloat1.floatValue();
        boolean boolean7 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-10.0f) + "'", float6 == (-10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0966");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(1.0f);
        java.lang.Float float2 = mutableFloat1.getValue();
        mutableFloat1.add((java.lang.Number) 10L);
        mutableFloat1.increment();
        double double6 = mutableFloat1.doubleValue();
        mutableFloat1.add((java.lang.Number) 22.0d);
        java.lang.String str9 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 12.0d + "'", double6 == 12.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34.0" + "'", str9.equals("34.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0967");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-100.0f));
        mutableFloat1.subtract(100.0f);
        mutableFloat1.decrement();
        float float5 = mutableFloat1.floatValue();
        long long6 = mutableFloat1.longValue();
        double double7 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-201.0f) + "'", float5 == (-201.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-201L) + "'", long6 == (-201L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-201.0d) + "'", double7 == (-201.0d));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0968");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        long long6 = mutableFloat1.longValue();
        float float7 = mutableFloat1.floatValue();
        java.lang.Class<?> wildcardClass8 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0969");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.getValue();
        float float4 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3.equals(2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0970");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Float float6 = mutableFloat1.toFloat();
        mutableFloat1.increment();
        mutableFloat1.add((float) (-100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6.equals(100.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0971");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        boolean boolean5 = mutableFloat1.isInfinite();
        int int6 = mutableFloat1.intValue();
        mutableFloat1.add((float) 32L);
        java.lang.Float float9 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 132.0f + "'", float9.equals(132.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0972");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        java.lang.String str2 = mutableFloat1.toString();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0973");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        int int4 = mutableFloat1.intValue();
        int int5 = mutableFloat1.intValue();
        long long6 = mutableFloat1.longValue();
        int int7 = mutableFloat1.intValue();
        java.lang.String str8 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "32.0" + "'", str8.equals("32.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0974");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.subtract((-100.0f));
        java.lang.Float float4 = mutableFloat1.toFloat();
        double double5 = mutableFloat1.doubleValue();
        double double6 = mutableFloat1.doubleValue();
        java.lang.String str7 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4.equals(100.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100.0" + "'", str7.equals("100.0"));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0975");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 36);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0976");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.setValue(0.0f);
        float float4 = mutableFloat1.floatValue();
        boolean boolean5 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0977");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat();
        java.lang.String str4 = mutableFloat3.toString();
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        boolean boolean6 = mutableFloat3.isNaN();
        mutableFloat3.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0978");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        java.lang.Float float6 = mutableFloat1.getValue();
        float float7 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0979");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        mutableFloat1.add((java.lang.Number) (short) 1);
        boolean boolean4 = mutableFloat1.isInfinite();
        boolean boolean5 = mutableFloat1.isNaN();
        java.lang.Float float6 = mutableFloat1.toFloat();
        float float7 = mutableFloat1.floatValue();
        mutableFloat1.increment();
        byte byte9 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 2 + "'", byte9 == (byte) 2);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0980");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        mutableFloat1.add((-100.0f));
        mutableFloat1.add(10.0f);
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0981");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        long long2 = mutableFloat1.longValue();
        mutableFloat1.subtract((float) (byte) 0);
        boolean boolean5 = mutableFloat1.isNaN();
        mutableFloat1.setValue(0.0f);
        float float8 = mutableFloat1.floatValue();
        float float9 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0982");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.add(2.0f);
        java.lang.Class<?> wildcardClass5 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0983");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        mutableFloat0.increment();
        mutableFloat0.setValue((float) (short) 10);
        boolean boolean7 = mutableFloat0.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0984");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.Float float3 = mutableFloat1.getValue();
        java.lang.Float float4 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4.equals(1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0985");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-1.0");
        boolean boolean2 = mutableFloat1.isInfinite();
        mutableFloat1.add((float) 100L);
        float float5 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 99.0f + "'", float5 == 99.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0986");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        java.lang.Float float4 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "35.0" + "'", str3.equals("35.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4.equals(35.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0987");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        java.lang.Float float6 = mutableFloat1.toFloat();
        float float7 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0988");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.add((float) 10L);
        mutableFloat3.subtract((float) (byte) 9);
        java.lang.Float float9 = mutableFloat3.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9.equals(1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0989");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-1.0");
        mutableFloat1.decrement();
        double double3 = mutableFloat1.doubleValue();
        boolean boolean4 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.0d) + "'", double3 == (-2.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0990");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        mutableFloat1.subtract((float) (byte) -8);
        java.lang.Float float8 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 18.0f + "'", float8.equals(18.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0991");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 1);
        double double2 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0992");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        mutableFloat4.subtract((float) 10L);
        mutableFloat4.decrement();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat9 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat4);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0993");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.subtract((float) 10L);
        byte byte6 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 25 + "'", byte6 == (byte) 25);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0994");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        int int4 = mutableFloat3.intValue();
        float float5 = mutableFloat3.floatValue();
        mutableFloat3.subtract((float) (byte) -90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0995");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract(0.0f);
        byte byte6 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 32 + "'", byte6 == (byte) 32);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0996");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        mutableFloat1.add((java.lang.Number) (short) 1);
        boolean boolean4 = mutableFloat1.isInfinite();
        boolean boolean5 = mutableFloat1.isNaN();
        java.lang.Float float6 = mutableFloat1.getValue();
        java.lang.Float float7 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7.equals(1.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0997");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        int int3 = mutableFloat1.intValue();
        mutableFloat1.setValue((java.lang.Number) 20.0d);
        boolean boolean6 = mutableFloat1.isNaN();
        mutableFloat1.subtract((float) 10);
        java.lang.Float float9 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9.equals(10.0f));
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0998");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.add((float) (byte) 10);
        double double4 = mutableFloat1.doubleValue();
        short short5 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 20 + "'", short5 == (short) 20);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test0999");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 10);
        mutableFloat1.setValue((float) (byte) -100);
        mutableFloat1.setValue((float) (short) -89);
    }

    @Test
    public void MutableFloat() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.test1000");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.subtract((-100.0f));
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((float) 1);
        mutableFloat5.setValue((float) '4');
        mutableFloat1.setValue((java.lang.Number) mutableFloat5);
    }
}

