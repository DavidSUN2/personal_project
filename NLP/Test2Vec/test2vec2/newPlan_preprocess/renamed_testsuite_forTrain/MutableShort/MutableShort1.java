
package MutableShort;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableShort1 {

    public static boolean debug = false;

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0501");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0502");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0503");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0504");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0505");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0506");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort3.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0507");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0508");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0509");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0510");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0511");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0512");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0513");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0514");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.setValue((short) (byte) 8);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0515");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        mutableShort1.decrement();
        mutableShort1.subtract((short) 7);
        int int5 = mutableShort1.intValue();
        mutableShort1.subtract((short) (byte) 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 92 + "'", int5 == 92);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0516");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0517");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0518");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 18L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0519");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        byte byte3 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0520");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0521");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0522");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0523");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0524");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0525");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.decrement();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0526");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        double double2 = mutableShort1.doubleValue();
        java.lang.Class<?> wildcardClass3 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0527");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0528");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0529");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0530");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0531");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.increment();
        long long3 = mutableShort1.longValue();
        mutableShort1.setValue((short) (byte) 20);
        mutableShort1.add((short) (byte) 112);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0532");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0533");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0534");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0535");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) -2);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0536");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        mutableShort1.subtract((short) (byte) 1);
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 7.0f + "'", float4 == 7.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0537");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0538");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0539");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0540");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0541");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0542");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0543");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0544");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        byte byte2 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0545");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0546");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0547");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort2.add((short) (byte) 100);
        mutableShort2.increment();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0548");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0549");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0550");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        mutableShort1.increment();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0551");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0552");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0553");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0554");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0555");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        long long1 = mutableShort0.longValue();
        mutableShort0.add((short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0556");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0557");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0558");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0559");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0560");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (-1L));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0561");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 11);
        mutableShort1.setValue((short) 11);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0562");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.increment();
        mutableShort1.decrement();
        mutableShort1.setValue((short) -10);
        mutableShort1.decrement();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0563");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0564");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0565");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0566");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0567");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0568");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0569");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("-10");
        short short2 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -10 + "'", short2 == (short) -10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0570");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0571");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0572");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.increment();
        mutableShort1.decrement();
        mutableShort1.setValue((short) -10);
        mutableShort1.increment();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0573");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0574");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0575");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0576");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0577");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0578");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort5.subtract((short) -11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0579");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0580");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0581");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0582");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0583");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0584");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        mutableShort1.decrement();
        java.lang.Number number4 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0585");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0586");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0587");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0588");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0589");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0590");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0591");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        byte byte4 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0592");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0593");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0594");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0595");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0596");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0597");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0598");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0599");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0600");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0601");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0602");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0603");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0604");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0605");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0606");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0607");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0608");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0609");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0610");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0611");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0612");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0613");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0614");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0615");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0616");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0617");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0618");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0619");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0620");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0621");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (-1.0f));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0622");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) -102);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0623");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0624");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        mutableShort0.setValue((java.lang.Number) (-1.0f));
        mutableShort0.setValue((short) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0625");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0626");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        mutableShort1.subtract((short) (byte) 1);
        mutableShort1.setValue((short) (byte) -1);
        short short6 = mutableShort1.shortValue();
        mutableShort1.setValue((short) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0627");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0628");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 100.0f);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0629");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0630");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0631");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0632");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0633");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0634");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0635");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0636");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0637");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0638");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0639");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0640");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 29);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0641");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0L);
        mutableShort1.decrement();
        mutableShort1.increment();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0642");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        mutableShort1.setValue((short) (byte) 0);
        mutableShort1.increment();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0643");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0644");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0645");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0646");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0647");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0648");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0649");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("-10");
        mutableShort1.subtract((java.lang.Number) mutableShort3);
        java.lang.Short short5 = mutableShort1.toShort();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 20 + "'", short5.equals((short) 20));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0650");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0651");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 111);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0652");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0653");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0654");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0655");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0656");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        double double2 = mutableShort1.doubleValue();
        java.lang.Class<?> wildcardClass3 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0657");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0658");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0659");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0660");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0661");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        mutableShort1.subtract((short) (byte) 1);
        int int4 = mutableShort1.intValue();
        java.lang.Short short5 = mutableShort1.getValue();
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0662");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0663");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) -100);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -10);
        mutableShort1.setValue((java.lang.Number) mutableShort3);
        java.lang.Class<?> wildcardClass5 = mutableShort3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0664");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) -10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0665");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0666");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("12");
        mutableShort1.add((short) (byte) 100);
        double double4 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 112.0d + "'", double4 == 112.0d);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0667");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0668");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        java.lang.String str2 = mutableShort1.toString();
        byte byte3 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0" + "'", str2.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0669");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0670");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0671");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0672");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0673");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 7);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0674");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0675");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0676");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0677");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0678");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0679");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0680");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0681");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0682");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0683");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0684");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0685");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 7);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) (byte) 17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 7 + "'", short2 == (short) 7);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0686");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0687");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0688");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0689");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) -1);
        mutableShort1.setValue((short) (byte) 100);
        mutableShort1.subtract((short) -1);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0690");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0691");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0692");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0693");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.decrement();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0694");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0695");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0696");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0697");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0698");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0699");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0700");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0701");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0702");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0703");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0704");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0705");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0706");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.toShort();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0707");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0708");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0709");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0710");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0711");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0712");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        mutableShort1.setValue((java.lang.Number) (byte) 9);
        java.lang.Short short5 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 9 + "'", short5.equals((short) 9));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0713");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0714");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0715");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0716");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0717");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0718");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0719");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0720");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0721");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0722");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0723");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0724");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("8");
        java.lang.String str2 = mutableShort1.toString();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "8" + "'", str2.equals("8"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0725");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0726");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 111);
        mutableShort1.increment();
        java.lang.String str3 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "112" + "'", str3.equals("112"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0727");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0728");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0729");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0730");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.decrement();
        long long3 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-2L) + "'", long3 == (-2L));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0731");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        mutableShort1.decrement();
        mutableShort1.subtract((short) 7);
        mutableShort1.add((short) -100);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0732");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0733");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0734");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort2.add((short) 6);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0735");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort2.add((short) (byte) 100);
        long long5 = mutableShort2.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0736");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0737");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0738");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0739");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.increment();
        mutableShort1.setValue((short) 111);
        mutableShort1.decrement();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0740");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("12");
        java.lang.String str2 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "12" + "'", str2.equals("12"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0741");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0742");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        int int2 = mutableShort1.intValue();
        float float3 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0743");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0744");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0745");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("12");
        byte byte2 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 12 + "'", byte2 == (byte) 12);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0746");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        java.lang.String str5 = mutableShort1.toString();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12" + "'", str5.equals("12"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0747");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0748");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        java.lang.String str2 = mutableShort1.toString();
        java.lang.Short short3 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0" + "'", str2.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0749");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        mutableShort1.setValue((short) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0750");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0751");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0752");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0753");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0754");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("-10");
        mutableShort1.subtract((short) -2);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0755");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0756");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0757");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0758");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0759");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0760");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0761");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0762");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0763");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0764");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 100);
        int int2 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0765");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0766");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0767");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0768");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0769");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0770");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0771");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0772");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0773");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0774");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0775");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0776");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0777");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0778");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0779");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0780");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0781");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0782");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("-10");
        mutableShort1.subtract((java.lang.Number) mutableShort3);
        java.lang.String str5 = mutableShort3.toString();
        mutableShort3.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-10" + "'", str5.equals("-10"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0783");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0784");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0785");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0786");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0787");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 110);
        mutableShort1.decrement();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0788");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0789");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        mutableShort2.subtract((short) (byte) 11);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0790");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0791");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0792");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0793");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0794");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        int int2 = mutableShort1.intValue();
        java.lang.Short short3 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3.equals((short) 10));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0795");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0796");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0797");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0798");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0799");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0800");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0801");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0802");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        double double2 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0803");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        mutableShort1.subtract((short) 6);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0804");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0805");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0806");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0807");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0808");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        mutableShort1.setValue((short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0809");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0810");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0811");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short1 = mutableShort0.toShort();
        mutableShort0.add((short) (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1.equals((short) 0));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0812");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0813");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0814");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0815");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0816");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0817");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0818");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.decrement();
        mutableShort1.subtract((short) (byte) -1);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0819");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        double double2 = mutableShort1.doubleValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) double2);
        mutableShort3.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0820");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0821");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (short) 110);
        mutableShort1.subtract((short) 12);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0822");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("111");
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0823");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0824");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        mutableShort1.setValue((java.lang.Number) (short) -93);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0825");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0826");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0827");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        java.lang.String str3 = mutableShort0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0828");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0829");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) -1);
        mutableShort1.subtract((short) (byte) -8);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0830");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0831");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.increment();
        mutableShort1.setValue((short) 111);
        java.lang.Short short5 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 111 + "'", short5.equals((short) 111));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0832");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0833");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0834");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0835");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0836");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0837");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0838");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0839");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10L);
        short short2 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0840");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("-2");
        mutableShort1.add((short) 6);
        int int4 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0841");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0842");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0843");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 111);
        mutableShort1.decrement();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0844");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0845");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0846");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        java.lang.Number number4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableShort1.add(number4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0847");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0848");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0849");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0850");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("-8");
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        double double4 = mutableShort3.doubleValue();
        mutableShort3.subtract((short) (byte) 0);
        mutableShort1.add((java.lang.Number) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0851");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0852");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.decrement();
        mutableShort1.add((short) 18);
        mutableShort1.setValue((short) (byte) -8);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0853");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0854");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0855");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0856");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0857");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0858");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0859");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0860");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort2.add((short) -11);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0861");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0862");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        mutableShort1.setValue((short) 9);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0863");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0864");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0865");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0866");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0867");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0868");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0869");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        java.lang.Short short2 = mutableShort1.toShort();
        mutableShort1.setValue((short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 8 + "'", short2.equals((short) 8));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0870");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 8);
        mutableShort1.setValue((short) 26);
        long long4 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 26L + "'", long4 == 26L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0871");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0872");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0873");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0874");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0875");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0876");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0877");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("100");
        java.lang.Short short2 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2.equals((short) 100));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0878");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        int int3 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0879");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0880");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0881");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) -100);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -10);
        mutableShort1.setValue((java.lang.Number) mutableShort3);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort3);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort3);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0882");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0883");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0884");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0885");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0886");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0887");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0888");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 18);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0889");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0890");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0891");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        double double2 = mutableShort1.doubleValue();
        java.lang.Short short3 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0892");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0893");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0894");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0895");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        mutableShort1.subtract((short) 0);
        mutableShort1.decrement();
        mutableShort1.increment();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0896");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0897");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0898");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0899");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0900");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0901");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0902");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0903");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0904");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0905");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.setValue((short) 0);
        java.lang.Short short7 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7.equals((short) 0));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0906");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0907");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0908");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0909");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0910");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0911");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0912");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        mutableShort1.decrement();
        java.lang.Class<?> wildcardClass3 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0913");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0914");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0915");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        int int1 = mutableShort0.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort0.subtract((java.lang.Number) mutableShort3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0916");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0917");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        mutableShort1.subtract((short) 0);
        mutableShort1.subtract((short) -10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0918");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0919");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0920");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0921");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0922");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0923");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0924");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0925");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("102");
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0926");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0927");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0928");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        byte byte3 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0929");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 110);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0930");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0931");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("-10");
        mutableShort1.subtract((java.lang.Number) mutableShort3);
        java.lang.Short short5 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 20 + "'", short5.equals((short) 20));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0932");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0933");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0934");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 9);
        double double2 = mutableShort1.doubleValue();
        boolean boolean4 = mutableShort1.equals((java.lang.Object) 110.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0935");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0936");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0937");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.String str3 = mutableShort2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100" + "'", str3.equals("100"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0938");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0939");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0940");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.add((short) 0);
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0941");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        mutableShort1.subtract((short) 0);
        mutableShort1.increment();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0942");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0943");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0944");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0945");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 20);
        mutableShort1.subtract((short) 8);
        mutableShort1.add((short) 0);
        byte byte6 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 12 + "'", byte6 == (byte) 12);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0946");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0947");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0948");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0949");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        mutableShort1.decrement();
        float float3 = mutableShort1.floatValue();
        mutableShort1.subtract((short) (byte) 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0950");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0951");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0952");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0953");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0954");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0955");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0956");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0957");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0958");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0959");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0960");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) -11);
        double double2 = mutableShort1.doubleValue();
        float float3 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-11.0d) + "'", double2 == (-11.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-11.0f) + "'", float3 == (-11.0f));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0961");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0962");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0963");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 20);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0964");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("118");
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0965");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("-10");
        mutableShort1.subtract((java.lang.Number) mutableShort3);
        java.lang.Short short5 = mutableShort1.toShort();
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0966");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -2);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) -2);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0967");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0968");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 18);
        double double2 = mutableShort1.doubleValue();
        int int3 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.0d + "'", double2 == 18.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0969");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort3.increment();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0970");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0971");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0972");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 8);
        mutableShort1.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        long long4 = mutableShort3.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 7L + "'", long4 == 7L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0973");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0974");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0975");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0976");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0977");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0978");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) -100);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -10);
        mutableShort1.setValue((java.lang.Number) mutableShort3);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort3);
        mutableShort3.subtract((java.lang.Number) 9L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0979");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0980");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0981");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 18.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0982");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0983");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0984");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0985");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0986");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("-10");
        mutableShort1.subtract((java.lang.Number) mutableShort3);
        java.lang.String str5 = mutableShort3.toString();
        mutableShort3.add((short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-10" + "'", str5.equals("-10"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0987");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0988");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0989");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0990");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0991");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.decrement();
        java.lang.Short short4 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 99 + "'", short4.equals((short) 99));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0992");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) -8);
        java.lang.String str2 = mutableShort1.toString();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 19);
        mutableShort1.subtract((java.lang.Number) (byte) 19);
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-8" + "'", str2.equals("-8"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0993");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("20");
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0994");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0995");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0996");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        long long4 = mutableShort1.longValue();
        mutableShort1.setValue((short) (byte) 12);
        mutableShort1.add((short) (byte) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 7L + "'", long4 == 7L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0997");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0998");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 1L);
        long long2 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test0999");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort1.test1000");
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

