package MutableFloat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableFloat1 {

    public static boolean debug = false;

    @Test
    public void MutableFloat0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0501");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-89.0");
    }

    @Test
    public void MutableFloat0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0502");
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
    public void MutableFloat0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0503");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-10.0f));
    }

    @Test
    public void MutableFloat0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0504");
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
    public void MutableFloat0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0505");
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
    public void MutableFloat0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0506");
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
    public void MutableFloat0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0507");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.setValue((java.lang.Number) (short) 0);
        mutableFloat1.subtract(10.0f);
        mutableFloat1.subtract((float) (-31L));
    }

    @Test
    public void MutableFloat0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0508");
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
    public void MutableFloat0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0509");
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
    public void MutableFloat0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0510");
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
    public void MutableFloat0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0511");
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
    public void MutableFloat0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0512");
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
    public void MutableFloat0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0513");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract(0.0f);
        mutableFloat1.add((float) 1);
    }

    @Test
    public void MutableFloat0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0514");
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
    public void MutableFloat0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0515");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-1.0");
        boolean boolean2 = mutableFloat1.isInfinite();
        float float3 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void MutableFloat0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0516");
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
    public void MutableFloat0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0517");
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
    public void MutableFloat0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0518");
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
    public void MutableFloat0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0519");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("32.0");
        mutableFloat1.setValue((float) (byte) -100);
        float float4 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-100.0f) + "'", float4 == (-100.0f));
    }

    @Test
    public void MutableFloat0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0520");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) -89);
        mutableFloat1.decrement();
    }

    @Test
    public void MutableFloat0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0521");
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
    public void MutableFloat0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0522");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract(0.0f);
        short short6 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 32 + "'", short6 == (short) 32);
    }

    @Test
    public void MutableFloat0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0523");
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
    public void MutableFloat0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0524");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        mutableFloat1.add((java.lang.Number) (short) 1);
        mutableFloat1.setValue((float) (byte) 101);
        mutableFloat1.subtract((float) 10);
        byte byte8 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 91 + "'", byte8 == (byte) 91);
    }

    @Test
    public void MutableFloat0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0525");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-2.0");
    }

    @Test
    public void MutableFloat0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0526");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 1);
        mutableFloat1.setValue((float) '4');
        double double4 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void MutableFloat0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0527");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) -89);
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in MutableFloat generation
        try {
            mutableFloat1.subtract(number2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableFloat0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0528");
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
    public void MutableFloat0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0529");
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
    public void MutableFloat0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0530");
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
    public void MutableFloat0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0531");
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
    public void MutableFloat0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0532");
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
    public void MutableFloat0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0533");
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
    public void MutableFloat0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0534");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 36);
    }

    @Test
    public void MutableFloat0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0535");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isInfinite();
        boolean boolean4 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in MutableFloat generation
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
    public void MutableFloat0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0536");
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
    public void MutableFloat0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0537");
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
    public void MutableFloat0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0538");
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
    public void MutableFloat0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0539");
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
    public void MutableFloat0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0540");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10);
        java.lang.Float float2 = mutableFloat1.toFloat();
        long long3 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void MutableFloat0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0541");
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
    public void MutableFloat0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0542");
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
    public void MutableFloat0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0543");
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
    public void MutableFloat0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0544");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat3.setValue((java.lang.Number) mutableFloat6);
    }

    @Test
    public void MutableFloat0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0545");
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
    public void MutableFloat0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0546");
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
    public void MutableFloat0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0547");
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
    public void MutableFloat0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0548");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-8.0f));
        long long2 = mutableFloat1.longValue();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8L) + "'", long2 == (-8L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0549");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 25);
    }

    @Test
    public void MutableFloat0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0550");
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
    public void MutableFloat0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0551");
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
    public void MutableFloat0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0552");
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
    public void MutableFloat0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0553");
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
    public void MutableFloat0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0554");
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
    public void MutableFloat0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0555");
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
    public void MutableFloat0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0556");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        mutableFloat1.increment();
        mutableFloat1.setValue((float) (byte) 10);
        mutableFloat1.add(0.0f);
    }

    @Test
    public void MutableFloat0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0557");
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
    public void MutableFloat0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0558");
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
    public void MutableFloat0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0559");
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
    public void MutableFloat0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0560");
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
    public void MutableFloat0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0561");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-100.0f));
        long long2 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-100L) + "'", long2 == (-100L));
    }

    @Test
    public void MutableFloat0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0562");
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
    public void MutableFloat0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0563");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 9);
    }

    @Test
    public void MutableFloat0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0564");
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
    public void MutableFloat0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0565");
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
    public void MutableFloat0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0566");
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
    public void MutableFloat0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0567");
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
    public void MutableFloat0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0568");
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
    public void MutableFloat0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0569");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(52.0f);
    }

    @Test
    public void MutableFloat0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0570");
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
    public void MutableFloat0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0571");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.subtract((-100.0f));
        byte byte4 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
    }

    @Test
    public void MutableFloat0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0572");
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
    public void MutableFloat0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0573");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract(0.0f);
        mutableFloat1.setValue(0.0f);
        mutableFloat1.add((float) (short) -100);
    }

    @Test
    public void MutableFloat0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0574");
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
    public void MutableFloat0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0575");
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
    public void MutableFloat0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0576");
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
    public void MutableFloat0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0577");
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
    public void MutableFloat0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0578");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100L);
        java.lang.Float float2 = mutableFloat1.toFloat();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2.equals(100.0f));
    }

    @Test
    public void MutableFloat0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0579");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        boolean boolean5 = mutableFloat3.isInfinite();
        mutableFloat3.subtract((float) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0580");
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
    public void MutableFloat0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0581");
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
    public void MutableFloat0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0582");
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
    public void MutableFloat0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0583");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        java.lang.String str4 = mutableFloat1.toString();
        mutableFloat1.subtract((float) (-20L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "32.0" + "'", str4.equals("32.0"));
    }

    @Test
    public void MutableFloat0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0584");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        long long2 = mutableFloat1.longValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        mutableFloat1.subtract((-2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void MutableFloat0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0585");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        mutableFloat1.add((java.lang.Number) (short) 1);
        mutableFloat1.setValue((float) (byte) 101);
        mutableFloat1.subtract((float) 10);
        mutableFloat1.increment();
    }

    @Test
    public void MutableFloat0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0586");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-1.0f));
    }

    @Test
    public void MutableFloat0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0587");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 65L);
        mutableFloat1.subtract((-201.0f));
    }

    @Test
    public void MutableFloat0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0588");
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
    public void MutableFloat0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0589");
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
    public void MutableFloat0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0590");
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
    public void MutableFloat0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0591");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("197.0");
    }

    @Test
    public void MutableFloat0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0592");
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
    public void MutableFloat0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0593");
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
    public void MutableFloat0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0594");
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
    public void MutableFloat0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0595");
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
    public void MutableFloat0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0596");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        float float2 = mutableFloat1.floatValue();
        java.lang.String str3 = mutableFloat1.toString();
        mutableFloat1.setValue((float) 10);
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in MutableFloat generation
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
    public void MutableFloat0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0597");
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
    public void MutableFloat0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0598");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 1);
        mutableFloat1.setValue((float) '4');
        long long4 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
    }

    @Test
    public void MutableFloat0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0599");
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
    public void MutableFloat0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0600");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100);
        java.lang.Float float2 = mutableFloat1.getValue();
        mutableFloat1.add((float) 'a');
        mutableFloat1.setValue((java.lang.Number) 101L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2.equals(100.0f));
    }

    @Test
    public void MutableFloat0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0601");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        short short5 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void MutableFloat0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0602");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.add((float) (byte) 0);
        mutableFloat1.setValue(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
    }

    @Test
    public void MutableFloat0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0603");
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
    public void MutableFloat0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0604");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract(22.0f);
    }

    @Test
    public void MutableFloat0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0605");
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
    public void MutableFloat0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0606");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        mutableFloat1.subtract((float) 10L);
        float float4 = mutableFloat1.floatValue();
        mutableFloat1.subtract(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 22.0f + "'", float4 == 22.0f);
    }

    @Test
    public void MutableFloat0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0607");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.subtract((-100.0f));
        mutableFloat1.subtract((float) ' ');
        mutableFloat1.add((float) (byte) 100);
        java.lang.Float float8 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 168.0f + "'", float8.equals(168.0f));
    }

    @Test
    public void MutableFloat0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0608");
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
    public void MutableFloat0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0609");
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
    public void MutableFloat0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0610");
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
    public void MutableFloat0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0611");
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
    public void MutableFloat0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0612");
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
    public void MutableFloat0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0613");
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
    public void MutableFloat0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0614");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.subtract((float) 35L);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10.0" + "'", str2.equals("10.0"));
    }

    @Test
    public void MutableFloat0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0615");
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
    public void MutableFloat0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0616");
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
    public void MutableFloat0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0617");
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
    public void MutableFloat0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0618");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        mutableFloat1.subtract((float) 10L);
        short short4 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 22 + "'", short4 == (short) 22);
    }

    @Test
    public void MutableFloat0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0619");
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
    public void MutableFloat0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0620");
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
    public void MutableFloat0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0621");
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
    public void MutableFloat0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0622");
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
    public void MutableFloat0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0623");
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
    public void MutableFloat0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0624");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        mutableFloat1.subtract((java.lang.Number) 0);
        java.lang.Float float6 = mutableFloat1.getValue();
        int int7 = mutableFloat1.intValue();
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in MutableFloat generation
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
    public void MutableFloat0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0625");
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
    public void MutableFloat0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0626");
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
    public void MutableFloat0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0627");
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
    public void MutableFloat0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0628");
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
    public void MutableFloat0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0629");
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
    public void MutableFloat0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0630");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("1.0");
        java.lang.String str2 = mutableFloat1.toString();
        boolean boolean3 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableFloat0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0631");
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
    public void MutableFloat0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0632");
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
    public void MutableFloat0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0633");
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
    public void MutableFloat0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0634");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-99.0");
        mutableFloat1.decrement();
        mutableFloat1.increment();
        mutableFloat1.subtract((float) (-1L));
    }

    @Test
    public void MutableFloat0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0635");
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
    public void MutableFloat0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0636");
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
    public void MutableFloat0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0637");
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
    public void MutableFloat0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0638");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        mutableFloat1.add((java.lang.Number) (short) 1);
        mutableFloat1.setValue((float) (byte) 101);
        java.lang.Float float6 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 101.0f + "'", float6.equals(101.0f));
    }

    @Test
    public void MutableFloat0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0639");
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
    public void MutableFloat0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0640");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (byte) -8);
        mutableFloat1.add((float) (short) 10);
    }

    @Test
    public void MutableFloat0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0641");
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
    public void MutableFloat0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0642");
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
    public void MutableFloat0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0643");
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
    public void MutableFloat0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0644");
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
    public void MutableFloat0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0645");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract((float) (short) -89);
        mutableFloat1.setValue(9.0f);
    }

    @Test
    public void MutableFloat0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0646");
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
    public void MutableFloat0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0647");
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
    public void MutableFloat0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0648");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) -100);
        java.lang.Float float2 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100.0f) + "'", float2.equals((-100.0f)));
    }

    @Test
    public void MutableFloat0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0649");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 2);
    }

    @Test
    public void MutableFloat0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0650");
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
    public void MutableFloat0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0651");
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
    public void MutableFloat0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0652");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.setValue(0.0f);
        mutableFloat1.decrement();
        java.lang.Float float7 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7.equals((-1.0f)));
    }

    @Test
    public void MutableFloat0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0653");
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
    public void MutableFloat0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0654");
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
    public void MutableFloat0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0655");
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
    public void MutableFloat0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0656");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 30);
        byte byte2 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 30 + "'", byte2 == (byte) 30);
    }

    @Test
    public void MutableFloat0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0657");
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
    public void MutableFloat0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0658");
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
    public void MutableFloat0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0659");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-8));
    }

    @Test
    public void MutableFloat0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0660");
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
    public void MutableFloat0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0661");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        mutableFloat3.subtract((java.lang.Number) (-2.0d));
        java.lang.Class<?> wildcardClass7 = mutableFloat3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableFloat0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0662");
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
    public void MutableFloat0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0663");
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
    public void MutableFloat0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0664");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        mutableFloat0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
    }

    @Test
    public void MutableFloat0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0665");
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
    public void MutableFloat0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0666");
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
    public void MutableFloat0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0667");
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
    public void MutableFloat0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0668");
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
    public void MutableFloat0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0669");
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
    public void MutableFloat0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0670");
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
    public void MutableFloat0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0671");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        boolean boolean1 = mutableFloat0.isInfinite();
        double double2 = mutableFloat0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void MutableFloat0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0672");
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
    public void MutableFloat0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0673");
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
    public void MutableFloat0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0674");
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
    public void MutableFloat0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0675");
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
    public void MutableFloat0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0676");
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
    public void MutableFloat0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0677");
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
    public void MutableFloat0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0678");
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
    public void MutableFloat0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0679");
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
    public void MutableFloat0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0680");
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
    public void MutableFloat0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0681");
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
    public void MutableFloat0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0682");
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
    public void MutableFloat0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0683");
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
    public void MutableFloat0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0684");
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
    public void MutableFloat0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0685");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(68.0f);
        mutableFloat1.increment();
    }

    @Test
    public void MutableFloat0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0686");
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
    public void MutableFloat0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0687");
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
    public void MutableFloat0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0688");
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
    public void MutableFloat0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0689");
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
    public void MutableFloat0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0690");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(25.0f);
    }

    @Test
    public void MutableFloat0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0691");
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
    public void MutableFloat0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0692");
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
    public void MutableFloat0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0693");
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
    public void MutableFloat0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0694");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        boolean boolean1 = mutableFloat0.isInfinite();
        java.lang.Float float2 = mutableFloat0.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2.equals(0.0f));
    }

    @Test
    public void MutableFloat0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0695");
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
    public void MutableFloat0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0696");
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
    public void MutableFloat0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0697");
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
    public void MutableFloat0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0698");
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
    public void MutableFloat0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0699");
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
    public void MutableFloat0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0700");
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
    public void MutableFloat0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0701");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-31L));
    }

    @Test
    public void MutableFloat0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0702");
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
    public void MutableFloat0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0703");
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
    public void MutableFloat0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0704");
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
    public void MutableFloat0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0705");
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
    public void MutableFloat0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0706");
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
    public void MutableFloat0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0707");
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
    public void MutableFloat0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0708");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        int int2 = mutableFloat1.intValue();
        mutableFloat1.subtract((float) 20L);
        mutableFloat1.subtract((float) (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void MutableFloat0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0709");
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
    public void MutableFloat0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0710");
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
    public void MutableFloat0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0711");
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
    public void MutableFloat0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0712");
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
    public void MutableFloat0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0713");
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
    public void MutableFloat0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0714");
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
    public void MutableFloat0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0715");
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
    public void MutableFloat0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0716");
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
    public void MutableFloat0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0717");
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
    public void MutableFloat0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0718");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        boolean boolean5 = mutableFloat1.isInfinite();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat6 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableFloat0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0719");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 10);
        short short2 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void MutableFloat0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0720");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-100L));
        mutableFloat1.decrement();
        mutableFloat1.subtract((float) 202);
    }

    @Test
    public void MutableFloat0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0721");
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
    public void MutableFloat0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0722");
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
    public void MutableFloat0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0723");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 0);
        mutableFloat1.subtract((float) (byte) 99);
        mutableFloat1.subtract((float) 3);
    }

    @Test
    public void MutableFloat0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0724");
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
    public void MutableFloat0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0725");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract(0.0f);
        mutableFloat1.decrement();
        java.lang.Float float7 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 31.0f + "'", float7.equals(31.0f));
    }

    @Test
    public void MutableFloat0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0726");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        boolean boolean3 = mutableFloat0.isNaN();
        mutableFloat0.increment();
        mutableFloat0.setValue((float) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableFloat0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0727");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        int int2 = mutableFloat1.intValue();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.add((java.lang.Number) 10L);
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void MutableFloat0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0728");
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
    public void MutableFloat0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0729");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        mutableFloat1.add((float) (byte) 10);
        long long7 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
    }

    @Test
    public void MutableFloat0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0730");
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
    public void MutableFloat0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0731");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        java.lang.Float float2 = mutableFloat1.getValue();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2.equals((-1.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0732");
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
    public void MutableFloat0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0733");
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
    public void MutableFloat0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0734");
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
    public void MutableFloat0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0735");
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
    public void MutableFloat0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0736");
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
    public void MutableFloat0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0737");
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
    public void MutableFloat0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0738");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        int int2 = mutableFloat1.intValue();
        mutableFloat1.subtract((float) 20L);
        mutableFloat1.setValue((float) 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void MutableFloat0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0739");
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
    public void MutableFloat0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0740");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.add((-2.0f));
    }

    @Test
    public void MutableFloat0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0741");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (byte) -8);
        java.lang.Float float2 = mutableFloat1.toFloat();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.0f) + "'", float2.equals((-8.0f)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0742");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (short) 10);
        double double2 = mutableFloat1.doubleValue();
        mutableFloat1.add(1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void MutableFloat0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0743");
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
    public void MutableFloat0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0744");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat2 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat((float) 3);
        mutableFloat4.subtract(0.0f);
        mutableFloat2.add((java.lang.Number) 0.0f);
    }

    @Test
    public void MutableFloat0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0745");
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
    public void MutableFloat0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0746");
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
    public void MutableFloat0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0747");
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
    public void MutableFloat0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0748");
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
    public void MutableFloat0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0749");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.subtract((-100.0f));
        mutableFloat1.subtract((float) ' ');
        int int6 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 68 + "'", int6 == 68);
    }

    @Test
    public void MutableFloat0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0750");
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
    public void MutableFloat0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0751");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-11.0");
    }

    @Test
    public void MutableFloat0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0752");
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
    public void MutableFloat0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0753");
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
    public void MutableFloat0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0754");
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
    public void MutableFloat0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0755");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '4');
        java.lang.Float float2 = mutableFloat1.toFloat();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2.equals(52.0f));
    }

    @Test
    public void MutableFloat0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0756");
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
    public void MutableFloat0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0757");
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
    public void MutableFloat0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0758");
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
    public void MutableFloat0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0759");
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
    public void MutableFloat0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0760");
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
    public void MutableFloat0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0761");
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
    public void MutableFloat0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0762");
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
    public void MutableFloat0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0763");
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
    public void MutableFloat0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0764");
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
    public void MutableFloat0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0765");
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
    public void MutableFloat0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0766");
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
    public void MutableFloat0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0767");
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
    public void MutableFloat0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0768");
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
    public void MutableFloat0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0769");
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
    public void MutableFloat0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0770");
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
    public void MutableFloat0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0771");
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
    public void MutableFloat0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0772");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-99.0");
        mutableFloat1.decrement();
        double double3 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3 == (-100.0d));
    }

    @Test
    public void MutableFloat0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0773");
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
    public void MutableFloat0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0774");
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
    public void MutableFloat0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0775");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) -89);
        float float2 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-89.0f) + "'", float2 == (-89.0f));
    }

    @Test
    public void MutableFloat0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0776");
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
    public void MutableFloat0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0777");
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
    public void MutableFloat0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0778");
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
    public void MutableFloat0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0779");
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
    public void MutableFloat0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0780");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        java.lang.Float float4 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4.equals(32.0f));
    }

    @Test
    public void MutableFloat0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0781");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        mutableFloat1.add((float) (byte) 2);
        byte byte4 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 2 + "'", byte4 == (byte) 2);
    }

    @Test
    public void MutableFloat0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0782");
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
    public void MutableFloat0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0783");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 1);
        long long2 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void MutableFloat0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0784");
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
    public void MutableFloat0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0785");
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
    public void MutableFloat0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0786");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue(0.0f);
        mutableFloat1.subtract(200.0f);
    }

    @Test
    public void MutableFloat0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0787");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.subtract((-100.0f));
        mutableFloat1.add(33.0f);
        mutableFloat1.decrement();
    }

    @Test
    public void MutableFloat0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0788");
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
    public void MutableFloat0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0789");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.subtract((java.lang.Number) 10L);
        java.lang.Float float5 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-10.0f) + "'", float5.equals((-10.0f)));
    }

    @Test
    public void MutableFloat0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0790");
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
    public void MutableFloat0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0791");
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
    public void MutableFloat0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0792");
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
    public void MutableFloat0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0793");
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
    public void MutableFloat0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0794");
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
    public void MutableFloat0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0795");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.setValue(0.0f);
        mutableFloat1.setValue((float) (short) -1);
        java.lang.Float float6 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6.equals((-1.0f)));
    }

    @Test
    public void MutableFloat0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0796");
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
    public void MutableFloat0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0797");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((float) '#');
        mutableFloat1.decrement();
        java.lang.Float float5 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-37.0f) + "'", float5.equals((-37.0f)));
    }

    @Test
    public void MutableFloat0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0798");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.add((float) (short) 35);
        mutableFloat1.add((float) (byte) 65);
    }

    @Test
    public void MutableFloat0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0799");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        mutableFloat1.setValue((float) (short) 1);
        mutableFloat1.increment();
    }

    @Test
    public void MutableFloat0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0800");
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
    public void MutableFloat0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0801");
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
    public void MutableFloat0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0802");
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
    public void MutableFloat0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0803");
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
    public void MutableFloat0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0804");
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
    public void MutableFloat0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0805");
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
    public void MutableFloat0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0806");
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
    public void MutableFloat0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0807");
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
    public void MutableFloat0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0808");
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
    public void MutableFloat0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0809");
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
    public void MutableFloat0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0810");
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
    public void MutableFloat0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0811");
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
    public void MutableFloat0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0812");
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
    public void MutableFloat0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0813");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        mutableFloat1.setValue((float) (short) 1);
        mutableFloat1.setValue((float) 110);
    }

    @Test
    public void MutableFloat0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0814");
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
    public void MutableFloat0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0815");
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
    public void MutableFloat0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0816");
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
    public void MutableFloat0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0817");
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
    public void MutableFloat0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0818");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(200.0f);
        java.lang.Class<?> wildcardClass2 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableFloat0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0819");
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
    public void MutableFloat0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0820");
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
    public void MutableFloat0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0821");
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
    public void MutableFloat0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0822");
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
    public void MutableFloat0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0823");
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
    public void MutableFloat0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0824");
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
    public void MutableFloat0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0825");
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
    public void MutableFloat0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0826");
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
    public void MutableFloat0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0827");
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
    public void MutableFloat0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0828");
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
    public void MutableFloat0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0829");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        boolean boolean3 = mutableFloat1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableFloat0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0830");
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
    public void MutableFloat0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0831");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-90.0f));
    }

    @Test
    public void MutableFloat0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0832");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 101);
        java.lang.Float float2 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 101.0f + "'", float2.equals(101.0f));
    }

    @Test
    public void MutableFloat0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0833");
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
    public void MutableFloat0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0834");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.setValue(0.0f);
        float float6 = mutableFloat1.floatValue();
        mutableFloat1.add(99.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableFloat0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0835");
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
    public void MutableFloat0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0836");
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
    public void MutableFloat0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0837");
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
    public void MutableFloat0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0838");
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
    public void MutableFloat0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0839");
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
    public void MutableFloat0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0840");
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
    public void MutableFloat0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0841");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) '#');
        mutableFloat1.setValue((float) (byte) 10);
        float float4 = mutableFloat1.floatValue();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void MutableFloat0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0842");
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
    public void MutableFloat0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0843");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract(0.0f);
        java.lang.Float float6 = mutableFloat1.getValue();
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6.equals(32.0f));
    }

    @Test
    public void MutableFloat0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0844");
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
    public void MutableFloat0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0845");
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
    public void MutableFloat0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0846");
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
    public void MutableFloat0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0847");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) (-99.0f));
    }

    @Test
    public void MutableFloat0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0848");
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
    public void MutableFloat0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0849");
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
    public void MutableFloat0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0850");
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
    public void MutableFloat0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0851");
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
    public void MutableFloat0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0852");
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
    public void MutableFloat0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0853");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 20L);
        boolean boolean2 = mutableFloat1.isInfinite();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0854");
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
    public void MutableFloat0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0855");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        java.lang.String str4 = mutableFloat1.toString();
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "32.0" + "'", str4.equals("32.0"));
    }

    @Test
    public void MutableFloat0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0856");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.add(2.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void MutableFloat0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0857");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        mutableFloat1.add((java.lang.Number) mutableFloat3);
        java.lang.Float float5 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5.equals(10.0f));
    }

    @Test
    public void MutableFloat0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0858");
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
    public void MutableFloat0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0859");
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
    public void MutableFloat0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0860");
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
    public void MutableFloat0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0861");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("101.0");
        mutableFloat1.increment();
        java.lang.Float float3 = mutableFloat1.toFloat();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 102.0f + "'", float3.equals(102.0f));
    }

    @Test
    public void MutableFloat0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0862");
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
    public void MutableFloat0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0863");
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
    public void MutableFloat0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0864");
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
    public void MutableFloat0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0865");
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
    public void MutableFloat0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0866");
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
    public void MutableFloat0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0867");
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
    public void MutableFloat0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0868");
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
    public void MutableFloat0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0869");
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
    public void MutableFloat0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0870");
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
    public void MutableFloat0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0871");
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
    public void MutableFloat0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0872");
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
    public void MutableFloat0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0873");
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
    public void MutableFloat0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0874");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-1));
        mutableFloat1.subtract((java.lang.Number) mutableFloat3);
        short short5 = mutableFloat3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void MutableFloat0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0875");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        mutableFloat1.add((-11.0f));
        mutableFloat1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void MutableFloat0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0876");
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
    public void MutableFloat0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0877");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add((java.lang.Number) (byte) 0);
        mutableFloat1.add((float) (byte) 10);
        java.lang.Float float7 = mutableFloat1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 110.0f + "'", float7.equals(110.0f));
    }

    @Test
    public void MutableFloat0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0878");
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
    public void MutableFloat0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0879");
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
    public void MutableFloat0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0880");
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
    public void MutableFloat0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0881");
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
    public void MutableFloat0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0882");
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
    public void MutableFloat0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0883");
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
    public void MutableFloat0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0884");
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
    public void MutableFloat0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0885");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 10);
        long long2 = mutableFloat1.longValue();
        float float3 = mutableFloat1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void MutableFloat0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0886");
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
    public void MutableFloat0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0887");
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
    public void MutableFloat0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0888");
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
    public void MutableFloat0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0889");
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
    public void MutableFloat0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0890");
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
    public void MutableFloat0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0891");
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
    public void MutableFloat0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0892");
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
    public void MutableFloat0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0893");
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
    public void MutableFloat0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0894");
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
    public void MutableFloat0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0895");
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
    public void MutableFloat0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0896");
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
    public void MutableFloat0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0897");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("-1.0");
        boolean boolean2 = mutableFloat1.isInfinite();
        mutableFloat1.subtract((float) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableFloat0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0898");
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
    public void MutableFloat0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0899");
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
    public void MutableFloat0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0900");
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
    public void MutableFloat0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0901");
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
    public void MutableFloat0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0902");
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
    public void MutableFloat0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0903");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 10L);
        java.lang.String str2 = mutableFloat1.toString();
        mutableFloat1.subtract((float) 35L);
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10.0" + "'", str2.equals("10.0"));
    }

    @Test
    public void MutableFloat0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0904");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(0.0f);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat2 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat1);
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat3 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat2);
        short short4 = mutableFloat3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void MutableFloat0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0905");
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
    public void MutableFloat0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0906");
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
    public void MutableFloat0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0907");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 110);
    }

    @Test
    public void MutableFloat0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0908");
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
    public void MutableFloat0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0909");
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
    public void MutableFloat0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0910");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) -50);
    }

    @Test
    public void MutableFloat0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0911");
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
    public void MutableFloat0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0912");
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
    public void MutableFloat0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0913");
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
    public void MutableFloat0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0914");
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
    public void MutableFloat0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0915");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        double double2 = mutableFloat1.doubleValue();
        mutableFloat1.subtract((float) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void MutableFloat0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0916");
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
    public void MutableFloat0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0917");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("135.0");
    }

    @Test
    public void MutableFloat0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0918");
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
    public void MutableFloat0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0919");
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
    public void MutableFloat0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0920");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        float float2 = mutableFloat1.floatValue();
        mutableFloat1.add(2.0f);
        mutableFloat1.setValue((float) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void MutableFloat0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0921");
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
    public void MutableFloat0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0922");
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
    public void MutableFloat0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0923");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 101);
    }

    @Test
    public void MutableFloat0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0924");
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
    public void MutableFloat0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0925");
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
    public void MutableFloat0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0926");
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
    public void MutableFloat0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0927");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        boolean boolean3 = mutableFloat1.equals((java.lang.Object) (byte) 100);
        double double4 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void MutableFloat0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0928");
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
    public void MutableFloat0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0929");
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
    public void MutableFloat0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0930");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 101L);
        mutableFloat1.setValue((float) 110);
        short short4 = mutableFloat1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 110 + "'", short4 == (short) 110);
    }

    @Test
    public void MutableFloat0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0931");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 0);
        mutableFloat1.add(68.0f);
        mutableFloat1.subtract((float) 0);
        java.lang.Class<?> wildcardClass6 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableFloat0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0932");
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
    public void MutableFloat0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0933");
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
    public void MutableFloat0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0934");
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
    public void MutableFloat0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0935");
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
    public void MutableFloat0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0936");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(100.0f);
        long long2 = mutableFloat1.longValue();
        int int3 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void MutableFloat0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0937");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 100L);
        long long2 = mutableFloat1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void MutableFloat0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0938");
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
    public void MutableFloat0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0939");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 35);
        mutableFloat1.increment();
    }

    @Test
    public void MutableFloat0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0940");
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
    public void MutableFloat0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0941");
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
    public void MutableFloat0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0942");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat0 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat0.subtract((java.lang.Number) 100L);
        java.lang.Float float3 = mutableFloat0.toFloat();
        mutableFloat0.setValue((java.lang.Number) (-20L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-100.0f) + "'", float3.equals((-100.0f)));
    }

    @Test
    public void MutableFloat0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0943");
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
    public void MutableFloat0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0944");
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
    public void MutableFloat0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0945");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("2.0");
        java.lang.String str2 = mutableFloat1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "2.0" + "'", str2.equals("2.0"));
    }

    @Test
    public void MutableFloat0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0946");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((-50.0f));
    }

    @Test
    public void MutableFloat0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0947");
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
    public void MutableFloat0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0948");
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
    public void MutableFloat0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0949");
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
    public void MutableFloat0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0950");
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
    public void MutableFloat0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0951");
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
    public void MutableFloat0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0952");
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
    public void MutableFloat0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0953");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (-99L));
        mutableFloat1.setValue((float) (short) 110);
    }

    @Test
    public void MutableFloat0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0954");
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
    public void MutableFloat0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0955");
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
    public void MutableFloat0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0956");
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
    public void MutableFloat0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0957");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 10);
        int int2 = mutableFloat1.intValue();
        mutableFloat1.add((float) 20L);
        mutableFloat1.subtract((float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void MutableFloat0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0958");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 32);
        int int2 = mutableFloat1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void MutableFloat0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0959");
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
    public void MutableFloat0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0960");
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
    public void MutableFloat0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0961");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 20L);
        mutableFloat1.setValue(23.0f);
    }

    @Test
    public void MutableFloat0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0962");
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
    public void MutableFloat0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0963");
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
    public void MutableFloat0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0964");
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
    public void MutableFloat0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0965");
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
    public void MutableFloat0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0966");
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
    public void MutableFloat0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0967");
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
    public void MutableFloat0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0968");
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
    public void MutableFloat0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0969");
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
    public void MutableFloat0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0970");
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
    public void MutableFloat0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0971");
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
    public void MutableFloat0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0972");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 100);
        java.lang.String str2 = mutableFloat1.toString();
        java.lang.Class<?> wildcardClass3 = mutableFloat1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableFloat0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0973");
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
    public void MutableFloat0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0974");
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
    public void MutableFloat0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0975");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (byte) 36);
    }

    @Test
    public void MutableFloat0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0976");
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
    public void MutableFloat0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0977");
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
    public void MutableFloat0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0978");
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
    public void MutableFloat0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0979");
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
    public void MutableFloat0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0980");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat("0.0");
        long long2 = mutableFloat1.longValue();
        mutableFloat1.add((-100.0f));
        mutableFloat1.add(10.0f);
        mutableFloat1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void MutableFloat0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0981");
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
    public void MutableFloat0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0982");
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
    public void MutableFloat0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0983");
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
    public void MutableFloat0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0984");
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
    public void MutableFloat0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0985");
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
    public void MutableFloat0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0986");
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
    public void MutableFloat0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0987");
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
    public void MutableFloat0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0988");
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
    public void MutableFloat0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0989");
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
    public void MutableFloat0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0990");
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
    public void MutableFloat0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0991");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 1);
        double double2 = mutableFloat1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void MutableFloat0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0992");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat4 = new org.apache.commons.lang3.mutable.MutableFloat();
        mutableFloat1.setValue((java.lang.Number) mutableFloat4);
        mutableFloat4.subtract((float) 10L);
        mutableFloat4.decrement();
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat9 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) mutableFloat4);
    }

    @Test
    public void MutableFloat0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0993");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat(35.0f);
        mutableFloat1.subtract((float) (short) 0);
        mutableFloat1.subtract((float) 10L);
        byte byte6 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 25 + "'", byte6 == (byte) 25);
    }

    @Test
    public void MutableFloat0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0994");
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
    public void MutableFloat0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0995");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((java.lang.Number) 1.0d);
        mutableFloat1.setValue((float) ' ');
        mutableFloat1.subtract(0.0f);
        byte byte6 = mutableFloat1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 32 + "'", byte6 == (byte) 32);
    }

    @Test
    public void MutableFloat0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0996");
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
    public void MutableFloat0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0997");
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
    public void MutableFloat0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0998");
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
    public void MutableFloat0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat0999");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) (short) 10);
        mutableFloat1.setValue((float) (byte) -100);
        mutableFloat1.setValue((float) (short) -89);
    }

    @Test
    public void MutableFloat1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableFloat1.MutableFloat1000");
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat1 = new org.apache.commons.lang3.mutable.MutableFloat((float) 0L);
        mutableFloat1.subtract((-100.0f));
        org.apache.commons.lang3.mutable.MutableFloat mutableFloat5 = new org.apache.commons.lang3.mutable.MutableFloat((float) 1);
        mutableFloat5.setValue((float) '4');
        mutableFloat1.setValue((java.lang.Number) mutableFloat5);
    }
}

