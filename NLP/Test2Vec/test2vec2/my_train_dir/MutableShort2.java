
package MutableShort;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableShort2 {

    public static boolean debug = false;

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1001");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short6 = mutableShort5.toShort();
        int int7 = mutableShort1.compareTo(mutableShort5);
        java.lang.Class<?> wildcardClass8 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1002");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("8");
        mutableShort1.setValue((short) (byte) 111);
        float float4 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 111.0f + "'", float4 == 111.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1003");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        int int5 = mutableShort1.intValue();
        int int6 = mutableShort1.intValue();
        short short7 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 12 + "'", short7 == (short) 12);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1004");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1005");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 100.0f);
        float float2 = mutableShort1.floatValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1006");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("8");
        java.lang.String str2 = mutableShort1.toString();
        int int3 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "8" + "'", str2.equals("8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1007");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.increment();
        java.lang.Class<?> wildcardClass4 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1008");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        double double2 = mutableShort1.doubleValue();
        int int3 = mutableShort1.intValue();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1009");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1010");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 111);
        mutableShort1.add((java.lang.Number) 111);
        int int5 = mutableShort1.intValue();
        java.lang.Short short6 = mutableShort1.getValue();
        java.lang.String str7 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 111 + "'", int5 == 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 111 + "'", short6.equals((short) 111));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "111" + "'", str7.equals("111"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1011");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        int int2 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) 9);
        boolean boolean5 = mutableShort1.equals((java.lang.Object) mutableShort4);
        int int6 = mutableShort4.intValue();
        java.lang.Class<?> wildcardClass7 = mutableShort4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1012");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort5.subtract((short) (byte) 7);
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1013");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        java.lang.Short short5 = mutableShort1.toShort();
        short short6 = mutableShort1.shortValue();
        java.lang.String str7 = mutableShort1.toString();
        byte byte8 = mutableShort1.byteValue();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1014");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        long long2 = mutableShort1.longValue();
        java.lang.String str3 = mutableShort1.toString();
        long long4 = mutableShort1.longValue();
        int int5 = mutableShort1.intValue();
        float float6 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1" + "'", str3.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1015");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        java.lang.Short short5 = mutableShort1.toShort();
        java.lang.Short short6 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 110 + "'", short5.equals((short) 110));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 110 + "'", short6.equals((short) 110));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1016");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        mutableShort1.add((java.lang.Number) (short) 0);
        long long8 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1017");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long4 = mutableShort3.longValue();
        mutableShort3.add((short) 0);
        mutableShort1.subtract((java.lang.Number) mutableShort3);
        java.lang.Short short8 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8.equals((short) -1));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1018");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("-1");
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short4 = mutableShort3.getValue();
        mutableShort3.add((short) (byte) 100);
        mutableShort1.add((java.lang.Number) mutableShort3);
        mutableShort1.setValue((short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4.equals((short) 10));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1019");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        mutableShort1.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Short short5 = mutableShort4.getValue();
        java.lang.String str6 = mutableShort4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1020");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.setValue((short) 1);
        java.lang.Short short8 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8.equals((short) 1));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1021");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Short short5 = mutableShort1.toShort();
        long long6 = mutableShort1.longValue();
        java.lang.Short short7 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1022");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) 0);
        int int8 = mutableShort1.intValue();
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1023");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.increment();
        mutableShort1.setValue((java.lang.Number) 110L);
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
            System.out.format("%n%s%n", "MutableShort2.test1024");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        long long7 = mutableShort1.longValue();
        mutableShort1.setValue((short) (byte) -8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 111L + "'", long7 == 111L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1025");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        int int2 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.setValue((java.lang.Number) 10.0f);
        int int6 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1026");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        java.lang.Short short6 = mutableShort1.getValue();
        java.lang.Short short7 = mutableShort1.getValue();
        float float8 = mutableShort1.floatValue();
        java.lang.Short short9 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9.equals((short) 10));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1027");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        double double7 = mutableShort1.doubleValue();
        java.lang.String str8 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "9" + "'", str8.equals("9"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1028");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        mutableShort0.decrement();
        java.lang.Short short5 = mutableShort0.toShort();
        int int6 = mutableShort0.intValue();
        float float7 = mutableShort0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1029");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        java.lang.Short short5 = mutableShort1.toShort();
        double double6 = mutableShort1.doubleValue();
        double double7 = mutableShort1.doubleValue();
        byte byte8 = mutableShort1.byteValue();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1030");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 18);
        long long2 = mutableShort1.longValue();
        long long3 = mutableShort1.longValue();
        mutableShort1.increment();
        mutableShort1.decrement();
        byte byte6 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 18L + "'", long3 == 18L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 18 + "'", byte6 == (byte) 18);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1031");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort();
        long long7 = mutableShort6.longValue();
        mutableShort4.subtract((java.lang.Number) mutableShort6);
        byte byte9 = mutableShort4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1032");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        long long1 = mutableShort0.longValue();
        mutableShort0.setValue((short) -1);
        short short4 = mutableShort0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1033");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) -10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1034");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        float float2 = mutableShort1.floatValue();
        java.lang.Short short3 = mutableShort1.getValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.setValue((java.lang.Number) (byte) 112);
        mutableShort1.subtract((short) (byte) 1);
        float float9 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 111.0f + "'", float9 == 111.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1035");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        mutableShort0.setValue((java.lang.Number) (-1.0f));
        java.lang.Short short5 = mutableShort0.getValue();
        mutableShort0.decrement();
        boolean boolean8 = mutableShort0.equals((java.lang.Object) 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1036");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        float float2 = mutableShort1.floatValue();
        java.lang.Short short3 = mutableShort1.getValue();
        mutableShort1.increment();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 9 + "'", short3.equals((short) 9));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1037");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        mutableShort1.subtract((short) (byte) 1);
        float float4 = mutableShort1.floatValue();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 7.0f + "'", float4 == 7.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1038");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.subtract((short) (byte) 8);
        java.lang.Short short4 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -8 + "'", short4.equals((short) -8));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1039");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((java.lang.Number) 9.0f);
        short short5 = mutableShort1.shortValue();
        double double6 = mutableShort1.doubleValue();
        double double7 = mutableShort1.doubleValue();
        short short8 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 9 + "'", short5 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 9.0d + "'", double7 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 9 + "'", short8 == (short) 9);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1040");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        int int3 = mutableShort1.intValue();
        java.lang.Short short4 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4.equals((short) 10));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1041");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        mutableShort0.setValue((short) (byte) 9);
        mutableShort0.setValue((short) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0L);
        boolean boolean9 = mutableShort0.equals((java.lang.Object) mutableShort8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1042");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 20);
        mutableShort1.subtract((short) 8);
        mutableShort1.increment();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1043");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (short) 9);
        double double2 = mutableShort1.doubleValue();
        int int3 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1044");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        mutableShort1.add((java.lang.Number) (short) 0);
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1045");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        mutableShort1.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        mutableShort6.decrement();
        boolean boolean8 = mutableShort1.equals((java.lang.Object) mutableShort6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1046");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        short short7 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1047");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -2);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        float float4 = mutableShort3.floatValue();
        java.lang.Short short5 = mutableShort3.getValue();
        float float6 = mutableShort3.floatValue();
        mutableShort1.add((java.lang.Number) float6);
        mutableShort1.add((short) (byte) 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1048");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.setValue((short) 1);
        mutableShort1.setValue((short) (byte) -11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1049");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) -93);
        java.lang.Short short5 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -93 + "'", short5.equals((short) -93));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1050");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        float float3 = mutableShort2.floatValue();
        java.lang.Short short4 = mutableShort2.getValue();
        int int5 = mutableShort2.intValue();
        mutableShort2.subtract((short) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1051");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -8);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1052");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort4);
        mutableShort1.add((java.lang.Number) mutableShort5);
        mutableShort5.decrement();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1053");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        float float2 = mutableShort1.floatValue();
        java.lang.Short short3 = mutableShort1.getValue();
        mutableShort1.setValue((short) (byte) 12);
        mutableShort1.increment();
        short short7 = mutableShort1.shortValue();
        mutableShort1.subtract((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 13 + "'", short7 == (short) 13);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1054");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) mutableShort6);
        float float8 = mutableShort6.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1055");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        int int4 = mutableShort0.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) int4);
        int int6 = mutableShort5.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1056");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((short) 0);
        mutableShort1.subtract((short) (byte) -8);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1057");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        java.lang.Short short5 = mutableShort1.toShort();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 7 + "'", short5.equals((short) 7));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1058");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean5 = mutableShort3.equals((java.lang.Object) 8.0d);
        mutableShort3.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort3);
        mutableShort1.add((java.lang.Number) mutableShort7);
        float float9 = mutableShort7.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1059");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort6.decrement();
        java.lang.Short short8 = mutableShort6.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 9 + "'", short8.equals((short) 9));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1060");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        mutableShort1.increment();
        java.lang.Short short5 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5.equals((short) 1));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1061");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) 0);
        int int8 = mutableShort1.intValue();
        float float9 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1062");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        double double2 = mutableShort1.doubleValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) double2);
        java.lang.Short short4 = mutableShort3.getValue();
        java.lang.String str5 = mutableShort3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1063");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort();
        long long7 = mutableShort6.longValue();
        mutableShort4.subtract((java.lang.Number) mutableShort6);
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1064");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 18);
        long long2 = mutableShort1.longValue();
        long long3 = mutableShort1.longValue();
        mutableShort1.setValue((short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 18L + "'", long3 == 18L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1065");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short1 = mutableShort0.toShort();
        mutableShort0.increment();
        java.lang.String str3 = mutableShort0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1066");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        mutableShort0.add((java.lang.Number) 7.0d);
        java.lang.String str4 = mutableShort0.toString();
        mutableShort0.setValue((short) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "7" + "'", str4.equals("7"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1067");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        long long5 = mutableShort1.longValue();
        java.lang.Short short6 = mutableShort1.toShort();
        int int7 = mutableShort1.intValue();
        long long8 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1068");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        float float5 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 12.0f + "'", float5 == 12.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1069");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("-10");
        mutableShort1.subtract((java.lang.Number) mutableShort3);
        java.lang.String str5 = mutableShort3.toString();
        java.lang.Short short6 = mutableShort3.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-10" + "'", str5.equals("-10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -10 + "'", short6.equals((short) -10));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1070");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.increment();
        java.lang.String str5 = mutableShort1.toString();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        byte byte7 = mutableShort6.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "8" + "'", str5.equals("8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 8 + "'", byte7 == (byte) 8);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1071");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) -1);
        mutableShort1.setValue((short) (byte) 100);
        java.lang.Short short4 = mutableShort1.toShort();
        mutableShort1.increment();
        mutableShort1.increment();
        java.lang.String str7 = mutableShort1.toString();
        mutableShort1.add((short) (byte) -10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "102" + "'", str7.equals("102"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1072");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        mutableShort1.subtract((short) (byte) 1);
        float float4 = mutableShort1.floatValue();
        int int5 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 7.0f + "'", float4 == 7.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1073");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 26);
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableShort1.subtract(number2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1074");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort3);
        float float5 = mutableShort3.floatValue();
        java.lang.Short short6 = mutableShort3.getValue();
        mutableShort3.setValue((short) (byte) 17);
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
            System.out.format("%n%s%n", "MutableShort2.test1075");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("100");
        java.lang.Short short2 = mutableShort1.toShort();
        float float3 = mutableShort1.floatValue();
        double double4 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1076");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        java.lang.Short short6 = mutableShort1.toShort();
        float float7 = mutableShort1.floatValue();
        java.lang.Short short8 = mutableShort1.toShort();
        java.lang.Short short9 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 11 + "'", short6.equals((short) 11));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 11.0f + "'", float7 == 11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 11 + "'", short8.equals((short) 11));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 11 + "'", short9.equals((short) 11));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1077");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        float float2 = mutableShort1.floatValue();
        mutableShort1.increment();
        short short4 = mutableShort1.shortValue();
        int int5 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1078");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        long long1 = mutableShort0.longValue();
        mutableShort0.setValue((short) -1);
        int int4 = mutableShort0.intValue();
        int int5 = mutableShort0.intValue();
        double double6 = mutableShort0.doubleValue();
        java.lang.Short short7 = mutableShort0.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7.equals((short) -1));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1079");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        float float2 = mutableShort1.floatValue();
        int int3 = mutableShort1.intValue();
        mutableShort1.subtract((short) -8);
        java.lang.Short short6 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 18 + "'", short6.equals((short) 18));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1080");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 9);
        float float2 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1081");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        mutableShort0.setValue((java.lang.Number) (-1.0f));
        java.lang.Short short5 = mutableShort0.getValue();
        mutableShort0.decrement();
        java.lang.Short short7 = mutableShort0.getValue();
        mutableShort0.subtract((short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5.equals((short) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -2 + "'", short7.equals((short) -2));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1082");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort();
        long long7 = mutableShort6.longValue();
        mutableShort4.subtract((java.lang.Number) mutableShort6);
        mutableShort6.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1083");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        mutableShort1.increment();
        long long5 = mutableShort1.longValue();
        java.lang.Short short6 = mutableShort1.toShort();
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1084");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        float float2 = mutableShort1.floatValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort("100");
        mutableShort1.setValue((java.lang.Number) mutableShort4);
        int int6 = mutableShort4.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1085");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        mutableShort1.increment();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1086");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        java.lang.Short short5 = mutableShort1.toShort();
        short short6 = mutableShort1.shortValue();
        mutableShort1.setValue((short) (byte) -2);
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
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1087");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        int int8 = mutableShort1.compareTo(mutableShort7);
        java.lang.Short short9 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 9 + "'", short9.equals((short) 9));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1088");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        short short3 = mutableShort0.shortValue();
        mutableShort0.increment();
        byte byte5 = mutableShort0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1089");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        java.lang.Short short6 = mutableShort1.toShort();
        float float7 = mutableShort1.floatValue();
        java.lang.Short short8 = mutableShort1.toShort();
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 11 + "'", short6.equals((short) 11));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 11.0f + "'", float7 == 11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 11 + "'", short8.equals((short) 11));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1090");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        mutableShort1.subtract((short) (byte) 1);
        java.lang.Class<?> wildcardClass4 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1091");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 9);
        java.lang.Short short5 = mutableShort1.toShort();
        mutableShort1.setValue((short) 26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 9 + "'", short5.equals((short) 9));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1092");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.subtract((short) (byte) 8);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.add((short) (byte) 100);
        short short8 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-8.0f) + "'", float5 == (-8.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 92 + "'", short8 == (short) 92);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1093");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        float float7 = mutableShort1.floatValue();
        java.lang.String str8 = mutableShort1.toString();
        float float9 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "9" + "'", str8.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 9.0f + "'", float9 == 9.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1094");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) -1);
        mutableShort1.increment();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1095");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        float float2 = mutableShort1.floatValue();
        java.lang.Short short3 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort("100");
        java.lang.Short short6 = mutableShort5.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort5);
        int int8 = mutableShort1.compareTo(mutableShort5);
        java.lang.Class<?> wildcardClass9 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1096");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort5.subtract((short) -10);
        int int8 = mutableShort5.intValue();
        short short9 = mutableShort5.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 20 + "'", short9 == (short) 20);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1097");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.add((java.lang.Number) 112L);
        java.lang.Short short7 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 133 + "'", short7.equals((short) 133));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1098");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        java.lang.Short short6 = mutableShort1.toShort();
        int int7 = mutableShort1.intValue();
        float float8 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6.equals((short) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 9.0f + "'", float8 == 9.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1099");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) 11);
        mutableShort1.add((short) 18);
        mutableShort1.increment();
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 29 + "'", byte8 == (byte) 29);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1100");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) short6);
        long long8 = mutableShort7.longValue();
        long long9 = mutableShort7.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 11 + "'", short6 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 11L + "'", long8 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1101");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.add((short) 0);
        double double7 = mutableShort1.doubleValue();
        long long8 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 12.0d + "'", double7 == 12.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 12L + "'", long8 == 12L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1102");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        mutableShort1.add((short) 2);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1103");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("7");
        mutableShort1.add((short) -102);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort2.test1104");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) 20);
        byte byte5 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 20 + "'", byte5 == (byte) 20);
    }
}

