package MutableInt;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableInt1 {

    public static boolean debug = false;

    @Test
    public void MutableInt501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt501");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        mutableInt0.decrement();
        mutableInt0.increment();
        int int5 = mutableInt0.intValue();
        mutableInt0.decrement();
        int int7 = mutableInt0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void MutableInt502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt502");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(101);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 101);
        mutableInt2.add((int) (short) 2);
        mutableInt2.subtract((int) (byte) 97);
    }

    @Test
    public void MutableInt503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt503");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        mutableInt1.add((int) (byte) -1);
        java.lang.Integer int4 = mutableInt1.getValue();
        java.lang.Integer int5 = mutableInt1.toInteger();
        java.lang.Integer int6 = mutableInt1.getValue();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 99 + "'", int5.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6.equals(99));
    }

    @Test
    public void MutableInt504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt504");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        float float3 = mutableInt1.floatValue();
        mutableInt1.subtract((int) (byte) -2);
        mutableInt1.setValue((int) (byte) -1);
        mutableInt1.decrement();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void MutableInt505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt505");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) 'a');
        float float2 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void MutableInt506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt506");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        long long3 = mutableInt1.longValue();
        mutableInt1.increment();
        mutableInt1.add((int) (short) 1);
        float float7 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 102.0f + "'", float7 == 102.0f);
    }

    @Test
    public void MutableInt507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt507");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        long long3 = mutableInt1.longValue();
        mutableInt1.increment();
        int int5 = mutableInt1.intValue();
        mutableInt1.subtract((java.lang.Number) (-99L));
        mutableInt1.setValue(9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
    }

    @Test
    public void MutableInt508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt508");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long2 = mutableInt1.longValue();
        java.lang.Integer int3 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        mutableInt1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
    }

    @Test
    public void MutableInt509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt509");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        int int4 = mutableInt1.intValue();
        java.lang.String str5 = mutableInt1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "99" + "'", str5.equals("99"));
    }

    @Test
    public void MutableInt510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt510");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("99");
        long long2 = mutableInt1.longValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt(100);
        boolean boolean6 = mutableInt4.equals((java.lang.Object) (-98));
        mutableInt1.add((java.lang.Number) (-98));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableInt511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt511");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.subtract((int) (byte) 99);
        long long4 = mutableInt1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void MutableInt512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt512");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((-90));
        mutableInt1.setValue((int) ' ');
        mutableInt1.decrement();
        mutableInt1.increment();
        double double8 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
    }

    @Test
    public void MutableInt513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt513");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        int int5 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) int5);
        java.lang.String str7 = mutableInt6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-98) + "'", int5 == (-98));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-98" + "'", str7.equals("-98"));
    }

    @Test
    public void MutableInt514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt514");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        mutableInt1.subtract(103);
        mutableInt1.decrement();
        java.lang.Integer int5 = mutableInt1.getValue();
        byte byte6 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-4) + "'", int5.equals((-4)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -4 + "'", byte6 == (byte) -4);
    }

    @Test
    public void MutableInt515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt515");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        long long3 = mutableInt1.longValue();
        int int4 = mutableInt1.intValue();
        byte byte5 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void MutableInt516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt516");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 100);
    }

    @Test
    public void MutableInt517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt517");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        mutableInt0.decrement();
        mutableInt0.increment();
        int int5 = mutableInt0.intValue();
        mutableInt0.decrement();
        short short7 = mutableInt0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -2 + "'", short7 == (short) -2);
    }

    @Test
    public void MutableInt518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt518");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.subtract((int) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt4);
        mutableInt4.add(100);
    }

    @Test
    public void MutableInt519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt519");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        byte byte2 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void MutableInt520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt520");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("101");
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        mutableInt2.add((-2));
    }

    @Test
    public void MutableInt521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt521");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.subtract((java.lang.Number) (short) -1);
        mutableInt1.add((int) (short) 10);
        java.lang.Integer int9 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-87) + "'", int9.equals((-87)));
    }

    @Test
    public void MutableInt522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt522");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        mutableInt0.subtract((int) (byte) -1);
        long long6 = mutableInt0.longValue();
        java.lang.Class<?> wildcardClass7 = mutableInt0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableInt523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt523");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.decrement();
        java.lang.Integer int4 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) int4);
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) int4);
        byte byte7 = mutableInt6.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
    }

    @Test
    public void MutableInt524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt524");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 102);
    }

    @Test
    public void MutableInt525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt525");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        java.lang.Integer int2 = mutableInt0.toInteger();
        java.lang.Integer int3 = mutableInt0.getValue();
        long long4 = mutableInt0.longValue();
        java.lang.Integer int5 = mutableInt0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5.equals(0));
    }

    @Test
    public void MutableInt526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt526");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        int int3 = mutableInt0.intValue();
        mutableInt0.decrement();
        mutableInt0.subtract((int) (byte) -90);
        byte byte7 = mutableInt0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 88 + "'", byte7 == (byte) 88);
    }

    @Test
    public void MutableInt527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt527");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (byte) 2);
        mutableInt0.subtract((java.lang.Number) (byte) 2);
        org.apache.commons.lang3.mutable.MutableInt mutableInt9 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void MutableInt528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt528");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        boolean boolean3 = mutableInt1.equals((java.lang.Object) (-98));
        java.lang.String str4 = mutableInt1.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        byte byte6 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
    }

    @Test
    public void MutableInt529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt529");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(101);
        long long2 = mutableInt1.longValue();
        java.lang.Integer int3 = mutableInt1.toInteger();
        mutableInt1.add((-2));
        int int6 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3.equals(101));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6 == 99);
    }

    @Test
    public void MutableInt530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt530");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 98);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (short) 98);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt2);
        short short4 = mutableInt2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 98 + "'", short4 == (short) 98);
    }

    @Test
    public void MutableInt531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt531");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        java.lang.String str3 = mutableInt1.toString();
        boolean boolean5 = mutableInt1.equals((java.lang.Object) ' ');
        int int6 = mutableInt1.intValue();
        byte byte7 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2" + "'", str3.equals("2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 2 + "'", byte7 == (byte) 2);
    }

    @Test
    public void MutableInt532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt532");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.decrement();
        float float7 = mutableInt0.floatValue();
        mutableInt0.setValue(103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void MutableInt533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt533");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 101);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt("100");
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt4.add((-1));
        boolean boolean7 = mutableInt3.equals((java.lang.Object) mutableInt4);
        boolean boolean8 = mutableInt1.equals((java.lang.Object) mutableInt4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableInt534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt534");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt(0);
        mutableInt1.setValue((java.lang.Number) mutableInt5);
    }

    @Test
    public void MutableInt535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt535");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        java.lang.Integer int6 = mutableInt0.getValue();
        float float7 = mutableInt0.floatValue();
        long long8 = mutableInt0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void MutableInt536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt536");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("10");
        mutableInt1.decrement();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) (byte) 90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableInt537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt537");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("100");
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt2.add((-1));
        boolean boolean5 = mutableInt1.equals((java.lang.Object) mutableInt2);
        float float6 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void MutableInt538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt538");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        mutableInt1.add((int) (byte) -1);
        java.lang.Integer int4 = mutableInt1.getValue();
        byte byte5 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 99 + "'", byte5 == (byte) 99);
    }

    @Test
    public void MutableInt539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt539");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        int int6 = mutableInt3.intValue();
        mutableInt3.add((int) (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void MutableInt540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt540");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.subtract((java.lang.Number) (short) -1);
        java.lang.Integer int7 = mutableInt1.getValue();
        short short8 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-97) + "'", int7.equals((-97)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -97 + "'", short8 == (short) -97);
    }

    @Test
    public void MutableInt541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt541");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        mutableInt2.increment();
        java.lang.Integer int4 = mutableInt2.getValue();
        mutableInt2.decrement();
        mutableInt2.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void MutableInt542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt542");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("10");
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        boolean boolean6 = mutableInt3.equals((java.lang.Object) 1.0f);
        int int7 = mutableInt1.compareTo(mutableInt3);
        mutableInt1.add((-99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void MutableInt543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt543");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 1);
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in MutableInt generation
        try {
            mutableInt1.subtract(number2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableInt544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt544");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        mutableInt2.decrement();
        mutableInt2.increment();
        float float5 = mutableInt2.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void MutableInt545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt545");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(34);
    }

    @Test
    public void MutableInt546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt546");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        mutableInt1.setValue((-98));
        mutableInt1.setValue((java.lang.Number) (-87));
    }

    @Test
    public void MutableInt547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt547");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        mutableInt1.add((int) (short) -97);
    }

    @Test
    public void MutableInt548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt548");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        int int5 = mutableInt1.intValue();
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        mutableInt1.setValue((java.lang.Number) (short) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-98) + "'", int5 == (-98));
    }

    @Test
    public void MutableInt549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt549");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        boolean boolean3 = mutableInt0.equals((java.lang.Object) "1");
        long long4 = mutableInt0.longValue();
        mutableInt0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void MutableInt550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt550");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.add((int) (short) 1);
        java.lang.Integer int6 = mutableInt1.toInteger();
        java.lang.Integer int7 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6.equals(101));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7.equals(101));
    }

    @Test
    public void MutableInt551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt551");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.decrement();
        float float7 = mutableInt0.floatValue();
        double double8 = mutableInt0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void MutableInt552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt552");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        float float3 = mutableInt1.floatValue();
        double double4 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void MutableInt553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt553");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) -1);
        mutableInt1.increment();
    }

    @Test
    public void MutableInt554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt554");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10);
        mutableInt1.add((java.lang.Number) mutableInt5);
        mutableInt1.add((int) (short) 1);
        short short9 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 21 + "'", short9 == (short) 21);
    }

    @Test
    public void MutableInt555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt555");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        mutableInt3.increment();
        int int8 = mutableInt3.intValue();
        java.lang.String str9 = mutableInt3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "101" + "'", str9.equals("101"));
    }

    @Test
    public void MutableInt556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt556");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100L);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        java.lang.Integer int6 = mutableInt5.getValue();
        double double7 = mutableInt5.doubleValue();
        short short8 = mutableInt5.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
    }

    @Test
    public void MutableInt557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt557");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        mutableInt0.add((java.lang.Number) (-1L));
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
    }

    @Test
    public void MutableInt558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt558");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        boolean boolean3 = mutableInt1.equals((java.lang.Object) (-98));
        java.lang.String str4 = mutableInt1.toString();
        int int5 = mutableInt1.intValue();
        java.lang.String str6 = mutableInt1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "100" + "'", str6.equals("100"));
    }

    @Test
    public void MutableInt559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt559");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("10");
        mutableInt1.subtract((-99));
    }

    @Test
    public void MutableInt560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt560");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt("100");
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt5.add((-1));
        boolean boolean8 = mutableInt4.equals((java.lang.Object) mutableInt5);
        mutableInt1.add((java.lang.Number) mutableInt4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableInt561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt561");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((-90));
        mutableInt1.setValue((int) ' ');
        mutableInt1.subtract((int) (byte) 100);
        float float8 = mutableInt1.floatValue();
        int int9 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-68.0f) + "'", float8 == (-68.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-68) + "'", int9 == (-68));
    }

    @Test
    public void MutableInt562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt562");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        double double2 = mutableInt1.doubleValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt("-97");
        int int5 = mutableInt1.compareTo(mutableInt4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void MutableInt563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt563");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("-97");
        double double2 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-97.0d) + "'", double2 == (-97.0d));
    }

    @Test
    public void MutableInt564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt564");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        double double2 = mutableInt1.doubleValue();
        int int3 = mutableInt1.intValue();
        double double4 = mutableInt1.doubleValue();
        mutableInt1.decrement();
        mutableInt1.setValue(99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void MutableInt565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt565");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        mutableInt0.subtract((int) (byte) -1);
        long long6 = mutableInt0.longValue();
        mutableInt0.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt8 = null;
        // The following exception was thrown during execution in MutableInt generation
        try {
            int int9 = mutableInt0.compareTo(mutableInt8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void MutableInt566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt566");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.subtract((int) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt4);
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt5);
        mutableInt5.setValue((int) (byte) 103);
        mutableInt5.decrement();
    }

    @Test
    public void MutableInt567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt567");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt();
        int int4 = mutableInt3.intValue();
        boolean boolean6 = mutableInt3.equals((java.lang.Object) "1");
        int int7 = mutableInt1.compareTo(mutableInt3);
        java.lang.Integer int8 = mutableInt3.toInteger();
        java.lang.Class<?> wildcardClass9 = mutableInt3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableInt568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt568");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 101);
        mutableInt1.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt("10");
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt(100);
        double double7 = mutableInt6.doubleValue();
        int int8 = mutableInt4.compareTo(mutableInt6);
        boolean boolean9 = mutableInt1.equals((java.lang.Object) mutableInt6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void MutableInt569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt569");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        double double2 = mutableInt1.doubleValue();
        java.lang.Integer int3 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
    }

    @Test
    public void MutableInt570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt570");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.subtract((int) (byte) -1);
        mutableInt1.add((int) (short) -98);
    }

    @Test
    public void MutableInt571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt571");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        mutableInt0.decrement();
        java.lang.Number number4 = null;
        // The following exception was thrown during execution in MutableInt generation
        try {
            mutableInt0.setValue(number4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void MutableInt572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt572");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 9);
    }

    @Test
    public void MutableInt573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt573");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.decrement();
        boolean boolean8 = mutableInt0.equals((java.lang.Object) (byte) -2);
        double double9 = mutableInt0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void MutableInt574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt574");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((-90));
        mutableInt1.setValue((int) ' ');
        mutableInt1.subtract((int) (byte) 100);
        java.lang.Integer int8 = mutableInt1.toInteger();
        short short9 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-68) + "'", int8.equals((-68)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -68 + "'", short9 == (short) -68);
    }

    @Test
    public void MutableInt575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt575");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        mutableInt1.add((int) ' ');
        int int5 = mutableInt1.intValue();
        long long6 = mutableInt1.longValue();
        mutableInt1.subtract((int) (short) 1);
        org.apache.commons.lang3.mutable.MutableInt mutableInt9 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 34L + "'", long6 == 34L);
    }

    @Test
    public void MutableInt576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt576");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        mutableInt1.setValue((-98));
        mutableInt1.decrement();
        mutableInt1.increment();
    }

    @Test
    public void MutableInt577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt577");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (short) 2);
        mutableInt1.increment();
        int int3 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void MutableInt578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt578");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 1.0f);
        boolean boolean6 = mutableInt1.equals((java.lang.Object) "-97");
        mutableInt1.increment();
        double double8 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 101.0d + "'", double8 == 101.0d);
    }

    @Test
    public void MutableInt579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt579");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        mutableInt1.subtract((int) (byte) -98);
        double double7 = mutableInt1.doubleValue();
        short short8 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 97 + "'", short8 == (short) 97);
    }

    @Test
    public void MutableInt580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt580");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        boolean boolean3 = mutableInt1.equals((java.lang.Object) (-98));
        java.lang.String str4 = mutableInt1.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        long long6 = mutableInt1.longValue();
        mutableInt1.add((int) (short) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void MutableInt581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt581");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("100");
        mutableInt1.add(0);
    }

    @Test
    public void MutableInt582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt582");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        java.lang.String str3 = mutableInt1.toString();
        boolean boolean5 = mutableInt1.equals((java.lang.Object) ' ');
        int int6 = mutableInt1.intValue();
        mutableInt1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2" + "'", str3.equals("2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void MutableInt583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt583");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(190);
        int int2 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 190 + "'", int2 == 190);
    }

    @Test
    public void MutableInt584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt584");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((int) (short) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0" + "'", str2.equals("0"));
    }

    @Test
    public void MutableInt585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt585");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(99);
    }

    @Test
    public void MutableInt586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt586");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100L);
        java.lang.Integer int5 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
    }

    @Test
    public void MutableInt587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt587");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.decrement();
        java.lang.Integer int4 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) int4);
        mutableInt5.subtract((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
    }

    @Test
    public void MutableInt588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt588");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        mutableInt0.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void MutableInt589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt589");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long2 = mutableInt1.longValue();
        java.lang.Integer int3 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        double double5 = mutableInt4.doubleValue();
        mutableInt4.setValue((int) (short) 64);
        byte byte8 = mutableInt4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 64 + "'", byte8 == (byte) 64);
    }

    @Test
    public void MutableInt590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt590");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        java.lang.Class<?> wildcardClass7 = mutableInt3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableInt591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt591");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 1);
        mutableInt1.setValue((int) (byte) -90);
        java.lang.Class<?> wildcardClass4 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableInt592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt592");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.setValue((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
    }

    @Test
    public void MutableInt593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt593");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        java.lang.Integer int3 = mutableInt1.toInteger();
        mutableInt1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
    }

    @Test
    public void MutableInt594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt594");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(101);
        long long2 = mutableInt1.longValue();
        java.lang.Integer int3 = mutableInt1.toInteger();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt5.decrement();
        int int7 = mutableInt1.compareTo(mutableInt5);
        java.lang.Class<?> wildcardClass8 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3.equals(101));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableInt595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt595");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        long long3 = mutableInt1.longValue();
        mutableInt1.increment();
        float float5 = mutableInt1.floatValue();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 101.0f + "'", float5 == 101.0f);
    }

    @Test
    public void MutableInt596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt596");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        long long2 = mutableInt1.longValue();
        java.lang.String str3 = mutableInt1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100" + "'", str3.equals("100"));
    }

    @Test
    public void MutableInt597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt597");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((-90));
        mutableInt1.setValue((int) ' ');
        mutableInt1.subtract((int) (byte) 100);
        java.lang.Integer int8 = mutableInt1.toInteger();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-68) + "'", int8.equals((-68)));
    }

    @Test
    public void MutableInt598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt598");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        int int4 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        java.lang.Integer int6 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6.equals(99));
    }

    @Test
    public void MutableInt599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt599");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((-90));
        mutableInt1.setValue((int) ' ');
        mutableInt1.subtract((int) (byte) 100);
        org.apache.commons.lang3.mutable.MutableInt mutableInt8 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
    }

    @Test
    public void MutableInt600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt600");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        mutableInt0.add((java.lang.Number) (-1L));
        float float6 = mutableInt0.floatValue();
        mutableInt0.setValue((int) 'a');
        mutableInt0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void MutableInt601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt601");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        mutableInt0.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        long long5 = mutableInt0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-2L) + "'", long5 == (-2L));
    }

    @Test
    public void MutableInt602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt602");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        float float3 = mutableInt1.floatValue();
        mutableInt1.decrement();
        java.lang.Integer int5 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 99 + "'", int5.equals(99));
    }

    @Test
    public void MutableInt603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt603");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        int int7 = mutableInt1.intValue();
        double double8 = mutableInt1.doubleValue();
        java.lang.Integer int9 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 98.0d + "'", double8 == 98.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9.equals(98));
    }

    @Test
    public void MutableInt604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt604");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.subtract((java.lang.Number) (short) -1);
        java.lang.String str7 = mutableInt1.toString();
        mutableInt1.add((int) (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-97" + "'", str7.equals("-97"));
    }

    @Test
    public void MutableInt605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt605");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(103);
        double double2 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 103.0d + "'", double2 == 103.0d);
    }

    @Test
    public void MutableInt606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt606");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(9);
    }

    @Test
    public void MutableInt607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt607");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) -1);
        mutableInt1.add(88);
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
    }

    @Test
    public void MutableInt608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt608");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        boolean boolean8 = mutableInt3.equals((java.lang.Object) 2);
        mutableInt3.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableInt609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt609");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        int int3 = mutableInt0.intValue();
        mutableInt0.decrement();
        mutableInt0.add((int) (short) 10);
        boolean boolean8 = mutableInt0.equals((java.lang.Object) 103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableInt610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt610");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        java.lang.Integer int5 = mutableInt1.toInteger();
        float float6 = mutableInt1.floatValue();
        long long7 = mutableInt1.longValue();
        mutableInt1.increment();
        java.lang.String str9 = mutableInt1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void MutableInt611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt611");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long2 = mutableInt1.longValue();
        mutableInt1.setValue((java.lang.Number) (short) 102);
        java.lang.Integer int5 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 102 + "'", int5.equals(102));
    }

    @Test
    public void MutableInt612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt612");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 2.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((int) 'a');
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int6 = mutableInt5.getValue();
        mutableInt3.setValue((java.lang.Number) mutableInt5);
        mutableInt1.add((java.lang.Number) mutableInt3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
    }

    @Test
    public void MutableInt613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt613");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        mutableInt1.add((int) ' ');
        int int5 = mutableInt1.intValue();
        long long6 = mutableInt1.longValue();
        mutableInt1.add((int) (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 34 + "'", int5 == 34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 34L + "'", long6 == 34L);
    }

    @Test
    public void MutableInt614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt614");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.subtract((java.lang.Number) 100L);
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableInt1.equals(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableInt615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt615");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long2 = mutableInt1.longValue();
        java.lang.Integer int3 = mutableInt1.getValue();
        mutableInt1.setValue((int) (short) 100);
        mutableInt1.decrement();
        java.lang.Integer int7 = mutableInt1.toInteger();
        java.lang.String str8 = mutableInt1.toString();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "99" + "'", str8.equals("99"));
    }

    @Test
    public void MutableInt616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt616");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.setValue((int) (byte) 1);
        int int6 = mutableInt1.intValue();
        long long7 = mutableInt1.longValue();
        float float8 = mutableInt1.floatValue();
        double double9 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void MutableInt617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt617");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("-2");
    }

    @Test
    public void MutableInt618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt618");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        double double4 = mutableInt1.doubleValue();
        java.lang.Integer int5 = mutableInt1.toInteger();
        mutableInt1.decrement();
        mutableInt1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5.equals(10));
    }

    @Test
    public void MutableInt619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt619");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        double double6 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 98.0d + "'", double6 == 98.0d);
    }

    @Test
    public void MutableInt620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt620");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        int int6 = mutableInt1.intValue();
        mutableInt1.increment();
        java.lang.Integer int8 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 99 + "'", int8.equals(99));
    }

    @Test
    public void MutableInt621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt621");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.add((int) (short) 1);
        java.lang.Integer int6 = mutableInt1.toInteger();
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        mutableInt1.add((int) (byte) -98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6.equals(101));
    }

    @Test
    public void MutableInt622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt622");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((-90));
        mutableInt1.setValue((int) ' ');
        mutableInt1.decrement();
        mutableInt1.increment();
        mutableInt1.subtract((int) (byte) -1);
    }

    @Test
    public void MutableInt623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt623");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt();
        int int4 = mutableInt3.intValue();
        boolean boolean6 = mutableInt3.equals((java.lang.Object) "1");
        int int7 = mutableInt1.compareTo(mutableInt3);
        mutableInt1.increment();
        int int9 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
    }

    @Test
    public void MutableInt624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt624");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt("-97");
        int int7 = mutableInt1.compareTo(mutableInt6);
        float float8 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void MutableInt625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt625");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100L);
        mutableInt1.setValue((java.lang.Number) (short) -98);
        java.lang.String str7 = mutableInt1.toString();
        java.lang.String str8 = mutableInt1.toString();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-98" + "'", str7.equals("-98"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-98" + "'", str8.equals("-98"));
    }

    @Test
    public void MutableInt626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt626");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((-90));
    }

    @Test
    public void MutableInt627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt627");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(103);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((-98));
        mutableInt1.subtract((java.lang.Number) (-98));
        mutableInt1.subtract(10);
    }

    @Test
    public void MutableInt628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt628");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((java.lang.Number) mutableInt5);
        java.lang.Integer int7 = mutableInt5.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
    }

    @Test
    public void MutableInt629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt629");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        boolean boolean3 = mutableInt1.equals((java.lang.Object) (-98));
        java.lang.String str4 = mutableInt1.toString();
        long long5 = mutableInt1.longValue();
        byte byte6 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
    }

    @Test
    public void MutableInt630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt630");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(35);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str4 = mutableInt3.toString();
        float float5 = mutableInt3.floatValue();
        int int6 = mutableInt3.intValue();
        int int7 = mutableInt1.compareTo(mutableInt3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableInt631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt631");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("101");
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt632");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        mutableInt1.setValue((java.lang.Number) (-1));
        int int6 = mutableInt1.intValue();
        long long7 = mutableInt1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void MutableInt633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt633");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        java.lang.Integer int5 = mutableInt1.toInteger();
        float float6 = mutableInt1.floatValue();
        long long7 = mutableInt1.longValue();
        mutableInt1.add((java.lang.Number) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void MutableInt634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt634");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) -4);
    }

    @Test
    public void MutableInt635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt635");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(2);
        mutableInt1.subtract(0);
        long long4 = mutableInt1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
    }

    @Test
    public void MutableInt636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt636");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.subtract((java.lang.Number) (short) -1);
        java.lang.String str7 = mutableInt1.toString();
        long long8 = mutableInt1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-97" + "'", str7.equals("-97"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
    }

    @Test
    public void MutableInt637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt637");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.setValue((int) (byte) 1);
        int int6 = mutableInt1.intValue();
        int int7 = mutableInt1.intValue();
        java.lang.Integer int8 = mutableInt1.getValue();
        byte byte9 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void MutableInt638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt638");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        long long4 = mutableInt1.longValue();
        long long5 = mutableInt1.longValue();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void MutableInt639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt639");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 0);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 99);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
    }

    @Test
    public void MutableInt640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt640");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(101);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 101);
        mutableInt2.add((int) (short) 2);
        short short5 = mutableInt2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 103 + "'", short5 == (short) 103);
    }

    @Test
    public void MutableInt641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt641");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 98);
        mutableInt1.setValue((int) (byte) 10);
        float float4 = mutableInt1.floatValue();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void MutableInt642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt642");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (short) 2);
        int int2 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void MutableInt643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt643");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        mutableInt0.decrement();
    }

    @Test
    public void MutableInt644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt644");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100L);
        mutableInt1.setValue((java.lang.Number) (short) -98);
        java.lang.String str7 = mutableInt1.toString();
        java.lang.Integer int8 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-98" + "'", str7.equals("-98"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-98) + "'", int8.equals((-98)));
    }

    @Test
    public void MutableInt645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt645");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        int int5 = mutableInt1.intValue();
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        int int8 = mutableInt1.intValue();
        int int9 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-98) + "'", int5 == (-98));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-97) + "'", int9 == (-97));
    }

    @Test
    public void MutableInt646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt646");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.increment();
    }

    @Test
    public void MutableInt647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt647");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.subtract((int) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt4);
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt5);
        short short7 = mutableInt5.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 99 + "'", short7 == (short) 99);
    }

    @Test
    public void MutableInt648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt648");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        mutableInt1.increment();
        mutableInt1.add((int) 'a');
    }

    @Test
    public void MutableInt649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt649");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        java.lang.Integer int4 = mutableInt1.getValue();
        java.lang.String str5 = mutableInt1.toString();
        int int6 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void MutableInt650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt650");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) -2);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 3);
        int int4 = mutableInt1.compareTo(mutableInt3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void MutableInt651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt651");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        long long4 = mutableInt1.longValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        double double6 = mutableInt5.doubleValue();
        long long7 = mutableInt5.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void MutableInt652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt652");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        short short6 = mutableInt0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableInt653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt653");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        java.lang.Integer int4 = mutableInt1.getValue();
        java.lang.Integer int5 = mutableInt1.getValue();
        java.lang.Integer int6 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6.equals(10));
    }

    @Test
    public void MutableInt654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt654");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) -1);
        java.lang.Integer int2 = mutableInt1.toInteger();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) int2);
        java.lang.Integer int4 = mutableInt3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void MutableInt655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt655");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        java.lang.String str6 = mutableInt1.toString();
        java.lang.Number number7 = null;
        // The following exception was thrown during execution in MutableInt generation
        try {
            mutableInt1.setValue(number7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "98" + "'", str6.equals("98"));
    }

    @Test
    public void MutableInt656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt656");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        java.lang.String str6 = mutableInt0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
    }

    @Test
    public void MutableInt657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt657");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableInt658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt658");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        mutableInt1.decrement();
        mutableInt1.subtract(199);
    }

    @Test
    public void MutableInt659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt659");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10);
        mutableInt1.add((java.lang.Number) mutableInt5);
        int int7 = mutableInt5.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void MutableInt660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt660");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) -2);
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt661");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((-4));
    }

    @Test
    public void MutableInt662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt662");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100L);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        java.lang.Integer int6 = mutableInt5.getValue();
        double double7 = mutableInt5.doubleValue();
        int int8 = mutableInt5.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void MutableInt663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt663");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        long long4 = mutableInt1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 99L + "'", long4 == 99L);
    }

    @Test
    public void MutableInt664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt664");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        double double2 = mutableInt1.doubleValue();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void MutableInt665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt665");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) -2);
    }

    @Test
    public void MutableInt666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt666");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 63);
        java.lang.Integer int2 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2.equals(63));
    }

    @Test
    public void MutableInt667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt667");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.decrement();
        java.lang.Integer int4 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) int4);
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) int4);
        float float7 = mutableInt6.floatValue();
        mutableInt6.subtract((int) (short) 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void MutableInt668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt668");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        java.lang.Integer int5 = mutableInt1.toInteger();
        float float6 = mutableInt1.floatValue();
        long long7 = mutableInt1.longValue();
        short short8 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
    }

    @Test
    public void MutableInt669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt669");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        double double7 = mutableInt3.doubleValue();
        mutableInt3.decrement();
        mutableInt3.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void MutableInt670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt670");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 97);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt3.subtract((-90));
        java.lang.Integer int6 = mutableInt3.toInteger();
        boolean boolean7 = mutableInt1.equals((java.lang.Object) int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 190 + "'", int6.equals(190));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableInt671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt671");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.setValue((int) (byte) 1);
        mutableInt1.subtract((int) (short) 100);
        float float8 = mutableInt1.floatValue();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-99.0f) + "'", float8 == (-99.0f));
    }

    @Test
    public void MutableInt672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt672");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        java.lang.String str3 = mutableInt1.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        mutableInt4.setValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2" + "'", str3.equals("2"));
    }

    @Test
    public void MutableInt673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt673");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        boolean boolean3 = mutableInt0.equals((java.lang.Object) "1");
        long long4 = mutableInt0.longValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 2.0f);
        int int7 = mutableInt0.compareTo(mutableInt6);
        org.apache.commons.lang3.mutable.MutableInt mutableInt8 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) int7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void MutableInt674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt674");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        java.lang.Integer int2 = mutableInt0.toInteger();
        mutableInt0.decrement();
        mutableInt0.add((java.lang.Number) (-97.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2.equals(0));
    }

    @Test
    public void MutableInt675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt675");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.subtract((int) (byte) 99);
        java.lang.String str4 = mutableInt1.toString();
        short short5 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void MutableInt676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt676");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) -1);
        java.lang.Integer int2 = mutableInt1.toInteger();
        mutableInt1.add(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2.equals((-1)));
    }

    @Test
    public void MutableInt677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt677");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 97);
        mutableInt1.subtract((int) (short) -2);
    }

    @Test
    public void MutableInt678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt678");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        int int7 = mutableInt1.intValue();
        java.lang.Integer int8 = mutableInt1.getValue();
        mutableInt1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8.equals(98));
    }

    @Test
    public void MutableInt679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt679");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.decrement();
        java.lang.Integer int4 = mutableInt1.getValue();
        short short5 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
    }

    @Test
    public void MutableInt680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt680");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(1);
        mutableInt1.increment();
    }

    @Test
    public void MutableInt681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt681");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.add((int) (short) 1);
        java.lang.Integer int6 = mutableInt1.toInteger();
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        int int8 = mutableInt7.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6.equals(101));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
    }

    @Test
    public void MutableInt682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt1.MutableInt682");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        mutableInt1.setValue((-98));
        mutableInt1.add((int) (short) 21);
        mutableInt1.increment();
    }
}

