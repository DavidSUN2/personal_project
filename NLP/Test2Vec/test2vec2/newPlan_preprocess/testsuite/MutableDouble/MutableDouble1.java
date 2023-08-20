package MutableDouble;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableDouble1 {

    public static boolean debug = false;

    @Test
    public void MutableDouble0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0501");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        double double6 = mutableDouble4.doubleValue();
        java.lang.Class<?> wildcardClass7 = mutableDouble4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableDouble0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0502");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        int int6 = mutableDouble4.intValue();
        mutableDouble4.decrement();
        float float8 = mutableDouble4.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void MutableDouble0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0503");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-10.0d));
        mutableDouble1.add((double) (short) -1);
    }

    @Test
    public void MutableDouble0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0504");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        int int4 = mutableDouble1.intValue();
        mutableDouble1.add((double) ' ');
        boolean boolean7 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0505");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        int int6 = mutableDouble4.intValue();
        java.lang.Object obj7 = null;
        boolean boolean8 = mutableDouble4.equals(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0506");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) 100);
        byte byte7 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -99 + "'", byte7 == (byte) -99);
    }

    @Test
    public void MutableDouble0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0507");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        mutableDouble1.increment();
        short short8 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void MutableDouble0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0508");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100);
        int int2 = mutableDouble1.intValue();
        mutableDouble1.setValue((double) (-1));
        double double5 = mutableDouble1.doubleValue();
        double double6 = mutableDouble1.doubleValue();
        java.lang.Double double7 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7.equals((-1.0d)));
    }

    @Test
    public void MutableDouble0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0509");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.increment();
        long long4 = mutableDouble1.longValue();
        short short5 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 2 + "'", short5 == (short) 2);
    }

    @Test
    public void MutableDouble0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0510");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        int int6 = mutableDouble4.intValue();
        long long7 = mutableDouble4.longValue();
        java.lang.Class<?> wildcardClass8 = mutableDouble4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0511");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '#');
        double double2 = mutableDouble1.doubleValue();
        boolean boolean3 = mutableDouble1.isNaN();
        mutableDouble1.add((double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0512");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        java.lang.Double double7 = mutableDouble1.getValue();
        mutableDouble1.decrement();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble9 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
    }

    @Test
    public void MutableDouble0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0513");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("-110.0");
    }

    @Test
    public void MutableDouble0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0514");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean6 = mutableDouble5.isNaN();
        int int7 = mutableDouble1.compareTo(mutableDouble5);
        java.lang.String str8 = mutableDouble5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0.0" + "'", str8.equals("0.0"));
    }

    @Test
    public void MutableDouble0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0515");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(101.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble3.increment();
        long long5 = mutableDouble3.longValue();
        mutableDouble3.setValue(0.0d);
        boolean boolean8 = mutableDouble1.equals((java.lang.Object) mutableDouble3);
        short short9 = mutableDouble3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void MutableDouble0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0516");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble();
        boolean boolean4 = mutableDouble1.equals((java.lang.Object) mutableDouble3);
        mutableDouble1.subtract((-99.0d));
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-99.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableDouble0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0517");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 2);
        int int6 = mutableDouble5.intValue();
        mutableDouble1.subtract((java.lang.Number) mutableDouble5);
        mutableDouble1.add(101.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void MutableDouble0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0518");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        java.lang.Double double6 = mutableDouble5.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6.equals(1.0d));
    }

    @Test
    public void MutableDouble0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0519");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        mutableDouble1.setValue((-100.0d));
        java.lang.Class<?> wildcardClass5 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableDouble0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0520");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.add((java.lang.Number) (byte) 100);
        mutableDouble0.add((double) 0L);
        short short5 = mutableDouble0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
    }

    @Test
    public void MutableDouble0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0521");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        java.lang.Double double7 = mutableDouble1.getValue();
        mutableDouble1.decrement();
        long long9 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void MutableDouble0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0522");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        java.lang.Class<?> wildcardClass4 = mutableDouble0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableDouble0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0523");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        boolean boolean5 = mutableDouble1.equals((java.lang.Object) 1.0d);
        double double6 = mutableDouble1.doubleValue();
        boolean boolean7 = mutableDouble1.isInfinite();
        float float8 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void MutableDouble0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0524");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        float float4 = mutableDouble1.floatValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        int int6 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 2);
        mutableDouble1.subtract((java.lang.Number) (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void MutableDouble0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0525");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble3);
        mutableDouble4.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0526");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) -97);
        java.lang.Double double2 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-97.0d) + "'", double2.equals((-97.0d)));
    }

    @Test
    public void MutableDouble0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0527");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        boolean boolean5 = mutableDouble1.equals((java.lang.Object) 1.0d);
        double double6 = mutableDouble1.doubleValue();
        boolean boolean7 = mutableDouble1.isInfinite();
        long long8 = mutableDouble1.longValue();
        boolean boolean9 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0528");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str4 = mutableDouble3.toString();
        boolean boolean5 = mutableDouble3.isNaN();
        double double6 = mutableDouble3.doubleValue();
        java.lang.Double double7 = mutableDouble3.getValue();
        int int8 = mutableDouble1.compareTo(mutableDouble3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100.0" + "'", str4.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void MutableDouble0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0529");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.decrement();
        java.lang.Double double2 = mutableDouble0.toDouble();
        mutableDouble0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2.equals((-1.0d)));
    }

    @Test
    public void MutableDouble0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0530");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        float float4 = mutableDouble1.floatValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        int int6 = mutableDouble1.intValue();
        java.lang.Class<?> wildcardClass7 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableDouble0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0531");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean4 = mutableDouble3.isInfinite();
        java.lang.Double double5 = mutableDouble3.toDouble();
        int int6 = mutableDouble1.compareTo(mutableDouble3);
        mutableDouble3.add((-10.0d));
        java.lang.String str9 = mutableDouble3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-10.0" + "'", str9.equals("-10.0"));
    }

    @Test
    public void MutableDouble0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0532");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableDouble1.toString();
        boolean boolean3 = mutableDouble1.isInfinite();
        java.lang.Class<?> wildcardClass4 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableDouble0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0533");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 101);
        boolean boolean2 = mutableDouble1.isNaN();
        boolean boolean3 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0534");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.setValue((double) 2);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 2);
        float float6 = mutableDouble5.floatValue();
        float float7 = mutableDouble5.floatValue();
        mutableDouble5.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
    }

    @Test
    public void MutableDouble0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0535");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble0.add((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble("1.0");
        float float7 = mutableDouble6.floatValue();
        boolean boolean8 = mutableDouble0.equals((java.lang.Object) float7);
        double double9 = mutableDouble0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void MutableDouble0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0536");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        java.lang.Double double6 = mutableDouble1.getValue();
        long long7 = mutableDouble1.longValue();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void MutableDouble0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0537");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble1.setValue((double) 0.0f);
        mutableDouble1.add((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void MutableDouble0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0538");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        java.lang.Class<?> wildcardClass6 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableDouble0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0539");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        boolean boolean4 = mutableDouble1.isNaN();
        mutableDouble1.setValue((double) 1L);
        byte byte7 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void MutableDouble0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0540");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        mutableDouble1.subtract((double) 0L);
        double double6 = mutableDouble1.doubleValue();
        java.lang.Double double7 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void MutableDouble0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0541");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        int int4 = mutableDouble1.intValue();
        long long5 = mutableDouble1.longValue();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void MutableDouble0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0542");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        long long7 = mutableDouble1.longValue();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void MutableDouble0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0543");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        byte byte4 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void MutableDouble0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0544");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        int int4 = mutableDouble1.intValue();
        long long5 = mutableDouble1.longValue();
        mutableDouble1.add(92.0d);
        short short8 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 93 + "'", short8 == (short) 93);
    }

    @Test
    public void MutableDouble0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0545");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) -97);
        byte byte2 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -97 + "'", byte2 == (byte) -97);
    }

    @Test
    public void MutableDouble0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0546");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        java.lang.Double double3 = mutableDouble1.getValue();
        float float4 = mutableDouble1.floatValue();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void MutableDouble0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0547");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-1L));
        mutableDouble1.subtract((java.lang.Number) (-1L));
        boolean boolean6 = mutableDouble1.isInfinite();
        java.lang.Double double7 = mutableDouble1.getValue();
        mutableDouble1.setValue((double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7.equals(2.0d));
    }

    @Test
    public void MutableDouble0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0548");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        java.lang.String str2 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble(0.0d);
        mutableDouble1.add((java.lang.Number) mutableDouble4);
        float float6 = mutableDouble4.floatValue();
        mutableDouble4.add(0.0d);
        java.lang.Class<?> wildcardClass9 = mutableDouble4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableDouble0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0549");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long5 = mutableDouble4.longValue();
        int int6 = mutableDouble1.compareTo(mutableDouble4);
        int int7 = mutableDouble4.intValue();
        java.lang.Double double8 = mutableDouble4.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8.equals(1.0d));
    }

    @Test
    public void MutableDouble0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0550");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        mutableDouble1.subtract((double) 0L);
        mutableDouble1.subtract((double) (short) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0551");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.add((java.lang.Number) (byte) 100);
        mutableDouble0.add((double) (short) -1);
        boolean boolean5 = mutableDouble0.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0552");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        float float6 = mutableDouble1.floatValue();
        boolean boolean7 = mutableDouble1.isInfinite();
        mutableDouble1.increment();
        float float9 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void MutableDouble0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0553");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean6 = mutableDouble5.isNaN();
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) mutableDouble5);
        int int8 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void MutableDouble0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0554");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble1.add((double) 99.0f);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        mutableDouble5.add((double) 99.0f);
        mutableDouble1.setValue((java.lang.Number) 99.0f);
        java.lang.String str9 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "99.0" + "'", str9.equals("99.0"));
    }

    @Test
    public void MutableDouble0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0555");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 2.0f);
        mutableDouble1.subtract((double) 1L);
    }

    @Test
    public void MutableDouble0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0556");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        long long7 = mutableDouble1.longValue();
        byte byte8 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void MutableDouble0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0557");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean5 = mutableDouble4.isInfinite();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        double double7 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void MutableDouble0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0558");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(101.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble3.increment();
        long long5 = mutableDouble3.longValue();
        mutableDouble3.setValue(0.0d);
        boolean boolean8 = mutableDouble1.equals((java.lang.Object) mutableDouble3);
        byte byte9 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 101 + "'", byte9 == (byte) 101);
    }

    @Test
    public void MutableDouble0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0559");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) 'a');
        short short7 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -97 + "'", short7 == (short) -97);
    }

    @Test
    public void MutableDouble0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0560");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float5 = mutableDouble4.floatValue();
        java.lang.String str6 = mutableDouble4.toString();
        boolean boolean7 = mutableDouble0.equals((java.lang.Object) mutableDouble4);
        java.lang.String str8 = mutableDouble4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.0" + "'", str8.equals("1.0"));
    }

    @Test
    public void MutableDouble0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0561");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        mutableDouble4.add((-99.0d));
        byte byte8 = mutableDouble4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -98 + "'", byte8 == (byte) -98);
    }

    @Test
    public void MutableDouble0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0562");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        mutableDouble1.subtract((java.lang.Number) 0L);
        float float4 = mutableDouble1.floatValue();
        byte byte5 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void MutableDouble0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0563");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("2.0");
        float float2 = mutableDouble1.floatValue();
        java.lang.Double double3 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3.equals(2.0d));
    }

    @Test
    public void MutableDouble0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0564");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        float float6 = mutableDouble1.floatValue();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableDouble0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0565");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 2);
        boolean boolean2 = mutableDouble1.isNaN();
        mutableDouble1.subtract((double) 101);
        int int5 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-99) + "'", int5 == (-99));
    }

    @Test
    public void MutableDouble0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0566");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        java.lang.String str4 = mutableDouble1.toString();
        mutableDouble1.increment();
        java.lang.String str6 = mutableDouble1.toString();
        mutableDouble1.decrement();
        boolean boolean8 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0567");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.setValue((double) 2);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 2);
        float float6 = mutableDouble5.floatValue();
        mutableDouble5.subtract((double) (byte) 2);
        mutableDouble5.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
    }

    @Test
    public void MutableDouble0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0568");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((-1.0d));
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble6.decrement();
        mutableDouble1.setValue((java.lang.Number) mutableDouble6);
        boolean boolean9 = mutableDouble6.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0569");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        java.lang.Double double3 = mutableDouble1.getValue();
        float float4 = mutableDouble1.floatValue();
        short short5 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void MutableDouble0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0570");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        double double4 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void MutableDouble0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0571");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble();
        boolean boolean4 = mutableDouble1.equals((java.lang.Object) mutableDouble3);
        mutableDouble1.subtract((-99.0d));
        mutableDouble1.subtract(100.0d);
        byte byte9 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void MutableDouble0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0572");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 2);
        mutableDouble1.setValue((double) 3.0f);
    }

    @Test
    public void MutableDouble0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0573");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        float float4 = mutableDouble1.floatValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        java.lang.Double double6 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6.equals(100.0d));
    }

    @Test
    public void MutableDouble0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0574");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract(100.0d);
        double double7 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7 == (-100.0d));
    }

    @Test
    public void MutableDouble0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0575");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        java.lang.Double double4 = mutableDouble0.toDouble();
        mutableDouble0.subtract(10.0d);
        float float7 = mutableDouble0.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = null;
        // The following exception was thrown during execution in MutableDouble generation
        try {
            int int9 = mutableDouble0.compareTo(mutableDouble8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-110.0f) + "'", float7 == (-110.0f));
    }

    @Test
    public void MutableDouble0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0576");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.toDouble();
        float float8 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void MutableDouble0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0577");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        float float6 = mutableDouble1.floatValue();
        int int7 = mutableDouble1.intValue();
        int int8 = mutableDouble1.intValue();
        java.lang.Double double9 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9.equals(0.0d));
    }

    @Test
    public void MutableDouble0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0578");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long5 = mutableDouble4.longValue();
        mutableDouble4.add((double) 100.0f);
        mutableDouble1.subtract((java.lang.Number) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void MutableDouble0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0579");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue(10.0d);
        mutableDouble1.subtract((double) 0.0f);
        mutableDouble1.add(102.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
    }

    @Test
    public void MutableDouble0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0580");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) (byte) -1);
        boolean boolean8 = mutableDouble1.isInfinite();
        long long9 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void MutableDouble0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0581");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        mutableDouble1.decrement();
        mutableDouble1.add((double) 1.0f);
        boolean boolean5 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0582");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        java.lang.Double double2 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        java.lang.Class<?> wildcardClass4 = mutableDouble3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2.equals(52.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableDouble0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0583");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        java.lang.Double double3 = mutableDouble1.getValue();
        byte byte4 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void MutableDouble0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0584");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        long long5 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble1.add((double) (short) 1);
        java.lang.Double double9 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0d + "'", double9.equals(2.0d));
    }

    @Test
    public void MutableDouble0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0585");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        java.lang.String str2 = mutableDouble1.toString();
        int int3 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0.0" + "'", str2.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void MutableDouble0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0586");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (byte) -98);
    }

    @Test
    public void MutableDouble0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0587");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        float float6 = mutableDouble1.floatValue();
        double double7 = mutableDouble1.doubleValue();
        java.lang.Double double8 = mutableDouble1.toDouble();
        java.lang.String str9 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0.0" + "'", str9.equals("0.0"));
    }

    @Test
    public void MutableDouble0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0588");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        boolean boolean3 = mutableDouble1.isInfinite();
        float float4 = mutableDouble1.floatValue();
        java.lang.String str5 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2.0" + "'", str5.equals("2.0"));
    }

    @Test
    public void MutableDouble0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0589");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.toDouble();
        boolean boolean8 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0590");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        int int4 = mutableDouble1.intValue();
        mutableDouble1.add((double) ' ');
        java.lang.String str7 = mutableDouble1.toString();
        mutableDouble1.subtract((double) (short) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "33.0" + "'", str7.equals("33.0"));
    }

    @Test
    public void MutableDouble0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0591");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 99.0f);
        java.lang.String str2 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "99.0" + "'", str2.equals("99.0"));
    }

    @Test
    public void MutableDouble0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0592");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble3.increment();
        int int5 = mutableDouble3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void MutableDouble0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0593");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        java.lang.Double double3 = mutableDouble1.toDouble();
        mutableDouble1.increment();
        float float5 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void MutableDouble0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0594");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.setValue((-1.0d));
        java.lang.Class<?> wildcardClass7 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableDouble0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0595");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-1L));
        mutableDouble1.add((double) 1L);
        boolean boolean4 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 100);
        mutableDouble6.increment();
        mutableDouble1.setValue((java.lang.Number) mutableDouble6);
        mutableDouble6.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableDouble0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0596");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) 100);
        boolean boolean5 = mutableDouble1.isNaN();
        long long6 = mutableDouble1.longValue();
        double double7 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-99L) + "'", long6 == (-99L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-99.0d) + "'", double7 == (-99.0d));
    }

    @Test
    public void MutableDouble0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0597");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble3.decrement();
        mutableDouble3.subtract((double) (byte) 100);
        mutableDouble1.setValue((java.lang.Number) (byte) 100);
    }

    @Test
    public void MutableDouble0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0598");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        mutableDouble1.decrement();
        int int7 = mutableDouble1.intValue();
        double double8 = mutableDouble1.doubleValue();
        boolean boolean9 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0599");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0600");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.decrement();
        int int4 = mutableDouble0.intValue();
        double double5 = mutableDouble0.doubleValue();
        byte byte6 = mutableDouble0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 99.0d + "'", double5 == 99.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 99 + "'", byte6 == (byte) 99);
    }

    @Test
    public void MutableDouble0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0601");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.setValue((java.lang.Number) 1.0d);
        double double5 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void MutableDouble0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0602");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        boolean boolean4 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble("-10.0");
        boolean boolean7 = mutableDouble6.isNaN();
        boolean boolean8 = mutableDouble1.equals((java.lang.Object) boolean7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0603");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("100.0");
        long long2 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void MutableDouble0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0604");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        boolean boolean5 = mutableDouble0.equals((java.lang.Object) mutableDouble4);
        mutableDouble4.decrement();
        java.lang.Double double7 = mutableDouble4.getValue();
        long long8 = mutableDouble4.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void MutableDouble0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0605");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean4 = mutableDouble3.isInfinite();
        java.lang.Double double5 = mutableDouble3.toDouble();
        int int6 = mutableDouble1.compareTo(mutableDouble3);
        mutableDouble3.setValue((double) (-99.0f));
        mutableDouble3.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void MutableDouble0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0606");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) -49);
        boolean boolean2 = mutableDouble1.isNaN();
        java.lang.Class<?> wildcardClass3 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableDouble0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0607");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble1.decrement();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long5 = mutableDouble4.longValue();
        mutableDouble4.subtract((double) (byte) 0);
        boolean boolean8 = mutableDouble1.equals((java.lang.Object) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0608");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        java.lang.Double double6 = mutableDouble1.getValue();
        long long7 = mutableDouble1.longValue();
        boolean boolean8 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0609");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble1.decrement();
        mutableDouble1.setValue((-10.0d));
        mutableDouble1.setValue((java.lang.Number) (-99));
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
    }

    @Test
    public void MutableDouble0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0610");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble();
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) mutableDouble6);
        long long8 = mutableDouble6.longValue();
        short short9 = mutableDouble6.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void MutableDouble0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0611");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) -100);
        java.lang.Object obj2 = null;
        boolean boolean3 = mutableDouble1.equals(obj2);
        mutableDouble1.subtract((double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0612");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        int int5 = mutableDouble1.intValue();
        mutableDouble1.increment();
        java.lang.Double double7 = mutableDouble1.toDouble();
        double double8 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7.equals(2.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
    }

    @Test
    public void MutableDouble0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0613");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.add((java.lang.Number) mutableDouble4);
        byte byte6 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void MutableDouble0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0614");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) (byte) 100);
        short short5 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -99 + "'", short5 == (short) -99);
    }

    @Test
    public void MutableDouble0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0615");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean5 = mutableDouble4.isInfinite();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        java.lang.Double double7 = mutableDouble4.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void MutableDouble0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0616");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        long long5 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        long long7 = mutableDouble6.longValue();
        mutableDouble6.setValue((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void MutableDouble0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0617");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble4.decrement();
        mutableDouble4.setValue((-10.0d));
        int int8 = mutableDouble1.compareTo(mutableDouble4);
        float float9 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void MutableDouble0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0618");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((-99.0d));
        boolean boolean2 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0619");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 1);
        java.lang.Double double2 = mutableDouble1.toDouble();
        mutableDouble1.decrement();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2.equals(1.0d));
    }

    @Test
    public void MutableDouble0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0620");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        int int4 = mutableDouble1.intValue();
        mutableDouble1.setValue(10.0d);
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void MutableDouble0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0621");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        float float6 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        boolean boolean8 = mutableDouble1.isNaN();
        boolean boolean9 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0622");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        mutableDouble1.setValue(0.0d);
        byte byte6 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void MutableDouble0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0623");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble1.decrement();
        java.lang.String str9 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0.0" + "'", str9.equals("0.0"));
    }

    @Test
    public void MutableDouble0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0624");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        mutableDouble1.decrement();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long5 = mutableDouble4.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble();
        boolean boolean7 = mutableDouble4.equals((java.lang.Object) mutableDouble6);
        boolean boolean8 = mutableDouble1.equals((java.lang.Object) mutableDouble4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0625");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) 'a');
        java.lang.Double double7 = mutableDouble1.toDouble();
        java.lang.String str8 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-97.0d) + "'", double7.equals((-97.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-97.0" + "'", str8.equals("-97.0"));
    }

    @Test
    public void MutableDouble0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0626");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 100);
        mutableDouble1.increment();
        java.lang.Double double3 = mutableDouble1.toDouble();
        long long4 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 101.0d + "'", double3.equals(101.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 101L + "'", long4 == 101L);
    }

    @Test
    public void MutableDouble0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0627");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        boolean boolean3 = mutableDouble1.isNaN();
        boolean boolean4 = mutableDouble1.isInfinite();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableDouble0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0628");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("99.0");
        mutableDouble1.add((double) (short) 10);
    }

    @Test
    public void MutableDouble0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0629");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) 100);
        mutableDouble1.decrement();
        java.lang.String str8 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-100.0" + "'", str8.equals("-100.0"));
    }

    @Test
    public void MutableDouble0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0630");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        mutableDouble1.add((double) (-1.0f));
        boolean boolean6 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0631");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        mutableDouble1.increment();
        byte byte6 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void MutableDouble0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0632");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble7.subtract(92.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void MutableDouble0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0633");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 11);
    }

    @Test
    public void MutableDouble0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0634");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        boolean boolean5 = mutableDouble1.isNaN();
        mutableDouble1.increment();
        short short7 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 2 + "'", short7 == (short) 2);
    }

    @Test
    public void MutableDouble0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0635");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        boolean boolean4 = mutableDouble1.isNaN();
        java.lang.String str5 = mutableDouble1.toString();
        mutableDouble1.setValue((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0.0" + "'", str5.equals("0.0"));
    }

    @Test
    public void MutableDouble0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0636");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("-89.0");
        int int2 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-89) + "'", int2 == (-89));
    }

    @Test
    public void MutableDouble0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0637");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        boolean boolean5 = mutableDouble0.equals((java.lang.Object) mutableDouble4);
        short short6 = mutableDouble4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableDouble0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0638");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        float float6 = mutableDouble1.floatValue();
        int int7 = mutableDouble1.intValue();
        int int8 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble9 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void MutableDouble0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0639");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue(10.0d);
        mutableDouble1.setValue((-100.0d));
        java.lang.Double double8 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8.equals((-100.0d)));
    }

    @Test
    public void MutableDouble0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0640");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        long long7 = mutableDouble1.longValue();
        mutableDouble1.add((-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void MutableDouble0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0641");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        boolean boolean6 = mutableDouble1.isInfinite();
        java.lang.Double double7 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void MutableDouble0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0642");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble1.decrement();
        mutableDouble1.setValue((-10.0d));
        boolean boolean5 = mutableDouble1.isNaN();
        java.lang.String str6 = mutableDouble1.toString();
        double double7 = mutableDouble1.doubleValue();
        java.lang.Double double8 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-10.0" + "'", str6.equals("-10.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-10.0d) + "'", double7 == (-10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8.equals((-10.0d)));
    }

    @Test
    public void MutableDouble0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0643");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        float float4 = mutableDouble1.floatValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        java.lang.Double double6 = mutableDouble1.toDouble();
        short short7 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void MutableDouble0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0644");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.increment();
        mutableDouble1.add((-100.0d));
        boolean boolean8 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0645");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0L);
        int int2 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void MutableDouble0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0646");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.setValue((double) 2);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 2);
        float float6 = mutableDouble5.floatValue();
        double double7 = mutableDouble5.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7 == 2.0d);
    }

    @Test
    public void MutableDouble0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0647");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        mutableDouble1.increment();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) mutableDouble6);
        short short8 = mutableDouble6.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void MutableDouble0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0648");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((-100.0d));
        mutableDouble1.increment();
        boolean boolean3 = mutableDouble1.isNaN();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0649");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) 100);
        boolean boolean5 = mutableDouble1.isNaN();
        long long6 = mutableDouble1.longValue();
        java.lang.Double double7 = mutableDouble1.toDouble();
        int int8 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-99L) + "'", long6 == (-99L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-99.0d) + "'", double7.equals((-99.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-99) + "'", int8 == (-99));
    }

    @Test
    public void MutableDouble0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0650");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) 'a');
        java.lang.Double double7 = mutableDouble1.toDouble();
        boolean boolean8 = mutableDouble1.isNaN();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-97.0d) + "'", double7.equals((-97.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0651");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 99.0f);
        boolean boolean2 = mutableDouble1.isInfinite();
        long long3 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 99L + "'", long3 == 99L);
    }

    @Test
    public void MutableDouble0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0652");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble1.decrement();
        float float3 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 51.0f + "'", float3 == 51.0f);
    }

    @Test
    public void MutableDouble0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0653");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        java.lang.Double double2 = mutableDouble1.getValue();
        byte byte3 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void MutableDouble0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0654");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.add((java.lang.Number) (byte) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble(0.0d);
        mutableDouble4.setValue((double) '#');
        int int7 = mutableDouble0.compareTo(mutableDouble4);
        mutableDouble4.subtract((double) (-99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableDouble0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0655");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        mutableDouble1.increment();
        mutableDouble1.setValue((double) 1.0f);
        mutableDouble1.setValue((double) (byte) -100);
        byte byte7 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -100 + "'", byte7 == (byte) -100);
    }

    @Test
    public void MutableDouble0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0656");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean6 = mutableDouble5.isNaN();
        int int7 = mutableDouble1.compareTo(mutableDouble5);
        double double8 = mutableDouble5.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void MutableDouble0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0657");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long5 = mutableDouble4.longValue();
        int int6 = mutableDouble1.compareTo(mutableDouble4);
        int int7 = mutableDouble4.intValue();
        java.lang.Double double8 = mutableDouble4.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8.equals(1.0d));
    }

    @Test
    public void MutableDouble0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0658");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        java.lang.Double double4 = mutableDouble0.toDouble();
        mutableDouble0.subtract(10.0d);
        float float7 = mutableDouble0.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) float7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-110.0f) + "'", float7 == (-110.0f));
    }

    @Test
    public void MutableDouble0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0659");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        boolean boolean4 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableDouble0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0660");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        mutableDouble1.subtract((double) 0.0f);
        mutableDouble1.increment();
        float float9 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9 == 2.0f);
    }

    @Test
    public void MutableDouble0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0661");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 10);
        mutableDouble1.subtract((double) (byte) 0);
        mutableDouble1.increment();
    }

    @Test
    public void MutableDouble0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0662");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        boolean boolean3 = mutableDouble1.isNaN();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        boolean boolean6 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0663");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        java.lang.String str6 = mutableDouble1.toString();
        java.lang.Double double7 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0.0" + "'", str6.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void MutableDouble0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0664");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble1.decrement();
        mutableDouble1.setValue((-10.0d));
        boolean boolean5 = mutableDouble1.isNaN();
        java.lang.String str6 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (byte) -98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-10.0" + "'", str6.equals("-10.0"));
    }

    @Test
    public void MutableDouble0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0665");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) 100);
        mutableDouble1.decrement();
        mutableDouble1.increment();
        int int9 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
    }

    @Test
    public void MutableDouble0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0666");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        java.lang.Double double4 = mutableDouble0.toDouble();
        boolean boolean5 = mutableDouble0.isInfinite();
        double double6 = mutableDouble0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-100.0d) + "'", double6 == (-100.0d));
    }

    @Test
    public void MutableDouble0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0667");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean4 = mutableDouble3.isInfinite();
        java.lang.Double double5 = mutableDouble3.toDouble();
        int int6 = mutableDouble1.compareTo(mutableDouble3);
        long long7 = mutableDouble1.longValue();
        double double8 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void MutableDouble0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0668");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        mutableDouble1.subtract((double) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1);
        mutableDouble1.subtract((java.lang.Number) mutableDouble7);
        float float9 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void MutableDouble0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0669");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble("-1.0");
        int int6 = mutableDouble1.compareTo(mutableDouble5);
        long long7 = mutableDouble1.longValue();
        mutableDouble1.subtract((-100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void MutableDouble0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0670");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        java.lang.Double double6 = mutableDouble1.getValue();
        java.lang.Double double7 = mutableDouble1.toDouble();
        double double8 = mutableDouble1.doubleValue();
        boolean boolean9 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0671");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-99.0f));
        long long2 = mutableDouble1.longValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        boolean boolean4 = mutableDouble1.isInfinite();
        java.lang.Double double5 = mutableDouble1.getValue();
        mutableDouble1.subtract(102.0d);
        java.lang.Class<?> wildcardClass8 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99L) + "'", long2 == (-99L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-99.0d) + "'", double3.equals((-99.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-99.0d) + "'", double5.equals((-99.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0672");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        mutableDouble1.add((double) (-1));
        java.lang.Class<?> wildcardClass4 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableDouble0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0673");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        boolean boolean5 = mutableDouble1.isNaN();
        long long6 = mutableDouble1.longValue();
        boolean boolean7 = mutableDouble1.isInfinite();
        java.lang.String str8 = mutableDouble1.toString();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.0" + "'", str8.equals("1.0"));
    }

    @Test
    public void MutableDouble0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0674");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        mutableDouble1.decrement();
        float float7 = mutableDouble1.floatValue();
        mutableDouble1.add((double) 101.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void MutableDouble0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0675");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("2.0");
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((-10.0d));
        java.lang.String str5 = mutableDouble1.toString();
        short short6 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12.0" + "'", str5.equals("12.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 12 + "'", short6 == (short) 12);
    }

    @Test
    public void MutableDouble0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0676");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.setValue((double) 2);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 2);
        float float6 = mutableDouble5.floatValue();
        mutableDouble5.subtract((double) (byte) 2);
        java.lang.Double double9 = mutableDouble5.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9.equals(0.0d));
    }

    @Test
    public void MutableDouble0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0677");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.add((double) 99.0f);
        double double7 = mutableDouble1.doubleValue();
        long long8 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 99.0d + "'", double7 == 99.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 99L + "'", long8 == 99L);
    }

    @Test
    public void MutableDouble0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0678");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("-100.0");
    }

    @Test
    public void MutableDouble0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0679");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean4 = mutableDouble3.isInfinite();
        java.lang.Double double5 = mutableDouble3.toDouble();
        int int6 = mutableDouble1.compareTo(mutableDouble3);
        mutableDouble3.add((double) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void MutableDouble0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0680");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        java.lang.Double double4 = mutableDouble0.toDouble();
        mutableDouble0.subtract(10.0d);
        java.lang.String str7 = mutableDouble0.toString();
        short short8 = mutableDouble0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-110.0" + "'", str7.equals("-110.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -110 + "'", short8 == (short) -110);
    }

    @Test
    public void MutableDouble0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0681");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.increment();
        mutableDouble1.add((-100.0d));
        mutableDouble1.add((double) (byte) -99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void MutableDouble0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0682");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble1.add((double) 2L);
        boolean boolean4 = mutableDouble1.isNaN();
        java.lang.Double double5 = mutableDouble1.getValue();
        java.lang.Double double6 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 102.0d + "'", double5.equals(102.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 102.0d + "'", double6.equals(102.0d));
    }

    @Test
    public void MutableDouble0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0683");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        float float6 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        boolean boolean8 = mutableDouble7.isInfinite();
        byte byte9 = mutableDouble7.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void MutableDouble0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0684");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 2);
        boolean boolean2 = mutableDouble1.isNaN();
        mutableDouble1.subtract((double) 101);
        boolean boolean5 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0685");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        int int3 = mutableDouble1.intValue();
        java.lang.Double double4 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
    }

    @Test
    public void MutableDouble0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0686");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 92);
    }

    @Test
    public void MutableDouble0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0687");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 99.0f);
        float float2 = mutableDouble1.floatValue();
        byte byte3 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.0f + "'", float2 == 99.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 99 + "'", byte3 == (byte) 99);
    }

    @Test
    public void MutableDouble0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0688");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(0.0d);
        mutableDouble1.subtract((double) (-100));
    }

    @Test
    public void MutableDouble0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0689");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(10.0d);
        java.lang.Double double2 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2.equals(10.0d));
    }

    @Test
    public void MutableDouble0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0690");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(52.0d);
        java.lang.Double double2 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2.equals(52.0d));
    }

    @Test
    public void MutableDouble0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0691");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.setValue((java.lang.Number) 1.0d);
        long long5 = mutableDouble1.longValue();
        java.lang.String str6 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
    }

    @Test
    public void MutableDouble0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0692");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void MutableDouble0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0693");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble();
        boolean boolean4 = mutableDouble1.equals((java.lang.Object) mutableDouble3);
        mutableDouble1.subtract((java.lang.Number) 51.0d);
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableDouble0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0694");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        boolean boolean2 = mutableDouble1.isNaN();
        mutableDouble1.add((double) (-1L));
        mutableDouble1.increment();
        mutableDouble1.setValue((double) 93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0695");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.add((double) (byte) 10);
        double double8 = mutableDouble1.doubleValue();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void MutableDouble0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0696");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        long long3 = mutableDouble1.longValue();
        java.lang.Double double4 = mutableDouble1.getValue();
        long long5 = mutableDouble1.longValue();
        short short6 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableDouble0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0697");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (byte) 0);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble3.setValue((double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void MutableDouble0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0698");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (byte) 0);
        mutableDouble1.subtract((double) 1);
        mutableDouble1.setValue((double) (byte) 10);
    }

    @Test
    public void MutableDouble0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0699");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-1));
    }

    @Test
    public void MutableDouble0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0700");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.getValue();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void MutableDouble0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0701");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long5 = mutableDouble4.longValue();
        int int6 = mutableDouble1.compareTo(mutableDouble4);
        mutableDouble4.setValue((double) (byte) 100);
        float float9 = mutableDouble4.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void MutableDouble0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0702");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 2);
        boolean boolean2 = mutableDouble1.isNaN();
        java.lang.String str3 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2.0" + "'", str3.equals("2.0"));
    }

    @Test
    public void MutableDouble0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0703");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        double double4 = mutableDouble1.doubleValue();
        double double5 = mutableDouble1.doubleValue();
        long long6 = mutableDouble1.longValue();
        mutableDouble1.setValue((double) (short) 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void MutableDouble0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0704");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        boolean boolean3 = mutableDouble1.isInfinite();
        float float4 = mutableDouble1.floatValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        float float6 = mutableDouble1.floatValue();
        java.lang.Double double7 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5.equals(2.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7.equals(2.0d));
    }

    @Test
    public void MutableDouble0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0705");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        long long3 = mutableDouble1.longValue();
        mutableDouble1.setValue((double) 99);
        double double6 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 99.0d + "'", double6 == 99.0d);
    }

    @Test
    public void MutableDouble0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0706");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 0);
        long long2 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void MutableDouble0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0707");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.add((java.lang.Number) (byte) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble(0.0d);
        mutableDouble4.setValue((double) '#');
        int int7 = mutableDouble0.compareTo(mutableDouble4);
        mutableDouble0.increment();
        java.lang.Double double9 = mutableDouble0.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 101.0d + "'", double9.equals(101.0d));
    }

    @Test
    public void MutableDouble0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0708");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        java.lang.Double double4 = mutableDouble0.toDouble();
        boolean boolean5 = mutableDouble0.isInfinite();
        mutableDouble0.increment();
        java.lang.Double double7 = mutableDouble0.getValue();
        float float8 = mutableDouble0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-99.0d) + "'", double7.equals((-99.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-99.0f) + "'", float8 == (-99.0f));
    }

    @Test
    public void MutableDouble0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0709");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean4 = mutableDouble3.isInfinite();
        java.lang.Double double5 = mutableDouble3.toDouble();
        int int6 = mutableDouble1.compareTo(mutableDouble3);
        double double7 = mutableDouble1.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        java.lang.Double double9 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9.equals(100.0d));
    }

    @Test
    public void MutableDouble0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0710");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        int int4 = mutableDouble0.intValue();
        mutableDouble0.subtract((double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-100) + "'", int4 == (-100));
    }

    @Test
    public void MutableDouble0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0711");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        java.lang.String str2 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble(0.0d);
        mutableDouble1.add((java.lang.Number) mutableDouble4);
        float float6 = mutableDouble4.floatValue();
        mutableDouble4.add(0.0d);
        mutableDouble4.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableDouble0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0712");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) (byte) -1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        short short9 = mutableDouble8.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void MutableDouble0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0713");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 2);
        int int2 = mutableDouble1.intValue();
        java.lang.Double double3 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3.equals(2.0d));
    }

    @Test
    public void MutableDouble0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0714");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble1.decrement();
        long long9 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void MutableDouble0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0715");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 10.0f);
    }

    @Test
    public void MutableDouble0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0716");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.setValue((double) 2);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 2);
        float float6 = mutableDouble5.floatValue();
        mutableDouble5.subtract((double) (byte) 2);
        long long9 = mutableDouble5.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void MutableDouble0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0717");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean6 = mutableDouble5.isNaN();
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) mutableDouble5);
        java.lang.Double double8 = mutableDouble5.toDouble();
        java.lang.Double double9 = mutableDouble5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9.equals(0.0d));
    }

    @Test
    public void MutableDouble0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0718");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-1L));
        mutableDouble1.setValue((double) 100L);
    }

    @Test
    public void MutableDouble0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0719");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) (byte) 100);
        mutableDouble1.add((double) (byte) -98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void MutableDouble0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0720");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        mutableDouble4.add((-99.0d));
        double double8 = mutableDouble4.doubleValue();
        mutableDouble4.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-98.0d) + "'", double8 == (-98.0d));
    }

    @Test
    public void MutableDouble0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0721");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        boolean boolean6 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0722");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        mutableDouble1.decrement();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
    }

    @Test
    public void MutableDouble0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0723");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        java.lang.Double double2 = mutableDouble1.getValue();
        int int3 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void MutableDouble0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0724");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("100.0");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100L);
        mutableDouble1.setValue((java.lang.Number) mutableDouble3);
        java.lang.Number number5 = null;
        // The following exception was thrown during execution in MutableDouble generation
        try {
            mutableDouble1.add(number5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableDouble0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0725");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        mutableDouble1.setValue(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0726");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        long long4 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) 0);
        double double7 = mutableDouble1.doubleValue();
        java.lang.String str8 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0.0" + "'", str8.equals("0.0"));
    }

    @Test
    public void MutableDouble0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0727");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.add((java.lang.Number) (byte) 100);
        mutableDouble0.add((double) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 2);
        int int7 = mutableDouble6.intValue();
        mutableDouble0.subtract((java.lang.Number) mutableDouble6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void MutableDouble0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0728");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        mutableDouble1.setValue((double) (byte) 100);
        boolean boolean6 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0729");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble2.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble2.setValue((java.lang.Number) mutableDouble5);
        mutableDouble0.setValue((java.lang.Number) mutableDouble2);
        boolean boolean8 = mutableDouble0.isInfinite();
        double double9 = mutableDouble0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void MutableDouble0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0730");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble3);
        mutableDouble4.setValue(51.0d);
        int int7 = mutableDouble4.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 51 + "'", int7 == 51);
    }

    @Test
    public void MutableDouble0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0731");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) 100);
        mutableDouble1.decrement();
        java.lang.Double double8 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8.equals((-100.0d)));
    }

    @Test
    public void MutableDouble0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0732");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        boolean boolean6 = mutableDouble1.isInfinite();
        double double7 = mutableDouble1.doubleValue();
        byte byte8 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void MutableDouble0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0733");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 100);
        mutableDouble1.increment();
        java.lang.Double double3 = mutableDouble1.toDouble();
        short short4 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 101.0d + "'", double3.equals(101.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4 == (short) 101);
    }

    @Test
    public void MutableDouble0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0734");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        java.lang.Double double7 = mutableDouble1.getValue();
        int int8 = mutableDouble1.intValue();
        double double9 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void MutableDouble0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0735");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble0.add((java.lang.Number) 100.0d);
        mutableDouble0.add((double) (byte) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble0);
        short short8 = mutableDouble7.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
    }

    @Test
    public void MutableDouble0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0736");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((-100.0d));
        mutableDouble1.decrement();
        float float3 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-101.0f) + "'", float3 == (-101.0f));
    }

    @Test
    public void MutableDouble0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0737");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        int int6 = mutableDouble1.intValue();
        java.lang.Class<?> wildcardClass7 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableDouble0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0738");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1);
        mutableDouble1.decrement();
    }

    @Test
    public void MutableDouble0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0739");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean5 = mutableDouble4.isInfinite();
        int int6 = mutableDouble4.intValue();
        mutableDouble2.subtract((java.lang.Number) mutableDouble4);
        java.lang.Class<?> wildcardClass8 = mutableDouble4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0740");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-1L));
        mutableDouble1.setValue(101.0d);
        int int4 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void MutableDouble0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0741");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        boolean boolean5 = mutableDouble1.isNaN();
        long long6 = mutableDouble1.longValue();
        boolean boolean7 = mutableDouble1.isInfinite();
        mutableDouble1.subtract(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0742");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble();
        int int3 = mutableDouble1.compareTo(mutableDouble2);
        mutableDouble1.subtract((double) 99L);
        mutableDouble1.add(1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void MutableDouble0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0743");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        float float6 = mutableDouble1.floatValue();
        float float7 = mutableDouble1.floatValue();
        boolean boolean8 = mutableDouble1.isNaN();
        short short9 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void MutableDouble0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0744");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-99.0f));
        long long2 = mutableDouble1.longValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99L) + "'", long2 == (-99L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0745");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        long long4 = mutableDouble1.longValue();
        mutableDouble1.subtract(92.0d);
        long long7 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-92L) + "'", long7 == (-92L));
    }

    @Test
    public void MutableDouble0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0746");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        mutableDouble1.increment();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void MutableDouble0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0747");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float5 = mutableDouble4.floatValue();
        java.lang.String str6 = mutableDouble4.toString();
        boolean boolean7 = mutableDouble0.equals((java.lang.Object) mutableDouble4);
        java.lang.Class<?> wildcardClass8 = mutableDouble0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0748");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-89));
    }

    @Test
    public void MutableDouble0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0749");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((-1.0d));
        mutableDouble1.add((double) (byte) 2);
        int int7 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void MutableDouble0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0750");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("101.0");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((-100.0d));
        mutableDouble1.setValue((java.lang.Number) (-100.0d));
        short short5 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -100 + "'", short5 == (short) -100);
    }

    @Test
    public void MutableDouble0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0751");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("2.0");
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.setValue(101.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void MutableDouble0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0752");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        boolean boolean5 = mutableDouble0.equals((java.lang.Object) mutableDouble4);
        mutableDouble4.setValue((java.lang.Number) (byte) 10);
        java.lang.Double double8 = mutableDouble4.toDouble();
        short short9 = mutableDouble4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8.equals(10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
    }

    @Test
    public void MutableDouble0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0753");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.toDouble();
        mutableDouble1.increment();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void MutableDouble0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0754");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(52.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble3.decrement();
        mutableDouble3.setValue((-10.0d));
        int int7 = mutableDouble1.compareTo(mutableDouble3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableDouble0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0755");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        mutableDouble1.subtract((double) 0L);
        mutableDouble1.setValue((double) (short) 0);
        java.lang.Double double8 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
    }

    @Test
    public void MutableDouble0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0756");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("100.0");
        java.lang.Object obj2 = null;
        boolean boolean3 = mutableDouble1.equals(obj2);
        java.lang.Double double4 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4.equals(100.0d));
    }

    @Test
    public void MutableDouble0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0757");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        mutableDouble1.setValue((double) (-1.0f));
        short short4 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
    }

    @Test
    public void MutableDouble0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0758");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        java.lang.Double double3 = mutableDouble2.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) double3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3.equals(100.0d));
    }

    @Test
    public void MutableDouble0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0759");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-99L));
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 102);
        boolean boolean4 = mutableDouble1.equals((java.lang.Object) mutableDouble3);
        int int5 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-99) + "'", int5 == (-99));
    }

    @Test
    public void MutableDouble0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0760");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.subtract((java.lang.Number) 51.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
    }

    @Test
    public void MutableDouble0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0761");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.decrement();
        int int4 = mutableDouble0.intValue();
        java.lang.Double double5 = mutableDouble0.toDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-10.0d));
        mutableDouble0.add((java.lang.Number) (-10.0d));
        java.lang.Class<?> wildcardClass9 = mutableDouble0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 99.0d + "'", double5.equals(99.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableDouble0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0762");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (byte) 0);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.decrement();
        boolean boolean5 = mutableDouble1.equals((java.lang.Object) (-89));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0763");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isInfinite();
        boolean boolean8 = mutableDouble1.equals((java.lang.Object) (byte) 0);
        java.lang.Double double9 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9.equals(0.0d));
    }

    @Test
    public void MutableDouble0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0764");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) 100);
        mutableDouble1.setValue((double) 10);
        java.lang.Class<?> wildcardClass7 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableDouble0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0765");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        boolean boolean5 = mutableDouble1.equals((java.lang.Object) 1.0d);
        double double6 = mutableDouble1.doubleValue();
        boolean boolean7 = mutableDouble1.isInfinite();
        mutableDouble1.setValue((double) 51.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0766");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        java.lang.String str4 = mutableDouble1.toString();
        mutableDouble1.increment();
        java.lang.String str6 = mutableDouble1.toString();
        float float7 = mutableDouble1.floatValue();
        long long8 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void MutableDouble0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0767");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        float float6 = mutableDouble1.floatValue();
        float float7 = mutableDouble1.floatValue();
        boolean boolean8 = mutableDouble1.isNaN();
        int int9 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableDouble0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0768");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        mutableDouble0.increment();
        java.lang.Double double5 = mutableDouble0.toDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100L);
        mutableDouble0.add((java.lang.Number) 100L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble9 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-99.0d) + "'", double5.equals((-99.0d)));
    }

    @Test
    public void MutableDouble0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0769");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        float float6 = mutableDouble1.floatValue();
        int int7 = mutableDouble1.intValue();
        long long8 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void MutableDouble0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0770");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(0.0d);
        mutableDouble1.setValue((double) '#');
        java.lang.Class<?> wildcardClass4 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableDouble0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0771");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        mutableDouble1.setValue(0.0d);
        float float6 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableDouble0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0772");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 100);
        mutableDouble1.add((double) (short) 102);
        mutableDouble1.decrement();
        java.lang.Class<?> wildcardClass5 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableDouble0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0773");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        mutableDouble1.setValue((double) (-1.0f));
        java.lang.Double double4 = mutableDouble1.toDouble();
        java.lang.Double double5 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5.equals((-1.0d)));
    }

    @Test
    public void MutableDouble0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0774");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("2.0");
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((-10.0d));
        java.lang.String str5 = mutableDouble1.toString();
        java.lang.String str6 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12.0" + "'", str5.equals("12.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "12.0" + "'", str6.equals("12.0"));
    }

    @Test
    public void MutableDouble0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0775");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        java.lang.Double double4 = mutableDouble0.toDouble();
        mutableDouble0.subtract(2.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4.equals((-100.0d)));
    }

    @Test
    public void MutableDouble0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0776");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isInfinite();
        int int7 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableDouble0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0777");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        mutableDouble1.subtract((java.lang.Number) (byte) -100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
    }

    @Test
    public void MutableDouble0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0778");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        java.lang.Class<?> wildcardClass6 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableDouble0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0779");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 2);
        boolean boolean2 = mutableDouble1.isNaN();
        mutableDouble1.increment();
        double double4 = mutableDouble1.doubleValue();
        boolean boolean5 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 3.0d + "'", double4 == 3.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0780");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.decrement();
        boolean boolean4 = mutableDouble1.isInfinite();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableDouble0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0781");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(52.0d);
        java.lang.Double double2 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2.equals(52.0d));
    }

    @Test
    public void MutableDouble0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0782");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) 100);
        mutableDouble1.subtract((-1.0d));
        mutableDouble1.setValue((double) (short) 93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void MutableDouble0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0783");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        float float4 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void MutableDouble0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0784");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        java.lang.Double double2 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble1.setValue((double) 10L);
        mutableDouble1.add((double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2.equals(52.0d));
    }

    @Test
    public void MutableDouble0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0785");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        boolean boolean4 = mutableDouble1.isNaN();
        mutableDouble1.decrement();
        mutableDouble1.setValue((double) (-1));
        mutableDouble1.setValue((double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableDouble0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0786");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(3.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100.0f);
        double double4 = mutableDouble3.doubleValue();
        mutableDouble1.subtract((java.lang.Number) double4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void MutableDouble0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0787");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        java.lang.Double double7 = mutableDouble1.getValue();
        boolean boolean8 = mutableDouble1.isNaN();
        byte byte9 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void MutableDouble0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0788");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) -100);
        short short2 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -100 + "'", short2 == (short) -100);
    }

    @Test
    public void MutableDouble0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0789");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 10.0d);
        java.lang.String str2 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10.0" + "'", str2.equals("10.0"));
    }

    @Test
    public void MutableDouble0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0790");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        mutableDouble1.decrement();
        int int7 = mutableDouble1.intValue();
        boolean boolean8 = mutableDouble1.isNaN();
        java.lang.Double double9 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9.equals((-1.0d)));
    }

    @Test
    public void MutableDouble0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0791");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void MutableDouble0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0792");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble1.add((double) 2L);
        mutableDouble1.subtract((double) (byte) 10);
        java.lang.Double double6 = mutableDouble1.toDouble();
        java.lang.String str7 = mutableDouble1.toString();
        int int8 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 92.0d + "'", double6.equals(92.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "92.0" + "'", str7.equals("92.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 92 + "'", int8 == 92);
    }

    @Test
    public void MutableDouble0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0793");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.add((double) 100.0f);
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void MutableDouble0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0794");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.decrement();
        java.lang.Double double2 = mutableDouble0.toDouble();
        mutableDouble0.subtract((double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2.equals((-1.0d)));
    }

    @Test
    public void MutableDouble0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0795");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((-98.0d));
        java.lang.String str2 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-98.0" + "'", str2.equals("-98.0"));
    }

    @Test
    public void MutableDouble0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0796");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        java.lang.Double double3 = mutableDouble1.getValue();
        float float4 = mutableDouble1.floatValue();
        long long5 = mutableDouble1.longValue();
        short short6 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableDouble0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0797");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        long long3 = mutableDouble1.longValue();
        short short4 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void MutableDouble0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0798");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        long long4 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double7 = mutableDouble6.doubleValue();
        mutableDouble1.subtract((java.lang.Number) mutableDouble6);
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void MutableDouble0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0799");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((-1.0d));
        mutableDouble1.add((double) (byte) 2);
        mutableDouble1.increment();
        byte byte8 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 5 + "'", byte8 == (byte) 5);
    }

    @Test
    public void MutableDouble0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0800");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble4.subtract((java.lang.Number) 0);
        java.lang.String str7 = mutableDouble4.toString();
        mutableDouble1.subtract((java.lang.Number) mutableDouble4);
        boolean boolean9 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0.0" + "'", str7.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0801");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        boolean boolean3 = mutableDouble1.isNaN();
        boolean boolean4 = mutableDouble1.isInfinite();
        mutableDouble1.add((-10.0d));
        java.lang.Double double7 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7.equals(90.0d));
    }

    @Test
    public void MutableDouble0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0802");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) -50);
    }

    @Test
    public void MutableDouble0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0803");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        float float6 = mutableDouble1.floatValue();
        int int7 = mutableDouble1.intValue();
        int int8 = mutableDouble1.intValue();
        java.lang.Double double9 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9.equals(0.0d));
    }

    @Test
    public void MutableDouble0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0804");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        float float6 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        boolean boolean8 = mutableDouble7.isInfinite();
        short short9 = mutableDouble7.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void MutableDouble0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0805");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        mutableDouble1.increment();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void MutableDouble0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0806");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble1.add((double) 2L);
        mutableDouble1.subtract((double) (byte) 10);
        java.lang.Double double6 = mutableDouble1.toDouble();
        java.lang.String str7 = mutableDouble1.toString();
        float float8 = mutableDouble1.floatValue();
        short short9 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 92.0d + "'", double6.equals(92.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "92.0" + "'", str7.equals("92.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 92.0f + "'", float8 == 92.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 92 + "'", short9 == (short) 92);
    }

    @Test
    public void MutableDouble0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0807");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-1L));
        mutableDouble5.setValue(101.0d);
        boolean boolean8 = mutableDouble1.equals((java.lang.Object) 101.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0808");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
    }

    @Test
    public void MutableDouble0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0809");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean4 = mutableDouble3.isInfinite();
        java.lang.Double double5 = mutableDouble3.toDouble();
        int int6 = mutableDouble1.compareTo(mutableDouble3);
        double double7 = mutableDouble1.doubleValue();
        mutableDouble1.decrement();
        byte byte9 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 99 + "'", byte9 == (byte) 99);
    }

    @Test
    public void MutableDouble0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0810");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        float float4 = mutableDouble1.floatValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        int int6 = mutableDouble1.intValue();
        mutableDouble1.add((double) 101.0f);
        long long9 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 101L + "'", long9 == 101L);
    }

    @Test
    public void MutableDouble0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0811");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean5 = mutableDouble4.isInfinite();
        int int6 = mutableDouble4.intValue();
        mutableDouble2.subtract((java.lang.Number) mutableDouble4);
        short short8 = mutableDouble2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void MutableDouble0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0812");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        double double6 = mutableDouble4.doubleValue();
        mutableDouble4.increment();
        mutableDouble4.decrement();
        mutableDouble4.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void MutableDouble0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0813");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("99.0");
        mutableDouble1.add((double) (byte) -1);
        mutableDouble1.setValue((double) 99);
        mutableDouble1.decrement();
    }

    @Test
    public void MutableDouble0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0814");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract(100.0d);
        java.lang.Double double7 = mutableDouble1.toDouble();
        mutableDouble1.setValue((java.lang.Number) (short) 93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-100.0d) + "'", double7.equals((-100.0d)));
    }

    @Test
    public void MutableDouble0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0815");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.increment();
        mutableDouble1.decrement();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean7 = mutableDouble6.isNaN();
        mutableDouble6.decrement();
        mutableDouble1.subtract((java.lang.Number) mutableDouble6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0816");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble2.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble2.setValue((java.lang.Number) mutableDouble5);
        mutableDouble0.setValue((java.lang.Number) mutableDouble2);
        java.lang.Double double8 = mutableDouble0.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble9 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) double8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
    }

    @Test
    public void MutableDouble0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0817");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        int int4 = mutableDouble1.intValue();
        mutableDouble1.decrement();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void MutableDouble0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0818");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        mutableDouble0.increment();
        java.lang.Double double5 = mutableDouble0.toDouble();
        java.lang.Double double6 = mutableDouble0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-99.0d) + "'", double5.equals((-99.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-99.0d) + "'", double6.equals((-99.0d)));
    }

    @Test
    public void MutableDouble0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0819");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        boolean boolean3 = mutableDouble1.isNaN();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble(1.0d);
        mutableDouble1.subtract((java.lang.Number) 1.0d);
        short short9 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 99 + "'", short9 == (short) 99);
    }

    @Test
    public void MutableDouble0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0820");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        int int6 = mutableDouble4.intValue();
        long long7 = mutableDouble4.longValue();
        int int8 = mutableDouble4.intValue();
        java.lang.Class<?> wildcardClass9 = mutableDouble4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableDouble0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0821");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        boolean boolean6 = mutableDouble1.isInfinite();
        boolean boolean7 = mutableDouble1.isInfinite();
        short short8 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void MutableDouble0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0822");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) 100);
        float float7 = mutableDouble1.floatValue();
        java.lang.Double double8 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-99.0f) + "'", float7 == (-99.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-99.0d) + "'", double8.equals((-99.0d)));
    }

    @Test
    public void MutableDouble0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0823");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        boolean boolean5 = mutableDouble0.equals((java.lang.Object) mutableDouble4);
        mutableDouble0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0824");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long5 = mutableDouble4.longValue();
        int int6 = mutableDouble1.compareTo(mutableDouble4);
        long long7 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void MutableDouble0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0825");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble();
        int int3 = mutableDouble1.compareTo(mutableDouble2);
        float float4 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) float4);
        mutableDouble5.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void MutableDouble0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0826");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        java.lang.String str4 = mutableDouble1.toString();
        mutableDouble1.increment();
        java.lang.String str6 = mutableDouble1.toString();
        java.lang.Double double7 = mutableDouble1.toDouble();
        float float8 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void MutableDouble0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0827");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        long long5 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        java.lang.Double double7 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
    }

    @Test
    public void MutableDouble0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0828");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 51.0f);
    }

    @Test
    public void MutableDouble0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0829");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.increment();
        mutableDouble1.add((-100.0d));
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void MutableDouble0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0830");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 101.0f);
        java.lang.Double double2 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 101.0d + "'", double2.equals(101.0d));
    }

    @Test
    public void MutableDouble0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0831");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        boolean boolean4 = mutableDouble1.isNaN();
        int int5 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void MutableDouble0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0832");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        float float4 = mutableDouble1.floatValue();
        mutableDouble1.add((-100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void MutableDouble0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0833");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.setValue((java.lang.Number) (short) 100);
        mutableDouble1.decrement();
        boolean boolean6 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0834");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-100));
        java.lang.Class<?> wildcardClass2 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableDouble0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0835");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 101.0f);
    }

    @Test
    public void MutableDouble0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0836");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        int int6 = mutableDouble4.intValue();
        long long7 = mutableDouble4.longValue();
        int int8 = mutableDouble4.intValue();
        mutableDouble4.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void MutableDouble0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0837");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean5 = mutableDouble4.isInfinite();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        mutableDouble1.setValue((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0838");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("12.0");
        java.lang.Class<?> wildcardClass2 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableDouble0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0839");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        java.lang.String str4 = mutableDouble1.toString();
        int int5 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void MutableDouble0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0840");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100);
        int int2 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) -49);
        mutableDouble1.setValue((java.lang.Number) (short) -49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void MutableDouble0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0841");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        java.lang.Double double6 = mutableDouble1.getValue();
        java.lang.Double double7 = mutableDouble1.toDouble();
        int int8 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void MutableDouble0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0842");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (byte) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (byte) 0);
        java.lang.String str3 = mutableDouble2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0.0" + "'", str3.equals("0.0"));
    }

    @Test
    public void MutableDouble0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0843");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.getValue();
        mutableDouble1.subtract((double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void MutableDouble0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0844");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long5 = mutableDouble4.longValue();
        int int6 = mutableDouble1.compareTo(mutableDouble4);
        mutableDouble1.increment();
        java.lang.Double double8 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 101.0d + "'", double8.equals(101.0d));
    }

    @Test
    public void MutableDouble0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0845");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        float float4 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void MutableDouble0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0846");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean6 = mutableDouble5.isNaN();
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) mutableDouble5);
        short short8 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void MutableDouble0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0847");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        mutableDouble0.increment();
        java.lang.Double double5 = mutableDouble0.toDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100L);
        mutableDouble0.add((java.lang.Number) 100L);
        java.lang.String str9 = mutableDouble0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-99.0d) + "'", double5.equals((-99.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1.0" + "'", str9.equals("1.0"));
    }

    @Test
    public void MutableDouble0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0848");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        java.lang.Double double4 = mutableDouble0.toDouble();
        boolean boolean5 = mutableDouble0.isInfinite();
        mutableDouble0.add((-98.0d));
        mutableDouble0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0849");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        boolean boolean3 = mutableDouble1.isInfinite();
        java.lang.Class<?> wildcardClass4 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableDouble0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0850");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        java.lang.Double double3 = mutableDouble1.toDouble();
        boolean boolean4 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableDouble0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0851");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) -100);
        java.lang.Object obj2 = null;
        boolean boolean3 = mutableDouble1.equals(obj2);
        java.lang.Double double4 = mutableDouble1.toDouble();
        mutableDouble1.add(2.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4.equals((-100.0d)));
    }

    @Test
    public void MutableDouble0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0852");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (byte) 0);
        mutableDouble1.subtract((double) 1);
        long long4 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void MutableDouble0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0853");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("2.0");
        float float2 = mutableDouble1.floatValue();
        int int3 = mutableDouble1.intValue();
        short short4 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 2 + "'", short4 == (short) 2);
    }

    @Test
    public void MutableDouble0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0854");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble("-1.0");
        int int6 = mutableDouble1.compareTo(mutableDouble5);
        long long7 = mutableDouble5.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void MutableDouble0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0855");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 2);
        boolean boolean2 = mutableDouble1.isNaN();
        mutableDouble1.subtract((double) 101);
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0856");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        java.lang.Double double2 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2.equals(0.0d));
    }

    @Test
    public void MutableDouble0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0857");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        float float2 = mutableDouble1.floatValue();
        double double3 = mutableDouble1.doubleValue();
        mutableDouble1.add((double) (short) 100);
        short short6 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
    }

    @Test
    public void MutableDouble0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0858");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        boolean boolean6 = mutableDouble1.isInfinite();
        double double7 = mutableDouble1.doubleValue();
        float float8 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void MutableDouble0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0859");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        boolean boolean5 = mutableDouble1.isNaN();
        mutableDouble1.increment();
        double double7 = mutableDouble1.doubleValue();
        mutableDouble1.add((double) (short) 93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7 == 2.0d);
    }

    @Test
    public void MutableDouble0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0860");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        boolean boolean6 = mutableDouble1.isNaN();
        boolean boolean7 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0861");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        float float6 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        boolean boolean8 = mutableDouble1.isNaN();
        java.lang.Double double9 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9.equals(0.0d));
    }

    @Test
    public void MutableDouble0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0862");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("100.0");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100L);
        mutableDouble1.setValue((java.lang.Number) mutableDouble3);
        java.lang.Double double5 = mutableDouble3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5.equals(100.0d));
    }

    @Test
    public void MutableDouble0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0863");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.add((double) 99.0f);
        boolean boolean7 = mutableDouble1.isNaN();
        java.lang.Class<?> wildcardClass8 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0864");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 2);
        boolean boolean2 = mutableDouble1.isNaN();
        byte byte3 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 2 + "'", byte3 == (byte) 2);
    }

    @Test
    public void MutableDouble0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0865");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) 100);
        mutableDouble1.increment();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        boolean boolean7 = mutableDouble6.isInfinite();
        mutableDouble6.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0866");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.setValue((java.lang.Number) 1.0d);
        mutableDouble1.add((double) (short) 0);
        java.lang.Double double7 = mutableDouble1.getValue();
        boolean boolean8 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0867");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        float float6 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableDouble0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0868");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble();
        int int3 = mutableDouble1.compareTo(mutableDouble2);
        float float4 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-99.0f));
        mutableDouble1.setValue((java.lang.Number) (-99.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void MutableDouble0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0869");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 100);
        mutableDouble1.increment();
        java.lang.Double double3 = mutableDouble1.toDouble();
        mutableDouble1.setValue(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 101.0d + "'", double3.equals(101.0d));
    }

    @Test
    public void MutableDouble0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0870");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.setValue((double) 2);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 2);
        float float6 = mutableDouble5.floatValue();
        float float7 = mutableDouble5.floatValue();
        short short8 = mutableDouble5.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 2 + "'", short8 == (short) 2);
    }

    @Test
    public void MutableDouble0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0871");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 99);
    }

    @Test
    public void MutableDouble0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0872");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        java.lang.String str4 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        int int8 = mutableDouble1.compareTo(mutableDouble7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableDouble0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0873");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        boolean boolean4 = mutableDouble1.isNaN();
        mutableDouble1.decrement();
        mutableDouble1.setValue((double) (-1));
        mutableDouble1.subtract((double) 99L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableDouble0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0874");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(1.0d);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        mutableDouble1.subtract((double) (short) -99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0875");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        boolean boolean4 = mutableDouble1.isNaN();
        java.lang.String str5 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2.0" + "'", str5.equals("2.0"));
    }

    @Test
    public void MutableDouble0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0876");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 3.0f);
    }

    @Test
    public void MutableDouble0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0877");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.setValue((java.lang.Number) 1.0d);
        mutableDouble1.add((double) (short) 0);
        long long7 = mutableDouble1.longValue();
        mutableDouble1.increment();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void MutableDouble0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0878");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        java.lang.Double double3 = mutableDouble1.toDouble();
        float float4 = mutableDouble1.floatValue();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void MutableDouble0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0879");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((-10.0d));
        java.lang.Double double2 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-10.0d) + "'", double2.equals((-10.0d)));
    }

    @Test
    public void MutableDouble0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0880");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        float float6 = mutableDouble1.floatValue();
        mutableDouble1.add((-1.0d));
        short short9 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void MutableDouble0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0881");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.setValue((double) 2);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 2);
        float float6 = mutableDouble5.floatValue();
        float float7 = mutableDouble5.floatValue();
        float float8 = mutableDouble5.floatValue();
        java.lang.Double double9 = mutableDouble5.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0d + "'", double9.equals(2.0d));
    }

    @Test
    public void MutableDouble0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0882");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.setValue((double) 2);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 2);
        float float6 = mutableDouble5.floatValue();
        mutableDouble5.subtract((double) (byte) 2);
        short short9 = mutableDouble5.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void MutableDouble0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0883");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble1.add((double) 2L);
        mutableDouble1.subtract((double) (byte) 10);
        boolean boolean6 = mutableDouble1.isInfinite();
        mutableDouble1.increment();
        mutableDouble1.add(3.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0884");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(1.0d);
        mutableDouble1.decrement();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble3.increment();
    }

    @Test
    public void MutableDouble0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0885");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) 100);
        boolean boolean5 = mutableDouble1.isNaN();
        long long6 = mutableDouble1.longValue();
        mutableDouble1.subtract(150.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-99L) + "'", long6 == (-99L));
    }

    @Test
    public void MutableDouble0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0886");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        boolean boolean3 = mutableDouble1.isInfinite();
        float float4 = mutableDouble1.floatValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        mutableDouble1.subtract(3.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5.equals(2.0d));
    }

    @Test
    public void MutableDouble0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0887");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 101L);
    }

    @Test
    public void MutableDouble0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0888");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("-10.0");
        boolean boolean2 = mutableDouble1.isNaN();
        long long3 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10L) + "'", long3 == (-10L));
    }

    @Test
    public void MutableDouble0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0889");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        int int4 = mutableDouble1.intValue();
        long long5 = mutableDouble1.longValue();
        mutableDouble1.add(92.0d);
        mutableDouble1.decrement();
        java.lang.Double double9 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 92.0d + "'", double9.equals(92.0d));
    }

    @Test
    public void MutableDouble0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0890");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1);
        short short2 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void MutableDouble0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0891");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        boolean boolean5 = mutableDouble1.isNaN();
        mutableDouble1.increment();
        mutableDouble1.add((java.lang.Number) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0892");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        java.lang.Double double2 = mutableDouble1.toDouble();
        int int3 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void MutableDouble0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0893");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100);
        java.lang.String str2 = mutableDouble1.toString();
        double double3 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void MutableDouble0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0894");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble();
        boolean boolean4 = mutableDouble1.equals((java.lang.Object) mutableDouble3);
        mutableDouble1.subtract((-99.0d));
        mutableDouble1.subtract(100.0d);
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableDouble0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0895");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((-100.0d));
        mutableDouble1.increment();
        double double3 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-99.0d) + "'", double3 == (-99.0d));
    }

    @Test
    public void MutableDouble0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0896");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble();
        int int3 = mutableDouble1.compareTo(mutableDouble2);
        float float4 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float7 = mutableDouble6.floatValue();
        mutableDouble1.add((java.lang.Number) float7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void MutableDouble0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0897");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        java.lang.Double double4 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4.equals(1.0d));
    }

    @Test
    public void MutableDouble0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0898");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-1L));
        boolean boolean2 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0899");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        float float5 = mutableDouble1.floatValue();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void MutableDouble0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0900");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("150.0");
    }

    @Test
    public void MutableDouble0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0901");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        mutableDouble1.increment();
        double double6 = mutableDouble1.doubleValue();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
    }

    @Test
    public void MutableDouble0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0902");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        boolean boolean3 = mutableDouble1.isNaN();
        boolean boolean4 = mutableDouble1.isInfinite();
        short short5 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
    }

    @Test
    public void MutableDouble0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0903");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble2.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble2.setValue((java.lang.Number) mutableDouble5);
        mutableDouble0.setValue((java.lang.Number) mutableDouble2);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble2);
        short short9 = mutableDouble8.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void MutableDouble0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0904");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        int int4 = mutableDouble1.intValue();
        long long5 = mutableDouble1.longValue();
        java.lang.String str6 = mutableDouble1.toString();
        int int7 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableDouble0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0905");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        mutableDouble1.increment();
        int int4 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble1.add((java.lang.Number) mutableDouble7);
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void MutableDouble0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0906");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-1L));
        float float2 = mutableDouble1.floatValue();
        float float3 = mutableDouble1.floatValue();
        boolean boolean4 = mutableDouble1.isInfinite();
        java.lang.Double double5 = mutableDouble1.getValue();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5.equals((-1.0d)));
    }

    @Test
    public void MutableDouble0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0907");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float5 = mutableDouble4.floatValue();
        mutableDouble4.subtract((-1.0d));
        int int8 = mutableDouble1.compareTo(mutableDouble4);
        byte byte9 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void MutableDouble0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0908");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        double double6 = mutableDouble4.doubleValue();
        byte byte7 = mutableDouble4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void MutableDouble0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0909");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        mutableDouble1.add(10.0d);
        float float9 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void MutableDouble0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0910");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        java.lang.String str4 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        boolean boolean7 = mutableDouble6.isNaN();
        mutableDouble1.add((java.lang.Number) mutableDouble6);
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0911");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        mutableDouble1.setValue((double) (-1.0f));
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean6 = mutableDouble5.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble5);
        java.lang.Double double8 = mutableDouble5.toDouble();
        boolean boolean9 = mutableDouble1.equals((java.lang.Object) mutableDouble5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0912");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-1L));
        mutableDouble1.subtract((java.lang.Number) (-1L));
        boolean boolean6 = mutableDouble1.isInfinite();
        java.lang.Double double7 = mutableDouble1.getValue();
        java.lang.Class<?> wildcardClass8 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7.equals(2.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0913");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) -110);
        float float2 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-110.0f) + "'", float2 == (-110.0f));
    }

    @Test
    public void MutableDouble0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0914");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) 100);
        boolean boolean5 = mutableDouble1.isNaN();
        long long6 = mutableDouble1.longValue();
        java.lang.Double double7 = mutableDouble1.toDouble();
        float float8 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-99L) + "'", long6 == (-99L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-99.0d) + "'", double7.equals((-99.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-99.0f) + "'", float8 == (-99.0f));
    }

    @Test
    public void MutableDouble0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0915");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        double double6 = mutableDouble4.doubleValue();
        boolean boolean7 = mutableDouble4.isInfinite();
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in MutableDouble generation
        try {
            mutableDouble4.setValue(number8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0916");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean4 = mutableDouble3.isInfinite();
        java.lang.Double double5 = mutableDouble3.toDouble();
        int int6 = mutableDouble1.compareTo(mutableDouble3);
        mutableDouble1.add(10.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble9 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void MutableDouble0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0917");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble1.add((double) 2L);
        mutableDouble1.subtract((double) (byte) 10);
        java.lang.Double double6 = mutableDouble1.toDouble();
        int int7 = mutableDouble1.intValue();
        boolean boolean8 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 92.0d + "'", double6.equals(92.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 92 + "'", int7 == 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0918");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        int int5 = mutableDouble1.intValue();
        mutableDouble1.increment();
        java.lang.Double double7 = mutableDouble1.toDouble();
        boolean boolean8 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble9 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7.equals(2.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0919");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        boolean boolean4 = mutableDouble3.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableDouble0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0920");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        mutableDouble1.setValue((double) (byte) 100);
        java.lang.String str6 = mutableDouble1.toString();
        boolean boolean7 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "100.0" + "'", str6.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0921");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        mutableDouble1.add(0.0d);
        java.lang.Double double8 = mutableDouble1.getValue();
        java.lang.Double double9 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9.equals(1.0d));
    }

    @Test
    public void MutableDouble0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0922");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        long long3 = mutableDouble1.longValue();
        mutableDouble1.decrement();
        mutableDouble1.subtract((double) (short) 99);
        int int7 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-100) + "'", int7 == (-100));
    }

    @Test
    public void MutableDouble0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0923");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-1L));
        mutableDouble1.add((double) 1L);
        boolean boolean4 = mutableDouble1.isNaN();
        java.lang.Double double5 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
    }

    @Test
    public void MutableDouble0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0924");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        double double4 = mutableDouble1.doubleValue();
        int int5 = mutableDouble1.intValue();
        float float6 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
    }

    @Test
    public void MutableDouble0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0925");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        short short5 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void MutableDouble0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0926");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble();
        boolean boolean4 = mutableDouble1.equals((java.lang.Object) mutableDouble3);
        mutableDouble1.subtract((-99.0d));
        mutableDouble1.setValue((double) (short) 2);
        long long9 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2L + "'", long9 == 2L);
    }

    @Test
    public void MutableDouble0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0927");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        mutableDouble1.decrement();
        double double3 = mutableDouble1.doubleValue();
        int int4 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 99.0d + "'", double3 == 99.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
    }

    @Test
    public void MutableDouble0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0928");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble3);
        boolean boolean5 = mutableDouble4.isNaN();
        int int6 = mutableDouble4.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void MutableDouble0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0929");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue(10.0d);
        mutableDouble1.setValue((-100.0d));
        mutableDouble1.increment();
        short short9 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -99 + "'", short9 == (short) -99);
    }

    @Test
    public void MutableDouble0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0930");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        mutableDouble1.increment();
        java.lang.Double double6 = mutableDouble1.toDouble();
        boolean boolean7 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6.equals(2.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0931");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) -49);
    }

    @Test
    public void MutableDouble0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0932");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((-100.0d));
        mutableDouble1.increment();
        boolean boolean3 = mutableDouble1.isNaN();
        boolean boolean4 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableDouble0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0933");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(51.0d);
    }

    @Test
    public void MutableDouble0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0934");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        mutableDouble1.increment();
        mutableDouble1.setValue((double) 1.0f);
        mutableDouble1.setValue(35.0d);
    }

    @Test
    public void MutableDouble0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0935");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) (byte) -1);
        boolean boolean8 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble9 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0936");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble2.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble2.setValue((java.lang.Number) mutableDouble5);
        mutableDouble0.setValue((java.lang.Number) mutableDouble2);
        java.lang.String str8 = mutableDouble2.toString();
        int int9 = mutableDouble2.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0.0" + "'", str8.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableDouble0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0937");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble3.increment();
        java.lang.Class<?> wildcardClass5 = mutableDouble3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableDouble0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0938");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double5 = mutableDouble4.doubleValue();
        java.lang.Double double6 = mutableDouble4.getValue();
        mutableDouble1.subtract((java.lang.Number) mutableDouble4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
    }

    @Test
    public void MutableDouble0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0939");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        java.lang.Double double2 = mutableDouble1.toDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble("92.0");
        mutableDouble1.subtract((java.lang.Number) mutableDouble4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2.equals(0.0d));
    }

    @Test
    public void MutableDouble0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0940");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        byte byte6 = mutableDouble5.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void MutableDouble0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0941");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("10.0");
    }

    @Test
    public void MutableDouble0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0942");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100);
        java.lang.String str2 = mutableDouble1.toString();
        boolean boolean3 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0943");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("92.0");
        boolean boolean2 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0944");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        boolean boolean6 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0945");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        int int6 = mutableDouble4.intValue();
        boolean boolean7 = mutableDouble4.isNaN();
        mutableDouble4.increment();
        boolean boolean9 = mutableDouble4.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0946");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        float float4 = mutableDouble1.floatValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        mutableDouble1.increment();
        float float7 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void MutableDouble0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0947");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        boolean boolean5 = mutableDouble1.isNaN();
        double double6 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void MutableDouble0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0948");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        java.lang.String str4 = mutableDouble1.toString();
        mutableDouble1.increment();
        java.lang.String str6 = mutableDouble1.toString();
        mutableDouble1.setValue((double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
    }

    @Test
    public void MutableDouble0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0949");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        boolean boolean6 = mutableDouble1.isNaN();
        java.lang.Double double7 = mutableDouble1.getValue();
        float float8 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void MutableDouble0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0950");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble2.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble2.setValue((java.lang.Number) mutableDouble5);
        mutableDouble0.setValue((java.lang.Number) mutableDouble2);
        java.lang.Double double8 = mutableDouble0.toDouble();
        int int9 = mutableDouble0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableDouble0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0951");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.setValue((double) 2);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 2);
        float float6 = mutableDouble5.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) float6);
        boolean boolean8 = mutableDouble7.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0952");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 2);
        int int6 = mutableDouble5.intValue();
        mutableDouble1.subtract((java.lang.Number) mutableDouble5);
        mutableDouble5.add((java.lang.Number) 34.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void MutableDouble0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0953");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.add((double) (byte) 10);
        java.lang.Class<?> wildcardClass8 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0954");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        float float6 = mutableDouble1.floatValue();
        mutableDouble1.decrement();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableDouble0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0955");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean4 = mutableDouble3.isInfinite();
        java.lang.Double double5 = mutableDouble3.toDouble();
        int int6 = mutableDouble1.compareTo(mutableDouble3);
        mutableDouble3.add((-10.0d));
        double double9 = mutableDouble3.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-10.0d) + "'", double9 == (-10.0d));
    }

    @Test
    public void MutableDouble0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0956");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        long long4 = mutableDouble1.longValue();
        java.lang.Class<?> wildcardClass5 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableDouble0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0957");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-92L));
    }

    @Test
    public void MutableDouble0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0958");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        mutableDouble1.add((double) (-1));
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-1));
        double double5 = mutableDouble4.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void MutableDouble0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0959");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        double double3 = mutableDouble1.doubleValue();
        long long4 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void MutableDouble0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0960");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0f);
        float float2 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void MutableDouble0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0961");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) -100);
        java.lang.Double double2 = mutableDouble1.toDouble();
        mutableDouble1.add((double) (-92L));
        java.lang.Double double5 = mutableDouble1.getValue();
        mutableDouble1.add((double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-192.0d) + "'", double5.equals((-192.0d)));
    }

    @Test
    public void MutableDouble0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0962");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.add((java.lang.Number) mutableDouble4);
        java.lang.Double double6 = mutableDouble1.toDouble();
        short short7 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void MutableDouble0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0963");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) 100);
        mutableDouble1.setValue((double) 10);
        byte byte7 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void MutableDouble0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0964");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        boolean boolean2 = mutableDouble1.isNaN();
        mutableDouble1.increment();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble1.subtract((double) 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0965");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        float float6 = mutableDouble1.floatValue();
        java.lang.Double double7 = mutableDouble1.getValue();
        mutableDouble1.add((java.lang.Number) (short) -97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
    }

    @Test
    public void MutableDouble0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0966");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 10L);
        byte byte2 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void MutableDouble0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0967");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(1.0d);
        mutableDouble1.decrement();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((double) ' ');
        boolean boolean6 = mutableDouble3.equals((java.lang.Object) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0968");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        boolean boolean5 = mutableDouble1.equals((java.lang.Object) 1.0d);
        mutableDouble1.decrement();
        boolean boolean7 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0969");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.setValue((java.lang.Number) 1.0d);
        long long5 = mutableDouble1.longValue();
        float float6 = mutableDouble1.floatValue();
        float float7 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) float7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void MutableDouble0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0970");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        boolean boolean6 = mutableDouble1.isInfinite();
        boolean boolean7 = mutableDouble1.isInfinite();
        int int8 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void MutableDouble0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0971");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        float float6 = mutableDouble1.floatValue();
        float float7 = mutableDouble1.floatValue();
        mutableDouble1.setValue((double) (short) 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void MutableDouble0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0972");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.decrement();
        mutableDouble0.subtract(0.0d);
        mutableDouble0.increment();
        mutableDouble0.increment();
    }

    @Test
    public void MutableDouble0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0973");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) -110);
        java.lang.Class<?> wildcardClass2 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableDouble0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0974");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.decrement();
        int int4 = mutableDouble0.intValue();
        mutableDouble0.add(51.0d);
        double double7 = mutableDouble0.doubleValue();
        java.lang.String str8 = mutableDouble0.toString();
        java.lang.Double double9 = mutableDouble0.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 150.0d + "'", double7 == 150.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "150.0" + "'", str8.equals("150.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 150.0d + "'", double9.equals(150.0d));
    }

    @Test
    public void MutableDouble0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0975");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        java.lang.Double double3 = mutableDouble1.getValue();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) (short) 102);
        short short7 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -102 + "'", short7 == (short) -102);
    }

    @Test
    public void MutableDouble0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0976");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("-98.0");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble1.add((java.lang.Number) mutableDouble3);
    }

    @Test
    public void MutableDouble0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0977");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        java.lang.Double double6 = mutableDouble1.getValue();
        mutableDouble1.decrement();
        mutableDouble1.increment();
        boolean boolean9 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0978");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.decrement();
        java.lang.String str7 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1.0" + "'", str7.equals("-1.0"));
    }

    @Test
    public void MutableDouble0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0979");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        int int6 = mutableDouble1.intValue();
        short short7 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void MutableDouble0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0980");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '#');
        double double2 = mutableDouble1.doubleValue();
        boolean boolean3 = mutableDouble1.isNaN();
        boolean boolean4 = mutableDouble1.isNaN();
        mutableDouble1.setValue((double) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableDouble0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0981");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        boolean boolean7 = mutableDouble1.equals((java.lang.Object) (byte) -1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        boolean boolean9 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0982");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 10);
        mutableDouble1.setValue((java.lang.Number) 2.0f);
        java.lang.Double double4 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4.equals(2.0d));
    }

    @Test
    public void MutableDouble0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0983");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.add((java.lang.Number) (byte) 100);
        int int3 = mutableDouble0.intValue();
        mutableDouble0.subtract((double) (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void MutableDouble0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0984");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        float float3 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void MutableDouble0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0985");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((-99.0d));
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.subtract(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-99.0" + "'", str2.equals("-99.0"));
    }

    @Test
    public void MutableDouble0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0986");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        mutableDouble1.setValue((double) (-1.0f));
        java.lang.String str4 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.0" + "'", str4.equals("-1.0"));
    }

    @Test
    public void MutableDouble0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0987");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        boolean boolean5 = mutableDouble1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0988");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble2.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble2.setValue((java.lang.Number) mutableDouble5);
        mutableDouble0.setValue((java.lang.Number) mutableDouble2);
        boolean boolean8 = mutableDouble0.isInfinite();
        byte byte9 = mutableDouble0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void MutableDouble0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0989");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        java.lang.String str2 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble(0.0d);
        mutableDouble1.add((java.lang.Number) mutableDouble4);
        float float6 = mutableDouble4.floatValue();
        mutableDouble4.add(0.0d);
        boolean boolean9 = mutableDouble4.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0990");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        float float6 = mutableDouble1.floatValue();
        java.lang.String str7 = mutableDouble1.toString();
        mutableDouble1.add((double) (-99L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0.0" + "'", str7.equals("0.0"));
    }

    @Test
    public void MutableDouble0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0991");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        boolean boolean2 = mutableDouble1.isInfinite();
        mutableDouble1.subtract((double) (short) -100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0992");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        int int4 = mutableDouble0.intValue();
        mutableDouble0.subtract((-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-100) + "'", int4 == (-100));
    }

    @Test
    public void MutableDouble0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0993");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long6 = mutableDouble5.longValue();
        mutableDouble1.subtract((java.lang.Number) mutableDouble5);
        double double8 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void MutableDouble0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0994");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        int int4 = mutableDouble1.intValue();
        mutableDouble1.add((double) ' ');
        float float7 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 33.0f + "'", float7 == 33.0f);
    }

    @Test
    public void MutableDouble0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0995");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        double double4 = mutableDouble1.doubleValue();
        java.lang.String str5 = mutableDouble1.toString();
        mutableDouble1.add((double) (byte) -10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0.0" + "'", str5.equals("0.0"));
    }

    @Test
    public void MutableDouble0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0996");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        double double4 = mutableDouble1.doubleValue();
        int int5 = mutableDouble1.intValue();
        int int6 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void MutableDouble0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0997");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        java.lang.Double double8 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8.equals(1.0d));
    }

    @Test
    public void MutableDouble0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0998");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        short short6 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableDouble0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble0999");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        boolean boolean6 = mutableDouble4.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.MutableDouble1000");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        mutableDouble1.subtract(0.0d);
        boolean boolean6 = mutableDouble1.isNaN();
        mutableDouble1.increment();
        byte byte8 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }
}

