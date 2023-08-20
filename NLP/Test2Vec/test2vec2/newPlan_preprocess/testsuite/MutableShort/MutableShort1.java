package MutableShort;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableShort1 {

    public static boolean debug = false;

    @Test
    public void MutableShort0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0501");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.setValue((short) (byte) 7);
        mutableShort1.decrement();
        java.lang.Short short9 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 6 + "'", short9.equals((short) 6));
    }

    @Test
    public void MutableShort0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0502");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        int int2 = mutableShort1.intValue();
        java.lang.Short short3 = mutableShort1.toShort();
        mutableShort1.subtract((short) 0);
        mutableShort1.setValue((java.lang.Number) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3.equals((short) 10));
    }

    @Test
    public void MutableShort0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0503");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        float float4 = mutableShort0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void MutableShort0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0504");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) -1);
        mutableShort1.setValue((short) (byte) 100);
        java.lang.Short short4 = mutableShort1.toShort();
        short short5 = mutableShort1.shortValue();
        mutableShort1.setValue((short) 0);
        java.lang.Short short8 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8.equals((short) 0));
    }

    @Test
    public void MutableShort0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0505");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Short short5 = mutableShort1.toShort();
        java.lang.String str6 = mutableShort1.toString();
        mutableShort1.add((short) 7);
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 17 + "'", int9 == 17);
    }

    @Test
    public void MutableShort0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0506");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort3.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void MutableShort0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0507");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0508");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        java.lang.Short short7 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        short short9 = mutableShort8.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 111 + "'", short7.equals((short) 111));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 111 + "'", short9 == (short) 111);
    }

    @Test
    public void MutableShort0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0509");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10L);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int4 = mutableShort3.intValue();
        mutableShort3.setValue((java.lang.Number) 9.0f);
        long long7 = mutableShort3.longValue();
        int int8 = mutableShort1.compareTo(mutableShort3);
        float float9 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void MutableShort0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0510");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        mutableShort1.subtract((short) (byte) 100);
        mutableShort1.decrement();
        mutableShort1.decrement();
        java.lang.Short short9 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -102 + "'", short9.equals((short) -102));
    }

    @Test
    public void MutableShort0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0511");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Object obj6 = null;
        boolean boolean7 = mutableShort1.equals(obj6);
        long long8 = mutableShort1.longValue();
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void MutableShort0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0512");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) 0L);
        mutableShort1.subtract((short) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableShort0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0513");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        double double7 = mutableShort1.doubleValue();
        mutableShort1.subtract((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void MutableShort0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0514");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.setValue((short) (byte) 8);
    }

    @Test
    public void MutableShort0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0515");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        mutableShort1.decrement();
        mutableShort1.subtract((short) 7);
        int int5 = mutableShort1.intValue();
        mutableShort1.subtract((short) (byte) 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 92 + "'", int5 == 92);
    }

    @Test
    public void MutableShort0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0516");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        short short6 = mutableShort1.shortValue();
        int int7 = mutableShort1.intValue();
        java.lang.Short short8 = mutableShort1.toShort();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8.equals((short) 10));
    }

    @Test
    public void MutableShort0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0517");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.setValue((short) (byte) 100);
        java.lang.Short short9 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9.equals((short) 100));
    }

    @Test
    public void MutableShort0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0518");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 18L);
    }

    @Test
    public void MutableShort0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0519");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        byte byte3 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void MutableShort0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0520");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        mutableShort1.subtract((short) (byte) 100);
        short short7 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -100 + "'", short7 == (short) -100);
    }

    @Test
    public void MutableShort0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0521");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.increment();
        java.lang.Short short5 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort("0");
        short short8 = mutableShort7.shortValue();
        mutableShort1.subtract((java.lang.Number) mutableShort7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 8 + "'", short5.equals((short) 8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void MutableShort0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0522");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        float float2 = mutableShort1.floatValue();
        java.lang.Short short3 = mutableShort1.getValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.setValue((java.lang.Number) (byte) 112);
        long long7 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 112L + "'", long7 == 112L);
    }

    @Test
    public void MutableShort0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0523");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.setValue((short) 0);
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        int int8 = mutableShort7.intValue();
        java.lang.Class<?> wildcardClass9 = mutableShort7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0524");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) 11);
        mutableShort1.decrement();
        mutableShort1.setValue((java.lang.Number) 18L);
        float float8 = mutableShort1.floatValue();
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 18.0f + "'", float8 == 18.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 18 + "'", int9 == 18);
    }

    @Test
    public void MutableShort0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0525");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.decrement();
    }

    @Test
    public void MutableShort0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0526");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        double double2 = mutableShort1.doubleValue();
        java.lang.Class<?> wildcardClass3 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableShort0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0527");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        short short7 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort8.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 11 + "'", short6 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7 == (short) 11);
    }

    @Test
    public void MutableShort0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0528");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean5 = mutableShort3.equals((java.lang.Object) 8.0d);
        mutableShort3.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort3);
        mutableShort1.add((java.lang.Number) mutableShort7);
        java.lang.Short short9 = mutableShort7.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9.equals((short) 1));
    }

    @Test
    public void MutableShort0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0529");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.setValue((short) (byte) 7);
        double double8 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.0d + "'", double8 == 7.0d);
    }

    @Test
    public void MutableShort0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0530");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort4.intValue();
        mutableShort4.setValue((short) (byte) 10);
        float float8 = mutableShort4.floatValue();
        mutableShort1.setValue((java.lang.Number) mutableShort4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void MutableShort0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0531");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.increment();
        long long3 = mutableShort1.longValue();
        mutableShort1.setValue((short) (byte) 20);
        mutableShort1.add((short) (byte) 112);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
    }

    @Test
    public void MutableShort0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0532");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        int int2 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) int2);
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableShort3.equals(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableShort0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0533");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void MutableShort0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0534");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.increment();
        mutableShort1.add((short) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
    }

    @Test
    public void MutableShort0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0535");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) -2);
    }

    @Test
    public void MutableShort0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0536");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        mutableShort1.subtract((short) (byte) 1);
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 7.0f + "'", float4 == 7.0f);
    }

    @Test
    public void MutableShort0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0537");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        double double4 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void MutableShort0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0538");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        mutableShort1.subtract((short) (byte) 1);
        int int4 = mutableShort1.intValue();
        java.lang.Short short5 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort6.add((short) -11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 7 + "'", short5.equals((short) 7));
    }

    @Test
    public void MutableShort0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0539");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.getValue();
        mutableShort1.setValue((short) 10);
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void MutableShort0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0540");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        mutableShort1.subtract((short) (byte) 100);
        mutableShort1.decrement();
        mutableShort1.decrement();
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-102L) + "'", long9 == (-102L));
    }

    @Test
    public void MutableShort0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0541");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        float float2 = mutableShort1.floatValue();
        double double3 = mutableShort1.doubleValue();
        mutableShort1.increment();
        java.lang.Class<?> wildcardClass5 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableShort0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0542");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        short short4 = mutableShort1.shortValue();
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableShort0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0543");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.toShort();
        float float3 = mutableShort1.floatValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long6 = mutableShort5.longValue();
        mutableShort5.decrement();
        mutableShort1.subtract((java.lang.Number) mutableShort5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void MutableShort0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0544");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        byte byte2 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void MutableShort0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0545");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) 11);
        mutableShort1.decrement();
        mutableShort1.setValue((java.lang.Number) 18L);
        float float8 = mutableShort1.floatValue();
        java.lang.Class<?> wildcardClass9 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 18.0f + "'", float8 == 18.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0546");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Short short5 = mutableShort1.getValue();
        mutableShort1.decrement();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
    }

    @Test
    public void MutableShort0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0547");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort2.add((short) (byte) 100);
        mutableShort2.increment();
    }

    @Test
    public void MutableShort0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0548");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        java.lang.String str3 = mutableShort0.toString();
        mutableShort0.add((short) (byte) 2);
        mutableShort0.setValue((short) (byte) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void MutableShort0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0549");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        java.lang.Short short2 = mutableShort1.getValue();
        float float3 = mutableShort1.floatValue();
        byte byte4 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void MutableShort0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0550");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        mutableShort1.increment();
    }

    @Test
    public void MutableShort0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0551");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        mutableShort0.setValue((short) (byte) 9);
        mutableShort0.setValue((short) 1);
        int int7 = mutableShort0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableShort0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0552");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        short short7 = mutableShort1.shortValue();
        int int8 = mutableShort1.intValue();
        byte byte9 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 11 + "'", short6 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 11 + "'", byte9 == (byte) 11);
    }

    @Test
    public void MutableShort0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0553");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        long long5 = mutableShort1.longValue();
        java.lang.Short short6 = mutableShort1.toShort();
        float float7 = mutableShort1.floatValue();
        java.lang.String str8 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
    }

    @Test
    public void MutableShort0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0554");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        double double6 = mutableShort1.doubleValue();
        long long7 = mutableShort1.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) long7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void MutableShort0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0555");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        long long1 = mutableShort0.longValue();
        mutableShort0.add((short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void MutableShort0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0556");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        long long7 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 11 + "'", short6 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11L + "'", long7 == 11L);
    }

    @Test
    public void MutableShort0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0557");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        java.lang.Short short6 = mutableShort1.toShort();
        java.lang.String str7 = mutableShort1.toString();
        java.lang.Short short8 = mutableShort1.getValue();
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6.equals((short) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "9" + "'", str7.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 9 + "'", short8.equals((short) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void MutableShort0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0558");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.add((short) 0);
        mutableShort1.subtract((short) 0);
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (short) 0);
        short short8 = mutableShort7.shortValue();
        java.lang.Short short9 = mutableShort7.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9.equals((short) 0));
    }

    @Test
    public void MutableShort0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0559");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 20 + "'", short6 == (short) 20);
    }

    @Test
    public void MutableShort0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0560");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (-1L));
    }

    @Test
    public void MutableShort0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0561");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 11);
        mutableShort1.setValue((short) 11);
    }

    @Test
    public void MutableShort0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0562");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.increment();
        mutableShort1.decrement();
        mutableShort1.setValue((short) -10);
        mutableShort1.decrement();
    }

    @Test
    public void MutableShort0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0563");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        float float3 = mutableShort2.floatValue();
        mutableShort2.add((short) 100);
        java.lang.Short short6 = mutableShort2.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 101 + "'", short6.equals((short) 101));
    }

    @Test
    public void MutableShort0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0564");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.getValue();
        mutableShort1.setValue((short) 9);
        java.lang.Class<?> wildcardClass9 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0565");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort4.add((short) (byte) 8);
        double double7 = mutableShort4.doubleValue();
        java.lang.Short short8 = mutableShort4.toShort();
        mutableShort2.subtract((java.lang.Number) mutableShort4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.0d + "'", double7 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 7 + "'", short8.equals((short) 7));
    }

    @Test
    public void MutableShort0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0566");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        java.lang.Short short7 = mutableShort1.getValue();
        mutableShort1.increment();
        short short9 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 11 + "'", short9 == (short) 11);
    }

    @Test
    public void MutableShort0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0567");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        short short7 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 7 + "'", short7 == (short) 7);
    }

    @Test
    public void MutableShort0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0568");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        mutableShort1.add((short) 0);
        int int4 = mutableShort1.intValue();
        mutableShort1.add((short) -10);
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0569");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("-10");
        short short2 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -10 + "'", short2 == (short) -10);
    }

    @Test
    public void MutableShort0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0570");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 9);
        java.lang.String str5 = mutableShort1.toString();
        java.lang.Short short6 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "9" + "'", str5.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6.equals((short) 9));
    }

    @Test
    public void MutableShort0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0571");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) 0L);
        java.lang.Short short8 = mutableShort1.toShort();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8.equals((short) 10));
    }

    @Test
    public void MutableShort0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0572");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.increment();
        mutableShort1.decrement();
        mutableShort1.setValue((short) -10);
        mutableShort1.increment();
    }

    @Test
    public void MutableShort0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0573");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        int int5 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort7);
        mutableShort6.subtract((java.lang.Number) mutableShort8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void MutableShort0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0574");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.toShort();
        java.lang.String str7 = mutableShort1.toString();
        mutableShort1.increment();
        java.lang.Short short9 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 11 + "'", short9.equals((short) 11));
    }

    @Test
    public void MutableShort0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0575");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        int int2 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.setValue((java.lang.Number) 10.0f);
        byte byte6 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
    }

    @Test
    public void MutableShort0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0576");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        double double7 = mutableShort1.doubleValue();
        long long8 = mutableShort1.longValue();
        java.lang.Short short9 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 111.0d + "'", double7 == 111.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 111L + "'", long8 == 111L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 111 + "'", short9.equals((short) 111));
    }

    @Test
    public void MutableShort0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0577");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short1 = mutableShort0.toShort();
        mutableShort0.increment();
        int int3 = mutableShort0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void MutableShort0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0578");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort5.subtract((short) -11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableShort0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0579");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        mutableShort1.increment();
        java.lang.String str5 = mutableShort1.toString();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void MutableShort0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0580");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        long long4 = mutableShort1.longValue();
        double double5 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void MutableShort0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0581");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        int int4 = mutableShort0.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) int4);
        mutableShort5.decrement();
        int int7 = mutableShort5.intValue();
        int int8 = mutableShort5.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableShort0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0582");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        mutableShort1.decrement();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void MutableShort0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0583");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Short short5 = mutableShort1.toShort();
        java.lang.String str6 = mutableShort1.toString();
        java.lang.Short short7 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
    }

    @Test
    public void MutableShort0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0584");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        mutableShort1.decrement();
        java.lang.Number number4 = null;
        // The following exception was thrown during execution in MutableShort generation
        try {
            mutableShort1.add(number4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void MutableShort0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0585");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) 11);
        mutableShort1.decrement();
        mutableShort1.setValue((java.lang.Number) 18L);
        mutableShort1.setValue((short) 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void MutableShort0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0586");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        float float2 = mutableShort1.floatValue();
        int int3 = mutableShort1.intValue();
        long long4 = mutableShort1.longValue();
        java.lang.Short short5 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
    }

    @Test
    public void MutableShort0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0587");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) 11);
        short short5 = mutableShort1.shortValue();
        long long6 = mutableShort1.longValue();
        java.lang.String str7 = mutableShort1.toString();
        short short8 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
    }

    @Test
    public void MutableShort0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0588");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 20);
        mutableShort1.add((short) 0);
        float float8 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 21.0f + "'", float8 == 21.0f);
    }

    @Test
    public void MutableShort0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0589");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Short short7 = mutableShort6.toShort();
        byte byte8 = mutableShort6.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void MutableShort0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0590");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) 11);
        mutableShort1.decrement();
        mutableShort1.setValue((java.lang.Number) 18L);
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void MutableShort0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0591");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        byte byte4 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
    }

    @Test
    public void MutableShort0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0592");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        mutableShort1.decrement();
        java.lang.String str3 = mutableShort1.toString();
        short short4 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void MutableShort0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0593");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort("100");
        mutableShort1.setValue((java.lang.Number) mutableShort7);
        int int9 = mutableShort7.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void MutableShort0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0594");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        java.lang.Short short6 = mutableShort1.toShort();
        float float7 = mutableShort1.floatValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 11 + "'", short6.equals((short) 11));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 11.0f + "'", float7 == 11.0f);
    }

    @Test
    public void MutableShort0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0595");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        int int3 = mutableShort1.intValue();
        mutableShort1.decrement();
        short short5 = mutableShort1.shortValue();
        mutableShort1.subtract((short) 11);
        mutableShort1.add((java.lang.Number) 112);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 9 + "'", short5 == (short) 9);
    }

    @Test
    public void MutableShort0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0596");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        java.lang.String str6 = mutableShort1.toString();
        byte byte7 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void MutableShort0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0597");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        int int4 = mutableShort0.intValue();
        mutableShort0.add((short) -10);
        java.lang.Short short7 = mutableShort0.toShort();
        double double8 = mutableShort0.doubleValue();
        java.lang.String str9 = mutableShort0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -10 + "'", short7.equals((short) -10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-10" + "'", str9.equals("-10"));
    }

    @Test
    public void MutableShort0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0598");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        short short6 = mutableShort1.shortValue();
        int int7 = mutableShort1.intValue();
        java.lang.Short short8 = mutableShort1.getValue();
        java.lang.String str9 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10" + "'", str9.equals("10"));
    }

    @Test
    public void MutableShort0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0599");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.setValue((short) 0);
        mutableShort1.setValue((short) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void MutableShort0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0600");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        java.lang.Short short6 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) short6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6.equals((short) 9));
    }

    @Test
    public void MutableShort0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0601");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort3);
        float float5 = mutableShort3.floatValue();
        mutableShort3.setValue((short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void MutableShort0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0602");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        int int4 = mutableShort0.intValue();
        mutableShort0.add((short) -10);
        java.lang.Short short7 = mutableShort0.toShort();
        int int8 = mutableShort0.intValue();
        int int9 = mutableShort0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -10 + "'", short7.equals((short) -10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10) + "'", int8 == (-10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10) + "'", int9 == (-10));
    }

    @Test
    public void MutableShort0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0603");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        double double2 = mutableShort1.doubleValue();
        java.lang.Short short3 = mutableShort1.toShort();
        java.lang.Short short4 = mutableShort1.getValue();
        mutableShort1.subtract((short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4.equals((short) 1));
    }

    @Test
    public void MutableShort0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0604");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.add((short) 111);
        mutableShort1.add((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void MutableShort0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0605");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        mutableShort1.setValue((short) (byte) 100);
        java.lang.Short short5 = mutableShort1.toShort();
        float float6 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void MutableShort0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0606");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        float float2 = mutableShort1.floatValue();
        java.lang.Short short3 = mutableShort1.getValue();
        mutableShort1.increment();
        byte byte5 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 9 + "'", short3.equals((short) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
    }

    @Test
    public void MutableShort0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0607");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        double double2 = mutableShort1.doubleValue();
        int int3 = mutableShort1.intValue();
        java.lang.Short short4 = mutableShort1.getValue();
        java.lang.Short short5 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 8 + "'", short4.equals((short) 8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 8 + "'", short5.equals((short) 8));
    }

    @Test
    public void MutableShort0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0608");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        float float6 = mutableShort1.floatValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
    }

    @Test
    public void MutableShort0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0609");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) short6);
        java.lang.Short short8 = mutableShort7.toShort();
        byte byte9 = mutableShort7.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 11 + "'", short6 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 11 + "'", short8.equals((short) 11));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 11 + "'", byte9 == (byte) 11);
    }

    @Test
    public void MutableShort0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0610");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        mutableShort1.increment();
        java.lang.String str5 = mutableShort1.toString();
        short short6 = mutableShort1.shortValue();
        mutableShort1.decrement();
        mutableShort1.decrement();
        java.lang.Short short9 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9.equals((short) -1));
    }

    @Test
    public void MutableShort0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0611");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10L);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int4 = mutableShort3.intValue();
        mutableShort3.setValue((java.lang.Number) 9.0f);
        long long7 = mutableShort3.longValue();
        int int8 = mutableShort1.compareTo(mutableShort3);
        java.lang.Short short9 = mutableShort3.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 9 + "'", short9.equals((short) 9));
    }

    @Test
    public void MutableShort0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0612");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        mutableShort1.subtract((short) (byte) 1);
        float float4 = mutableShort1.floatValue();
        java.lang.Short short5 = mutableShort1.toShort();
        byte byte6 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 7.0f + "'", float4 == 7.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 7 + "'", short5.equals((short) 7));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 7 + "'", byte6 == (byte) 7);
    }

    @Test
    public void MutableShort0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0613");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.decrement();
        double double4 = mutableShort1.doubleValue();
        java.lang.Short short5 = mutableShort1.getValue();
        byte byte6 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.0d) + "'", double4 == (-2.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -2 + "'", short5.equals((short) -2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -2 + "'", byte6 == (byte) -2);
    }

    @Test
    public void MutableShort0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0614");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("10");
        int int4 = mutableShort3.intValue();
        java.lang.Short short5 = mutableShort3.toShort();
        boolean boolean6 = mutableShort1.equals((java.lang.Object) short5);
        int int7 = mutableShort1.intValue();
        short short8 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void MutableShort0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0615");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((java.lang.Number) 9.0f);
        long long5 = mutableShort1.longValue();
        short short6 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9L + "'", long5 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
    }

    @Test
    public void MutableShort0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0616");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        mutableShort1.setValue((short) 18);
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
    }

    @Test
    public void MutableShort0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0617");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        short short7 = mutableShort1.shortValue();
        int int8 = mutableShort1.intValue();
        java.lang.Class<?> wildcardClass9 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 11 + "'", short6 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0618");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        long long5 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void MutableShort0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0619");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        long long5 = mutableShort1.longValue();
        java.lang.Short short6 = mutableShort1.toShort();
        int int7 = mutableShort1.intValue();
        java.lang.Short short8 = mutableShort1.toShort();
        java.lang.Short short9 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9.equals((short) 10));
    }

    @Test
    public void MutableShort0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0620");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 9);
        double double2 = mutableShort1.doubleValue();
        long long3 = mutableShort1.longValue();
        mutableShort1.subtract((short) (byte) 20);
        mutableShort1.subtract((java.lang.Number) (-10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9L + "'", long3 == 9L);
    }

    @Test
    public void MutableShort0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0621");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (-1.0f));
    }

    @Test
    public void MutableShort0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0622");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) -102);
    }

    @Test
    public void MutableShort0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0623");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        java.lang.Short short7 = mutableShort1.getValue();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 7 + "'", short7.equals((short) 7));
    }

    @Test
    public void MutableShort0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0624");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        mutableShort0.setValue((java.lang.Number) (-1.0f));
        mutableShort0.setValue((short) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void MutableShort0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0625");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        int int4 = mutableShort0.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) int4);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) int4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void MutableShort0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0626");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        mutableShort1.subtract((short) (byte) 1);
        mutableShort1.setValue((short) (byte) -1);
        short short6 = mutableShort1.shortValue();
        mutableShort1.setValue((short) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
    }

    @Test
    public void MutableShort0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0627");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        mutableShort1.increment();
        java.lang.Class<?> wildcardClass8 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableShort0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0628");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 100.0f);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
    }

    @Test
    public void MutableShort0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0629");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 18);
        short short2 = mutableShort1.shortValue();
        mutableShort1.subtract((short) (byte) 19);
        java.lang.Short short5 = mutableShort1.toShort();
        java.lang.String str6 = mutableShort1.toString();
        mutableShort1.setValue((short) (byte) 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 18 + "'", short2 == (short) 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1" + "'", str6.equals("-1"));
    }

    @Test
    public void MutableShort0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0630");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        short short5 = mutableShort1.shortValue();
        float float6 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 110 + "'", short5 == (short) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 110.0f + "'", float6 == 110.0f);
    }

    @Test
    public void MutableShort0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0631");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        int int8 = mutableShort1.compareTo(mutableShort7);
        short short9 = mutableShort7.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void MutableShort0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0632");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        java.lang.Short short7 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 11 + "'", short6 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7.equals((short) 11));
    }

    @Test
    public void MutableShort0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0633");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) 11);
        short short5 = mutableShort1.shortValue();
        long long6 = mutableShort1.longValue();
        java.lang.Short short7 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
    }

    @Test
    public void MutableShort0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0634");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        mutableShort1.subtract((short) (byte) 0);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort("100");
        java.lang.Short short6 = mutableShort5.toShort();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) mutableShort5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableShort0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0635");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        long long5 = mutableShort1.longValue();
        mutableShort1.decrement();
        mutableShort1.add((short) (byte) 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void MutableShort0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0636");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.increment();
        float float6 = mutableShort1.floatValue();
        byte byte7 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 8.0f + "'", float6 == 8.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 8 + "'", byte7 == (byte) 8);
    }

    @Test
    public void MutableShort0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0637");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        java.lang.String str5 = mutableShort1.toString();
        long long6 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12" + "'", str5.equals("12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 12L + "'", long6 == 12L);
    }

    @Test
    public void MutableShort0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0638");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        java.lang.String str7 = mutableShort1.toString();
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void MutableShort0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0639");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Short short5 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 7);
        mutableShort1.subtract((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
    }

    @Test
    public void MutableShort0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0640");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 29);
    }

    @Test
    public void MutableShort0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0641");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0L);
        mutableShort1.decrement();
        mutableShort1.increment();
    }

    @Test
    public void MutableShort0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0642");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        mutableShort1.setValue((short) (byte) 0);
        mutableShort1.increment();
    }

    @Test
    public void MutableShort0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0643");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        float float7 = mutableShort1.floatValue();
        mutableShort1.increment();
        java.lang.Short short9 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 11 + "'", short9.equals((short) 11));
    }

    @Test
    public void MutableShort0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0644");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        mutableShort1.add((short) 0);
        float float4 = mutableShort1.floatValue();
        int int5 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void MutableShort0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0645");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        int int4 = mutableShort0.intValue();
        mutableShort0.add((short) -10);
        java.lang.Short short7 = mutableShort0.toShort();
        int int8 = mutableShort0.intValue();
        float float9 = mutableShort0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -10 + "'", short7.equals((short) -10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10) + "'", int8 == (-10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-10.0f) + "'", float9 == (-10.0f));
    }

    @Test
    public void MutableShort0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0646");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        float float6 = mutableShort1.floatValue();
        mutableShort1.setValue((short) 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
    }

    @Test
    public void MutableShort0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0647");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        mutableShort0.setValue((java.lang.Number) (-1.0f));
        java.lang.Short short5 = mutableShort0.getValue();
        mutableShort0.subtract((short) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5.equals((short) -1));
    }

    @Test
    public void MutableShort0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0648");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        mutableShort0.setValue((java.lang.Number) (-1.0f));
        java.lang.Short short5 = mutableShort0.getValue();
        mutableShort0.decrement();
        java.lang.Short short7 = mutableShort0.getValue();
        float float8 = mutableShort0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -2 + "'", short7.equals((short) -2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-2.0f) + "'", float8 == (-2.0f));
    }

    @Test
    public void MutableShort0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0649");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("-10");
        mutableShort1.subtract((java.lang.Number) mutableShort3);
        java.lang.Short short5 = mutableShort1.toShort();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 20 + "'", short5.equals((short) 20));
    }

    @Test
    public void MutableShort0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0650");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        float float2 = mutableShort1.floatValue();
        java.lang.Short short3 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort5.subtract((short) (byte) 8);
        boolean boolean8 = mutableShort1.equals((java.lang.Object) (byte) 8);
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void MutableShort0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0651");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 111);
    }

    @Test
    public void MutableShort0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0652");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Short short5 = mutableShort1.getValue();
        mutableShort1.increment();
        byte byte7 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7 == (byte) 11);
    }

    @Test
    public void MutableShort0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0653");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        mutableShort0.setValue((java.lang.Number) (-1.0f));
        java.lang.Short short5 = mutableShort0.getValue();
        java.lang.Short short6 = mutableShort0.getValue();
        int int7 = mutableShort0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void MutableShort0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0654");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.decrement();
        double double4 = mutableShort1.doubleValue();
        java.lang.Short short5 = mutableShort1.getValue();
        long long6 = mutableShort1.longValue();
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.0d) + "'", double4 == (-2.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -2 + "'", short5.equals((short) -2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2L) + "'", long6 == (-2L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0655");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        short short2 = mutableShort1.shortValue();
        java.lang.Short short3 = mutableShort1.toShort();
        float float4 = mutableShort1.floatValue();
        long long5 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void MutableShort0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0656");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        double double2 = mutableShort1.doubleValue();
        java.lang.Class<?> wildcardClass3 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableShort0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0657");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        java.lang.Short short2 = mutableShort1.toShort();
        float float3 = mutableShort1.floatValue();
        java.lang.String str4 = mutableShort1.toString();
        mutableShort1.increment();
        java.lang.Short short6 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6.equals((short) 1));
    }

    @Test
    public void MutableShort0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0658");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.subtract((short) (byte) 7);
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableShort0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0659");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int3 = mutableShort2.intValue();
        mutableShort2.setValue((short) (byte) 10);
        mutableShort2.subtract((short) (byte) 1);
        boolean boolean8 = mutableShort0.equals((java.lang.Object) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableShort0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0660");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        java.lang.Short short7 = mutableShort1.getValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
    }

    @Test
    public void MutableShort0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0661");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        mutableShort1.subtract((short) (byte) 1);
        int int4 = mutableShort1.intValue();
        java.lang.Short short5 = mutableShort1.getValue();
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in MutableShort generation
        try {
            mutableShort1.setValue(number6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 7 + "'", short5.equals((short) 7));
    }

    @Test
    public void MutableShort0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0662");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        int int2 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.setValue((java.lang.Number) 10.0f);
        long long6 = mutableShort1.longValue();
        int int7 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void MutableShort0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0663");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) -100);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -10);
        mutableShort1.setValue((java.lang.Number) mutableShort3);
        java.lang.Class<?> wildcardClass5 = mutableShort3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableShort0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0664");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) -10);
    }

    @Test
    public void MutableShort0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0665");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        java.lang.Short short2 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short5 = mutableShort4.getValue();
        mutableShort4.add((short) (byte) 100);
        mutableShort1.add((java.lang.Number) mutableShort4);
        int int9 = mutableShort4.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
    }

    @Test
    public void MutableShort0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0666");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("12");
        mutableShort1.add((short) (byte) 100);
        double double4 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 112.0d + "'", double4 == 112.0d);
    }

    @Test
    public void MutableShort0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0667");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int4 = mutableShort3.intValue();
        mutableShort3.subtract((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort3);
        int int8 = mutableShort1.compareTo(mutableShort7);
        mutableShort7.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void MutableShort0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0668");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        java.lang.String str2 = mutableShort1.toString();
        byte byte3 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0" + "'", str2.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void MutableShort0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0669");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.setValue((short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
    }

    @Test
    public void MutableShort0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0670");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 9);
        double double5 = mutableShort4.doubleValue();
        double double6 = mutableShort4.doubleValue();
        boolean boolean8 = mutableShort4.equals((java.lang.Object) "9");
        mutableShort1.add((java.lang.Number) mutableShort4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 9.0d + "'", double5 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableShort0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0671");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        java.lang.String str3 = mutableShort0.toString();
        java.lang.Short short4 = mutableShort0.getValue();
        float float5 = mutableShort0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void MutableShort0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0672");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        long long5 = mutableShort1.longValue();
        java.lang.Short short6 = mutableShort1.toShort();
        mutableShort1.setValue((short) (byte) 0);
        java.lang.String str9 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void MutableShort0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0673");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 7);
    }

    @Test
    public void MutableShort0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0674");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        mutableShort1.add((java.lang.Number) (short) 0);
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void MutableShort0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0675");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0L);
    }

    @Test
    public void MutableShort0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0676");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.toShort();
        java.lang.String str7 = mutableShort1.toString();
        mutableShort1.increment();
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
    }

    @Test
    public void MutableShort0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0677");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.decrement();
        double double4 = mutableShort1.doubleValue();
        java.lang.Short short5 = mutableShort1.getValue();
        long long6 = mutableShort1.longValue();
        java.lang.Short short7 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.0d) + "'", double4 == (-2.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -2 + "'", short5.equals((short) -2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2L) + "'", long6 == (-2L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -2 + "'", short7.equals((short) -2));
    }

    @Test
    public void MutableShort0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0678");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 18);
        short short2 = mutableShort1.shortValue();
        mutableShort1.subtract((short) (byte) 19);
        java.lang.Short short5 = mutableShort1.toShort();
        mutableShort1.subtract((java.lang.Number) 7.0d);
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 18 + "'", short2 == (short) 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -8 + "'", byte8 == (byte) -8);
    }

    @Test
    public void MutableShort0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0679");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        mutableShort1.add((short) (byte) 10);
        byte byte9 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 20 + "'", byte9 == (byte) 20);
    }

    @Test
    public void MutableShort0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0680");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 18);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort3.increment();
        mutableShort3.setValue((short) 111);
        int int7 = mutableShort1.compareTo(mutableShort3);
        float float8 = mutableShort1.floatValue();
        java.lang.Short short9 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 18.0f + "'", float8 == 18.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 18 + "'", short9.equals((short) 18));
    }

    @Test
    public void MutableShort0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0681");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        mutableShort1.add((short) 0);
        java.lang.Short short5 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5.equals((short) 1));
    }

    @Test
    public void MutableShort0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0682");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        mutableShort1.setValue((short) 18);
        double double8 = mutableShort1.doubleValue();
        float float9 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 18.0d + "'", double8 == 18.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 18.0f + "'", float9 == 18.0f);
    }

    @Test
    public void MutableShort0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0683");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        short short2 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort4.add((short) (byte) 8);
        double double7 = mutableShort4.doubleValue();
        int int8 = mutableShort1.compareTo(mutableShort4);
        byte byte9 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.0d + "'", double7 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void MutableShort0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0684");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        mutableShort1.setValue((short) 18);
        java.lang.Short short8 = mutableShort1.toShort();
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 18 + "'", short8.equals((short) 18));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 18 + "'", int9 == 18);
    }

    @Test
    public void MutableShort0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0685");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 7);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) (byte) 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 7 + "'", short2 == (short) 7);
    }

    @Test
    public void MutableShort0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0686");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        mutableShort1.subtract((short) (byte) 1);
        mutableShort1.setValue((short) (byte) -1);
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.String str8 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1" + "'", str8.equals("-1"));
    }

    @Test
    public void MutableShort0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0687");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((java.lang.Number) 9.0f);
        float float5 = mutableShort1.floatValue();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
    }

    @Test
    public void MutableShort0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0688");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        float float3 = mutableShort2.floatValue();
        mutableShort2.add((short) 100);
        long long6 = mutableShort2.longValue();
        mutableShort2.add((short) (byte) 17);
        mutableShort2.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 101L + "'", long6 == 101L);
    }

    @Test
    public void MutableShort0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0689");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) -1);
        mutableShort1.setValue((short) (byte) 100);
        mutableShort1.subtract((short) -1);
    }

    @Test
    public void MutableShort0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0690");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        int int2 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.setValue((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort6);
        mutableShort1.add((java.lang.Number) mutableShort7);
        long long9 = mutableShort7.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void MutableShort0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0691");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short1 = mutableShort0.toShort();
        mutableShort0.setValue((short) (byte) 110);
        java.lang.Short short4 = mutableShort0.toShort();
        short short5 = mutableShort0.shortValue();
        long long6 = mutableShort0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 110 + "'", short4.equals((short) 110));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 110 + "'", short5 == (short) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
    }

    @Test
    public void MutableShort0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0692");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        float float2 = mutableShort1.floatValue();
        java.lang.Short short3 = mutableShort1.getValue();
        mutableShort1.setValue((short) (byte) 12);
        java.lang.String str6 = mutableShort1.toString();
        int int7 = mutableShort1.intValue();
        java.lang.Short short8 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "12" + "'", str6.equals("12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 12 + "'", short8.equals((short) 12));
    }

    @Test
    public void MutableShort0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0693");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.decrement();
    }

    @Test
    public void MutableShort0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0694");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 9);
        java.lang.Short short5 = mutableShort1.toShort();
        mutableShort1.subtract((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 9 + "'", short5.equals((short) 9));
    }

    @Test
    public void MutableShort0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0695");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 9);
        int int5 = mutableShort1.intValue();
        mutableShort1.increment();
        int int7 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void MutableShort0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0696");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) 11);
        mutableShort1.add((short) 18);
        mutableShort1.increment();
        java.lang.Short short8 = mutableShort1.getValue();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 29 + "'", short8.equals((short) 29));
    }

    @Test
    public void MutableShort0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0697");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        int int4 = mutableShort3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void MutableShort0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0698");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        int int4 = mutableShort0.intValue();
        mutableShort0.add((short) -10);
        java.lang.Short short7 = mutableShort0.toShort();
        int int8 = mutableShort0.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -10 + "'", short7.equals((short) -10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10) + "'", int8 == (-10));
    }

    @Test
    public void MutableShort0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0699");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        int int4 = mutableShort0.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) int4);
        mutableShort5.decrement();
        mutableShort5.decrement();
        mutableShort5.add((short) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void MutableShort0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0700");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        mutableShort1.increment();
        float float8 = mutableShort1.floatValue();
        java.lang.Short short9 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 11 + "'", short6 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 12.0f + "'", float8 == 12.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 12 + "'", short9.equals((short) 12));
    }

    @Test
    public void MutableShort0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0701");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        java.lang.Short short2 = mutableShort1.toShort();
        float float3 = mutableShort1.floatValue();
        java.lang.String str4 = mutableShort1.toString();
        mutableShort1.subtract((short) -93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void MutableShort0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0702");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.toShort();
        mutableShort1.setValue((java.lang.Number) 10.0f);
        byte byte9 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void MutableShort0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0703");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        byte byte5 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void MutableShort0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0704");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        long long4 = mutableShort1.longValue();
        mutableShort1.add((short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void MutableShort0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0705");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        java.lang.Short short2 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short5 = mutableShort4.getValue();
        mutableShort4.add((short) (byte) 100);
        mutableShort1.add((java.lang.Number) mutableShort4);
        double double9 = mutableShort4.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 110.0d + "'", double9 == 110.0d);
    }

    @Test
    public void MutableShort0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0706");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.toShort();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
    }

    @Test
    public void MutableShort0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0707");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.setValue((short) 0);
        double double8 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void MutableShort0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0708");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int4 = mutableShort3.intValue();
        short short5 = mutableShort3.shortValue();
        short short6 = mutableShort3.shortValue();
        mutableShort0.subtract((java.lang.Number) short6);
        java.lang.Short short8 = mutableShort0.getValue();
        java.lang.Class<?> wildcardClass9 = mutableShort0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -10 + "'", short8.equals((short) -10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0709");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        java.lang.Short short7 = mutableShort1.getValue();
        short short8 = mutableShort1.shortValue();
        float float9 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 111 + "'", short7.equals((short) 111));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 111 + "'", short8 == (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 111.0f + "'", float9 == 111.0f);
    }

    @Test
    public void MutableShort0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0710");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        java.lang.Short short7 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Short short9 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 111 + "'", short7.equals((short) 111));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 111 + "'", short9.equals((short) 111));
    }

    @Test
    public void MutableShort0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0711");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 9);
        double double2 = mutableShort1.doubleValue();
        double double3 = mutableShort1.doubleValue();
        boolean boolean5 = mutableShort1.equals((java.lang.Object) "9");
        int int6 = mutableShort1.intValue();
        short short7 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.0d + "'", double3 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 9 + "'", short7 == (short) 9);
    }

    @Test
    public void MutableShort0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0712");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        mutableShort1.setValue((java.lang.Number) (byte) 9);
        java.lang.Short short5 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 9 + "'", short5.equals((short) 9));
    }

    @Test
    public void MutableShort0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0713");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) short6);
        java.lang.Short short8 = mutableShort7.toShort();
        java.lang.Short short9 = mutableShort7.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 11 + "'", short6 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 11 + "'", short8.equals((short) 11));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 11 + "'", short9.equals((short) 11));
    }

    @Test
    public void MutableShort0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0714");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        byte byte4 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
    }

    @Test
    public void MutableShort0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0715");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.setValue((short) 1);
        long long8 = mutableShort1.longValue();
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void MutableShort0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0716");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        java.lang.Short short2 = mutableShort1.getValue();
        java.lang.String str3 = mutableShort1.toString();
        java.lang.String str4 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void MutableShort0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0717");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void MutableShort0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0718");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        long long7 = mutableShort1.longValue();
        java.lang.Short short8 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 111L + "'", long7 == 111L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 111 + "'", short8.equals((short) 111));
    }

    @Test
    public void MutableShort0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0719");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        int int3 = mutableShort1.intValue();
        mutableShort1.decrement();
        float float5 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
    }

    @Test
    public void MutableShort0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0720");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        double double7 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
    }

    @Test
    public void MutableShort0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0721");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        short short7 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        float float9 = mutableShort8.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 11 + "'", short6 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 11.0f + "'", float9 == 11.0f);
    }

    @Test
    public void MutableShort0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0722");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        int int7 = mutableShort1.intValue();
        double double8 = mutableShort1.doubleValue();
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.0d + "'", double8 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9L + "'", long9 == 9L);
    }

    @Test
    public void MutableShort0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0723");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.setValue((short) 0);
        short short7 = mutableShort1.shortValue();
        int int8 = mutableShort1.intValue();
        java.lang.Short short9 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9.equals((short) 0));
    }

    @Test
    public void MutableShort0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0724");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("8");
        java.lang.String str2 = mutableShort1.toString();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "8" + "'", str2.equals("8"));
    }

    @Test
    public void MutableShort0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0725");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        mutableShort1.setValue((short) (byte) 0);
        java.lang.Class<?> wildcardClass9 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0726");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 111);
        mutableShort1.increment();
        java.lang.String str3 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "112" + "'", str3.equals("112"));
    }

    @Test
    public void MutableShort0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0727");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short1 = mutableShort0.toShort();
        int int2 = mutableShort0.intValue();
        mutableShort0.add((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void MutableShort0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0728");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        mutableShort1.add((short) (byte) 10);
        java.lang.Class<?> wildcardClass9 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0729");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        int int2 = mutableShort1.intValue();
        java.lang.String str3 = mutableShort1.toString();
        mutableShort1.setValue((short) 110);
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void MutableShort0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0730");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.decrement();
        long long3 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-2L) + "'", long3 == (-2L));
    }

    @Test
    public void MutableShort0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0731");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        mutableShort1.decrement();
        mutableShort1.subtract((short) 7);
        mutableShort1.add((short) -100);
    }

    @Test
    public void MutableShort0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0732");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        java.lang.Short short7 = mutableShort1.getValue();
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 111 + "'", short7.equals((short) 111));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 111 + "'", byte8 == (byte) 111);
    }

    @Test
    public void MutableShort0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0733");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        mutableShort1.setValue((short) 18);
        java.lang.Class<?> wildcardClass8 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableShort0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0734");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort2.add((short) 6);
    }

    @Test
    public void MutableShort0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0735");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort2.add((short) (byte) 100);
        long long5 = mutableShort2.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
    }

    @Test
    public void MutableShort0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0736");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        mutableShort1.setValue((short) (byte) 100);
        java.lang.Short short5 = mutableShort1.toShort();
        java.lang.Class<?> wildcardClass6 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableShort0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0737");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) 11);
        short short5 = mutableShort1.shortValue();
        long long6 = mutableShort1.longValue();
        java.lang.String str7 = mutableShort1.toString();
        double double8 = mutableShort1.doubleValue();
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void MutableShort0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0738");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Class<?> wildcardClass6 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableShort0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0739");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.increment();
        mutableShort1.setValue((short) 111);
        mutableShort1.decrement();
    }

    @Test
    public void MutableShort0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0740");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("12");
        java.lang.String str2 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "12" + "'", str2.equals("12"));
    }

    @Test
    public void MutableShort0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0741");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) mutableShort6);
        java.lang.String str8 = mutableShort6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void MutableShort0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0742");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        int int2 = mutableShort1.intValue();
        float float3 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void MutableShort0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0743");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        mutableShort1.subtract((short) (byte) 1);
        int int4 = mutableShort1.intValue();
        java.lang.Short short5 = mutableShort1.getValue();
        mutableShort1.add((short) 29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 7 + "'", short5.equals((short) 7));
    }

    @Test
    public void MutableShort0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0744");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        int int4 = mutableShort3.intValue();
        mutableShort3.setValue((short) (byte) 9);
        java.lang.String str7 = mutableShort3.toString();
        boolean boolean8 = mutableShort1.equals((java.lang.Object) str7);
        java.lang.Short short9 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "9" + "'", str7.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9.equals((short) 0));
    }

    @Test
    public void MutableShort0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0745");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("12");
        byte byte2 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 12 + "'", byte2 == (byte) 12);
    }

    @Test
    public void MutableShort0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0746");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        java.lang.String str5 = mutableShort1.toString();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12" + "'", str5.equals("12"));
    }

    @Test
    public void MutableShort0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0747");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        java.lang.String str6 = mutableShort1.toString();
        mutableShort1.add((short) (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
    }

    @Test
    public void MutableShort0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0748");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        java.lang.String str2 = mutableShort1.toString();
        java.lang.Short short3 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0" + "'", str2.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
    }

    @Test
    public void MutableShort0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0749");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        mutableShort1.setValue((short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
    }

    @Test
    public void MutableShort0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0750");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (short) -93);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        float float4 = mutableShort3.floatValue();
        int int5 = mutableShort3.intValue();
        mutableShort1.setValue((java.lang.Number) int5);
        mutableShort1.setValue((short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void MutableShort0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0751");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.subtract((short) (byte) 8);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.add((short) (byte) 100);
        java.lang.String str8 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-8.0f) + "'", float5 == (-8.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "92" + "'", str8.equals("92"));
    }

    @Test
    public void MutableShort0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0752");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        int int3 = mutableShort1.intValue();
        mutableShort1.decrement();
        short short5 = mutableShort1.shortValue();
        java.lang.String str6 = mutableShort1.toString();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 9 + "'", short5 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "9" + "'", str6.equals("9"));
    }

    @Test
    public void MutableShort0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0753");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        long long1 = mutableShort0.longValue();
        mutableShort0.setValue((short) -1);
        long long4 = mutableShort0.longValue();
        int int5 = mutableShort0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void MutableShort0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0754");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("-10");
        mutableShort1.subtract((short) -2);
    }

    @Test
    public void MutableShort0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0755");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 20);
        mutableShort1.add((short) 0);
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void MutableShort0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0756");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        int int5 = mutableShort1.intValue();
        java.lang.String str6 = mutableShort1.toString();
        short short7 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "12" + "'", str6.equals("12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 12 + "'", short7 == (short) 12);
    }

    @Test
    public void MutableShort0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0757");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        int int4 = mutableShort0.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) int4);
        mutableShort5.decrement();
        int int7 = mutableShort5.intValue();
        long long8 = mutableShort5.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void MutableShort0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0758");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        mutableShort0.setValue((java.lang.Number) (-1.0f));
        java.lang.Short short5 = mutableShort0.getValue();
        short short6 = mutableShort0.shortValue();
        float float7 = mutableShort0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void MutableShort0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0759");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        long long5 = mutableShort1.longValue();
        java.lang.Short short6 = mutableShort1.toShort();
        float float7 = mutableShort1.floatValue();
        long long8 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void MutableShort0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0760");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 18);
        short short2 = mutableShort1.shortValue();
        mutableShort1.subtract((short) (byte) 11);
        float float5 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 18 + "'", short2 == (short) 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 7.0f + "'", float5 == 7.0f);
    }

    @Test
    public void MutableShort0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0761");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (short) 110);
        mutableShort1.increment();
        double double3 = mutableShort1.doubleValue();
        java.lang.String str4 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 111.0d + "'", double3 == 111.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "111" + "'", str4.equals("111"));
    }

    @Test
    public void MutableShort0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0762");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        short short5 = mutableShort1.shortValue();
        long long6 = mutableShort1.longValue();
        mutableShort1.add((short) 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void MutableShort0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0763");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) float5);
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort("0");
        mutableShort6.setValue((java.lang.Number) mutableShort8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void MutableShort0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0764");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 100);
        int int2 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void MutableShort0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0765");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        long long4 = mutableShort1.longValue();
        java.lang.Short short5 = mutableShort1.getValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 7L + "'", long4 == 7L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 7 + "'", short5.equals((short) 7));
    }

    @Test
    public void MutableShort0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0766");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        java.lang.Short short7 = mutableShort1.getValue();
        int int8 = mutableShort1.intValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 111 + "'", short7.equals((short) 111));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 111 + "'", int8 == 111);
    }

    @Test
    public void MutableShort0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0767");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 9);
        double double2 = mutableShort1.doubleValue();
        long long3 = mutableShort1.longValue();
        mutableShort1.subtract((short) (byte) 20);
        float float6 = mutableShort1.floatValue();
        byte byte7 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9L + "'", long3 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-11.0f) + "'", float6 == (-11.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -11 + "'", byte7 == (byte) -11);
    }

    @Test
    public void MutableShort0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0768");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.String str8 = mutableShort7.toString();
        int int9 = mutableShort7.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "9" + "'", str8.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void MutableShort0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0769");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        int int5 = mutableShort1.intValue();
        java.lang.String str6 = mutableShort1.toString();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "12" + "'", str6.equals("12"));
    }

    @Test
    public void MutableShort0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0770");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        java.lang.Short short4 = mutableShort0.toShort();
        int int5 = mutableShort0.intValue();
        java.lang.String str6 = mutableShort0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
    }

    @Test
    public void MutableShort0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0771");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 9);
        int int5 = mutableShort1.intValue();
        mutableShort1.increment();
        float float7 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void MutableShort0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0772");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short6 = mutableShort5.toShort();
        int int7 = mutableShort1.compareTo(mutableShort5);
        mutableShort5.decrement();
        java.lang.String str9 = mutableShort5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-1" + "'", str9.equals("-1"));
    }

    @Test
    public void MutableShort0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0773");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int4 = mutableShort3.intValue();
        short short5 = mutableShort3.shortValue();
        short short6 = mutableShort3.shortValue();
        mutableShort0.subtract((java.lang.Number) short6);
        mutableShort0.setValue((short) -102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
    }

    @Test
    public void MutableShort0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0774");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.subtract((short) (byte) 8);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        int int6 = mutableShort1.intValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-8.0f) + "'", float5 == (-8.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-8) + "'", int6 == (-8));
    }

    @Test
    public void MutableShort0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0775");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort4);
        mutableShort1.add((java.lang.Number) mutableShort5);
        double double7 = mutableShort5.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void MutableShort0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0776");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        double double6 = mutableShort1.doubleValue();
        mutableShort1.add((short) 18);
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (short) 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void MutableShort0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0777");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.String str5 = mutableShort4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void MutableShort0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0778");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("100");
        java.lang.Short short2 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.String str4 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
    }

    @Test
    public void MutableShort0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0779");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort3.add((short) (byte) 8);
        double double6 = mutableShort3.doubleValue();
        mutableShort3.increment();
        mutableShort1.add((java.lang.Number) mutableShort3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.0d + "'", double6 == 7.0d);
    }

    @Test
    public void MutableShort0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0780");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((java.lang.Number) 9.0f);
        short short5 = mutableShort1.shortValue();
        mutableShort1.increment();
        java.lang.Short short7 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 9 + "'", short5 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
    }

    @Test
    public void MutableShort0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0781");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.increment();
        java.lang.String str5 = mutableShort1.toString();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "8" + "'", str5.equals("8"));
    }

    @Test
    public void MutableShort0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0782");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("-10");
        mutableShort1.subtract((java.lang.Number) mutableShort3);
        java.lang.String str5 = mutableShort3.toString();
        mutableShort3.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-10" + "'", str5.equals("-10"));
    }

    @Test
    public void MutableShort0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0783");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        mutableShort1.add((short) 0);
        int int4 = mutableShort1.intValue();
        int int5 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) int5);
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) int5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void MutableShort0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0784");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        float float7 = mutableShort1.floatValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) float7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void MutableShort0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0785");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.add((short) 0);
        mutableShort1.subtract((short) 0);
        mutableShort1.setValue((short) -1);
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void MutableShort0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0786");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        float float3 = mutableShort2.floatValue();
        mutableShort2.add((short) 100);
        long long6 = mutableShort2.longValue();
        mutableShort2.add((short) (byte) 17);
        java.lang.String str9 = mutableShort2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 101L + "'", long6 == 101L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "118" + "'", str9.equals("118"));
    }

    @Test
    public void MutableShort0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0787");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 110);
        mutableShort1.decrement();
    }

    @Test
    public void MutableShort0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0788");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        mutableShort1.subtract((short) (byte) 12);
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0789");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        mutableShort2.subtract((short) (byte) 11);
    }

    @Test
    public void MutableShort0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0790");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        java.lang.Short short7 = mutableShort1.getValue();
        double double8 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 11 + "'", short6 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7.equals((short) 11));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
    }

    @Test
    public void MutableShort0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0791");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        java.lang.Short short6 = mutableShort1.getValue();
        java.lang.Short short7 = mutableShort1.getValue();
        mutableShort1.increment();
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
    }

    @Test
    public void MutableShort0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0792");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void MutableShort0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0793");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        int int5 = mutableShort1.intValue();
        long long6 = mutableShort1.longValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void MutableShort0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0794");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        int int2 = mutableShort1.intValue();
        java.lang.Short short3 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3.equals((short) 10));
    }

    @Test
    public void MutableShort0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0795");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Short short5 = mutableShort1.toShort();
        java.lang.String str6 = mutableShort1.toString();
        short short7 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
    }

    @Test
    public void MutableShort0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0796");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        float float7 = mutableShort1.floatValue();
        java.lang.Short short8 = mutableShort1.toShort();
        float float9 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 9 + "'", short8.equals((short) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 9.0f + "'", float9 == 9.0f);
    }

    @Test
    public void MutableShort0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0797");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("7");
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short3 = mutableShort2.toShort();
        mutableShort2.setValue((short) (byte) 110);
        java.lang.Short short6 = mutableShort2.toShort();
        mutableShort2.setValue((short) 0);
        mutableShort1.subtract((java.lang.Number) mutableShort2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 110 + "'", short6.equals((short) 110));
    }

    @Test
    public void MutableShort0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0798");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        short short6 = mutableShort1.shortValue();
        int int7 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void MutableShort0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0799");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        int int5 = mutableShort1.intValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void MutableShort0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0800");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        mutableShort1.increment();
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void MutableShort0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0801");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        short short2 = mutableShort1.shortValue();
        java.lang.Short short3 = mutableShort1.toShort();
        byte byte4 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void MutableShort0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0802");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        double double2 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void MutableShort0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0803");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        mutableShort1.subtract((short) 6);
    }

    @Test
    public void MutableShort0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0804");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("12");
        mutableShort1.add((short) (byte) 100);
        int int4 = mutableShort1.intValue();
        double double5 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 112 + "'", int4 == 112);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 112.0d + "'", double5 == 112.0d);
    }

    @Test
    public void MutableShort0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0805");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        mutableShort0.setValue((short) (byte) 9);
        mutableShort0.increment();
        long long6 = mutableShort0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void MutableShort0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0806");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Object obj3 = null;
        boolean boolean4 = mutableShort2.equals(obj3);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort6.increment();
        mutableShort6.decrement();
        boolean boolean9 = mutableShort2.equals((java.lang.Object) mutableShort6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableShort0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0807");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        double double5 = mutableShort1.doubleValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 112);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void MutableShort0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0808");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        mutableShort1.setValue((short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
    }

    @Test
    public void MutableShort0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0809");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.decrement();
        double double4 = mutableShort1.doubleValue();
        java.lang.Short short5 = mutableShort1.getValue();
        long long6 = mutableShort1.longValue();
        java.lang.Short short7 = mutableShort1.getValue();
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.0d) + "'", double4 == (-2.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -2 + "'", short5.equals((short) -2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2L) + "'", long6 == (-2L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -2 + "'", short7.equals((short) -2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -2 + "'", byte8 == (byte) -2);
    }

    @Test
    public void MutableShort0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0810");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        double double7 = mutableShort1.doubleValue();
        long long8 = mutableShort1.longValue();
        java.lang.Class<?> wildcardClass9 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 111.0d + "'", double7 == 111.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 111L + "'", long8 == 111L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0811");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short1 = mutableShort0.toShort();
        mutableShort0.add((short) (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1.equals((short) 0));
    }

    @Test
    public void MutableShort0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0812");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        long long5 = mutableShort1.longValue();
        java.lang.Short short6 = mutableShort1.toShort();
        int int7 = mutableShort1.intValue();
        float float8 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void MutableShort0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0813");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        long long5 = mutableShort1.longValue();
        java.lang.Short short6 = mutableShort1.toShort();
        mutableShort1.setValue((short) (byte) 0);
        short short9 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void MutableShort0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0814");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 8);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int4 = mutableShort3.intValue();
        short short5 = mutableShort3.shortValue();
        short short6 = mutableShort3.shortValue();
        mutableShort1.setValue((java.lang.Number) mutableShort3);
        java.lang.String str8 = mutableShort3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
    }

    @Test
    public void MutableShort0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0815");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        java.lang.Short short7 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 111 + "'", short7.equals((short) 111));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 111.0d + "'", double9 == 111.0d);
    }

    @Test
    public void MutableShort0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0816");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) 11);
        short short5 = mutableShort1.shortValue();
        double double6 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void MutableShort0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0817");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 111);
        mutableShort1.add((java.lang.Number) 111);
        int int5 = mutableShort1.intValue();
        java.lang.Short short6 = mutableShort1.getValue();
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 111 + "'", int5 == 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 111 + "'", short6.equals((short) 111));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0818");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.decrement();
        mutableShort1.subtract((short) (byte) -1);
    }

    @Test
    public void MutableShort0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0819");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        double double2 = mutableShort1.doubleValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) double2);
        mutableShort3.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void MutableShort0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0820");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.setValue((short) 1);
        long long8 = mutableShort1.longValue();
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableShort0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0821");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (short) 110);
        mutableShort1.subtract((short) 12);
    }

    @Test
    public void MutableShort0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0822");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("111");
    }

    @Test
    public void MutableShort0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0823");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        mutableShort1.decrement();
        mutableShort1.subtract((short) 7);
        int int5 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        double double7 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 92 + "'", int5 == 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 92.0d + "'", double7 == 92.0d);
    }

    @Test
    public void MutableShort0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0824");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        mutableShort1.setValue((java.lang.Number) (short) -93);
    }

    @Test
    public void MutableShort0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0825");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) 11);
        mutableShort1.add((short) 18);
        mutableShort1.increment();
        float float8 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 29.0f + "'", float8 == 29.0f);
    }

    @Test
    public void MutableShort0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0826");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short6 = mutableShort5.toShort();
        int int7 = mutableShort1.compareTo(mutableShort5);
        java.lang.Short short8 = mutableShort5.getValue();
        java.lang.String str9 = mutableShort5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void MutableShort0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0827");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        java.lang.String str3 = mutableShort0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void MutableShort0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0828");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        short short6 = mutableShort1.shortValue();
        int int7 = mutableShort1.intValue();
        java.lang.Short short8 = mutableShort1.toShort();
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void MutableShort0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0829");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) -1);
        mutableShort1.subtract((short) (byte) -8);
    }

    @Test
    public void MutableShort0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0830");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        mutableShort1.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.String str5 = mutableShort4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void MutableShort0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0831");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.increment();
        mutableShort1.setValue((short) 111);
        java.lang.Short short5 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 111 + "'", short5.equals((short) 111));
    }

    @Test
    public void MutableShort0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0832");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        mutableShort1.subtract((short) 0);
        mutableShort1.subtract((short) -10);
        short short6 = mutableShort1.shortValue();
        short short7 = mutableShort1.shortValue();
        mutableShort1.add((short) (byte) 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
    }

    @Test
    public void MutableShort0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0833");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 9);
        short short5 = mutableShort1.shortValue();
        mutableShort1.setValue((short) (byte) -10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 9 + "'", short5 == (short) 9);
    }

    @Test
    public void MutableShort0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0834");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort5);
        mutableShort6.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void MutableShort0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0835");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        float float2 = mutableShort1.floatValue();
        java.lang.String str3 = mutableShort1.toString();
        byte byte4 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "9" + "'", str3.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 9 + "'", byte4 == (byte) 9);
    }

    @Test
    public void MutableShort0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0836");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("8");
        java.lang.String str2 = mutableShort1.toString();
        mutableShort1.add((short) 0);
        int int5 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "8" + "'", str2.equals("8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void MutableShort0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0837");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        int int2 = mutableShort1.intValue();
        java.lang.Short short3 = mutableShort1.toShort();
        mutableShort1.subtract((short) 0);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (short) 0);
        java.lang.Class<?> wildcardClass7 = mutableShort6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0838");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        int int2 = mutableShort1.intValue();
        java.lang.Short short3 = mutableShort1.toShort();
        mutableShort1.subtract((short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3.equals((short) 10));
    }

    @Test
    public void MutableShort0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0839");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10L);
        short short2 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void MutableShort0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0840");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("-2");
        mutableShort1.add((short) 6);
        int int4 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void MutableShort0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0841");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        float float2 = mutableShort1.floatValue();
        java.lang.Short short3 = mutableShort1.getValue();
        java.lang.Short short4 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4.equals((short) 0));
    }

    @Test
    public void MutableShort0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0842");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 8);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int4 = mutableShort3.intValue();
        short short5 = mutableShort3.shortValue();
        short short6 = mutableShort3.shortValue();
        mutableShort1.setValue((java.lang.Number) mutableShort3);
        int int8 = mutableShort3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void MutableShort0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0843");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 111);
        mutableShort1.decrement();
    }

    @Test
    public void MutableShort0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0844");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short1 = mutableShort0.toShort();
        mutableShort0.setValue((short) (byte) 110);
        java.lang.Short short4 = mutableShort0.toShort();
        java.lang.Class<?> wildcardClass5 = mutableShort0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 110 + "'", short4.equals((short) 110));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableShort0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0845");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 100.0f);
        float float2 = mutableShort1.floatValue();
        mutableShort1.increment();
        java.lang.Short short4 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 101 + "'", short4.equals((short) 101));
    }

    @Test
    public void MutableShort0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0846");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        java.lang.Number number4 = null;
        // The following exception was thrown during execution in MutableShort generation
        try {
            mutableShort1.add(number4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableShort0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0847");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        mutableShort1.add((java.lang.Number) 1.0f);
        int int7 = mutableShort1.intValue();
        int int8 = mutableShort1.intValue();
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
    }

    @Test
    public void MutableShort0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0848");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        int int2 = mutableShort1.intValue();
        java.lang.Short short3 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort4);
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 111);
        mutableShort5.add((java.lang.Number) 111);
        boolean boolean9 = mutableShort1.equals((java.lang.Object) mutableShort5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableShort0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0849");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        long long5 = mutableShort1.longValue();
        java.lang.Short short6 = mutableShort1.getValue();
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        long long9 = mutableShort8.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
    }

    @Test
    public void MutableShort0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0850");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("-8");
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        double double4 = mutableShort3.doubleValue();
        mutableShort3.subtract((short) (byte) 0);
        mutableShort1.add((java.lang.Number) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void MutableShort0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0851");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        float float7 = mutableShort1.floatValue();
        double double8 = mutableShort1.doubleValue();
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void MutableShort0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0852");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.decrement();
        mutableShort1.add((short) 18);
        mutableShort1.setValue((short) (byte) -8);
    }

    @Test
    public void MutableShort0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0853");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        java.lang.Short short6 = mutableShort1.toShort();
        int int7 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableShort0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0854");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.setValue((short) (byte) 7);
        long long8 = mutableShort1.longValue();
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 7L + "'", long8 == 7L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
    }

    @Test
    public void MutableShort0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0855");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        mutableShort1.add((java.lang.Number) 1.0f);
        mutableShort1.increment();
        java.lang.Short short8 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 12 + "'", short8.equals((short) 12));
    }

    @Test
    public void MutableShort0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0856");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        long long7 = mutableShort1.longValue();
        java.lang.Short short8 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 111L + "'", long7 == 111L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 111 + "'", short8.equals((short) 111));
    }

    @Test
    public void MutableShort0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0857");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        int int2 = mutableShort1.intValue();
        java.lang.Short short3 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3.equals((short) 10));
    }

    @Test
    public void MutableShort0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0858");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        float float2 = mutableShort1.floatValue();
        double double3 = mutableShort1.doubleValue();
        mutableShort1.increment();
        java.lang.Short short5 = mutableShort1.toShort();
        java.lang.String str6 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void MutableShort0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0859");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        java.lang.String str3 = mutableShort0.toString();
        java.lang.Short short4 = mutableShort0.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) short4);
        mutableShort5.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4.equals((short) 0));
    }

    @Test
    public void MutableShort0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0860");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort2.add((short) -11);
    }

    @Test
    public void MutableShort0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0861");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        int int2 = mutableShort1.intValue();
        float float3 = mutableShort1.floatValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short6 = mutableShort5.getValue();
        mutableShort5.add((short) (byte) 100);
        mutableShort1.add((java.lang.Number) mutableShort5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
    }

    @Test
    public void MutableShort0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0862");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) 9);
    }

    @Test
    public void MutableShort0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0863");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        mutableShort1.subtract((short) 10);
        long long8 = mutableShort1.longValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void MutableShort0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0864");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Short short6 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6.equals((short) 1));
    }

    @Test
    public void MutableShort0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0865");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort3);
        float float5 = mutableShort3.floatValue();
        java.lang.Short short6 = mutableShort3.getValue();
        mutableShort3.decrement();
        mutableShort3.setValue((short) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6.equals((short) 1));
    }

    @Test
    public void MutableShort0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0866");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.increment();
        java.lang.String str6 = mutableShort1.toString();
        float float7 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "8" + "'", str6.equals("8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 8.0f + "'", float7 == 8.0f);
    }

    @Test
    public void MutableShort0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0867");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        float float2 = mutableShort1.floatValue();
        java.lang.Short short3 = mutableShort1.getValue();
        java.lang.Short short4 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 9 + "'", short3.equals((short) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 9 + "'", short4.equals((short) 9));
    }

    @Test
    public void MutableShort0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0868");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 111);
        mutableShort1.add((java.lang.Number) 111);
        int int5 = mutableShort1.intValue();
        float float6 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 111 + "'", int5 == 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 111.0f + "'", float6 == 111.0f);
    }

    @Test
    public void MutableShort0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0869");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        java.lang.Short short2 = mutableShort1.toShort();
        mutableShort1.setValue((short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 8 + "'", short2.equals((short) 8));
    }

    @Test
    public void MutableShort0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0870");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 8);
        mutableShort1.setValue((short) 26);
        long long4 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 26L + "'", long4 == 26L);
    }

    @Test
    public void MutableShort0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0871");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        int int4 = mutableShort0.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) int4);
        java.lang.Short short6 = mutableShort5.toShort();
        int int7 = mutableShort5.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableShort0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0872");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        long long4 = mutableShort1.longValue();
        mutableShort1.add((short) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void MutableShort0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0873");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        float float2 = mutableShort1.floatValue();
        int int3 = mutableShort1.intValue();
        java.lang.String str4 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
    }

    @Test
    public void MutableShort0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0874");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        java.lang.String str3 = mutableShort1.toString();
        java.lang.Short short4 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10" + "'", str3.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4.equals((short) 10));
    }

    @Test
    public void MutableShort0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0875");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        mutableShort0.setValue((short) (byte) 9);
        float float5 = mutableShort0.floatValue();
        mutableShort0.add((java.lang.Number) 17.0f);
        java.lang.Class<?> wildcardClass8 = mutableShort0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableShort0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0876");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        long long2 = mutableShort1.longValue();
        java.lang.String str3 = mutableShort1.toString();
        long long4 = mutableShort1.longValue();
        int int5 = mutableShort1.intValue();
        mutableShort1.increment();
        boolean boolean8 = mutableShort1.equals((java.lang.Object) (short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1" + "'", str3.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableShort0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0877");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("100");
        java.lang.Short short2 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2.equals((short) 100));
    }

    @Test
    public void MutableShort0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0878");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        int int3 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void MutableShort0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0879");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        java.lang.Short short6 = mutableShort1.toShort();
        float float7 = mutableShort1.floatValue();
        long long8 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6.equals((short) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8 == 9L);
    }

    @Test
    public void MutableShort0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0880");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        java.lang.String str6 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
    }

    @Test
    public void MutableShort0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0881");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) -100);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -10);
        mutableShort1.setValue((java.lang.Number) mutableShort3);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort3);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort3);
    }

    @Test
    public void MutableShort0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0882");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.add((short) 0);
        mutableShort1.subtract((short) 0);
        mutableShort1.setValue((short) -1);
        byte byte9 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void MutableShort0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0883");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) -1);
        mutableShort1.setValue((short) (byte) 100);
        java.lang.Short short4 = mutableShort1.toShort();
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        short short7 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 101 + "'", short7 == (short) 101);
    }

    @Test
    public void MutableShort0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0884");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short1 = mutableShort0.toShort();
        mutableShort0.setValue((short) (byte) 110);
        java.lang.Short short4 = mutableShort0.toShort();
        mutableShort0.setValue((short) 0);
        mutableShort0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 110 + "'", short4.equals((short) 110));
    }

    @Test
    public void MutableShort0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0885");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        java.lang.Short short5 = mutableShort1.toShort();
        double double6 = mutableShort1.doubleValue();
        long long7 = mutableShort1.longValue();
        int int8 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void MutableShort0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0886");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("12");
        mutableShort1.add((short) (byte) 100);
        int int4 = mutableShort1.intValue();
        long long5 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 112 + "'", int4 == 112);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 112L + "'", long5 == 112L);
    }

    @Test
    public void MutableShort0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0887");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort5);
        mutableShort6.subtract((short) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void MutableShort0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0888");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 18);
    }

    @Test
    public void MutableShort0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0889");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short1 = mutableShort0.toShort();
        int int2 = mutableShort0.intValue();
        short short3 = mutableShort0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void MutableShort0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0890");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        mutableShort1.add((short) (byte) 100);
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableShort0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0891");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        double double2 = mutableShort1.doubleValue();
        java.lang.Short short3 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
    }

    @Test
    public void MutableShort0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0892");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        java.lang.String str5 = mutableShort1.toString();
        short short6 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableShort0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0893");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.decrement();
        long long4 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9L + "'", long4 == 9L);
    }

    @Test
    public void MutableShort0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0894");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        java.lang.Short short5 = mutableShort1.toShort();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
    }

    @Test
    public void MutableShort0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0895");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        mutableShort1.subtract((short) 0);
        mutableShort1.decrement();
        mutableShort1.increment();
    }

    @Test
    public void MutableShort0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0896");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        mutableShort1.subtract((short) 10);
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void MutableShort0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0897");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        int int2 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) 9);
        boolean boolean5 = mutableShort1.equals((java.lang.Object) mutableShort4);
        int int6 = mutableShort4.intValue();
        double double7 = mutableShort4.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
    }

    @Test
    public void MutableShort0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0898");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.getValue();
        java.lang.Short short7 = mutableShort1.getValue();
        java.lang.String str8 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
    }

    @Test
    public void MutableShort0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0899");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 9);
        double double2 = mutableShort1.doubleValue();
        long long3 = mutableShort1.longValue();
        mutableShort1.subtract((short) (byte) 20);
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9L + "'", long3 == 9L);
    }

    @Test
    public void MutableShort0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0900");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        short short2 = mutableShort1.shortValue();
        java.lang.Short short3 = mutableShort1.toShort();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
    }

    @Test
    public void MutableShort0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0901");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        int int2 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.setValue((java.lang.Number) 10.0f);
        long long6 = mutableShort1.longValue();
        mutableShort1.setValue((short) 8);
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void MutableShort0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0902");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        double double2 = mutableShort1.doubleValue();
        double double3 = mutableShort1.doubleValue();
        double double4 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.0d + "'", double3 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.0d + "'", double4 == 8.0d);
    }

    @Test
    public void MutableShort0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0903");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        int int5 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Short short7 = mutableShort1.toShort();
        java.lang.Class<?> wildcardClass8 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableShort0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0904");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 18);
        short short2 = mutableShort1.shortValue();
        mutableShort1.subtract((short) (byte) 19);
        int int5 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 18 + "'", short2 == (short) 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void MutableShort0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0905");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.setValue((short) 0);
        java.lang.Short short7 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7.equals((short) 0));
    }

    @Test
    public void MutableShort0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0906");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        java.lang.Short short5 = mutableShort1.toShort();
        short short6 = mutableShort1.shortValue();
        java.lang.String str7 = mutableShort1.toString();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
    }

    @Test
    public void MutableShort0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0907");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Short short5 = mutableShort1.getValue();
        double double6 = mutableShort1.doubleValue();
        java.lang.String str7 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
    }

    @Test
    public void MutableShort0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0908");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        short short7 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 11 + "'", short6 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
    }

    @Test
    public void MutableShort0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0909");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        float float7 = mutableShort1.floatValue();
        int int8 = mutableShort1.intValue();
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9L + "'", long9 == 9L);
    }

    @Test
    public void MutableShort0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0910");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        mutableShort1.subtract((short) (byte) 1);
        int int4 = mutableShort1.intValue();
        java.lang.Short short5 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        short short7 = mutableShort6.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 7 + "'", short5.equals((short) 7));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 7 + "'", short7 == (short) 7);
    }

    @Test
    public void MutableShort0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0911");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        double double7 = mutableShort6.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 6.0d + "'", double7 == 6.0d);
    }

    @Test
    public void MutableShort0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0912");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        mutableShort1.decrement();
        java.lang.Class<?> wildcardClass3 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableShort0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0913");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short6 = mutableShort5.toShort();
        int int7 = mutableShort1.compareTo(mutableShort5);
        int int8 = mutableShort1.intValue();
        short short9 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void MutableShort0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0914");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        short short6 = mutableShort1.shortValue();
        short short7 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
    }

    @Test
    public void MutableShort0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0915");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        int int1 = mutableShort0.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort0.subtract((java.lang.Number) mutableShort3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void MutableShort0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0916");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.decrement();
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.0d) + "'", double4 == (-2.0d));
    }

    @Test
    public void MutableShort0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0917");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        mutableShort1.subtract((short) 0);
        mutableShort1.subtract((short) -10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
    }

    @Test
    public void MutableShort0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0918");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean5 = mutableShort3.equals((java.lang.Object) 8.0d);
        mutableShort3.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort3);
        mutableShort1.add((java.lang.Number) mutableShort7);
        float float9 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void MutableShort0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0919");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort6.decrement();
        byte byte8 = mutableShort6.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 9 + "'", byte8 == (byte) 9);
    }

    @Test
    public void MutableShort0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0920");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        float float2 = mutableShort1.floatValue();
        java.lang.Short short3 = mutableShort1.getValue();
        mutableShort1.setValue((short) (byte) 12);
        java.lang.String str6 = mutableShort1.toString();
        float float7 = mutableShort1.floatValue();
        java.lang.Short short8 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "12" + "'", str6.equals("12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 12.0f + "'", float7 == 12.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 12 + "'", short8.equals((short) 12));
    }

    @Test
    public void MutableShort0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0921");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        java.lang.Short short2 = mutableShort1.toShort();
        mutableShort1.increment();
        byte byte4 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 8 + "'", short2.equals((short) 8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 9 + "'", byte4 == (byte) 9);
    }

    @Test
    public void MutableShort0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0922");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        mutableShort2.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort4);
        short short6 = mutableShort4.shortValue();
        java.lang.String str7 = mutableShort4.toString();
        java.lang.Short short8 = mutableShort4.getValue();
        mutableShort2.setValue((java.lang.Number) short8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8.equals((short) 0));
    }

    @Test
    public void MutableShort0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0923");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) 11);
        short short5 = mutableShort1.shortValue();
        long long6 = mutableShort1.longValue();
        float float7 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void MutableShort0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0924");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((java.lang.Number) 9.0f);
        short short5 = mutableShort1.shortValue();
        mutableShort1.increment();
        int int7 = mutableShort1.intValue();
        float float8 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 9 + "'", short5 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void MutableShort0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0925");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("102");
    }

    @Test
    public void MutableShort0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0926");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        mutableShort1.setValue((short) 18);
        mutableShort1.increment();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
    }

    @Test
    public void MutableShort0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0927");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) 20);
        long long5 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 20L + "'", long5 == 20L);
    }

    @Test
    public void MutableShort0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0928");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        byte byte3 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void MutableShort0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0929");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 110);
    }

    @Test
    public void MutableShort0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0930");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) 11);
        short short5 = mutableShort1.shortValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void MutableShort0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0931");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("-10");
        mutableShort1.subtract((java.lang.Number) mutableShort3);
        java.lang.Short short5 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 20 + "'", short5.equals((short) 20));
    }

    @Test
    public void MutableShort0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0932");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) -1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort2);
        short short4 = mutableShort2.shortValue();
        mutableShort2.setValue((short) (byte) 9);
        float float7 = mutableShort2.floatValue();
        boolean boolean8 = mutableShort1.equals((java.lang.Object) mutableShort2);
        byte byte9 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void MutableShort0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0933");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        java.lang.String str7 = mutableShort1.toString();
        java.lang.Short short8 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8.equals((short) 10));
    }

    @Test
    public void MutableShort0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0934");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 9);
        double double2 = mutableShort1.doubleValue();
        boolean boolean4 = mutableShort1.equals((java.lang.Object) 110.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableShort0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0935");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 110);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short4 = mutableShort3.toShort();
        mutableShort3.setValue((short) (byte) 110);
        java.lang.Short short7 = mutableShort3.toShort();
        short short8 = mutableShort3.shortValue();
        int int9 = mutableShort2.compareTo(mutableShort3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 110 + "'", short7.equals((short) 110));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 110 + "'", short8 == (short) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableShort0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0936");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        long long2 = mutableShort1.longValue();
        java.lang.String str3 = mutableShort1.toString();
        mutableShort1.setValue((short) 100);
        mutableShort1.subtract((short) (byte) 0);
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1" + "'", str3.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
    }

    @Test
    public void MutableShort0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0937");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.String str3 = mutableShort2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100" + "'", str3.equals("100"));
    }

    @Test
    public void MutableShort0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0938");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 8);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int4 = mutableShort3.intValue();
        short short5 = mutableShort3.shortValue();
        short short6 = mutableShort3.shortValue();
        mutableShort1.setValue((java.lang.Number) mutableShort3);
        float float8 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void MutableShort0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0939");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        mutableShort1.decrement();
        mutableShort1.subtract((short) 7);
        int int5 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort6.setValue((short) (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 92 + "'", int5 == 92);
    }

    @Test
    public void MutableShort0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0940");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.add((short) 0);
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void MutableShort0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0941");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        mutableShort1.subtract((short) 0);
        mutableShort1.increment();
    }

    @Test
    public void MutableShort0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0942");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        mutableShort1.setValue((short) 18);
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 18 + "'", byte8 == (byte) 18);
    }

    @Test
    public void MutableShort0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0943");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        java.lang.Short short6 = mutableShort1.toShort();
        float float7 = mutableShort1.floatValue();
        mutableShort1.increment();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 11 + "'", short6.equals((short) 11));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 11.0f + "'", float7 == 11.0f);
    }

    @Test
    public void MutableShort0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0944");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("8");
        mutableShort1.setValue((short) (byte) 111);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 20);
        java.lang.Class<?> wildcardClass6 = mutableShort5.getClass();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableShort0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0945");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 20);
        mutableShort1.subtract((short) 8);
        mutableShort1.add((short) 0);
        byte byte6 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 12 + "'", byte6 == (byte) 12);
    }

    @Test
    public void MutableShort0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0946");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        java.lang.Short short7 = mutableShort1.toShort();
        float float8 = mutableShort1.floatValue();
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 9 + "'", short7.equals((short) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 9.0f + "'", float8 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9L + "'", long9 == 9L);
    }

    @Test
    public void MutableShort0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0947");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.increment();
        java.lang.Class<?> wildcardClass6 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableShort0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0948");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short1 = mutableShort0.toShort();
        int int2 = mutableShort0.intValue();
        java.lang.Short short3 = mutableShort0.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
    }

    @Test
    public void MutableShort0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0949");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        mutableShort1.decrement();
        float float3 = mutableShort1.floatValue();
        mutableShort1.subtract((short) (byte) 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void MutableShort0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0950");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        int int4 = mutableShort0.intValue();
        mutableShort0.add((short) -10);
        mutableShort0.decrement();
        java.lang.String str8 = mutableShort0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-11" + "'", str8.equals("-11"));
    }

    @Test
    public void MutableShort0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0951");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) 11);
        mutableShort1.decrement();
        mutableShort1.setValue((short) (byte) 1);
        java.lang.Object obj8 = null;
        boolean boolean9 = mutableShort1.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableShort0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0952");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        int int5 = mutableShort1.intValue();
        java.lang.Short short6 = mutableShort1.toShort();
        java.lang.Short short7 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7.equals((short) 0));
    }

    @Test
    public void MutableShort0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0953");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        float float2 = mutableShort1.floatValue();
        int int3 = mutableShort1.intValue();
        long long4 = mutableShort1.longValue();
        float float5 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void MutableShort0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0954");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        float float2 = mutableShort1.floatValue();
        java.lang.String str3 = mutableShort1.toString();
        double double4 = mutableShort1.doubleValue();
        short short5 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "9" + "'", str3.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 9 + "'", short5 == (short) 9);
    }

    @Test
    public void MutableShort0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0955");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.setValue((short) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void MutableShort0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0956");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 9);
        double double2 = mutableShort1.doubleValue();
        double double3 = mutableShort1.doubleValue();
        boolean boolean5 = mutableShort1.equals((java.lang.Object) "9");
        int int6 = mutableShort1.intValue();
        mutableShort1.increment();
        java.lang.Short short8 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.0d + "'", double3 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8.equals((short) 10));
    }

    @Test
    public void MutableShort0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0957");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        mutableShort1.subtract((short) 12);
        java.lang.Short short8 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 8 + "'", short8.equals((short) 8));
    }

    @Test
    public void MutableShort0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0958");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        int int2 = mutableShort1.intValue();
        java.lang.String str3 = mutableShort1.toString();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        boolean boolean6 = mutableShort1.equals((java.lang.Object) mutableShort5);
        int int7 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableShort0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0959");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("-1");
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short4 = mutableShort3.getValue();
        mutableShort3.add((short) (byte) 100);
        mutableShort1.add((java.lang.Number) mutableShort3);
        mutableShort1.setValue((short) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4.equals((short) 10));
    }

    @Test
    public void MutableShort0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0960");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) -11);
        double double2 = mutableShort1.doubleValue();
        float float3 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-11.0d) + "'", double2 == (-11.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-11.0f) + "'", float3 == (-11.0f));
    }

    @Test
    public void MutableShort0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0961");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 9);
        double double2 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        byte byte4 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 8 + "'", byte4 == (byte) 8);
    }

    @Test
    public void MutableShort0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0962");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        short short6 = mutableShort1.shortValue();
        int int7 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Class<?> wildcardClass9 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0963");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 20);
    }

    @Test
    public void MutableShort0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0964");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("118");
    }

    @Test
    public void MutableShort0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0965");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("-10");
        mutableShort1.subtract((java.lang.Number) mutableShort3);
        java.lang.Short short5 = mutableShort1.toShort();
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in MutableShort generation
        try {
            mutableShort1.setValue(number6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 20 + "'", short5.equals((short) 20));
    }

    @Test
    public void MutableShort0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0966");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -2);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) -2);
    }

    @Test
    public void MutableShort0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0967");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        mutableShort1.subtract((short) 12);
        java.lang.String str8 = mutableShort1.toString();
        java.lang.Short short9 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "8" + "'", str8.equals("8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 8 + "'", short9.equals((short) 8));
    }

    @Test
    public void MutableShort0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0968");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 18);
        double double2 = mutableShort1.doubleValue();
        int int3 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.0d + "'", double2 == 18.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
    }

    @Test
    public void MutableShort0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0969");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort3.increment();
    }

    @Test
    public void MutableShort0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0970");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        mutableShort1.decrement();
        java.lang.Class<?> wildcardClass8 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableShort0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0971");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        long long6 = mutableShort4.longValue();
        float float7 = mutableShort4.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void MutableShort0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0972");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 8);
        mutableShort1.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        long long4 = mutableShort3.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 7L + "'", long4 == 7L);
    }

    @Test
    public void MutableShort0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0973");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        float float2 = mutableShort1.floatValue();
        double double3 = mutableShort1.doubleValue();
        mutableShort1.increment();
        java.lang.Short short5 = mutableShort1.toShort();
        long long6 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void MutableShort0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0974");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        java.lang.String str7 = mutableShort1.toString();
        mutableShort1.add((short) 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
    }

    @Test
    public void MutableShort0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0975");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        mutableShort1.subtract((short) (byte) 1);
        mutableShort1.setValue((short) (byte) -1);
        short short6 = mutableShort1.shortValue();
        mutableShort1.increment();
        mutableShort1.setValue((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
    }

    @Test
    public void MutableShort0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0976");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort4);
        mutableShort1.add((java.lang.Number) mutableShort5);
        java.lang.Short short7 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) short7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 2 + "'", short7.equals((short) 2));
    }

    @Test
    public void MutableShort0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0977");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.increment();
        long long3 = mutableShort1.longValue();
        mutableShort1.setValue((short) (byte) 20);
        byte byte6 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6 == (byte) 20);
    }

    @Test
    public void MutableShort0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0978");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) -100);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -10);
        mutableShort1.setValue((java.lang.Number) mutableShort3);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort3);
        mutableShort3.subtract((java.lang.Number) 9L);
    }

    @Test
    public void MutableShort0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0979");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        int int2 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.setValue((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort6);
        mutableShort1.add((java.lang.Number) mutableShort7);
        float float9 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void MutableShort0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0980");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort();
        long long7 = mutableShort6.longValue();
        mutableShort4.subtract((java.lang.Number) mutableShort6);
        java.lang.String str9 = mutableShort4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10" + "'", str9.equals("10"));
    }

    @Test
    public void MutableShort0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0981");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 18.0f);
    }

    @Test
    public void MutableShort0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0982");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((java.lang.Number) 9.0f);
        short short5 = mutableShort1.shortValue();
        mutableShort1.increment();
        java.lang.Short short7 = mutableShort1.toShort();
        mutableShort1.subtract((short) (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 9 + "'", short5 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
    }

    @Test
    public void MutableShort0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0983");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.setValue((short) 1);
        short short8 = mutableShort1.shortValue();
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void MutableShort0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0984");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.setValue((short) (byte) 7);
        mutableShort1.decrement();
        byte byte9 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 6 + "'", byte9 == (byte) 6);
    }

    @Test
    public void MutableShort0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0985");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        java.lang.Short short2 = mutableShort1.toShort();
        float float3 = mutableShort1.floatValue();
        java.lang.String str4 = mutableShort1.toString();
        double double5 = mutableShort1.doubleValue();
        java.lang.String str6 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
    }

    @Test
    public void MutableShort0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0986");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("-10");
        mutableShort1.subtract((java.lang.Number) mutableShort3);
        java.lang.String str5 = mutableShort3.toString();
        mutableShort3.add((short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-10" + "'", str5.equals("-10"));
    }

    @Test
    public void MutableShort0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0987");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        int int2 = mutableShort1.intValue();
        java.lang.String str3 = mutableShort1.toString();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        boolean boolean6 = mutableShort1.equals((java.lang.Object) mutableShort5);
        java.lang.Class<?> wildcardClass7 = mutableShort5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0988");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        float float3 = mutableShort0.floatValue();
        float float4 = mutableShort0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void MutableShort0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0989");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Short short5 = mutableShort1.toShort();
        long long6 = mutableShort1.longValue();
        float float7 = mutableShort1.floatValue();
        java.lang.Class<?> wildcardClass8 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableShort0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0990");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        java.lang.Short short2 = mutableShort1.getValue();
        long long3 = mutableShort1.longValue();
        short short4 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void MutableShort0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0991");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.decrement();
        java.lang.Short short4 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 99 + "'", short4.equals((short) 99));
    }

    @Test
    public void MutableShort0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0992");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) -8);
        java.lang.String str2 = mutableShort1.toString();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 19);
        mutableShort1.subtract((java.lang.Number) (byte) 19);
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-8" + "'", str2.equals("-8"));
    }

    @Test
    public void MutableShort0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0993");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("20");
    }

    @Test
    public void MutableShort0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0994");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        java.lang.Short short7 = mutableShort1.getValue();
        java.lang.Short short8 = mutableShort1.getValue();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8.equals((short) 10));
    }

    @Test
    public void MutableShort0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0995");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        float float2 = mutableShort1.floatValue();
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int6 = mutableShort5.intValue();
        int int7 = mutableShort5.intValue();
        int int8 = mutableShort1.compareTo(mutableShort5);
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableShort0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0996");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        long long4 = mutableShort1.longValue();
        mutableShort1.setValue((short) (byte) 12);
        mutableShort1.add((short) (byte) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 7L + "'", long4 == 7L);
    }

    @Test
    public void MutableShort0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0997");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.increment();
        java.lang.Short short5 = mutableShort1.toShort();
        double double6 = mutableShort1.doubleValue();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 8 + "'", short5.equals((short) 8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
    }

    @Test
    public void MutableShort0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0998");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 1L);
        long long2 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void MutableShort0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort0999");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 9);
        double double2 = mutableShort1.doubleValue();
        long long3 = mutableShort1.longValue();
        mutableShort1.subtract((short) (byte) 20);
        mutableShort1.decrement();
        mutableShort1.decrement();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9L + "'", long3 == 9L);
    }

    @Test
    public void MutableShort1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.MutableShort1000");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        java.lang.Short short2 = mutableShort1.toShort();
        float float3 = mutableShort1.floatValue();
        java.lang.String str4 = mutableShort1.toString();
        mutableShort1.increment();
        mutableShort1.subtract((short) (byte) 1);
        double double8 = mutableShort1.doubleValue();
        short short9 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }
}

