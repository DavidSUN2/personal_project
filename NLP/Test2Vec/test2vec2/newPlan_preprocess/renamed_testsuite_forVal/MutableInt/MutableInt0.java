
package MutableInt;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableInt0 {

    public static boolean debug = false;

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test01");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt1.setValue((int) (byte) -1);
        int int4 = mutableInt1.intValue();
        java.lang.Integer int5 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test02");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt3.setValue((int) (byte) -1);
        mutableInt3.increment();
        java.lang.String str7 = mutableInt3.toString();
        int int8 = mutableInt1.compareTo(mutableInt3);
        java.lang.Class<?> wildcardClass9 = mutableInt3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test03");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test04");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt1.setValue((int) (byte) -1);
        mutableInt1.increment();
        java.lang.Class<?> wildcardClass5 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test05");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test06");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (short) -1);
        float float2 = mutableInt1.floatValue();
        float float3 = mutableInt1.floatValue();
        byte byte4 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test07");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        long long2 = mutableInt1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test08");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt1.setValue((int) (byte) -1);
        mutableInt1.increment();
        mutableInt1.increment();
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test09");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 1.0f);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test10");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("0");
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test11");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        float float2 = mutableInt1.floatValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt4.setValue((int) (byte) -1);
        mutableInt4.increment();
        java.lang.String str8 = mutableInt4.toString();
        mutableInt1.add((java.lang.Number) mutableInt4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test12");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt1.setValue((int) (byte) -1);
        mutableInt1.increment();
        java.lang.Integer int5 = mutableInt1.toInteger();
        byte byte6 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test13");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt1.setValue((int) (byte) -1);
        mutableInt1.increment();
        java.lang.String str5 = mutableInt1.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test14");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 1);
        mutableInt1.add(10);
        java.lang.Integer int4 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4.equals(11));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test15");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("0");
        mutableInt1.add((int) (short) 1);
        mutableInt1.subtract((int) (short) -1);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test16");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test17");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 1);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt3.setValue((int) (byte) -1);
        mutableInt3.increment();
        java.lang.Integer int7 = mutableInt3.toInteger();
        int int8 = mutableInt1.compareTo(mutableInt3);
        float float9 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test18");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (short) -1);
        float float2 = mutableInt1.floatValue();
        byte byte3 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test19");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) ' ');
        mutableInt1.add((java.lang.Number) 100.0d);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test20");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 1);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt3.setValue((int) (byte) -1);
        mutableInt3.increment();
        java.lang.Integer int7 = mutableInt3.toInteger();
        int int8 = mutableInt1.compareTo(mutableInt3);
        double double9 = mutableInt3.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test21");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt1.setValue((int) (byte) -1);
        mutableInt1.increment();
        java.lang.String str5 = mutableInt1.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 1);
        mutableInt1.setValue((java.lang.Number) 1);
        double double9 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test22");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        boolean boolean3 = mutableInt1.equals((java.lang.Object) 1);
        mutableInt1.add((java.lang.Number) 10.0d);
        int int6 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test23");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt1.setValue((int) (byte) -1);
        mutableInt1.increment();
        java.lang.String str5 = mutableInt1.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 1);
        mutableInt1.setValue((java.lang.Number) 1);
        mutableInt1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test24");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        boolean boolean3 = mutableInt1.equals((java.lang.Object) 1);
        mutableInt1.add((java.lang.Number) 10.0d);
        mutableInt1.add((-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test25");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 0);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test26");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt1.setValue((int) (byte) -1);
        int int4 = mutableInt1.intValue();
        mutableInt1.subtract((java.lang.Number) (byte) 1);
        java.lang.Integer int7 = mutableInt1.getValue();
        mutableInt1.increment();
        java.lang.Integer int9 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7.equals((-2)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test27");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt1.setValue((int) (byte) -1);
        mutableInt1.increment();
        java.lang.Integer int5 = mutableInt1.toInteger();
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (short) 10);
        int int8 = mutableInt1.compareTo(mutableInt7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test28");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (byte) 100);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test29");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        short short2 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test30");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        boolean boolean3 = mutableInt1.equals((java.lang.Object) 1);
        mutableInt1.increment();
        mutableInt1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test31");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt3.setValue((int) (byte) -1);
        mutableInt3.increment();
        java.lang.String str7 = mutableInt3.toString();
        int int8 = mutableInt1.compareTo(mutableInt3);
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test32");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        boolean boolean3 = mutableInt1.equals((java.lang.Object) 1);
        mutableInt1.subtract((java.lang.Number) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test33");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt1.setValue((int) (byte) -1);
        mutableInt1.increment();
        java.lang.Integer int5 = mutableInt1.toInteger();
        long long6 = mutableInt1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test34");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 10);
        mutableInt1.decrement();
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test35");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (short) -1);
        float float2 = mutableInt1.floatValue();
        float float3 = mutableInt1.floatValue();
        long long4 = mutableInt1.longValue();
        long long5 = mutableInt1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test36");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 10);
        int int2 = mutableInt1.intValue();
        java.lang.Integer int3 = mutableInt1.toInteger();
        java.lang.Integer int4 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test37");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt1.setValue((int) (byte) -1);
        mutableInt1.increment();
        java.lang.String str5 = mutableInt1.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 1);
        mutableInt1.setValue((java.lang.Number) 1);
        java.lang.String str9 = mutableInt1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test38");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt1.setValue((int) (byte) -1);
        mutableInt1.setValue((int) (short) -1);
        boolean boolean7 = mutableInt1.equals((java.lang.Object) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test39");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt1.setValue((int) (byte) -1);
        mutableInt1.setValue((java.lang.Number) (-1.0f));
        mutableInt1.subtract((java.lang.Number) (byte) 10);
        java.lang.Integer int8 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-11) + "'", int8.equals((-11)));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test40");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (short) -1);
        float float2 = mutableInt1.floatValue();
        float float3 = mutableInt1.floatValue();
        long long4 = mutableInt1.longValue();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test41");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt1.setValue((int) (byte) -1);
        mutableInt1.setValue((java.lang.Number) (-1.0f));
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (short) -1);
        mutableInt1.add((java.lang.Number) mutableInt7);
        int int9 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test42");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (short) 10);
        java.lang.Integer int2 = mutableInt1.toInteger();
        mutableInt1.add((int) '#');
        mutableInt1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2.equals(10));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test43");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt1.setValue((int) (byte) -1);
        java.lang.Integer int4 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test44");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        boolean boolean3 = mutableInt1.equals((java.lang.Object) 1);
        mutableInt1.subtract((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test45");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt1.setValue((int) (byte) -1);
        int int4 = mutableInt1.intValue();
        mutableInt1.subtract((java.lang.Number) (byte) 1);
        java.lang.Class<?> wildcardClass7 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test46");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        boolean boolean3 = mutableInt1.equals((java.lang.Object) 1);
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.add((-11));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test47");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test48");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) '4');
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test49");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt3.setValue((int) (byte) -1);
        mutableInt3.increment();
        java.lang.String str7 = mutableInt3.toString();
        int int8 = mutableInt1.compareTo(mutableInt3);
        mutableInt3.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test50");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (short) -1);
        java.lang.String str2 = mutableInt1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1" + "'", str2.equals("-1"));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test51");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt1.setValue((int) (byte) -1);
        double double4 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test52");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (short) 1);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test53");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10L);
        mutableInt1.setValue((int) (byte) -1);
        mutableInt1.setValue((int) (short) -1);
        mutableInt1.add((int) (short) 1);
    }
}

