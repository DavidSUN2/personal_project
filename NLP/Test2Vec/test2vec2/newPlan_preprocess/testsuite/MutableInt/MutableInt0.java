package MutableInt;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableInt0 {

    public static boolean debug = false;

    @Test
    public void MutableInt001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt001");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        byte byte5 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -98 + "'", byte5 == (byte) -98);
    }

    @Test
    public void MutableInt002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt002");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.decrement();
        byte byte3 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -2 + "'", byte3 == (byte) -2);
    }

    @Test
    public void MutableInt003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt003");
        // The following exception was thrown during execution in MutableInt generation
        try {
            org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableInt004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt004");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        short short7 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -90 + "'", short7 == (short) -90);
    }

    @Test
    public void MutableInt005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt005");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        float float3 = mutableInt1.floatValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int6 = mutableInt5.intValue();
        float float7 = mutableInt5.floatValue();
        mutableInt1.subtract((java.lang.Number) mutableInt5);
        double double9 = mutableInt5.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void MutableInt006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt006");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        long long3 = mutableInt1.longValue();
        byte byte4 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
    }

    @Test
    public void MutableInt007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt007");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        java.lang.Integer int7 = mutableInt1.getValue();
        mutableInt1.add((int) (byte) -98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-90) + "'", int7.equals((-90)));
    }

    @Test
    public void MutableInt008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt008");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        java.lang.Integer int7 = mutableInt3.toInteger();
        mutableInt3.add((java.lang.Number) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
    }

    @Test
    public void MutableInt009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt009");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.add((int) (short) 1);
        byte byte6 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 101 + "'", byte6 == (byte) 101);
    }

    @Test
    public void MutableInt010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt010");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        float float3 = mutableInt1.floatValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int6 = mutableInt5.intValue();
        float float7 = mutableInt5.floatValue();
        mutableInt1.subtract((java.lang.Number) mutableInt5);
        org.apache.commons.lang3.mutable.MutableInt mutableInt9 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void MutableInt011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt011");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        byte byte2 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void MutableInt012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt012");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        boolean boolean8 = mutableInt1.equals((java.lang.Object) (short) -1);
        mutableInt1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableInt013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt013");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        java.lang.Integer int7 = mutableInt1.getValue();
        short short8 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-90) + "'", int7.equals((-90)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -90 + "'", short8 == (short) -90);
    }

    @Test
    public void MutableInt014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt014");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt();
        int int4 = mutableInt3.intValue();
        boolean boolean6 = mutableInt3.equals((java.lang.Object) "1");
        int int7 = mutableInt1.compareTo(mutableInt3);
        mutableInt3.subtract((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableInt015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt015");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt016");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) int5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void MutableInt017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt017");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        byte byte3 = mutableInt0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void MutableInt018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt018");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        long long3 = mutableInt1.longValue();
        mutableInt1.setValue((java.lang.Number) 0.0d);
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        java.lang.Integer int8 = mutableInt7.toInteger();
        int int9 = mutableInt1.compareTo(mutableInt7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableInt019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt019");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        mutableInt1.setValue((int) '#');
        org.apache.commons.lang3.mutable.MutableInt mutableInt9 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
    }

    @Test
    public void MutableInt020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt020");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt4.subtract((int) 'a');
        java.lang.Integer int7 = mutableInt4.getValue();
        mutableInt1.add((java.lang.Number) mutableInt4);
        java.lang.Integer int9 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-98) + "'", int7.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9.equals(2));
    }

    @Test
    public void MutableInt021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt021");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100.0f);
        mutableInt1.setValue(100);
        java.lang.Class<?> wildcardClass7 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableInt022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt022");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        mutableInt1.setValue((int) '#');
        double double9 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    }

    @Test
    public void MutableInt023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt023");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        java.lang.Integer int7 = mutableInt3.toInteger();
        java.lang.Class<?> wildcardClass8 = mutableInt3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableInt024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt024");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt4.subtract((int) 'a');
        java.lang.Integer int7 = mutableInt4.getValue();
        mutableInt1.add((java.lang.Number) mutableInt4);
        float float9 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-98) + "'", int7.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9 == 2.0f);
    }

    @Test
    public void MutableInt025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt025");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        mutableInt1.setValue((int) '#');
        float float9 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 35.0f + "'", float9 == 35.0f);
    }

    @Test
    public void MutableInt026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt026");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        java.lang.Class<?> wildcardClass7 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableInt027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt027");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt();
        int int4 = mutableInt3.intValue();
        boolean boolean6 = mutableInt3.equals((java.lang.Object) "1");
        int int7 = mutableInt1.compareTo(mutableInt3);
        mutableInt1.setValue((int) (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableInt028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt028");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt4.subtract((int) 'a');
        java.lang.Integer int7 = mutableInt4.getValue();
        mutableInt1.add((java.lang.Number) mutableInt4);
        java.lang.Class<?> wildcardClass9 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-98) + "'", int7.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableInt029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt029");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        boolean boolean5 = mutableInt1.equals((java.lang.Object) "0");
        short short6 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -98 + "'", short6 == (short) -98);
    }

    @Test
    public void MutableInt030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt030");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        mutableInt1.subtract((java.lang.Number) (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void MutableInt031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt031");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        mutableInt1.setValue((int) '#');
        java.lang.Integer int9 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9.equals(35));
    }

    @Test
    public void MutableInt032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt032");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        byte byte2 = mutableInt0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void MutableInt033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt033");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.subtract((java.lang.Number) (short) -1);
        java.lang.Class<?> wildcardClass7 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableInt034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt034");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.setValue((int) (byte) 1);
        int int6 = mutableInt1.intValue();
        short short7 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void MutableInt035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt035");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        byte byte1 = mutableInt0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void MutableInt036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt036");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        long long4 = mutableInt1.longValue();
        mutableInt1.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long8 = mutableInt7.longValue();
        mutableInt1.add((java.lang.Number) mutableInt7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void MutableInt037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt037");
        // The following exception was thrown during execution in MutableInt generation
        try {
            org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableInt038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt038");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        float float3 = mutableInt1.floatValue();
        mutableInt1.subtract((int) (byte) -2);
        byte byte6 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 102 + "'", byte6 == (byte) 102);
    }

    @Test
    public void MutableInt039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt039");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        boolean boolean8 = mutableInt1.equals((java.lang.Object) (short) -1);
        byte byte9 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -90 + "'", byte9 == (byte) -90);
    }

    @Test
    public void MutableInt040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt040");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt();
        int int4 = mutableInt3.intValue();
        boolean boolean6 = mutableInt3.equals((java.lang.Object) "1");
        int int7 = mutableInt1.compareTo(mutableInt3);
        java.lang.Integer int8 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
    }

    @Test
    public void MutableInt041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt041");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        java.lang.Integer int7 = mutableInt3.toInteger();
        mutableInt3.subtract((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
    }

    @Test
    public void MutableInt042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt042");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        java.lang.Integer int7 = mutableInt3.toInteger();
        mutableInt3.subtract((int) (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
    }

    @Test
    public void MutableInt043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt043");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        boolean boolean8 = mutableInt1.equals((java.lang.Object) (short) -1);
        double double9 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
    }

    @Test
    public void MutableInt044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt044");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        java.lang.Integer int2 = mutableInt1.toInteger();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
    }

    @Test
    public void MutableInt045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt045");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt3.subtract(35);
        java.lang.Class<?> wildcardClass8 = mutableInt3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableInt046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt046");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        mutableInt0.subtract((int) (byte) -1);
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        mutableInt0.subtract((java.lang.Number) mutableInt7);
        long long9 = mutableInt0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-99L) + "'", long9 == (-99L));
    }

    @Test
    public void MutableInt047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt047");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        double double2 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void MutableInt048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt048");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        long long3 = mutableInt1.longValue();
        java.lang.Class<?> wildcardClass4 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableInt049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt049");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.setValue((int) (byte) 1);
        mutableInt1.subtract((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableInt050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt050");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        long long4 = mutableInt1.longValue();
        mutableInt1.decrement();
        byte byte6 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 99 + "'", byte6 == (byte) 99);
    }

    @Test
    public void MutableInt051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt051");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.add((int) (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void MutableInt052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt052");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        java.lang.Integer int2 = mutableInt1.getValue();
        mutableInt1.setValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2.equals(10));
    }

    @Test
    public void MutableInt053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt053");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        int int3 = mutableInt0.intValue();
        mutableInt0.setValue((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void MutableInt054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt054");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        long long3 = mutableInt1.longValue();
        mutableInt1.increment();
        java.lang.String str5 = mutableInt1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "101" + "'", str5.equals("101"));
    }

    @Test
    public void MutableInt055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt055");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        double double7 = mutableInt3.doubleValue();
        byte byte8 = mutableInt3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
    }

    @Test
    public void MutableInt056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt056");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        float float3 = mutableInt1.floatValue();
        mutableInt1.subtract((int) (byte) -2);
        mutableInt1.subtract((java.lang.Number) (-1.0d));
        java.lang.Integer int8 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 103 + "'", int8.equals(103));
    }

    @Test
    public void MutableInt057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt057");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.decrement();
        double double7 = mutableInt0.doubleValue();
        byte byte8 = mutableInt0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void MutableInt058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt058");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        double double3 = mutableInt1.doubleValue();
        mutableInt1.increment();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void MutableInt059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt059");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        mutableInt1.setValue((java.lang.Number) (-1));
        boolean boolean7 = mutableInt1.equals((java.lang.Object) '#');
        double double8 = mutableInt1.doubleValue();
        int int9 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableInt060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt060");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        long long3 = mutableInt1.longValue();
        short short4 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4 == (short) 100);
    }

    @Test
    public void MutableInt061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt061");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10);
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in MutableInt generation
        try {
            mutableInt1.add(number2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableInt062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt062");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt();
        int int4 = mutableInt3.intValue();
        boolean boolean6 = mutableInt3.equals((java.lang.Object) "1");
        int int7 = mutableInt1.compareTo(mutableInt3);
        java.lang.Integer int8 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
    }

    @Test
    public void MutableInt063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt063");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.increment();
        mutableInt1.add((java.lang.Number) (short) 10);
    }

    @Test
    public void MutableInt064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt064");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt();
        int int4 = mutableInt3.intValue();
        boolean boolean6 = mutableInt3.equals((java.lang.Object) "1");
        int int7 = mutableInt1.compareTo(mutableInt3);
        boolean boolean9 = mutableInt1.equals((java.lang.Object) 101L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableInt065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt065");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        java.lang.Integer int2 = mutableInt1.getValue();
        byte byte3 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void MutableInt066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt066");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.decrement();
        double double7 = mutableInt0.doubleValue();
        int int8 = mutableInt0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableInt067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt067");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100L);
        java.lang.Integer int5 = mutableInt1.getValue();
        java.lang.Integer int6 = mutableInt1.getValue();
        java.lang.Class<?> wildcardClass7 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableInt068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt068");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        double double4 = mutableInt1.doubleValue();
        java.lang.Integer int5 = mutableInt1.toInteger();
        java.lang.Integer int6 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6.equals(10));
    }

    @Test
    public void MutableInt069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt069");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        mutableInt1.add((int) (byte) -1);
        mutableInt1.subtract((int) '#');
        mutableInt1.decrement();
        java.lang.Class<?> wildcardClass7 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableInt070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt070");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        int int5 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        mutableInt1.add((java.lang.Number) 100.0d);
        byte byte9 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 99 + "'", byte9 == (byte) 99);
    }

    @Test
    public void MutableInt071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt071");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        java.lang.Integer int2 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int5 = mutableInt4.getValue();
        long long6 = mutableInt4.longValue();
        mutableInt4.increment();
        mutableInt1.add((java.lang.Number) mutableInt4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void MutableInt072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt072");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        byte byte2 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void MutableInt073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt073");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.subtract((int) (byte) 0);
        mutableInt0.decrement();
        java.lang.String str9 = mutableInt0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-1" + "'", str9.equals("-1"));
    }

    @Test
    public void MutableInt074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt074");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt4.subtract((-90));
        mutableInt1.add((java.lang.Number) mutableInt4);
        mutableInt4.subtract((int) (byte) -2);
    }

    @Test
    public void MutableInt075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt075");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        double double4 = mutableInt1.doubleValue();
        mutableInt1.subtract(100);
        long long7 = mutableInt1.longValue();
        mutableInt1.setValue(99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-90L) + "'", long7 == (-90L));
    }

    @Test
    public void MutableInt076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt076");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt4.subtract((int) 'a');
        java.lang.Integer int7 = mutableInt4.getValue();
        mutableInt1.add((java.lang.Number) mutableInt4);
        java.lang.Integer int9 = mutableInt4.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-98) + "'", int7.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-98) + "'", int9.equals((-98)));
    }

    @Test
    public void MutableInt077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt077");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.subtract((int) (byte) 0);
        mutableInt0.decrement();
        float float9 = mutableInt0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void MutableInt078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt078");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long2 = mutableInt1.longValue();
        short short3 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void MutableInt079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt079");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        mutableInt0.subtract((java.lang.Number) (short) 0);
        short short6 = mutableInt0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableInt080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt080");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        java.lang.Integer int7 = mutableInt3.getValue();
        int int8 = mutableInt3.intValue();
        java.lang.String str9 = mutableInt3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "100" + "'", str9.equals("100"));
    }

    @Test
    public void MutableInt081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt081");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        mutableInt0.subtract((java.lang.Number) (short) 0);
        int int6 = mutableInt0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void MutableInt082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt082");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        double double7 = mutableInt3.doubleValue();
        mutableInt3.decrement();
        float float9 = mutableInt3.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 99.0f + "'", float9 == 99.0f);
    }

    @Test
    public void MutableInt083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt083");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        float float3 = mutableInt1.floatValue();
        mutableInt1.subtract((int) (byte) -2);
        mutableInt1.subtract((java.lang.Number) (-1.0d));
        double double8 = mutableInt1.doubleValue();
        mutableInt1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 103.0d + "'", double8 == 103.0d);
    }

    @Test
    public void MutableInt084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt084");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10);
        mutableInt1.add((java.lang.Number) mutableInt5);
        short short7 = mutableInt5.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
    }

    @Test
    public void MutableInt085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt085");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt4.subtract((int) 'a');
        java.lang.Integer int7 = mutableInt4.getValue();
        mutableInt1.add((java.lang.Number) mutableInt4);
        int int9 = mutableInt4.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-98) + "'", int7.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-98) + "'", int9 == (-98));
    }

    @Test
    public void MutableInt086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt086");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.setValue((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableInt087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt087");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.decrement();
        mutableInt1.increment();
        java.lang.Class<?> wildcardClass4 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableInt088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt088");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        short short2 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void MutableInt089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt089");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long2 = mutableInt1.longValue();
        java.lang.Class<?> wildcardClass3 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableInt090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt090");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        java.lang.Integer int6 = mutableInt0.getValue();
        mutableInt0.decrement();
        java.lang.Integer int8 = mutableInt0.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
    }

    @Test
    public void MutableInt091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt091");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        mutableInt0.decrement();
        mutableInt0.increment();
        mutableInt0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void MutableInt092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt092");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.decrement();
        boolean boolean8 = mutableInt0.equals((java.lang.Object) (byte) -2);
        short short9 = mutableInt0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void MutableInt093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt093");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.decrement();
        mutableInt1.increment();
        short short4 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
    }

    @Test
    public void MutableInt094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt094");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 1L);
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt095");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.subtract((java.lang.Number) 100L);
        mutableInt1.subtract((java.lang.Number) 2);
    }

    @Test
    public void MutableInt096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt096");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.decrement();
        byte byte4 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
    }

    @Test
    public void MutableInt097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt097");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("1");
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt098");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        float float3 = mutableInt1.floatValue();
        mutableInt1.subtract((int) (byte) -2);
        mutableInt1.subtract((java.lang.Number) (-1.0d));
        mutableInt1.setValue(2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void MutableInt099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt099");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 35.0d);
    }

    @Test
    public void MutableInt100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt100");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("-1");
    }

    @Test
    public void MutableInt101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt101");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        int int5 = mutableInt1.intValue();
        mutableInt1.increment();
        byte byte7 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-98) + "'", int5 == (-98));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -97 + "'", byte7 == (byte) -97);
    }

    @Test
    public void MutableInt102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt102");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        double double7 = mutableInt3.doubleValue();
        double double8 = mutableInt3.doubleValue();
        float float9 = mutableInt3.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void MutableInt103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt103");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        int int6 = mutableInt1.intValue();
        short short7 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 98 + "'", short7 == (short) 98);
    }

    @Test
    public void MutableInt104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt104");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.decrement();
        short short3 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void MutableInt105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt105");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        long long4 = mutableInt1.longValue();
        mutableInt1.decrement();
        float float6 = mutableInt1.floatValue();
        mutableInt1.subtract((java.lang.Number) 98);
        mutableInt1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 99.0f + "'", float6 == 99.0f);
    }

    @Test
    public void MutableInt106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt106");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        short short7 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 98 + "'", short7 == (short) 98);
    }

    @Test
    public void MutableInt107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt107");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        mutableInt1.add((int) 'a');
        java.lang.Class<?> wildcardClass6 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableInt108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt108");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long2 = mutableInt1.longValue();
        java.lang.Integer int3 = mutableInt1.getValue();
        mutableInt1.setValue((java.lang.Number) 2.0f);
        byte byte6 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 2 + "'", byte6 == (byte) 2);
    }

    @Test
    public void MutableInt109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt109");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        int int5 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        mutableInt1.add((java.lang.Number) 100.0d);
        java.lang.Integer int9 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9.equals(99));
    }

    @Test
    public void MutableInt110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt110");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100L);
        java.lang.Integer int5 = mutableInt1.getValue();
        byte byte6 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
    }

    @Test
    public void MutableInt111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt111");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        java.lang.Integer int2 = mutableInt1.getValue();
        short short3 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void MutableInt112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt112");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        float float3 = mutableInt1.floatValue();
        mutableInt1.subtract((int) (byte) -2);
        mutableInt1.subtract((java.lang.Number) (-1.0d));
        double double8 = mutableInt1.doubleValue();
        byte byte9 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 103.0d + "'", double8 == 103.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 103 + "'", byte9 == (byte) 103);
    }

    @Test
    public void MutableInt113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt113");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        java.lang.Integer int6 = mutableInt0.getValue();
        mutableInt0.decrement();
        mutableInt0.subtract((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6.equals(0));
    }

    @Test
    public void MutableInt114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt114");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 99);
        mutableInt1.add((java.lang.Number) 99);
        java.lang.Number number7 = null;
        // The following exception was thrown during execution in MutableInt generation
        try {
            mutableInt1.setValue(number7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableInt115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt115");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.subtract((java.lang.Number) (short) -1);
        java.lang.String str7 = mutableInt1.toString();
        java.lang.Integer int8 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-97" + "'", str7.equals("-97"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8.equals((-97)));
    }

    @Test
    public void MutableInt116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt116");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        int int5 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        mutableInt1.add((java.lang.Number) 100.0d);
        double double9 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 99.0d + "'", double9 == 99.0d);
    }

    @Test
    public void MutableInt117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt117");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        mutableInt1.add((int) (byte) -1);
        mutableInt1.subtract((int) '#');
        java.lang.Integer int6 = mutableInt1.getValue();
        byte byte7 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6.equals(64));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 64 + "'", byte7 == (byte) 64);
    }

    @Test
    public void MutableInt118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt118");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(0);
        short short2 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void MutableInt119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt119");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        java.lang.String str3 = mutableInt1.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        mutableInt1.setValue((int) (byte) 101);
        short short7 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2" + "'", str3.equals("2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 101 + "'", short7 == (short) 101);
    }

    @Test
    public void MutableInt120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt120");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        java.lang.Integer int6 = mutableInt0.getValue();
        mutableInt0.decrement();
        double double8 = mutableInt0.doubleValue();
        mutableInt0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void MutableInt121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt121");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        mutableInt1.setValue((int) '#');
        byte byte9 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 35 + "'", byte9 == (byte) 35);
    }

    @Test
    public void MutableInt122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt122");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        java.lang.String str3 = mutableInt1.toString();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2" + "'", str3.equals("2"));
    }

    @Test
    public void MutableInt123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt123");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt4.subtract((-90));
        mutableInt1.add((java.lang.Number) mutableInt4);
        java.lang.Integer int8 = mutableInt1.toInteger();
        java.lang.Integer int9 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 190 + "'", int8.equals(190));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 190 + "'", int9.equals(190));
    }

    @Test
    public void MutableInt124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt124");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.setValue((int) (short) -98);
        java.lang.Integer int8 = mutableInt0.toInteger();
        float float9 = mutableInt0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-98) + "'", int8.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-98.0f) + "'", float9 == (-98.0f));
    }

    @Test
    public void MutableInt125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt125");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("101");
        java.lang.Integer int2 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2.equals(101));
    }

    @Test
    public void MutableInt126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt126");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 2.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt();
        int int3 = mutableInt2.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str6 = mutableInt5.toString();
        int int7 = mutableInt2.compareTo(mutableInt5);
        mutableInt2.decrement();
        boolean boolean9 = mutableInt1.equals((java.lang.Object) mutableInt2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "100" + "'", str6.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableInt127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt127");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        boolean boolean5 = mutableInt1.equals((java.lang.Object) "0");
        java.lang.Integer int6 = mutableInt1.getValue();
        java.lang.Integer int7 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-98) + "'", int6.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-98) + "'", int7.equals((-98)));
    }

    @Test
    public void MutableInt128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt128");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        float float2 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void MutableInt129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt129");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.increment();
        short short4 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 102 + "'", short4 == (short) 102);
    }

    @Test
    public void MutableInt130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt130");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((-90));
        mutableInt1.setValue((int) ' ');
        mutableInt1.decrement();
        mutableInt1.increment();
        mutableInt1.setValue((int) (short) 100);
    }

    @Test
    public void MutableInt131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt131");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        mutableInt0.add((java.lang.Number) (-1L));
        float float6 = mutableInt0.floatValue();
        mutableInt0.setValue((int) 'a');
        byte byte9 = mutableInt0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 97 + "'", byte9 == (byte) 97);
    }

    @Test
    public void MutableInt132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt132");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        java.lang.Integer int7 = mutableInt1.getValue();
        mutableInt1.setValue((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7.equals(98));
    }

    @Test
    public void MutableInt133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt133");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        double double4 = mutableInt1.doubleValue();
        java.lang.Integer int5 = mutableInt1.toInteger();
        mutableInt1.decrement();
        mutableInt1.setValue((java.lang.Number) (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5.equals(10));
    }

    @Test
    public void MutableInt134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt134");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        boolean boolean5 = mutableInt1.equals((java.lang.Object) "0");
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        java.lang.Integer int7 = mutableInt6.getValue();
        double double8 = mutableInt6.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-98) + "'", int7.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-98.0d) + "'", double8 == (-98.0d));
    }

    @Test
    public void MutableInt135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt135");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((-90));
        mutableInt1.setValue((int) ' ');
        mutableInt1.decrement();
        mutableInt1.subtract((int) (byte) 2);
        long long9 = mutableInt1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 29L + "'", long9 == 29L);
    }

    @Test
    public void MutableInt136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt136");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        int int7 = mutableInt1.intValue();
        long long8 = mutableInt1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
    }

    @Test
    public void MutableInt137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt137");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((-90));
        byte byte4 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -66 + "'", byte4 == (byte) -66);
    }

    @Test
    public void MutableInt138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt138");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        mutableInt1.setValue((java.lang.Number) (-1));
        boolean boolean7 = mutableInt1.equals((java.lang.Object) '#');
        double double8 = mutableInt1.doubleValue();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void MutableInt139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt139");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100.0f);
        mutableInt1.setValue(100);
        org.apache.commons.lang3.mutable.MutableInt mutableInt8 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        int int9 = mutableInt1.compareTo(mutableInt8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableInt140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt140");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 1.0f);
        mutableInt1.increment();
        mutableInt1.setValue((java.lang.Number) 99.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableInt141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt141");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10);
        mutableInt1.add((java.lang.Number) mutableInt5);
        byte byte7 = mutableInt5.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void MutableInt142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt142");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        java.lang.Integer int5 = mutableInt1.toInteger();
        float float6 = mutableInt1.floatValue();
        short short7 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
    }

    @Test
    public void MutableInt143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt143");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((-90));
        mutableInt1.setValue((int) ' ');
        mutableInt1.decrement();
        mutableInt1.increment();
        java.lang.Integer int8 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8.equals(32));
    }

    @Test
    public void MutableInt144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt144");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        java.lang.Integer int4 = mutableInt1.getValue();
        java.lang.String str5 = mutableInt1.toString();
        short short6 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
    }

    @Test
    public void MutableInt145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt145");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.subtract((java.lang.Number) (short) -1);
        mutableInt1.decrement();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
    }

    @Test
    public void MutableInt146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt146");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        java.lang.Integer int5 = mutableInt1.toInteger();
        mutableInt1.increment();
        int int7 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableInt147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt147");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        java.lang.Class<?> wildcardClass4 = mutableInt0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableInt148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt148");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        int int3 = mutableInt0.intValue();
        java.lang.Integer int4 = mutableInt0.getValue();
        mutableInt0.setValue((int) (short) -90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
    }

    @Test
    public void MutableInt149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt149");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        mutableInt1.add((int) (byte) 0);
        int int5 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void MutableInt150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt150");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        java.lang.String str3 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) 0.0d);
        short short6 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2" + "'", str3.equals("2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableInt151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt151");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.subtract((java.lang.Number) (short) -1);
        java.lang.String str7 = mutableInt1.toString();
        byte byte8 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-97" + "'", str7.equals("-97"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -97 + "'", byte8 == (byte) -97);
    }

    @Test
    public void MutableInt152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt152");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
    }

    @Test
    public void MutableInt153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt153");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(101);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 101);
        byte byte3 = mutableInt2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 101 + "'", byte3 == (byte) 101);
    }

    @Test
    public void MutableInt154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt154");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("10");
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt(100);
        double double4 = mutableInt3.doubleValue();
        int int5 = mutableInt1.compareTo(mutableInt3);
        mutableInt1.add((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void MutableInt155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt155");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        mutableInt1.add((int) 'a');
        double double6 = mutableInt1.doubleValue();
        java.lang.Class<?> wildcardClass7 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 107.0d + "'", double6 == 107.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableInt156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt156");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        java.lang.String str3 = mutableInt1.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        int int5 = mutableInt1.intValue();
        short short6 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2" + "'", str3.equals("2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 2 + "'", short6 == (short) 2);
    }

    @Test
    public void MutableInt157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt157");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        double double4 = mutableInt1.doubleValue();
        mutableInt1.subtract((int) (short) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void MutableInt158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt158");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        mutableInt1.add((int) (byte) -1);
        mutableInt1.subtract((int) '#');
        short short6 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 64 + "'", short6 == (short) 64);
    }

    @Test
    public void MutableInt159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt159");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.decrement();
        int int3 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void MutableInt160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt160");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.add((-1));
        mutableInt0.decrement();
        int int9 = mutableInt0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void MutableInt161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt161");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 2);
    }

    @Test
    public void MutableInt162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt162");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        int int6 = mutableInt1.intValue();
        float float7 = mutableInt1.floatValue();
        mutableInt1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 98.0f + "'", float7 == 98.0f);
    }

    @Test
    public void MutableInt163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt163");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        double double3 = mutableInt0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void MutableInt164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt164");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100L);
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableInt165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt165");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        mutableInt1.add((int) (byte) -1);
        mutableInt1.subtract((int) '#');
        mutableInt1.decrement();
        short short7 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 63 + "'", short7 == (short) 63);
    }

    @Test
    public void MutableInt166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt166");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        mutableInt0.decrement();
        mutableInt0.increment();
        java.lang.Class<?> wildcardClass5 = mutableInt0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableInt167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt167");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt("-97");
        int int7 = mutableInt1.compareTo(mutableInt6);
        double double8 = mutableInt6.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-97.0d) + "'", double8 == (-97.0d));
    }

    @Test
    public void MutableInt168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt168");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.add((int) (byte) -90);
        mutableInt1.decrement();
    }

    @Test
    public void MutableInt169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt169");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt3.add((int) (byte) -2);
        java.lang.Integer int8 = mutableInt3.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8.equals(98));
    }

    @Test
    public void MutableInt170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt170");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        mutableInt1.add((int) 'a');
        java.lang.Integer int6 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 107 + "'", int6.equals(107));
    }

    @Test
    public void MutableInt171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt171");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        int int6 = mutableInt1.intValue();
        float float7 = mutableInt1.floatValue();
        boolean boolean9 = mutableInt1.equals((java.lang.Object) (byte) -66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 98.0f + "'", float7 == 98.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableInt172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt172");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        double double7 = mutableInt3.doubleValue();
        double double8 = mutableInt3.doubleValue();
        mutableInt3.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void MutableInt173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt173");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        int int3 = mutableInt0.intValue();
        mutableInt0.decrement();
        mutableInt0.subtract((int) (byte) -90);
        int int7 = mutableInt0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 88 + "'", int7 == 88);
    }

    @Test
    public void MutableInt174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt174");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100L);
        mutableInt1.setValue((java.lang.Number) (short) -98);
        java.lang.String str7 = mutableInt1.toString();
        java.lang.String str8 = mutableInt1.toString();
        double double9 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-98" + "'", str7.equals("-98"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-98" + "'", str8.equals("-98"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-98.0d) + "'", double9 == (-98.0d));
    }

    @Test
    public void MutableInt175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt175");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 64);
    }

    @Test
    public void MutableInt176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt176");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        int int5 = mutableInt1.intValue();
        java.lang.String str6 = mutableInt1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1" + "'", str6.equals("-1"));
    }

    @Test
    public void MutableInt177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt177");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        double double4 = mutableInt1.doubleValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt6.increment();
        boolean boolean8 = mutableInt1.equals((java.lang.Object) mutableInt6);
        java.lang.Integer int9 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9.equals(10));
    }

    @Test
    public void MutableInt178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt178");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.add((int) (short) 1);
        int int6 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void MutableInt179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt179");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        java.lang.String str4 = mutableInt1.toString();
        java.lang.Integer int5 = mutableInt1.getValue();
        byte byte6 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
    }

    @Test
    public void MutableInt180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt180");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.add((int) (short) 1);
        java.lang.Class<?> wildcardClass6 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableInt181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt181");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("0");
        short short2 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void MutableInt182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt182");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100.0f);
        java.lang.Integer int5 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5.equals(1));
    }

    @Test
    public void MutableInt183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt183");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        long long3 = mutableInt1.longValue();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void MutableInt184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt184");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        mutableInt6.setValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
    }

    @Test
    public void MutableInt185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt185");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt();
        int int4 = mutableInt3.intValue();
        boolean boolean6 = mutableInt3.equals((java.lang.Object) "1");
        int int7 = mutableInt1.compareTo(mutableInt3);
        long long8 = mutableInt1.longValue();
        short short9 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
    }

    @Test
    public void MutableInt186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt186");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        boolean boolean3 = mutableInt1.equals((java.lang.Object) (-98));
        java.lang.String str4 = mutableInt1.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        short short6 = mutableInt5.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
    }

    @Test
    public void MutableInt187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt187");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        java.lang.Integer int2 = mutableInt1.toInteger();
        java.lang.String str3 = mutableInt1.toString();
        short short4 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100" + "'", str3.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4 == (short) 100);
    }

    @Test
    public void MutableInt188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt188");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        java.lang.Integer int4 = mutableInt1.getValue();
        java.lang.Class<?> wildcardClass5 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableInt189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt189");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.setValue((int) (byte) 1);
        short short6 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
    }

    @Test
    public void MutableInt190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt190");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void MutableInt191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt191");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((-90));
        mutableInt1.setValue((int) ' ');
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
    }

    @Test
    public void MutableInt192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt192");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        boolean boolean5 = mutableInt1.equals((java.lang.Object) "0");
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        java.lang.Integer int7 = mutableInt6.getValue();
        mutableInt6.subtract(190);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-98) + "'", int7.equals((-98)));
    }

    @Test
    public void MutableInt193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt193");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        int int6 = mutableInt1.intValue();
        float float7 = mutableInt1.floatValue();
        mutableInt1.subtract((int) (byte) -98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 98.0f + "'", float7 == 98.0f);
    }

    @Test
    public void MutableInt194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt194");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        float float3 = mutableInt1.floatValue();
        mutableInt1.subtract((int) (byte) -2);
        mutableInt1.add(103);
        mutableInt1.setValue(98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void MutableInt195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt195");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.setValue((java.lang.Number) 10.0d);
        java.lang.String str6 = mutableInt3.toString();
        mutableInt3.subtract((int) (byte) 100);
        boolean boolean9 = mutableInt1.equals((java.lang.Object) mutableInt3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableInt196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt196");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt3.subtract(35);
        double double8 = mutableInt3.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 65.0d + "'", double8 == 65.0d);
    }

    @Test
    public void MutableInt197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt197");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        java.lang.Integer int2 = mutableInt0.toInteger();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str4 = mutableInt3.toString();
        mutableInt3.decrement();
        int int6 = mutableInt3.intValue();
        mutableInt0.setValue((java.lang.Number) mutableInt3);
        java.lang.Class<?> wildcardClass8 = mutableInt3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableInt198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt198");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.decrement();
        double double7 = mutableInt0.doubleValue();
        mutableInt0.add(98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void MutableInt199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt199");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100.0f);
        mutableInt1.setValue(100);
        java.lang.String str7 = mutableInt1.toString();
        java.lang.String str8 = mutableInt1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100" + "'", str7.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "100" + "'", str8.equals("100"));
    }

    @Test
    public void MutableInt200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt200");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        mutableInt2.increment();
        java.lang.Integer int4 = mutableInt2.getValue();
        mutableInt2.add((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4.equals(1));
    }

    @Test
    public void MutableInt201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt201");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        int int4 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void MutableInt202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt202");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        int int6 = mutableInt3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void MutableInt203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt203");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        float float5 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
    }

    @Test
    public void MutableInt204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt204");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) 'a');
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int4 = mutableInt3.getValue();
        mutableInt1.setValue((java.lang.Number) mutableInt3);
        float float6 = mutableInt1.floatValue();
        java.lang.Class<?> wildcardClass7 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableInt205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt205");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        float float7 = mutableInt3.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void MutableInt206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt206");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100.0f);
        mutableInt1.add(10);
        mutableInt1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableInt207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt207");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.subtract((java.lang.Number) (short) -1);
        mutableInt1.decrement();
        float float8 = mutableInt1.floatValue();
        float float9 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-98.0f) + "'", float8 == (-98.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-98.0f) + "'", float9 == (-98.0f));
    }

    @Test
    public void MutableInt208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt208");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.subtract((java.lang.Number) (short) -1);
        java.lang.String str7 = mutableInt1.toString();
        int int8 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-97" + "'", str7.equals("-97"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-97) + "'", int8 == (-97));
    }

    @Test
    public void MutableInt209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt209");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        java.lang.Integer int7 = mutableInt1.getValue();
        mutableInt1.decrement();
        mutableInt1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7.equals(98));
    }

    @Test
    public void MutableInt210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt210");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt4.subtract((int) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt8 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt7);
        mutableInt1.subtract((java.lang.Number) mutableInt8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void MutableInt211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt211");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) -90);
        mutableInt1.decrement();
    }

    @Test
    public void MutableInt212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt212");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        int int5 = mutableInt1.intValue();
        java.lang.Class<?> wildcardClass6 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableInt213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt213");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.subtract((java.lang.Number) (short) -1);
        mutableInt1.decrement();
        java.lang.Integer int8 = mutableInt1.getValue();
        short short9 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-98) + "'", int8.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -98 + "'", short9 == (short) -98);
    }

    @Test
    public void MutableInt214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt214");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long2 = mutableInt1.longValue();
        java.lang.Integer int3 = mutableInt1.getValue();
        mutableInt1.setValue((java.lang.Number) 2.0f);
        mutableInt1.setValue((java.lang.Number) (-99L));
        int int8 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-99) + "'", int8 == (-99));
    }

    @Test
    public void MutableInt215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt215");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        float float3 = mutableInt1.floatValue();
        mutableInt1.decrement();
        float float5 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 99.0f + "'", float5 == 99.0f);
    }

    @Test
    public void MutableInt216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt216");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        mutableInt3.add((int) (byte) -1);
    }

    @Test
    public void MutableInt217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt217");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.add((int) (short) 1);
        java.lang.Integer int6 = mutableInt1.toInteger();
        short short7 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6.equals(101));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 101 + "'", short7 == (short) 101);
    }

    @Test
    public void MutableInt218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt218");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long2 = mutableInt1.longValue();
        java.lang.Integer int3 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        java.lang.Integer int5 = mutableInt4.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
    }

    @Test
    public void MutableInt219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt219");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        int int3 = mutableInt0.intValue();
        java.lang.Integer int4 = mutableInt0.toInteger();
        java.lang.Integer int5 = mutableInt0.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
    }

    @Test
    public void MutableInt220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt220");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 35);
        byte byte2 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 35 + "'", byte2 == (byte) 35);
    }

    @Test
    public void MutableInt221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt221");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        java.lang.Integer int6 = mutableInt0.getValue();
        byte byte7 = mutableInt0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void MutableInt222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt222");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        double double7 = mutableInt3.doubleValue();
        double double8 = mutableInt3.doubleValue();
        java.lang.String str9 = mutableInt3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "100" + "'", str9.equals("100"));
    }

    @Test
    public void MutableInt223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt223");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt("-97");
        int int7 = mutableInt1.compareTo(mutableInt6);
        mutableInt6.setValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableInt224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt224");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(35);
        float float2 = mutableInt1.floatValue();
        long long3 = mutableInt1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void MutableInt225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt225");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt3.add((int) (byte) -2);
        mutableInt3.add((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void MutableInt226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt226");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        int int3 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt5.add((java.lang.Number) (-1));
        int int8 = mutableInt1.compareTo(mutableInt5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void MutableInt227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt227");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.subtract((int) (byte) 99);
        mutableInt1.increment();
        short short5 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 2 + "'", short5 == (short) 2);
    }

    @Test
    public void MutableInt228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt228");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        double double3 = mutableInt1.doubleValue();
        mutableInt1.increment();
        byte byte5 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 101 + "'", byte5 == (byte) 101);
    }

    @Test
    public void MutableInt229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt229");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt3.subtract(35);
        byte byte8 = mutableInt3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 65 + "'", byte8 == (byte) 65);
    }

    @Test
    public void MutableInt230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt230");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        boolean boolean3 = mutableInt0.equals((java.lang.Object) "1");
        long long4 = mutableInt0.longValue();
        mutableInt0.subtract((int) (short) 1);
        byte byte7 = mutableInt0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
    }

    @Test
    public void MutableInt231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt231");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        float float3 = mutableInt1.floatValue();
        int int4 = mutableInt1.intValue();
        byte byte5 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void MutableInt232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt232");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long2 = mutableInt1.longValue();
        java.lang.Integer int3 = mutableInt1.getValue();
        mutableInt1.setValue((int) (short) 100);
        byte byte6 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
    }

    @Test
    public void MutableInt233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt233");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        double double2 = mutableInt1.doubleValue();
        byte byte3 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void MutableInt234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt234");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.subtract((java.lang.Number) (short) -1);
        mutableInt1.decrement();
        long long8 = mutableInt1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-98L) + "'", long8 == (-98L));
    }

    @Test
    public void MutableInt235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt235");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        java.lang.Integer int5 = mutableInt1.toInteger();
        java.lang.Integer int6 = mutableInt1.getValue();
        short short7 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
    }

    @Test
    public void MutableInt236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt236");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        mutableInt1.subtract((int) (byte) -1);
        mutableInt1.subtract((int) (byte) 101);
    }

    @Test
    public void MutableInt237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt237");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("2");
    }

    @Test
    public void MutableInt238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt238");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 98);
        mutableInt1.setValue((int) (byte) 10);
        short short4 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
    }

    @Test
    public void MutableInt239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt239");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        mutableInt1.add((int) (byte) -1);
        mutableInt1.subtract((int) '#');
        java.lang.Integer int6 = mutableInt1.getValue();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6.equals(64));
    }

    @Test
    public void MutableInt240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt240");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.add((int) (short) 1);
        mutableInt1.setValue((int) (byte) -66);
    }

    @Test
    public void MutableInt241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt241");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        mutableInt0.subtract((java.lang.Number) (short) 0);
        long long6 = mutableInt0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void MutableInt242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt242");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100L);
        java.lang.Integer int5 = mutableInt1.getValue();
        java.lang.Integer int6 = mutableInt1.getValue();
        java.lang.Integer int7 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
    }

    @Test
    public void MutableInt243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt243");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        java.lang.Integer int2 = mutableInt1.getValue();
        float float3 = mutableInt1.floatValue();
        java.lang.Integer int4 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
    }

    @Test
    public void MutableInt244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt244");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.decrement();
        double double7 = mutableInt0.doubleValue();
        mutableInt0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void MutableInt245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt245");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt4.subtract((-90));
        mutableInt1.add((java.lang.Number) mutableInt4);
        int int8 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 190 + "'", int8 == 190);
    }

    @Test
    public void MutableInt246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt246");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt();
        int int4 = mutableInt3.intValue();
        boolean boolean6 = mutableInt3.equals((java.lang.Object) "1");
        int int7 = mutableInt1.compareTo(mutableInt3);
        java.lang.Integer int8 = mutableInt3.toInteger();
        java.lang.String str9 = mutableInt3.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void MutableInt247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt247");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        java.lang.Integer int2 = mutableInt1.toInteger();
        mutableInt1.subtract((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
    }

    @Test
    public void MutableInt248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt248");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        short short6 = mutableInt0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableInt249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt249");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 10);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        mutableInt3.setValue((java.lang.Number) (short) -1);
        java.lang.Integer int7 = mutableInt3.toInteger();
        java.lang.Integer int8 = mutableInt3.getValue();
        mutableInt1.subtract((java.lang.Number) int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8.equals((-1)));
    }

    @Test
    public void MutableInt250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt250");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) ' ');
    }

    @Test
    public void MutableInt251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt251");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.setValue((int) (byte) 1);
        int int6 = mutableInt1.intValue();
        int int7 = mutableInt1.intValue();
        short short8 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void MutableInt252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt252");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100L);
        mutableInt1.setValue((java.lang.Number) (short) -98);
        java.lang.String str7 = mutableInt1.toString();
        java.lang.String str8 = mutableInt1.toString();
        java.lang.Integer int9 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-98" + "'", str7.equals("-98"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-98" + "'", str8.equals("-98"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-98) + "'", int9.equals((-98)));
    }

    @Test
    public void MutableInt253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt253");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        double double2 = mutableInt1.doubleValue();
        int int3 = mutableInt1.intValue();
        java.lang.String str4 = mutableInt1.toString();
        java.lang.Class<?> wildcardClass5 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableInt254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt254");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        mutableInt1.subtract((int) (byte) -97);
        double double9 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 195.0d + "'", double9 == 195.0d);
    }

    @Test
    public void MutableInt255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt255");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        double double2 = mutableInt1.doubleValue();
        int int3 = mutableInt1.intValue();
        double double4 = mutableInt1.doubleValue();
        java.lang.String str5 = mutableInt1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100" + "'", str5.equals("100"));
    }

    @Test
    public void MutableInt256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt256");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        mutableInt2.increment();
        short short4 = mutableInt2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
    }

    @Test
    public void MutableInt257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt257");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        java.lang.Integer int2 = mutableInt1.toInteger();
        java.lang.String str3 = mutableInt1.toString();
        int int4 = mutableInt1.intValue();
        double double5 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100" + "'", str3.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void MutableInt258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt258");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        boolean boolean3 = mutableInt0.equals((java.lang.Object) "1");
        long long4 = mutableInt0.longValue();
        java.lang.Integer int5 = mutableInt0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5.equals(0));
    }

    @Test
    public void MutableInt259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt259");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100L);
        java.lang.Integer int5 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        mutableInt1.increment();
        short short8 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 101 + "'", short8 == (short) 101);
    }

    @Test
    public void MutableInt260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt260");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        long long4 = mutableInt1.longValue();
        mutableInt1.decrement();
        float float6 = mutableInt1.floatValue();
        mutableInt1.subtract((java.lang.Number) 98);
        java.lang.String str9 = mutableInt1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 99.0f + "'", float6 == 99.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void MutableInt261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt261");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        mutableInt1.add(0);
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in MutableInt generation
        try {
            mutableInt1.add(number6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableInt262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt262");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        java.lang.Integer int3 = mutableInt1.toInteger();
        java.lang.Integer int4 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
    }

    @Test
    public void MutableInt263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt263");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        java.lang.Integer int2 = mutableInt0.toInteger();
        java.lang.Integer int3 = mutableInt0.getValue();
        long long4 = mutableInt0.longValue();
        long long5 = mutableInt0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void MutableInt264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt264");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(0);
        float float2 = mutableInt1.floatValue();
        byte byte3 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void MutableInt265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt265");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        java.lang.Class<?> wildcardClass3 = mutableInt0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableInt266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt266");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        java.lang.Integer int2 = mutableInt1.toInteger();
        mutableInt1.subtract(103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
    }

    @Test
    public void MutableInt267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt267");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 35);
        java.lang.Integer int2 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2.equals(35));
    }

    @Test
    public void MutableInt268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt268");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.subtract((int) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt4);
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt5);
        mutableInt6.subtract((int) (byte) 101);
    }

    @Test
    public void MutableInt269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt269");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        long long4 = mutableInt1.longValue();
        mutableInt1.decrement();
        float float6 = mutableInt1.floatValue();
        short short7 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 99.0f + "'", float6 == 99.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 99 + "'", short7 == (short) 99);
    }

    @Test
    public void MutableInt270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt270");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.setValue((java.lang.Number) 99.0f);
        mutableInt1.add((int) (byte) 35);
    }

    @Test
    public void MutableInt271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt271");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        double double7 = mutableInt3.doubleValue();
        short short8 = mutableInt3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
    }

    @Test
    public void MutableInt272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt272");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        int int7 = mutableInt1.intValue();
        java.lang.Class<?> wildcardClass8 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableInt273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt273");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.add((int) (short) 1);
        java.lang.Integer int6 = mutableInt1.toInteger();
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        mutableInt7.setValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6.equals(101));
    }

    @Test
    public void MutableInt274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt274");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.subtract((java.lang.Number) (short) -1);
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (short) -1);
        byte byte8 = mutableInt7.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void MutableInt275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt275");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("-3");
    }

    @Test
    public void MutableInt276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt276");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        double double2 = mutableInt1.doubleValue();
        int int3 = mutableInt1.intValue();
        double double4 = mutableInt1.doubleValue();
        short short5 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
    }

    @Test
    public void MutableInt277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt277");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 1.0f);
        mutableInt1.increment();
        java.lang.Integer int6 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6.equals(101));
    }

    @Test
    public void MutableInt278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt278");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        double double4 = mutableInt1.doubleValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt6.increment();
        boolean boolean8 = mutableInt1.equals((java.lang.Object) mutableInt6);
        java.lang.Integer int9 = mutableInt6.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9.equals(0));
    }

    @Test
    public void MutableInt279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt279");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        double double4 = mutableInt1.doubleValue();
        java.lang.Integer int5 = mutableInt1.toInteger();
        mutableInt1.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        java.lang.Class<?> wildcardClass8 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableInt280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt280");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        mutableInt1.subtract(103);
        mutableInt1.decrement();
        int int5 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-4) + "'", int5 == (-4));
    }

    @Test
    public void MutableInt281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt281");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long2 = mutableInt1.longValue();
        java.lang.Integer int3 = mutableInt1.getValue();
        mutableInt1.setValue((int) (short) 100);
        mutableInt1.decrement();
        java.lang.Integer int7 = mutableInt1.toInteger();
        java.lang.Class<?> wildcardClass8 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableInt282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt282");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.subtract((int) (byte) 0);
        double double8 = mutableInt0.doubleValue();
        int int9 = mutableInt0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableInt283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt283");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        short short7 = mutableInt3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
    }

    @Test
    public void MutableInt284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt284");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        double double3 = mutableInt1.doubleValue();
        float float4 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
    }

    @Test
    public void MutableInt285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt285");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100.0f);
        mutableInt1.setValue(100);
        java.lang.String str7 = mutableInt1.toString();
        mutableInt1.setValue(64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100" + "'", str7.equals("100"));
    }

    @Test
    public void MutableInt286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt286");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(103);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((-98));
        mutableInt1.subtract((java.lang.Number) (-98));
        int int5 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 201 + "'", int5 == 201);
    }

    @Test
    public void MutableInt287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt287");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        double double4 = mutableInt1.doubleValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt6.increment();
        boolean boolean8 = mutableInt1.equals((java.lang.Object) mutableInt6);
        java.lang.Class<?> wildcardClass9 = mutableInt6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableInt288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt288");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        boolean boolean8 = mutableInt3.equals((java.lang.Object) 2);
        java.lang.Integer int9 = mutableInt3.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9.equals(100));
    }

    @Test
    public void MutableInt289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt289");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        long long2 = mutableInt1.longValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int5 = mutableInt4.intValue();
        float float6 = mutableInt4.floatValue();
        mutableInt4.decrement();
        int int8 = mutableInt1.compareTo(mutableInt4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableInt290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt290");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10);
        mutableInt1.setValue((-97));
    }

    @Test
    public void MutableInt291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt291");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        java.lang.String str3 = mutableInt1.toString();
        mutableInt1.subtract((int) (short) -90);
        byte byte6 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2" + "'", str3.equals("2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 92 + "'", byte6 == (byte) 92);
    }

    @Test
    public void MutableInt292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt292");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 99);
        mutableInt1.decrement();
    }

    @Test
    public void MutableInt293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt293");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        java.lang.Integer int7 = mutableInt3.toInteger();
        java.lang.Integer int8 = mutableInt3.toInteger();
        int int9 = mutableInt3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void MutableInt294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt294");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.setValue((java.lang.Number) 99.0f);
        java.lang.Integer int5 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 99 + "'", int5.equals(99));
    }

    @Test
    public void MutableInt295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt295");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt();
        int int4 = mutableInt3.intValue();
        boolean boolean6 = mutableInt3.equals((java.lang.Object) "1");
        int int7 = mutableInt1.compareTo(mutableInt3);
        mutableInt1.increment();
        short short9 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 101 + "'", short9 == (short) 101);
    }

    @Test
    public void MutableInt296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt296");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        java.lang.Integer int2 = mutableInt1.getValue();
        float float3 = mutableInt1.floatValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) float3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void MutableInt297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt297");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 101);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt3.setValue((int) (byte) 102);
        mutableInt1.setValue((java.lang.Number) (byte) 102);
    }

    @Test
    public void MutableInt298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt298");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((-90));
        mutableInt1.setValue((int) ' ');
        mutableInt1.decrement();
        mutableInt1.increment();
        mutableInt1.setValue((int) (byte) 35);
    }

    @Test
    public void MutableInt299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt299");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.setValue((int) (byte) 1);
        int int6 = mutableInt1.intValue();
        long long7 = mutableInt1.longValue();
        int int8 = mutableInt1.intValue();
        short short9 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void MutableInt300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt300");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        double double4 = mutableInt1.doubleValue();
        mutableInt1.subtract(100);
        mutableInt1.increment();
        mutableInt1.subtract((java.lang.Number) (byte) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void MutableInt301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt301");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100.0f);
        mutableInt1.setValue(100);
        mutableInt1.decrement();
        mutableInt1.setValue((int) (byte) -97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableInt302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt302");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.decrement();
        byte byte7 = mutableInt0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
    }

    @Test
    public void MutableInt303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt303");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((-98));
        mutableInt1.setValue((int) (byte) 101);
    }

    @Test
    public void MutableInt304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt304");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        boolean boolean8 = mutableInt1.equals((java.lang.Object) (short) -1);
        float float9 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-90.0f) + "'", float9 == (-90.0f));
    }

    @Test
    public void MutableInt305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt305");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        java.lang.String str5 = mutableInt1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "99" + "'", str5.equals("99"));
    }

    @Test
    public void MutableInt306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt306");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 2);
    }

    @Test
    public void MutableInt307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt307");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        boolean boolean3 = mutableInt1.equals((java.lang.Object) (-98));
        java.lang.String str4 = mutableInt1.toString();
        mutableInt1.add((int) (byte) -98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
    }

    @Test
    public void MutableInt308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt308");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long2 = mutableInt1.longValue();
        java.lang.Integer int3 = mutableInt1.getValue();
        mutableInt1.setValue((int) (short) 100);
        mutableInt1.decrement();
        java.lang.Integer int7 = mutableInt1.toInteger();
        short short8 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 99 + "'", short8 == (short) 99);
    }

    @Test
    public void MutableInt309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt309");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        mutableInt1.subtract(103);
        java.lang.String str4 = mutableInt1.toString();
        java.lang.Class<?> wildcardClass5 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-3" + "'", str4.equals("-3"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableInt310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt310");
        java.lang.Number number0 = null;
        // The following exception was thrown during execution in MutableInt generation
        try {
            org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(number0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableInt311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt311");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.setValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void MutableInt312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt312");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 1.0f);
        mutableInt1.increment();
        java.lang.Class<?> wildcardClass6 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableInt313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt313");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        java.lang.String str3 = mutableInt1.toString();
        long long4 = mutableInt1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2" + "'", str3.equals("2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
    }

    @Test
    public void MutableInt314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt314");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.subtract((int) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt4);
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt5);
        java.lang.Integer int7 = mutableInt6.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7.equals(99));
    }

    @Test
    public void MutableInt315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt315");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        double double4 = mutableInt1.doubleValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt6.increment();
        boolean boolean8 = mutableInt1.equals((java.lang.Object) mutableInt6);
        java.lang.Integer int9 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9.equals(10));
    }

    @Test
    public void MutableInt316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt316");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.decrement();
        float float4 = mutableInt1.floatValue();
        java.lang.Integer int5 = mutableInt1.getValue();
        boolean boolean7 = mutableInt1.equals((java.lang.Object) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableInt317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt317");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("101");
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        java.lang.String str3 = mutableInt2.toString();
        java.lang.Class<?> wildcardClass4 = mutableInt2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "101" + "'", str3.equals("101"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableInt318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt318");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        mutableInt6.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
    }

    @Test
    public void MutableInt319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt319");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt4.subtract((-90));
        mutableInt1.add((java.lang.Number) mutableInt4);
        mutableInt1.setValue((int) (short) 98);
    }

    @Test
    public void MutableInt320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt320");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        int int3 = mutableInt0.intValue();
        mutableInt0.decrement();
        short short5 = mutableInt0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -2 + "'", short5 == (short) -2);
    }

    @Test
    public void MutableInt321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt321");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt4.subtract((int) 'a');
        java.lang.Integer int7 = mutableInt4.getValue();
        mutableInt1.add((java.lang.Number) mutableInt4);
        float float9 = mutableInt4.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-98) + "'", int7.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-98.0f) + "'", float9 == (-98.0f));
    }

    @Test
    public void MutableInt322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt322");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        mutableInt1.add((int) (byte) -1);
        java.lang.Integer int4 = mutableInt1.getValue();
        java.lang.Integer int5 = mutableInt1.toInteger();
        java.lang.Integer int6 = mutableInt1.getValue();
        byte byte7 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 99 + "'", int5.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 99 + "'", int6.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 99 + "'", byte7 == (byte) 99);
    }

    @Test
    public void MutableInt323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt323");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((java.lang.Number) mutableInt5);
        byte byte7 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void MutableInt324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt324");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.add(35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
    }

    @Test
    public void MutableInt325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt325");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        java.lang.Integer int4 = mutableInt1.getValue();
        java.lang.String str5 = mutableInt1.toString();
        java.lang.Class<?> wildcardClass6 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableInt326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt326");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) -97);
    }

    @Test
    public void MutableInt327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt327");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        long long2 = mutableInt1.longValue();
        java.lang.Class<?> wildcardClass3 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableInt328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt328");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("10");
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        boolean boolean6 = mutableInt3.equals((java.lang.Object) 1.0f);
        int int7 = mutableInt1.compareTo(mutableInt3);
        mutableInt3.add(88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void MutableInt329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt329");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        double double4 = mutableInt1.doubleValue();
        java.lang.Integer int5 = mutableInt1.toInteger();
        mutableInt1.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        short short8 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 9 + "'", short8 == (short) 9);
    }

    @Test
    public void MutableInt330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt330");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(2);
        mutableInt1.subtract(0);
        short short4 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 2 + "'", short4 == (short) 2);
    }

    @Test
    public void MutableInt331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt331");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((-90));
        java.lang.Integer int4 = mutableInt1.toInteger();
        java.lang.Integer int5 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 190 + "'", int4.equals(190));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 190 + "'", int5.equals(190));
    }

    @Test
    public void MutableInt332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt332");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        double double4 = mutableInt1.doubleValue();
        mutableInt1.setValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void MutableInt333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt333");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        float float3 = mutableInt1.floatValue();
        byte byte4 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
    }

    @Test
    public void MutableInt334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt334");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.subtract((int) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt4);
        java.lang.String str6 = mutableInt4.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt8 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10);
        mutableInt4.add((java.lang.Number) mutableInt8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "99" + "'", str6.equals("99"));
    }

    @Test
    public void MutableInt335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt335");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.decrement();
        float float4 = mutableInt1.floatValue();
        java.lang.Integer int5 = mutableInt1.getValue();
        float float6 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void MutableInt336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt336");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        mutableInt1.setValue((java.lang.Number) (-1));
        java.lang.Integer int6 = mutableInt1.getValue();
        java.lang.Class<?> wildcardClass7 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableInt337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt337");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-99L));
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt338");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long2 = mutableInt1.longValue();
        java.lang.Integer int3 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        double double5 = mutableInt4.doubleValue();
        short short6 = mutableInt4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
    }

    @Test
    public void MutableInt339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt339");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        boolean boolean5 = mutableInt1.equals((java.lang.Object) "0");
        double double6 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-98.0d) + "'", double6 == (-98.0d));
    }

    @Test
    public void MutableInt340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt340");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt("-97");
        int int7 = mutableInt1.compareTo(mutableInt6);
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableInt341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt341");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        java.lang.Integer int6 = mutableInt0.getValue();
        mutableInt0.setValue(35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6.equals(0));
    }

    @Test
    public void MutableInt342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt342");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(101);
        long long2 = mutableInt1.longValue();
        java.lang.Integer int3 = mutableInt1.toInteger();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt5.decrement();
        int int7 = mutableInt1.compareTo(mutableInt5);
        short short8 = mutableInt5.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3.equals(101));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -2 + "'", short8 == (short) -2);
    }

    @Test
    public void MutableInt343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt343");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        java.lang.Integer int2 = mutableInt1.getValue();
        double double3 = mutableInt1.doubleValue();
        long long4 = mutableInt1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void MutableInt344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt344");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        java.lang.String str3 = mutableInt1.toString();
        boolean boolean5 = mutableInt1.equals((java.lang.Object) ' ');
        mutableInt1.subtract((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2" + "'", str3.equals("2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableInt345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt345");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        java.lang.Integer int5 = mutableInt1.toInteger();
        float float6 = mutableInt1.floatValue();
        long long7 = mutableInt1.longValue();
        double double8 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void MutableInt346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt346");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(35);
        int int2 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt(101);
        long long5 = mutableInt4.longValue();
        java.lang.Integer int6 = mutableInt4.toInteger();
        mutableInt4.setValue((int) (byte) -90);
        boolean boolean9 = mutableInt1.equals((java.lang.Object) mutableInt4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 101L + "'", long5 == 101L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6.equals(101));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableInt347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt347");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.subtract((java.lang.Number) 100L);
        java.lang.Class<?> wildcardClass4 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableInt348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt348");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("100");
        double double2 = mutableInt1.doubleValue();
        double double3 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void MutableInt349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt349");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        mutableInt0.decrement();
        mutableInt0.increment();
        mutableInt0.add((java.lang.Number) 1.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 1.0f);
        mutableInt7.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void MutableInt350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt350");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        boolean boolean3 = mutableInt0.equals((java.lang.Object) "1");
        long long4 = mutableInt0.longValue();
        java.lang.Class<?> wildcardClass5 = mutableInt0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableInt351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt351");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        long long3 = mutableInt1.longValue();
        float float4 = mutableInt1.floatValue();
        long long5 = mutableInt1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void MutableInt352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt352");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        long long4 = mutableInt1.longValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        short short6 = mutableInt5.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
    }

    @Test
    public void MutableInt353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt353");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.setValue((int) (short) -98);
        java.lang.Class<?> wildcardClass8 = mutableInt0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableInt354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt354");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        mutableInt1.add((int) 'a');
        double double6 = mutableInt1.doubleValue();
        java.lang.Integer int7 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 107.0d + "'", double6 == 107.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 107 + "'", int7.equals(107));
    }

    @Test
    public void MutableInt355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt355");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10);
        mutableInt1.add(64);
        java.lang.String str4 = mutableInt1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "74" + "'", str4.equals("74"));
    }

    @Test
    public void MutableInt356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt356");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long2 = mutableInt1.longValue();
        java.lang.Integer int3 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        java.lang.Integer int5 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
    }

    @Test
    public void MutableInt357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt357");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.subtract((int) (byte) 0);
        java.lang.Integer int8 = mutableInt0.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8.equals(0));
    }

    @Test
    public void MutableInt358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt358");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        long long3 = mutableInt1.longValue();
        mutableInt1.decrement();
        mutableInt1.setValue((int) (byte) 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void MutableInt359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt359");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        long long4 = mutableInt1.longValue();
        mutableInt1.decrement();
        mutableInt1.add(2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void MutableInt360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt360");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        mutableInt0.decrement();
        mutableInt0.increment();
        double double5 = mutableInt0.doubleValue();
        mutableInt0.decrement();
        float float7 = mutableInt0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-2.0f) + "'", float7 == (-2.0f));
    }

    @Test
    public void MutableInt361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt361");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("101");
        java.lang.String str2 = mutableInt1.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt3);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt3);
        mutableInt5.increment();
        java.lang.Integer int7 = mutableInt5.getValue();
        boolean boolean8 = mutableInt1.equals((java.lang.Object) mutableInt5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "101" + "'", str2.equals("101"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7.equals(1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableInt362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt362");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.subtract((java.lang.Number) (short) -1);
        java.lang.String str7 = mutableInt1.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt8 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        byte byte9 = mutableInt8.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-97" + "'", str7.equals("-97"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -97 + "'", byte9 == (byte) -97);
    }

    @Test
    public void MutableInt363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt363");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.add((int) (short) 1);
        java.lang.Integer int6 = mutableInt1.toInteger();
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        mutableInt7.add((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6.equals(101));
    }

    @Test
    public void MutableInt364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt364");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.add((-1));
        mutableInt0.increment();
        java.lang.Class<?> wildcardClass9 = mutableInt0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableInt365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt365");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100.0f);
        mutableInt1.setValue(100);
        java.lang.String str7 = mutableInt1.toString();
        float float8 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100" + "'", str7.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void MutableInt366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt366");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        long long3 = mutableInt1.longValue();
        mutableInt1.increment();
        int int5 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) int5);
        float float7 = mutableInt6.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 101.0f + "'", float7 == 101.0f);
    }

    @Test
    public void MutableInt367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt367");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        float float3 = mutableInt1.floatValue();
        mutableInt1.subtract((int) (byte) -2);
        java.lang.Integer int6 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6.equals(102));
    }

    @Test
    public void MutableInt368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt368");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("-98");
        double double2 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-98.0d) + "'", double2 == (-98.0d));
    }

    @Test
    public void MutableInt369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt369");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.subtract((int) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt4);
        java.lang.String str6 = mutableInt4.toString();
        mutableInt4.setValue((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "99" + "'", str6.equals("99"));
    }

    @Test
    public void MutableInt370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt370");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        double double6 = mutableInt0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void MutableInt371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt371");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) -1);
        mutableInt1.add(88);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt(35);
        mutableInt5.setValue((int) (short) 64);
        mutableInt1.add((java.lang.Number) (short) 64);
    }

    @Test
    public void MutableInt372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt372");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        mutableInt1.add((int) (byte) -1);
        mutableInt1.subtract((int) '#');
        java.lang.Integer int6 = mutableInt1.getValue();
        short short7 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6.equals(64));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 64 + "'", short7 == (short) 64);
    }

    @Test
    public void MutableInt373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt373");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.subtract((java.lang.Number) (short) -1);
        mutableInt1.decrement();
        java.lang.Integer int8 = mutableInt1.getValue();
        java.lang.Class<?> wildcardClass9 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-98) + "'", int8.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableInt374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt374");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10);
        mutableInt1.add((java.lang.Number) mutableInt5);
        mutableInt1.add((int) (short) 1);
        float float9 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 21.0f + "'", float9 == 21.0f);
    }

    @Test
    public void MutableInt375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt375");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        java.lang.Integer int7 = mutableInt1.toInteger();
        short short8 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-90) + "'", int7.equals((-90)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -90 + "'", short8 == (short) -90);
    }

    @Test
    public void MutableInt376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt376");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        mutableInt2.add((int) (short) -2);
        float float5 = mutableInt2.floatValue();
        java.lang.String str6 = mutableInt2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-2.0f) + "'", float5 == (-2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-2" + "'", str6.equals("-2"));
    }

    @Test
    public void MutableInt377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt377");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        long long4 = mutableInt1.longValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        mutableInt1.add((-2));
        java.lang.Integer int8 = mutableInt1.toInteger();
        org.apache.commons.lang3.mutable.MutableInt mutableInt9 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8.equals(98));
    }

    @Test
    public void MutableInt378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt378");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.decrement();
        float float4 = mutableInt1.floatValue();
        java.lang.String str5 = mutableInt1.toString();
        mutableInt1.setValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100" + "'", str5.equals("100"));
    }

    @Test
    public void MutableInt379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt379");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        java.lang.Integer int7 = mutableInt3.getValue();
        int int8 = mutableInt3.intValue();
        float float9 = mutableInt3.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void MutableInt380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt380");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.decrement();
        boolean boolean8 = mutableInt0.equals((java.lang.Object) (byte) -2);
        java.lang.Integer int9 = mutableInt0.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9.equals((-1)));
    }

    @Test
    public void MutableInt381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt381");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("10");
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int4 = mutableInt3.getValue();
        long long5 = mutableInt3.longValue();
        mutableInt3.increment();
        int int7 = mutableInt3.intValue();
        mutableInt1.subtract((java.lang.Number) int7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
    }

    @Test
    public void MutableInt382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt382");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        java.lang.Integer int6 = mutableInt0.getValue();
        mutableInt0.decrement();
        double double8 = mutableInt0.doubleValue();
        double double9 = mutableInt0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void MutableInt383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt383");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100L);
        mutableInt1.setValue((java.lang.Number) (short) -98);
        java.lang.String str7 = mutableInt1.toString();
        java.lang.String str8 = mutableInt1.toString();
        short short9 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-98" + "'", str7.equals("-98"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-98" + "'", str8.equals("-98"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -98 + "'", short9 == (short) -98);
    }

    @Test
    public void MutableInt384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt384");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        float float3 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 101.0f + "'", float3 == 101.0f);
    }

    @Test
    public void MutableInt385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt385");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.setValue((int) (byte) 1);
        int int6 = mutableInt1.intValue();
        long long7 = mutableInt1.longValue();
        float float8 = mutableInt1.floatValue();
        mutableInt1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void MutableInt386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt386");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        mutableInt0.add((int) (byte) 92);
        mutableInt0.increment();
    }

    @Test
    public void MutableInt387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt387");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        double double2 = mutableInt1.doubleValue();
        int int3 = mutableInt1.intValue();
        double double4 = mutableInt1.doubleValue();
        mutableInt1.decrement();
        mutableInt1.setValue(102);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void MutableInt388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt388");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("1");
        mutableInt1.increment();
        java.lang.Class<?> wildcardClass3 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableInt389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt389");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(103);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((-98));
        mutableInt1.subtract((java.lang.Number) (-98));
        mutableInt1.subtract((int) (byte) 0);
    }

    @Test
    public void MutableInt390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt390");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
    }

    @Test
    public void MutableInt391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt391");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        double double3 = mutableInt1.doubleValue();
        mutableInt1.increment();
        mutableInt1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void MutableInt392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt392");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        long long3 = mutableInt1.longValue();
        short short4 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4 == (short) 100);
    }

    @Test
    public void MutableInt393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt393");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt4.subtract((int) 'a');
        java.lang.Integer int7 = mutableInt4.getValue();
        mutableInt1.add((java.lang.Number) mutableInt4);
        java.lang.String str9 = mutableInt1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-98) + "'", int7.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "2" + "'", str9.equals("2"));
    }

    @Test
    public void MutableInt394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt394");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(101);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 101);
        double double3 = mutableInt2.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 101.0d + "'", double3 == 101.0d);
    }

    @Test
    public void MutableInt395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt395");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        mutableInt0.decrement();
        mutableInt0.increment();
        mutableInt0.add((java.lang.Number) 1.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 1.0f);
        byte byte8 = mutableInt7.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void MutableInt396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt396");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100.0f);
        mutableInt1.setValue(100);
        java.lang.String str7 = mutableInt1.toString();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100" + "'", str7.equals("100"));
    }

    @Test
    public void MutableInt397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt397");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        mutableInt3.increment();
        java.lang.Integer int8 = mutableInt3.toInteger();
        java.lang.Integer int9 = mutableInt3.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8.equals(101));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9.equals(101));
    }

    @Test
    public void MutableInt398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt398");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        mutableInt1.subtract((int) (byte) -98);
        double double7 = mutableInt1.doubleValue();
        java.lang.Integer int8 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8.equals(97));
    }

    @Test
    public void MutableInt399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt399");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        int int6 = mutableInt1.intValue();
        double double7 = mutableInt1.doubleValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt8 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        byte byte9 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 98.0d + "'", double7 == 98.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 98 + "'", byte9 == (byte) 98);
    }

    @Test
    public void MutableInt400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt400");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        mutableInt0.decrement();
    }

    @Test
    public void MutableInt401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt401");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        float float1 = mutableInt0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void MutableInt402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt402");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        byte byte5 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 99 + "'", byte5 == (byte) 99);
    }

    @Test
    public void MutableInt403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt403");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.subtract((int) (byte) -1);
        long long4 = mutableInt1.longValue();
        boolean boolean6 = mutableInt1.equals((java.lang.Object) (byte) 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableInt404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt404");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (short) 2);
        byte byte2 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 2 + "'", byte2 == (byte) 2);
    }

    @Test
    public void MutableInt405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt405");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        mutableInt2.increment();
        mutableInt2.setValue(88);
        byte byte6 = mutableInt2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 88 + "'", byte6 == (byte) 88);
    }

    @Test
    public void MutableInt406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt406");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.add((-1));
        mutableInt0.increment();
        mutableInt0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void MutableInt407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt407");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        java.lang.Integer int4 = mutableInt1.getValue();
        java.lang.String str5 = mutableInt1.toString();
        double double6 = mutableInt1.doubleValue();
        java.lang.Integer int7 = mutableInt1.getValue();
        java.lang.Integer int8 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8.equals(10));
    }

    @Test
    public void MutableInt408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt408");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        mutableInt0.add((java.lang.Number) (-1L));
        short short6 = mutableInt0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
    }

    @Test
    public void MutableInt409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt409");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("74");
    }

    @Test
    public void MutableInt410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt410");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        java.lang.String str3 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) 0.0d);
        mutableInt1.subtract((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2" + "'", str3.equals("2"));
    }

    @Test
    public void MutableInt411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt411");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("99");
        double double2 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.0d + "'", double2 == 99.0d);
    }

    @Test
    public void MutableInt412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt412");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt(35);
        mutableInt1.subtract((java.lang.Number) mutableInt4);
    }

    @Test
    public void MutableInt413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt413");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        double double2 = mutableInt0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void MutableInt414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt414");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        double double2 = mutableInt1.doubleValue();
        int int3 = mutableInt1.intValue();
        java.lang.Integer int4 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
    }

    @Test
    public void MutableInt415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt415");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.subtract((java.lang.Number) (short) -1);
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (short) -1);
        java.lang.String str8 = mutableInt7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1" + "'", str8.equals("-1"));
    }

    @Test
    public void MutableInt416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt416");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.add((int) (short) 1);
        java.lang.Integer int6 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6.equals(101));
    }

    @Test
    public void MutableInt417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt417");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("98");
        float float2 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 98.0f + "'", float2 == 98.0f);
    }

    @Test
    public void MutableInt418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt418");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 2.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt(0);
        float float4 = mutableInt3.floatValue();
        mutableInt1.setValue((java.lang.Number) mutableInt3);
        java.lang.Class<?> wildcardClass6 = mutableInt3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableInt419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt419");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        mutableInt1.subtract((java.lang.Number) (byte) -1);
        java.lang.Integer int6 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-97) + "'", int6.equals((-97)));
    }

    @Test
    public void MutableInt420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt420");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 99);
        mutableInt1.add((java.lang.Number) 99);
        mutableInt1.increment();
        int int8 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 199 + "'", int8 == 199);
    }

    @Test
    public void MutableInt421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt421");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        java.lang.Integer int5 = mutableInt1.toInteger();
        short short6 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 99 + "'", int5.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 99 + "'", short6 == (short) 99);
    }

    @Test
    public void MutableInt422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt422");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (byte) -90);
    }

    @Test
    public void MutableInt423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt423");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("1");
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int4 = mutableInt3.intValue();
        float float5 = mutableInt3.floatValue();
        mutableInt3.decrement();
        java.lang.Integer int7 = mutableInt3.getValue();
        boolean boolean8 = mutableInt1.equals((java.lang.Object) mutableInt3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableInt424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt424");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt425");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        java.lang.Integer int7 = mutableInt3.toInteger();
        double double8 = mutableInt3.doubleValue();
        double double9 = mutableInt3.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void MutableInt426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt426");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(88);
        mutableInt1.decrement();
    }

    @Test
    public void MutableInt427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt427");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 1);
        java.lang.String str2 = mutableInt1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void MutableInt428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt428");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        double double4 = mutableInt1.doubleValue();
        mutableInt1.add((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void MutableInt429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt429");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        boolean boolean3 = mutableInt0.equals((java.lang.Object) "1");
        java.lang.Integer int4 = mutableInt0.toInteger();
        mutableInt0.setValue((java.lang.Number) (-4));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4.equals(0));
    }

    @Test
    public void MutableInt430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt430");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        mutableInt0.decrement();
        java.lang.Integer int4 = mutableInt0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4.equals((-2)));
    }

    @Test
    public void MutableInt431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt431");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 101);
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt432");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        mutableInt0.decrement();
        mutableInt0.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        mutableInt0.subtract((int) (byte) 2);
        short short7 = mutableInt0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -4 + "'", short7 == (short) -4);
    }

    @Test
    public void MutableInt433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt433");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.subtract((int) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt4);
        mutableInt4.increment();
    }

    @Test
    public void MutableInt434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt434");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 0);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt(100);
        java.lang.Integer int4 = mutableInt3.getValue();
        int int5 = mutableInt1.compareTo(mutableInt3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void MutableInt435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt435");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        float float3 = mutableInt1.floatValue();
        mutableInt1.subtract((int) (byte) -2);
        mutableInt1.add(103);
        org.apache.commons.lang3.mutable.MutableInt mutableInt8 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        float float9 = mutableInt8.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 205.0f + "'", float9 == 205.0f);
    }

    @Test
    public void MutableInt436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt436");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt0.decrement();
        mutableInt0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void MutableInt437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt437");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt();
        int int3 = mutableInt2.intValue();
        int int4 = mutableInt1.compareTo(mutableInt2);
        mutableInt1.decrement();
        java.lang.Integer int6 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6.equals(9));
    }

    @Test
    public void MutableInt438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt438");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100.0f);
        mutableInt1.setValue(100);
        mutableInt1.decrement();
        mutableInt1.add(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableInt439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt439");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt3);
        float float5 = mutableInt3.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 101.0f + "'", float5 == 101.0f);
    }

    @Test
    public void MutableInt440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt440");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        mutableInt1.setValue((java.lang.Number) (-1));
        boolean boolean7 = mutableInt1.equals((java.lang.Object) '#');
        java.lang.String str8 = mutableInt1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1" + "'", str8.equals("-1"));
    }

    @Test
    public void MutableInt441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt441");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt();
        int int4 = mutableInt3.intValue();
        boolean boolean6 = mutableInt3.equals((java.lang.Object) "1");
        int int7 = mutableInt1.compareTo(mutableInt3);
        mutableInt3.subtract(99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableInt442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt442");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long2 = mutableInt1.longValue();
        java.lang.Integer int3 = mutableInt1.getValue();
        mutableInt1.setValue((java.lang.Number) 2.0f);
        mutableInt1.setValue((java.lang.Number) (-99L));
        mutableInt1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
    }

    @Test
    public void MutableInt443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt443");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        java.lang.Number number5 = null;
        // The following exception was thrown during execution in MutableInt generation
        try {
            mutableInt4.subtract(number5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableInt444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt444");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        boolean boolean3 = mutableInt0.equals((java.lang.Object) "1");
        mutableInt0.subtract((int) (short) 98);
        java.lang.String str6 = mutableInt0.toString();
        java.lang.Integer int7 = mutableInt0.getValue();
        mutableInt0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-98" + "'", str6.equals("-98"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-98) + "'", int7.equals((-98)));
    }

    @Test
    public void MutableInt445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt445");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long2 = mutableInt1.longValue();
        mutableInt1.subtract((int) (byte) 10);
        double double5 = mutableInt1.doubleValue();
        byte byte6 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 90.0d + "'", double5 == 90.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 90 + "'", byte6 == (byte) 90);
    }

    @Test
    public void MutableInt446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt446");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.decrement();
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.setValue((int) (byte) 64);
        mutableInt1.setValue(88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
    }

    @Test
    public void MutableInt447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt447");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        double double4 = mutableInt1.doubleValue();
        java.lang.Integer int5 = mutableInt1.toInteger();
        mutableInt1.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt7 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        byte byte8 = mutableInt7.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 9 + "'", byte8 == (byte) 9);
    }

    @Test
    public void MutableInt448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt448");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        int int6 = mutableInt0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void MutableInt449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt449");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(101);
        long long2 = mutableInt1.longValue();
        java.lang.Integer int3 = mutableInt1.toInteger();
        mutableInt1.setValue((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3.equals(101));
    }

    @Test
    public void MutableInt450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt450");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        long long3 = mutableInt1.longValue();
        mutableInt1.increment();
        int int5 = mutableInt1.intValue();
        boolean boolean7 = mutableInt1.equals((java.lang.Object) (byte) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableInt451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt451");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        int int4 = mutableInt3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void MutableInt452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt452");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        double double7 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-90.0d) + "'", double7 == (-90.0d));
    }

    @Test
    public void MutableInt453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt453");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((-90));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        mutableInt1.add(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 190 + "'", int4.equals(190));
    }

    @Test
    public void MutableInt454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt454");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        mutableInt3.subtract(35);
        mutableInt3.decrement();
        float float9 = mutableInt3.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 64.0f + "'", float9 == 64.0f);
    }

    @Test
    public void MutableInt455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt455");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 102);
    }

    @Test
    public void MutableInt456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt456");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        boolean boolean3 = mutableInt0.equals((java.lang.Object) "1");
        long long4 = mutableInt0.longValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 2.0f);
        int int7 = mutableInt0.compareTo(mutableInt6);
        mutableInt0.subtract(98);
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
    public void MutableInt457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt457");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.subtract((java.lang.Number) (short) -1);
        java.lang.String str7 = mutableInt1.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt8 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        double double9 = mutableInt8.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-97" + "'", str7.equals("-97"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-97.0d) + "'", double9 == (-97.0d));
    }

    @Test
    public void MutableInt458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt458");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.decrement();
        float float4 = mutableInt1.floatValue();
        java.lang.String str5 = mutableInt1.toString();
        byte byte6 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100" + "'", str5.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
    }

    @Test
    public void MutableInt459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt459");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 98);
    }

    @Test
    public void MutableInt460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt460");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        int int6 = mutableInt1.intValue();
        double double7 = mutableInt1.doubleValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt8 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        java.lang.String str9 = mutableInt8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 98.0d + "'", double7 == 98.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "98" + "'", str9.equals("98"));
    }

    @Test
    public void MutableInt461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt461");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        java.lang.Integer int2 = mutableInt0.toInteger();
        java.lang.Integer int3 = mutableInt0.getValue();
        long long4 = mutableInt0.longValue();
        java.lang.String str5 = mutableInt0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3.equals(0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void MutableInt462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt462");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        mutableInt1.setValue((java.lang.Number) (-1));
        boolean boolean7 = mutableInt1.equals((java.lang.Object) '#');
        double double8 = mutableInt1.doubleValue();
        java.lang.Class<?> wildcardClass9 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableInt463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt463");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        boolean boolean5 = mutableInt1.equals((java.lang.Object) "0");
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        mutableInt1.add((int) (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableInt464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt464");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 1.0f);
        mutableInt1.increment();
        mutableInt1.setValue(64);
        int int8 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void MutableInt465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt465");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str4 = mutableInt3.toString();
        int int5 = mutableInt0.compareTo(mutableInt3);
        boolean boolean7 = mutableInt0.equals((java.lang.Object) (short) 101);
        java.lang.Integer int8 = mutableInt0.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8.equals(0));
    }

    @Test
    public void MutableInt466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt466");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100L);
        java.lang.Integer int5 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        org.apache.commons.lang3.mutable.MutableInt mutableInt8 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 98);
        mutableInt1.subtract((java.lang.Number) mutableInt8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5.equals(100));
    }

    @Test
    public void MutableInt467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt467");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long2 = mutableInt1.longValue();
        java.lang.Integer int3 = mutableInt1.getValue();
        mutableInt1.setValue((int) (short) 100);
        mutableInt1.decrement();
        int int7 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
    }

    @Test
    public void MutableInt468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt468");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        java.lang.Integer int4 = mutableInt1.getValue();
        int int5 = mutableInt1.intValue();
        long long6 = mutableInt1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-98) + "'", int4.equals((-98)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-98) + "'", int5 == (-98));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-98L) + "'", long6 == (-98L));
    }

    @Test
    public void MutableInt469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt469");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 99);
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt470");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        long long3 = mutableInt1.longValue();
        mutableInt1.increment();
        int int5 = mutableInt1.intValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) int5);
        java.lang.Object obj7 = null;
        boolean boolean8 = mutableInt6.equals(obj7);
        mutableInt6.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableInt471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt471");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(35);
        mutableInt1.subtract((int) (short) 1);
        java.lang.Integer int4 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 34 + "'", int4.equals(34));
    }

    @Test
    public void MutableInt472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt472");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        mutableInt2.increment();
        mutableInt2.setValue(88);
        mutableInt2.increment();
    }

    @Test
    public void MutableInt473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt473");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(102);
    }

    @Test
    public void MutableInt474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt474");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(103);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((-98));
        mutableInt1.subtract((java.lang.Number) (-98));
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        mutableInt6.setValue((-98));
        mutableInt1.setValue((java.lang.Number) mutableInt6);
    }

    @Test
    public void MutableInt475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt475");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 65);
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt476");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 99);
    }

    @Test
    public void MutableInt477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt477");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        double double2 = mutableInt1.doubleValue();
        int int3 = mutableInt1.intValue();
        double double4 = mutableInt1.doubleValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = null;
        // The following exception was thrown during execution in MutableInt generation
        try {
            int int6 = mutableInt1.compareTo(mutableInt5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void MutableInt478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt478");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 65);
        mutableInt1.setValue((int) (short) -90);
    }

    @Test
    public void MutableInt479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt479");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        mutableInt0.subtract((int) (byte) -1);
        long long6 = mutableInt0.longValue();
        mutableInt0.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt8 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void MutableInt480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt480");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt3);
        java.lang.Class<?> wildcardClass5 = mutableInt3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableInt481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt481");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.Integer int2 = mutableInt1.getValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt4.subtract((int) 'a');
        java.lang.Integer int7 = mutableInt4.getValue();
        mutableInt1.add((java.lang.Number) mutableInt4);
        mutableInt4.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-98) + "'", int7.equals((-98)));
    }

    @Test
    public void MutableInt482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt482");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        mutableInt0.add((java.lang.Number) (-1L));
        int int6 = mutableInt0.intValue();
        mutableInt0.subtract((java.lang.Number) 101.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt9 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void MutableInt483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt483");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        java.lang.Integer int4 = mutableInt1.getValue();
        java.lang.String str5 = mutableInt1.toString();
        double double6 = mutableInt1.doubleValue();
        java.lang.Integer int7 = mutableInt1.getValue();
        byte byte8 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void MutableInt484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt484");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        java.lang.Integer int4 = mutableInt1.getValue();
        java.lang.String str5 = mutableInt1.toString();
        java.lang.String str6 = mutableInt1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
    }

    @Test
    public void MutableInt485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt485");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.decrement();
        java.lang.Integer int4 = mutableInt1.getValue();
        mutableInt1.setValue((int) (byte) 64);
        java.lang.Integer int7 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4.equals(100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7.equals(64));
    }

    @Test
    public void MutableInt486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt486");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((-98));
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 98);
        mutableInt3.setValue((int) (byte) 10);
        mutableInt1.setValue((java.lang.Number) (byte) 10);
    }

    @Test
    public void MutableInt487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt487");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 1.0f);
        boolean boolean6 = mutableInt1.equals((java.lang.Object) "-97");
        mutableInt1.increment();
        mutableInt1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableInt488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt488");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) -98);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.setValue((java.lang.Number) 10.0d);
        double double6 = mutableInt3.doubleValue();
        mutableInt3.subtract(100);
        int int9 = mutableInt1.compareTo(mutableInt3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableInt489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt489");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        float float3 = mutableInt1.floatValue();
        mutableInt1.decrement();
        java.lang.Number number5 = null;
        // The following exception was thrown during execution in MutableInt generation
        try {
            mutableInt1.setValue(number5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void MutableInt490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt490");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        java.lang.String str3 = mutableInt1.toString();
        boolean boolean5 = mutableInt1.equals((java.lang.Object) ' ');
        int int6 = mutableInt1.intValue();
        mutableInt1.setValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2" + "'", str3.equals("2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void MutableInt491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt491");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 1.0f);
        mutableInt1.increment();
        mutableInt1.setValue((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableInt492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt492");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-99L));
        mutableInt1.increment();
    }

    @Test
    public void MutableInt493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt493");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        boolean boolean3 = mutableInt1.equals((java.lang.Object) (-98));
        java.lang.String str4 = mutableInt1.toString();
        long long5 = mutableInt1.longValue();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void MutableInt494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt494");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10);
        mutableInt1.add((java.lang.Number) mutableInt5);
        java.lang.Class<?> wildcardClass7 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableInt495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt495");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) (short) -1);
        java.lang.Integer int5 = mutableInt1.toInteger();
        mutableInt1.increment();
        mutableInt1.increment();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5.equals((-1)));
    }

    @Test
    public void MutableInt496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt496");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("10");
        mutableInt1.decrement();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt(100);
        mutableInt4.subtract(103);
        java.lang.String str7 = mutableInt4.toString();
        mutableInt1.add((java.lang.Number) mutableInt4);
        org.apache.commons.lang3.mutable.MutableInt mutableInt9 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-3" + "'", str7.equals("-3"));
    }

    @Test
    public void MutableInt497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt497");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        boolean boolean4 = mutableInt1.equals((java.lang.Object) 100.0f);
        mutableInt1.setValue((int) (byte) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableInt498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt498");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(35);
        mutableInt1.subtract((-1));
        mutableInt1.setValue((int) (byte) 102);
    }

    @Test
    public void MutableInt499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt499");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        float float3 = mutableInt1.floatValue();
        mutableInt1.subtract((int) (byte) -2);
        mutableInt1.add(103);
        org.apache.commons.lang3.mutable.MutableInt mutableInt8 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        int int9 = mutableInt8.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 205 + "'", int9 == 205);
    }

    @Test
    public void MutableInt500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.MutableInt500");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        float float3 = mutableInt1.floatValue();
        mutableInt1.subtract((int) (byte) -2);
        mutableInt1.setValue((int) (byte) -1);
        mutableInt1.decrement();
        double double9 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-2.0d) + "'", double9 == (-2.0d));
    }
}

