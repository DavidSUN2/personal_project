package MutableDouble;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableDouble2 {

    public static boolean debug = false;

    @Test
    public void MutableDouble1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1001");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble();
        int int3 = mutableDouble1.compareTo(mutableDouble2);
        double double4 = mutableDouble2.doubleValue();
        java.lang.Double double5 = mutableDouble2.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble6.add(35.0d);
        int int9 = mutableDouble2.compareTo(mutableDouble6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableDouble1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1002");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) 100);
        boolean boolean8 = mutableDouble1.equals((java.lang.Object) (byte) 0);
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1003");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        double double4 = mutableDouble1.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) double4);
        float float6 = mutableDouble5.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableDouble1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1004");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.toDouble();
        java.lang.Double double4 = mutableDouble0.toDouble();
        boolean boolean5 = mutableDouble0.isInfinite();
        mutableDouble0.increment();
        java.lang.Double double7 = mutableDouble0.getValue();
        short short8 = mutableDouble0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4.equals((-100.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-99.0d) + "'", double7.equals((-99.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -99 + "'", short8 == (short) -99);
    }

    @Test
    public void MutableDouble1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1005");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) 100);
        float float7 = mutableDouble1.floatValue();
        mutableDouble1.decrement();
        int int9 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-99.0f) + "'", float7 == (-99.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
    }

    @Test
    public void MutableDouble1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1006");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        boolean boolean6 = mutableDouble1.isInfinite();
        long long7 = mutableDouble1.longValue();
        java.lang.String str8 = mutableDouble1.toString();
        long long9 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0.0" + "'", str8.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void MutableDouble1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1007");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        boolean boolean3 = mutableDouble1.isInfinite();
        float float4 = mutableDouble1.floatValue();
        long long5 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
    }

    @Test
    public void MutableDouble1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1008");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        boolean boolean4 = mutableDouble1.isInfinite();
        byte byte5 = mutableDouble1.byteValue();
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
    public void MutableDouble1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1009");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) '#');
        double double4 = mutableDouble3.doubleValue();
        boolean boolean5 = mutableDouble3.isNaN();
        mutableDouble3.decrement();
        java.lang.Double double7 = mutableDouble3.toDouble();
        int int8 = mutableDouble1.compareTo(mutableDouble3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 34.0d + "'", double7.equals(34.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableDouble1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1010");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (-92L));
    }

    @Test
    public void MutableDouble1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1011");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) -100);
        java.lang.Object obj2 = null;
        boolean boolean3 = mutableDouble1.equals(obj2);
        java.lang.Double double4 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4.equals((-100.0d)));
    }

    @Test
    public void MutableDouble1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1012");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        mutableDouble1.decrement();
        int int7 = mutableDouble1.intValue();
        boolean boolean8 = mutableDouble1.isNaN();
        java.lang.Double double9 = mutableDouble1.toDouble();
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
    public void MutableDouble1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1013");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        mutableDouble1.increment();
        float float3 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 101.0f + "'", float3 == 101.0f);
    }

    @Test
    public void MutableDouble1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1014");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        mutableDouble1.decrement();
        float float4 = mutableDouble1.floatValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 99.0f + "'", float4 == 99.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 99.0d + "'", double5.equals(99.0d));
    }

    @Test
    public void MutableDouble1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1015");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100);
        int int2 = mutableDouble1.intValue();
        mutableDouble1.setValue((double) (-1));
        double double5 = mutableDouble1.doubleValue();
        double double6 = mutableDouble1.doubleValue();
        float float7 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void MutableDouble1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1016");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        float float4 = mutableDouble1.floatValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        mutableDouble1.increment();
        mutableDouble1.add((java.lang.Number) 52);
        java.lang.Double double9 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 53.0d + "'", double9.equals(53.0d));
    }

    @Test
    public void MutableDouble1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1017");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        double double4 = mutableDouble1.doubleValue();
        java.lang.String str5 = mutableDouble1.toString();
        java.lang.Class<?> wildcardClass6 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0.0" + "'", str5.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableDouble1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1018");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.add((java.lang.Number) (byte) 100);
        int int3 = mutableDouble0.intValue();
        double double4 = mutableDouble0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void MutableDouble1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1019");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 0);
    }

    @Test
    public void MutableDouble1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1020");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        mutableDouble1.add(0.0d);
        byte byte8 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void MutableDouble1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1021");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        java.lang.Double double3 = mutableDouble1.toDouble();
        java.lang.Double double4 = mutableDouble1.getValue();
        double double5 = mutableDouble1.doubleValue();
        mutableDouble1.subtract((double) (-89));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void MutableDouble1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1022");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        long long2 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        int int5 = mutableDouble1.compareTo(mutableDouble4);
        int int6 = mutableDouble1.intValue();
        java.lang.Double double7 = mutableDouble1.getValue();
        boolean boolean8 = mutableDouble1.isNaN();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void MutableDouble1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1023");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("2.0");
        float float2 = mutableDouble1.floatValue();
        int int3 = mutableDouble1.intValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 99.0f);
        float float6 = mutableDouble5.floatValue();
        mutableDouble1.subtract((java.lang.Number) mutableDouble5);
        java.lang.Double double8 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 99.0f + "'", float6 == 99.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-97.0d) + "'", double8.equals((-97.0d)));
    }

    @Test
    public void MutableDouble1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1024");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 2.0f);
        java.lang.Double double2 = mutableDouble1.getValue();
        long long3 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2.equals(2.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
    }

    @Test
    public void MutableDouble1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1025");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) double5);
        double double7 = mutableDouble6.doubleValue();
        float float8 = mutableDouble6.floatValue();
        byte byte9 = mutableDouble6.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void MutableDouble1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1026");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        boolean boolean3 = mutableDouble1.isInfinite();
        float float4 = mutableDouble1.floatValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        float float6 = mutableDouble1.floatValue();
        long long7 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5.equals(2.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
    }

    @Test
    public void MutableDouble1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1027");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        mutableDouble1.increment();
        mutableDouble1.setValue((double) (byte) -98);
    }

    @Test
    public void MutableDouble1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1028");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) 100);
        mutableDouble1.setValue((double) 10);
        double double7 = mutableDouble1.doubleValue();
        mutableDouble1.setValue(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void MutableDouble1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1029");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        mutableDouble1.subtract((double) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1);
        mutableDouble1.subtract((java.lang.Number) mutableDouble7);
        java.lang.String str9 = mutableDouble7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1.0" + "'", str9.equals("1.0"));
    }

    @Test
    public void MutableDouble1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1030");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        boolean boolean6 = mutableDouble1.isInfinite();
        double double7 = mutableDouble1.doubleValue();
        mutableDouble1.setValue((double) (byte) -98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void MutableDouble1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1031");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        mutableDouble1.decrement();
        mutableDouble1.setValue((-10.0d));
        boolean boolean5 = mutableDouble1.isNaN();
        java.lang.String str6 = mutableDouble1.toString();
        double double7 = mutableDouble1.doubleValue();
        boolean boolean8 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-10.0" + "'", str6.equals("-10.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-10.0d) + "'", double7 == (-10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableDouble1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1032");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean4 = mutableDouble3.isInfinite();
        java.lang.Double double5 = mutableDouble3.toDouble();
        int int6 = mutableDouble1.compareTo(mutableDouble3);
        long long7 = mutableDouble1.longValue();
        byte byte8 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
    }

    @Test
    public void MutableDouble1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1033");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        long long5 = mutableDouble1.longValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble1.setValue((double) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void MutableDouble1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1034");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        mutableDouble1.decrement();
        int int7 = mutableDouble1.intValue();
        double double8 = mutableDouble1.doubleValue();
        mutableDouble1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void MutableDouble1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1035");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        float float6 = mutableDouble1.floatValue();
        java.lang.String str7 = mutableDouble1.toString();
        boolean boolean8 = mutableDouble1.isInfinite();
        java.lang.Double double9 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0.0" + "'", str7.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9.equals(0.0d));
    }

    @Test
    public void MutableDouble1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1036");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        long long3 = mutableDouble1.longValue();
        mutableDouble1.setValue(0.0d);
        float float6 = mutableDouble1.floatValue();
        float float7 = mutableDouble1.floatValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        byte byte9 = mutableDouble8.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void MutableDouble1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1037");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1038");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-99.0f));
        long long2 = mutableDouble1.longValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        boolean boolean4 = mutableDouble1.isInfinite();
        short short5 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99L) + "'", long2 == (-99L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-99.0d) + "'", double3.equals((-99.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -99 + "'", short5 == (short) -99);
    }

    @Test
    public void MutableDouble1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1039");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        mutableDouble1.setValue((double) (byte) 100);
        java.lang.String str6 = mutableDouble1.toString();
        java.lang.Class<?> wildcardClass7 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "100.0" + "'", str6.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableDouble1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1040");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        mutableDouble1.increment();
        boolean boolean6 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1041");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble5 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long6 = mutableDouble5.longValue();
        mutableDouble1.subtract((java.lang.Number) mutableDouble5);
        java.lang.Double double8 = mutableDouble1.getValue();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8.equals((-1.0d)));
    }

    @Test
    public void MutableDouble1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1042");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        short short5 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void MutableDouble1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1043");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        boolean boolean4 = mutableDouble1.isNaN();
        mutableDouble1.setValue((double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableDouble1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1044");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double2 = mutableDouble1.doubleValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        mutableDouble1.increment();
        java.lang.Double double5 = mutableDouble1.toDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble6 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) double5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
    }

    @Test
    public void MutableDouble1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1045");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        mutableDouble1.increment();
        java.lang.String str6 = mutableDouble1.toString();
        boolean boolean7 = mutableDouble1.isNaN();
        java.lang.Double double8 = mutableDouble1.toDouble();
        float float9 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2.0" + "'", str6.equals("2.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8.equals(2.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9 == 2.0f);
    }

    @Test
    public void MutableDouble1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1046");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        mutableDouble1.subtract((double) (byte) 100);
        java.lang.Double double5 = mutableDouble1.toDouble();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-99.0d) + "'", double5.equals((-99.0d)));
    }

    @Test
    public void MutableDouble1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1047");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(1.0d);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        java.lang.Double double5 = mutableDouble4.toDouble();
        long long6 = mutableDouble4.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void MutableDouble1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1048");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(1.0d);
        mutableDouble1.decrement();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        java.lang.Class<?> wildcardClass4 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableDouble1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1049");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        boolean boolean2 = mutableDouble1.isInfinite();
        int int3 = mutableDouble1.intValue();
        float float4 = mutableDouble1.floatValue();
        java.lang.Double double5 = mutableDouble1.toDouble();
        java.lang.Double double6 = mutableDouble1.getValue();
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
    }

    @Test
    public void MutableDouble1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1050");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble();
        int int3 = mutableDouble1.compareTo(mutableDouble2);
        double double4 = mutableDouble2.doubleValue();
        java.lang.Double double5 = mutableDouble2.getValue();
        short short6 = mutableDouble2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableDouble1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1051");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        boolean boolean2 = mutableDouble1.isNaN();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        java.lang.Double double4 = mutableDouble1.toDouble();
        boolean boolean5 = mutableDouble1.isNaN();
        boolean boolean6 = mutableDouble1.isNaN();
        byte byte7 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void MutableDouble1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1052");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble("0.0");
        boolean boolean5 = mutableDouble0.equals((java.lang.Object) mutableDouble4);
        mutableDouble0.increment();
        java.lang.Double double7 = mutableDouble0.toDouble();
        mutableDouble0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-99.0d) + "'", double7.equals((-99.0d)));
    }

    @Test
    public void MutableDouble1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1053");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((-100.0d));
        mutableDouble1.decrement();
        long long3 = mutableDouble1.longValue();
        long long4 = mutableDouble1.longValue();
        float float5 = mutableDouble1.floatValue();
        mutableDouble1.setValue(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-101L) + "'", long3 == (-101L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-101L) + "'", long4 == (-101L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-101.0f) + "'", float5 == (-101.0f));
    }

    @Test
    public void MutableDouble1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1054");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        double double5 = mutableDouble1.doubleValue();
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void MutableDouble1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1055");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble();
        int int3 = mutableDouble1.compareTo(mutableDouble2);
        mutableDouble1.subtract((double) 99L);
        mutableDouble1.add((double) (short) -2);
        int int8 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-101) + "'", int8 == (-101));
    }

    @Test
    public void MutableDouble1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1056");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        java.lang.Double double3 = mutableDouble0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3.equals((-100.0d)));
    }

    @Test
    public void MutableDouble1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1057");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble1.add((double) 2L);
        boolean boolean4 = mutableDouble1.isNaN();
        boolean boolean5 = mutableDouble1.isInfinite();
        boolean boolean6 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1058");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-99.0f));
        long long2 = mutableDouble1.longValue();
        java.lang.Double double3 = mutableDouble1.getValue();
        java.lang.String str4 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99L) + "'", long2 == (-99L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-99.0d) + "'", double3.equals((-99.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-99.0" + "'", str4.equals("-99.0"));
    }

    @Test
    public void MutableDouble1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1059");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        double double4 = mutableDouble1.doubleValue();
        int int5 = mutableDouble1.intValue();
        mutableDouble1.increment();
        java.lang.Double double7 = mutableDouble1.toDouble();
        mutableDouble1.increment();
        double double9 = mutableDouble1.doubleValue();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.0d + "'", double9 == 3.0d);
    }

    @Test
    public void MutableDouble1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1060");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 10);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0L);
        double double4 = mutableDouble3.doubleValue();
        long long5 = mutableDouble3.longValue();
        java.lang.Double double6 = mutableDouble3.getValue();
        long long7 = mutableDouble3.longValue();
        int int8 = mutableDouble1.compareTo(mutableDouble3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void MutableDouble1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1061");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        mutableDouble1.increment();
        boolean boolean6 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1062");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) -49);
        boolean boolean2 = mutableDouble1.isNaN();
        boolean boolean3 = mutableDouble1.isNaN();
        java.lang.Double double4 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-49.0d) + "'", double4.equals((-49.0d)));
    }

    @Test
    public void MutableDouble1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1063");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(100.0d);
        java.lang.String str2 = mutableDouble1.toString();
        java.lang.Double double3 = mutableDouble1.getValue();
        java.lang.Class<?> wildcardClass4 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100.0" + "'", str2.equals("100.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3.equals(100.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableDouble1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1064");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        long long2 = mutableDouble1.longValue();
        mutableDouble1.subtract((double) (byte) 0);
        boolean boolean5 = mutableDouble1.isNaN();
        long long6 = mutableDouble1.longValue();
        boolean boolean7 = mutableDouble1.isInfinite();
        java.lang.String str8 = mutableDouble1.toString();
        java.lang.Double double9 = mutableDouble1.getValue();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9.equals(1.0d));
    }

    @Test
    public void MutableDouble1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1065");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        java.lang.String str2 = mutableDouble1.toString();
        boolean boolean3 = mutableDouble1.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1.0" + "'", str2.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1066");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        java.lang.String str4 = mutableDouble1.toString();
        java.lang.Double double5 = mutableDouble1.getValue();
        mutableDouble1.add((java.lang.Number) 101.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
    }

    @Test
    public void MutableDouble1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1067");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 100);
        int int2 = mutableDouble1.intValue();
        mutableDouble1.setValue((double) (-1));
        double double5 = mutableDouble1.doubleValue();
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in MutableDouble generation
        try {
            mutableDouble1.setValue(number6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void MutableDouble1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1068");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float2 = mutableDouble1.floatValue();
        java.lang.String str3 = mutableDouble1.toString();
        mutableDouble1.setValue((double) (short) 0);
        double double6 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1.0" + "'", str3.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void MutableDouble1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1069");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0);
        mutableDouble1.subtract((java.lang.Number) 0);
        java.lang.String str4 = mutableDouble1.toString();
        java.lang.Double double5 = mutableDouble1.getValue();
        boolean boolean6 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0" + "'", str4.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableDouble1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1070");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (byte) 100);
        java.lang.Class<?> wildcardClass2 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableDouble1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1071");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(1.0d);
        double double2 = mutableDouble1.doubleValue();
        mutableDouble1.setValue(99.0d);
        double double5 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 99.0d + "'", double5 == 99.0d);
    }

    @Test
    public void MutableDouble1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1072");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 0.0f);
        float float2 = mutableDouble1.floatValue();
        boolean boolean3 = mutableDouble1.isInfinite();
        double double4 = mutableDouble1.doubleValue();
        java.lang.Double double5 = mutableDouble1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5.equals(0.0d));
    }

    @Test
    public void MutableDouble1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1073");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) '4');
        java.lang.Double double2 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        mutableDouble1.setValue((double) 10L);
        mutableDouble1.subtract((double) (-110.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2.equals(52.0d));
    }

    @Test
    public void MutableDouble1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1074");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(150.0d);
        long long2 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 150L + "'", long2 == 150L);
    }

    @Test
    public void MutableDouble1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1075");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 100.0d);
        mutableDouble0.add((java.lang.Number) 100.0d);
        mutableDouble0.add((double) (byte) 0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble0);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble7);
    }

    @Test
    public void MutableDouble1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1076");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.increment();
        mutableDouble1.increment();
        mutableDouble1.setValue((double) (-110.0f));
    }

    @Test
    public void MutableDouble1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1077");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) 1);
        java.lang.Double double2 = mutableDouble1.getValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble3 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        boolean boolean5 = mutableDouble1.equals((java.lang.Object) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2.equals(1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableDouble1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1078");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((double) (-97));
        mutableDouble1.setValue((double) 100);
        java.lang.String str4 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100.0" + "'", str4.equals("100.0"));
    }

    @Test
    public void MutableDouble1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1079");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        mutableDouble1.setValue((double) (short) 0);
        int int4 = mutableDouble1.intValue();
        int int5 = mutableDouble1.intValue();
        int int6 = mutableDouble1.intValue();
        double double7 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void MutableDouble1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble2.MutableDouble1080");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        mutableDouble0.subtract((java.lang.Number) 100L);
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble4 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 1.0d);
        float float5 = mutableDouble4.floatValue();
        java.lang.String str6 = mutableDouble4.toString();
        boolean boolean7 = mutableDouble0.equals((java.lang.Object) mutableDouble4);
        boolean boolean8 = mutableDouble4.isInfinite();
        mutableDouble4.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1.0" + "'", str6.equals("1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }
}

