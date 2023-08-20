
package MutableDouble;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableDouble1 {

    public static boolean debug = false;

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0501");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0502");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0503");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-10.0d));
        mutableDouble1.add((double) (short) -1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0504");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0505");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0506");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0507");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0508");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0509");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0510");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0511");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0512");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0513");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("-110.0");
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0514");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0515");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0516");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0517");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0518");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0519");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0520");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.add((java.lang.Number) (byte) 100);
        mutableDouble0.add((double) 0L);
        short short5 = mutableDouble0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0521");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0522");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0523");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0524");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0525");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble3);
        mutableDouble4.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0526");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) -97);
        java.lang.Double double2 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-97.0d) + "'", double2.equals((-97.0d)));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0527");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0528");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0529");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.decrement();
        java.lang.Double double2 = mutableDouble0.toDouble();
        mutableDouble0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2.equals((-1.0d)));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0530");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0531");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0532");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0533");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 101);
        boolean boolean2 = mutableDouble1.isNaN();
        boolean boolean3 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0534");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0535");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0536");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0537");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0538");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0539");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0540");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0541");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0542");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0543");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0544");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0545");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) -97);
        byte byte2 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -97 + "'", byte2 == (byte) -97);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0546");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0547");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0548");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0549");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0550");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0551");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.add((java.lang.Number) (byte) 100);
        mutableDouble0.add((double) (short) -1);
        boolean boolean5 = mutableDouble0.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0552");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0553");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0554");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0555");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 2.0f);
        mutableDouble1.subtract((double) 1L);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0556");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0557");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0558");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0559");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0560");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0561");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0562");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0563");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("2.0");
        float float2 = mutableDouble1.floatValue();
        java.lang.Double double3 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3.equals(2.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0564");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0565");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0566");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0567");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0568");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0569");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0570");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0571");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0572");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 2);
        mutableDouble1.setValue((double) 3.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0573");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0574");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0575");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        java.lang.Double double4 = mutableDouble0.toDouble();
        mutableDouble0.subtract(10.0d);
        float float7 = mutableDouble0.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0576");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0577");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0578");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0579");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0580");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0581");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        mutableDouble1.decrement();
        mutableDouble1.add((double) 1.0f);
        boolean boolean5 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0582");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0583");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0584");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0585");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        java.lang.String str2 = mutableDouble1.toString();
        int int3 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0.0" + "'", str2.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0586");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (byte) -98);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0587");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0588");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0589");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0590");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0591");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 99.0f);
        java.lang.String str2 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "99.0" + "'", str2.equals("99.0"));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0592");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0593");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0594");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0595");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0596");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0597");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble3.decrement();
        mutableDouble3.subtract((double) (byte) 100);
        mutableDouble1.setValue((java.lang.Number) (byte) 100);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0598");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0599");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0600");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0601");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0602");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0603");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("100.0");
        long long2 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0604");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0605");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0606");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) -49);
        boolean boolean2 = mutableDouble1.isNaN();
        java.lang.Class<?> wildcardClass3 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0607");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0608");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0609");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble1.decrement();
        mutableDouble1.setValue((-10.0d));
        mutableDouble1.setValue((java.lang.Number) (-99));
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0610");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0611");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) -100);
        java.lang.Object obj2 = null;
        boolean boolean3 = mutableDouble1.equals(obj2);
        mutableDouble1.subtract((double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0612");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0613");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0614");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0615");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0616");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0617");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0618");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((-99.0d));
        boolean boolean2 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0619");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 1);
        java.lang.Double double2 = mutableDouble1.toDouble();
        mutableDouble1.decrement();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2.equals(1.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0620");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0621");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0622");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0623");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0624");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0625");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0626");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0627");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0628");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("99.0");
        mutableDouble1.add((double) (short) 10);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0629");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0630");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0631");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0632");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0633");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 11);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0634");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0635");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0636");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("-89.0");
        int int2 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-89) + "'", int2 == (-89));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0637");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0638");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0639");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0640");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0641");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0642");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0643");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0644");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0645");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0L);
        int int2 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0646");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0647");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0648");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((-100.0d));
        mutableDouble1.increment();
        boolean boolean3 = mutableDouble1.isNaN();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0649");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0650");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0651");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0652");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble1.decrement();
        float float3 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 51.0f + "'", float3 == 51.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0653");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        java.lang.Double double2 = mutableDouble1.getValue();
        byte byte3 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0654");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0655");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        mutableDouble1.increment();
        mutableDouble1.setValue((double) 1.0f);
        mutableDouble1.setValue((double) (byte) -100);
        byte byte7 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -100 + "'", byte7 == (byte) -100);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0656");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0657");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0658");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0659");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0660");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0661");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 10);
        mutableDouble1.subtract((double) (byte) 0);
        mutableDouble1.increment();
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0662");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0663");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0664");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0665");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0666");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0667");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0668");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0669");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0670");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0671");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0672");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        mutableDouble1.add((double) (-1));
        java.lang.Class<?> wildcardClass4 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0673");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0674");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0675");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0676");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0677");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0678");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("-100.0");
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0679");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0680");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0681");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0682");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0683");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0684");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0685");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0686");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 92);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0687");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 99.0f);
        float float2 = mutableDouble1.floatValue();
        byte byte3 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.0f + "'", float2 == 99.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 99 + "'", byte3 == (byte) 99);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0688");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(0.0d);
        mutableDouble1.subtract((double) (-100));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0689");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(10.0d);
        java.lang.Double double2 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2.equals(10.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0690");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(52.0d);
        java.lang.Double double2 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2.equals(52.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0691");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0692");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0693");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0694");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        boolean boolean2 = mutableDouble1.isNaN();
        mutableDouble1.add((double) (-1L));
        mutableDouble1.increment();
        mutableDouble1.setValue((double) 93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0695");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0696");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0697");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (byte) 0);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble3.setValue((double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0698");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (byte) 0);
        mutableDouble1.subtract((double) 1);
        mutableDouble1.setValue((double) (byte) 10);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0699");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-1));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0700");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0701");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0702");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 2);
        boolean boolean2 = mutableDouble1.isNaN();
        java.lang.String str3 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2.0" + "'", str3.equals("2.0"));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0703");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0704");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0705");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0706");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 0);
        long long2 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0707");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0708");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0709");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0710");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0711");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0712");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0713");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 2);
        int int2 = mutableDouble1.intValue();
        java.lang.Double double3 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3.equals(2.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0714");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0715");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 10.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0716");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0717");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0718");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-1L));
        mutableDouble1.setValue((double) 100L);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0719");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) (byte) 100);
        mutableDouble1.add((double) (byte) -98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0720");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0721");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        boolean boolean6 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0722");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        mutableDouble1.decrement();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0723");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        java.lang.Double double2 = mutableDouble1.getValue();
        int int3 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0724");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("100.0");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100L);
        mutableDouble1.setValue((java.lang.Number) mutableDouble3);
        java.lang.Number number5 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDouble1.add(number5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0725");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0726");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0727");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0728");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0729");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0730");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0731");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0732");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0733");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0734");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0735");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0736");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((-100.0d));
        mutableDouble1.decrement();
        float float3 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-101.0f) + "'", float3 == (-101.0f));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0737");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0738");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1);
        mutableDouble1.decrement();
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0739");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0740");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-1L));
        mutableDouble1.setValue(101.0d);
        int int4 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0741");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0742");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble();
        int int3 = mutableDouble1.compareTo(mutableDouble2);
        mutableDouble1.subtract((double) 99L);
        mutableDouble1.add(1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0743");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0744");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-99.0f));
        long long2 = mutableDouble1.longValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99L) + "'", long2 == (-99L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0745");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0746");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        mutableDouble1.increment();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0747");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0748");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-89));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0749");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0750");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("101.0");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((-100.0d));
        mutableDouble1.setValue((java.lang.Number) (-100.0d));
        short short5 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -100 + "'", short5 == (short) -100);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0751");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("2.0");
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.setValue(101.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0752");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0753");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0754");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(52.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble3.decrement();
        mutableDouble3.setValue((-10.0d));
        int int7 = mutableDouble1.compareTo(mutableDouble3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0755");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0756");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0757");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        mutableDouble1.setValue((double) (-1.0f));
        short short4 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0758");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        java.lang.Double double3 = mutableDouble2.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) double3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3.equals(100.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0759");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0760");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.subtract((java.lang.Number) 51.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0761");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0762");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0763");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0764");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0765");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0766");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0767");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0768");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0769");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0770");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(0.0d);
        mutableDouble1.setValue((double) '#');
        java.lang.Class<?> wildcardClass4 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0771");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0772");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 100);
        mutableDouble1.add((double) (short) 102);
        mutableDouble1.decrement();
        java.lang.Class<?> wildcardClass5 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0773");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0774");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0775");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0776");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0777");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0778");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0779");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0780");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0781");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(52.0d);
        java.lang.Double double2 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2.equals(52.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0782");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) 100);
        mutableDouble1.subtract((-1.0d));
        mutableDouble1.setValue((double) (short) 93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0783");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0784");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        java.lang.Double double2 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble1.setValue((double) 10L);
        mutableDouble1.add((double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2.equals(52.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0785");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0786");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(3.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100.0f);
        double double4 = mutableDouble3.doubleValue();
        mutableDouble1.subtract((java.lang.Number) double4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0787");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0788");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) -100);
        short short2 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -100 + "'", short2 == (short) -100);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0789");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 10.0d);
        java.lang.String str2 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10.0" + "'", str2.equals("10.0"));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0790");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0791");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0792");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0793");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.add((double) 100.0f);
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0794");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.decrement();
        java.lang.Double double2 = mutableDouble0.toDouble();
        mutableDouble0.subtract((double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2.equals((-1.0d)));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0795");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((-98.0d));
        java.lang.String str2 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-98.0" + "'", str2.equals("-98.0"));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0796");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0797");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0798");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0799");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0800");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0801");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0802");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) -50);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0803");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0804");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0805");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        mutableDouble1.increment();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0806");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0807");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0808");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3.equals(1.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0809");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0810");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0811");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0812");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0813");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("99.0");
        mutableDouble1.add((double) (byte) -1);
        mutableDouble1.setValue((double) 99);
        mutableDouble1.decrement();
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0814");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0815");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0816");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0817");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0818");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0819");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0820");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0821");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0822");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0823");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        boolean boolean5 = mutableDouble0.equals((java.lang.Object) mutableDouble4);
        mutableDouble0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0824");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0825");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0826");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0827");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0828");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 51.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0829");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0830");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 101.0f);
        java.lang.Double double2 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 101.0d + "'", double2.equals(101.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0831");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0832");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0833");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0834");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-100));
        java.lang.Class<?> wildcardClass2 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0835");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 101.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0836");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0837");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0838");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("12.0");
        java.lang.Class<?> wildcardClass2 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0839");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0840");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100);
        int int2 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) -49);
        mutableDouble1.setValue((java.lang.Number) (short) -49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0841");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0842");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (byte) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (byte) 0);
        java.lang.String str3 = mutableDouble2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0.0" + "'", str3.equals("0.0"));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0843");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0844");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0845");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0846");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0847");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0848");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0849");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0850");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0851");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0852");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (byte) 0);
        mutableDouble1.subtract((double) 1);
        long long4 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0853");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0854");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0855");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 2);
        boolean boolean2 = mutableDouble1.isNaN();
        mutableDouble1.subtract((double) 101);
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0856");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        java.lang.Double double2 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2.equals(0.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0857");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0858");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0859");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0860");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0861");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0862");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("100.0");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100L);
        mutableDouble1.setValue((java.lang.Number) mutableDouble3);
        java.lang.Double double5 = mutableDouble3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5.equals(100.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0863");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0864");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 2);
        boolean boolean2 = mutableDouble1.isNaN();
        byte byte3 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 2 + "'", byte3 == (byte) 2);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0865");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0866");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0867");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0868");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0869");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 100);
        mutableDouble1.increment();
        java.lang.Double double3 = mutableDouble1.toDouble();
        mutableDouble1.setValue(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 101.0d + "'", double3.equals(101.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0870");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0871");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) 99);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0872");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0873");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0874");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0875");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0876");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 3.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0877");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0878");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0879");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((-10.0d));
        java.lang.Double double2 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-10.0d) + "'", double2.equals((-10.0d)));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0880");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0881");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0882");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0883");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0884");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(1.0d);
        mutableDouble1.decrement();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble3.increment();
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0885");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0886");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0887");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 101L);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0888");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("-10.0");
        boolean boolean2 = mutableDouble1.isNaN();
        long long3 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-10L) + "'", long3 == (-10L));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0889");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0890");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1);
        short short2 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0891");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0892");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        java.lang.Double double2 = mutableDouble1.toDouble();
        int int3 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0893");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100);
        java.lang.String str2 = mutableDouble1.toString();
        double double3 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0894");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0895");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((-100.0d));
        mutableDouble1.increment();
        double double3 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-99.0d) + "'", double3 == (-99.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0896");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0897");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0898");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-1L));
        boolean boolean2 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0899");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0900");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("150.0");
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0901");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0902");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0903");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0904");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0905");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0906");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0907");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0908");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0909");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0910");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0911");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0912");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0913");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) -110);
        float float2 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-110.0f) + "'", float2 == (-110.0f));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0914");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0915");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        double double6 = mutableDouble4.doubleValue();
        boolean boolean7 = mutableDouble4.isInfinite();
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0916");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0917");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0918");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0919");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0920");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0921");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0922");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0923");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0924");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0925");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0926");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0927");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0928");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0929");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0930");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0931");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (short) -49);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0932");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0933");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(51.0d);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0934");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        mutableDouble1.increment();
        mutableDouble1.setValue((double) 1.0f);
        mutableDouble1.setValue(35.0d);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0935");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0936");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0937");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0938");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0939");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        java.lang.Double double2 = mutableDouble1.toDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble("92.0");
        mutableDouble1.subtract((java.lang.Number) mutableDouble4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2.equals(0.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0940");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0941");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("10.0");
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0942");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100);
        java.lang.String str2 = mutableDouble1.toString();
        boolean boolean3 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0943");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("92.0");
        boolean boolean2 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0944");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0945");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0946");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0947");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0948");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0949");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0950");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0951");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0952");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0953");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0954");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0955");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0956");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0957");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-92L));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0958");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        mutableDouble1.add((double) (-1));
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-1));
        double double5 = mutableDouble4.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0959");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0960");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0f);
        float float2 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0961");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0962");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0963");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0964");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        boolean boolean2 = mutableDouble1.isNaN();
        mutableDouble1.increment();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble1.subtract((double) 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0965");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0966");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 10L);
        byte byte2 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0967");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(1.0d);
        mutableDouble1.decrement();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((double) ' ');
        boolean boolean6 = mutableDouble3.equals((java.lang.Object) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0968");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0969");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0970");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0971");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0972");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.setValue((double) (short) 100);
        mutableDouble0.decrement();
        mutableDouble0.subtract(0.0d);
        mutableDouble0.increment();
        mutableDouble0.increment();
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0973");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) -110);
        java.lang.Class<?> wildcardClass2 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0974");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0975");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0976");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("-98.0");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble1.add((java.lang.Number) mutableDouble3);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0977");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0978");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0979");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0980");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0981");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0982");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 10);
        mutableDouble1.setValue((java.lang.Number) 2.0f);
        java.lang.Double double4 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4.equals(2.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0983");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.add((java.lang.Number) (byte) 100);
        int int3 = mutableDouble0.intValue();
        mutableDouble0.subtract((double) (short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0984");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        float float3 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0985");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((-99.0d));
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.subtract(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-99.0" + "'", str2.equals("-99.0"));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0986");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        mutableDouble1.setValue((double) (-1.0f));
        java.lang.String str4 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1.0" + "'", str4.equals("-1.0"));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0987");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0988");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0989");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0990");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0991");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        boolean boolean2 = mutableDouble1.isInfinite();
        mutableDouble1.subtract((double) (short) -100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0992");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0993");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0994");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0995");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0996");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0997");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0998");
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
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test0999");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble1.setValue((java.lang.Number) mutableDouble4);
        boolean boolean6 = mutableDouble4.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble1.test1000");
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

