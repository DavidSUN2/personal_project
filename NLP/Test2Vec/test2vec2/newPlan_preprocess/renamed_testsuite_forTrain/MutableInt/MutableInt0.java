
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
            System.out.format("%n%s%n", "MutableInt0.test001");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test002");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.decrement();
        byte byte3 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -2 + "'", byte3 == (byte) -2);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test003");
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
            System.out.format("%n%s%n", "MutableInt0.test004");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        short short7 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -90 + "'", short7 == (short) -90);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test005");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test006");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test007");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test008");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test009");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.add((int) (short) 1);
        byte byte6 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 101 + "'", byte6 == (byte) 101);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test010");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test011");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        byte byte2 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test012");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test013");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test014");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test015");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test016");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test017");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test018");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test019");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        mutableInt1.setValue((int) '#');
        org.apache.commons.lang3.mutable.MutableInt mutableInt9 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test020");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test021");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test022");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test023");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test024");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test025");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test026");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        java.lang.Class<?> wildcardClass7 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test027");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test028");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test029");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test030");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        mutableInt1.subtract((java.lang.Number) (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test031");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test032");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        int int1 = mutableInt0.intValue();
        byte byte2 = mutableInt0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test033");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test034");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test035");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        byte byte1 = mutableInt0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test036");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test037");
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
            System.out.format("%n%s%n", "MutableInt0.test038");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test039");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test040");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test041");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test042");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test043");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test044");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        java.lang.Integer int2 = mutableInt1.toInteger();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test045");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test046");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test047");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        double double2 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test048");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test049");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.setValue((int) (byte) 1);
        mutableInt1.subtract((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test050");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test051");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.add((int) (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test052");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        java.lang.Integer int2 = mutableInt1.getValue();
        mutableInt1.setValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2.equals(10));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test053");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test054");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test055");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test056");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test057");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test058");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test059");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test060");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test061");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10);
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableInt1.add(number2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test062");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test063");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.increment();
        mutableInt1.add((java.lang.Number) (short) 10);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test064");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test065");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        java.lang.Integer int2 = mutableInt1.getValue();
        byte byte3 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test066");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test067");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test068");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test069");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        mutableInt1.add((int) (byte) -1);
        mutableInt1.subtract((int) '#');
        mutableInt1.decrement();
        java.lang.Class<?> wildcardClass7 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test070");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test071");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test072");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        byte byte2 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test073");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test074");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt4.subtract((-90));
        mutableInt1.add((java.lang.Number) mutableInt4);
        mutableInt4.subtract((int) (byte) -2);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test075");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test076");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test077");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test078");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long2 = mutableInt1.longValue();
        short short3 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test079");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        mutableInt0.subtract((java.lang.Number) (short) 0);
        short short6 = mutableInt0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test080");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test081");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        mutableInt0.subtract((java.lang.Number) (short) 0);
        int int6 = mutableInt0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test082");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test083");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test084");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10);
        mutableInt1.add((java.lang.Number) mutableInt5);
        short short7 = mutableInt5.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test085");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test086");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.setValue((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test087");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.decrement();
        mutableInt1.increment();
        java.lang.Class<?> wildcardClass4 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test088");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        short short2 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test089");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        long long2 = mutableInt1.longValue();
        java.lang.Class<?> wildcardClass3 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test090");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test091");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test092");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test093");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.decrement();
        mutableInt1.increment();
        short short4 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test094");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 1L);
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test095");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.subtract((java.lang.Number) 100L);
        mutableInt1.subtract((java.lang.Number) 2);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test096");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.decrement();
        byte byte4 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test097");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("1");
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test098");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test099");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 35.0d);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test100");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("-1");
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test101");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test102");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test103");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test104");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.decrement();
        short short3 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test105");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test106");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test107");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        mutableInt1.add((int) 'a');
        java.lang.Class<?> wildcardClass6 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test108");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test109");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test110");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test111");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        java.lang.Integer int2 = mutableInt1.getValue();
        short short3 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2.equals(10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test112");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test113");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test114");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 99);
        mutableInt1.add((java.lang.Number) 99);
        java.lang.Number number7 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableInt1.setValue(number7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test115");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test116");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test117");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test118");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(0);
        short short2 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test119");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test120");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test121");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test122");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        java.lang.String str3 = mutableInt1.toString();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2" + "'", str3.equals("2"));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test123");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test124");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test125");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("101");
        java.lang.Integer int2 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2.equals(101));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test126");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test127");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test128");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        float float2 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test129");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.increment();
        short short4 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 102 + "'", short4 == (short) 102);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test130");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((-90));
        mutableInt1.setValue((int) ' ');
        mutableInt1.decrement();
        mutableInt1.increment();
        mutableInt1.setValue((int) (short) 100);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test131");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test132");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test133");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test134");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test135");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test136");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test137");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((-90));
        byte byte4 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -66 + "'", byte4 == (byte) -66);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test138");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test139");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test140");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test141");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10);
        mutableInt1.add((java.lang.Number) mutableInt5);
        byte byte7 = mutableInt5.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test142");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test143");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test144");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test145");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test146");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test147");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        java.lang.Class<?> wildcardClass4 = mutableInt0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test148");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test149");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        mutableInt1.add((int) (byte) 0);
        int int5 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test150");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test151");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test152");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.add((java.lang.Number) (-1));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4.equals(99));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test153");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(101);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 101);
        byte byte3 = mutableInt2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 101 + "'", byte3 == (byte) 101);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test154");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test155");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test156");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test157");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        double double4 = mutableInt1.doubleValue();
        mutableInt1.subtract((int) (short) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test158");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        mutableInt1.add((int) (byte) -1);
        mutableInt1.subtract((int) '#');
        short short6 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 64 + "'", short6 == (short) 64);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test159");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.decrement();
        int int3 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test160");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test161");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 2);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test162");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test163");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        double double3 = mutableInt0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test164");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test165");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        mutableInt1.add((int) (byte) -1);
        mutableInt1.subtract((int) '#');
        mutableInt1.decrement();
        short short7 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 63 + "'", short7 == (short) 63);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test166");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test167");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test168");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.add((int) (byte) -90);
        mutableInt1.decrement();
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test169");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test170");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        mutableInt1.add((int) 'a');
        java.lang.Integer int6 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 107 + "'", int6.equals(107));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test171");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test172");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test173");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test174");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test175");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 64);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test176");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test177");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test178");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.add((int) (short) 1);
        int int6 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test179");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test180");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.add((int) (short) 1);
        java.lang.Class<?> wildcardClass6 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test181");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("0");
        short short2 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test182");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test183");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test184");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test185");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test186");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test187");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test188");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test189");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.setValue((int) (byte) 1);
        short short6 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test190");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test191");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((-90));
        mutableInt1.setValue((int) ' ');
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test192");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test193");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test194");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test195");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test196");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test197");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test198");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test199");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test200");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test201");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        int int4 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test202");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test203");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test204");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test205");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        float float7 = mutableInt3.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test206");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test207");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test208");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test209");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test210");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test211");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) -90);
        mutableInt1.decrement();
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test212");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test213");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test214");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test215");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test216");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        mutableInt3.add((int) (byte) -1);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test217");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test218");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test219");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test220");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 35);
        byte byte2 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 35 + "'", byte2 == (byte) 35);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test221");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test222");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test223");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test224");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(35);
        float float2 = mutableInt1.floatValue();
        long long3 = mutableInt1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test225");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test226");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test227");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.subtract((int) (byte) 99);
        mutableInt1.increment();
        short short5 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 2 + "'", short5 == (short) 2);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test228");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test229");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test230");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test231");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test232");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test233");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        double double2 = mutableInt1.doubleValue();
        byte byte3 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test234");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test235");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test236");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        mutableInt1.subtract((int) (byte) -1);
        mutableInt1.subtract((int) (byte) 101);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test237");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("2");
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test238");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 98);
        mutableInt1.setValue((int) (byte) 10);
        short short4 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test239");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        mutableInt1.add((int) (byte) -1);
        mutableInt1.subtract((int) '#');
        java.lang.Integer int6 = mutableInt1.getValue();
        mutableInt1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6.equals(64));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test240");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.add((int) (short) 1);
        mutableInt1.setValue((int) (byte) -66);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test241");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        mutableInt0.subtract((java.lang.Number) (short) 0);
        long long6 = mutableInt0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test242");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test243");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test244");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test245");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test246");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test247");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        java.lang.Integer int2 = mutableInt1.toInteger();
        mutableInt1.subtract((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test248");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test249");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test250");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) ' ');
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test251");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test252");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test253");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test254");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test255");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test256");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        mutableInt2.increment();
        short short4 = mutableInt2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test257");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test258");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test259");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test260");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test261");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        mutableInt1.add(0);
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableInt1.add(number6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test262");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test263");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test264");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(0);
        float float2 = mutableInt1.floatValue();
        byte byte3 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test265");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test266");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        java.lang.Integer int2 = mutableInt1.toInteger();
        mutableInt1.subtract(103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2.equals(100));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test267");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 35);
        java.lang.Integer int2 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2.equals(35));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test268");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.subtract((int) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt4);
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt5);
        mutableInt6.subtract((int) (byte) 101);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test269");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test270");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.setValue((java.lang.Number) 99.0f);
        mutableInt1.add((int) (byte) 35);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test271");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test272");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test273");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test274");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test275");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("-3");
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test276");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test277");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test278");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test279");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test280");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        mutableInt1.subtract(103);
        mutableInt1.decrement();
        int int5 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-4) + "'", int5 == (-4));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test281");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test282");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test283");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        short short7 = mutableInt3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test284");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test285");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test286");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(103);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((-98));
        mutableInt1.subtract((java.lang.Number) (-98));
        int int5 = mutableInt1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 201 + "'", int5 == 201);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test287");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test288");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test289");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test290");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10);
        mutableInt1.setValue((-97));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test291");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test292");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 99);
        mutableInt1.decrement();
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test293");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test294");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        mutableInt1.setValue((java.lang.Number) 99.0f);
        java.lang.Integer int5 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 99 + "'", int5.equals(99));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test295");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test296");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test297");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 101);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt3.setValue((int) (byte) 102);
        mutableInt1.setValue((java.lang.Number) (byte) 102);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test298");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((-90));
        mutableInt1.setValue((int) ' ');
        mutableInt1.decrement();
        mutableInt1.increment();
        mutableInt1.setValue((int) (byte) 35);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test299");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test300");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test301");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test302");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test303");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((-98));
        mutableInt1.setValue((int) (byte) 101);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test304");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test305");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test306");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 2);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test307");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test308");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test309");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test310");
        java.lang.Number number0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(number0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test311");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test312");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test313");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test314");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test315");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test316");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test317");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test318");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test319");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt4.subtract((-90));
        mutableInt1.add((java.lang.Number) mutableInt4);
        mutableInt1.setValue((int) (short) 98);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test320");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test321");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test322");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test323");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test324");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        java.lang.String str2 = mutableInt1.toString();
        mutableInt1.add(35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test325");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test326");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) -97);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test327");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        long long2 = mutableInt1.longValue();
        java.lang.Class<?> wildcardClass3 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test328");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test329");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test330");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(2);
        mutableInt1.subtract(0);
        short short4 = mutableInt1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 2 + "'", short4 == (short) 2);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test331");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test332");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        double double4 = mutableInt1.doubleValue();
        mutableInt1.setValue(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test333");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test334");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test335");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test336");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test337");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-99L));
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test338");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test339");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test340");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test341");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test342");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test343");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test344");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test345");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test346");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test347");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.subtract((java.lang.Number) 100L);
        java.lang.Class<?> wildcardClass4 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test348");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("100");
        double double2 = mutableInt1.doubleValue();
        double double3 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test349");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test350");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test351");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test352");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test353");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test354");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test355");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10);
        mutableInt1.add(64);
        java.lang.String str4 = mutableInt1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "74" + "'", str4.equals("74"));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test356");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test357");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test358");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test359");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        long long4 = mutableInt1.longValue();
        mutableInt1.decrement();
        mutableInt1.add(2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test360");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test361");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test362");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test363");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test364");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test365");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test366");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test367");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test368");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("-98");
        double double2 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-98.0d) + "'", double2 == (-98.0d));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test369");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test370");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test371");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) -1);
        mutableInt1.add(88);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt(35);
        mutableInt5.setValue((int) (short) 64);
        mutableInt1.add((java.lang.Number) (short) 64);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test372");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test373");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test374");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test375");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test376");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test377");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test378");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test379");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test380");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test381");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test382");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test383");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test384");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        float float3 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 101.0f + "'", float3 == 101.0f);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test385");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test386");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        mutableInt0.add((int) (byte) 92);
        mutableInt0.increment();
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test387");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test388");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("1");
        mutableInt1.increment();
        java.lang.Class<?> wildcardClass3 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test389");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(103);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((-98));
        mutableInt1.subtract((java.lang.Number) (-98));
        mutableInt1.subtract((int) (byte) 0);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test390");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test391");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test392");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test393");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test394");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(101);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 101);
        double double3 = mutableInt2.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 101.0d + "'", double3 == 101.0d);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test395");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test396");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test397");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test398");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test399");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test400");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        mutableInt0.decrement();
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test401");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        float float1 = mutableInt0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test402");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test403");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test404");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (short) 2);
        byte byte2 = mutableInt1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 2 + "'", byte2 == (byte) 2);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test405");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test406");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test407");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test408");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        mutableInt0.add((java.lang.Number) (-1L));
        short short6 = mutableInt0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test409");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("74");
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test410");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        mutableInt1.increment();
        java.lang.String str3 = mutableInt1.toString();
        mutableInt1.setValue((java.lang.Number) 0.0d);
        mutableInt1.subtract((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2" + "'", str3.equals("2"));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test411");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("99");
        double double2 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.0d + "'", double2 == 99.0d);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test412");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt(35);
        mutableInt1.subtract((java.lang.Number) mutableInt4);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test413");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        java.lang.String str1 = mutableInt0.toString();
        double double2 = mutableInt0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test414");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test415");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test416");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.add(0);
        mutableInt1.add((int) (short) 1);
        java.lang.Integer int6 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6.equals(101));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test417");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt("98");
        float float2 = mutableInt1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 98.0f + "'", float2 == 98.0f);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test418");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test419");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        mutableInt1.subtract((java.lang.Number) (byte) -1);
        java.lang.Integer int6 = mutableInt1.toInteger();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-97) + "'", int6.equals((-97)));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test420");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test421");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test422");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (byte) -90);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test423");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test424");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test425");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test426");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(88);
        mutableInt1.decrement();
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test427");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 1);
        java.lang.String str2 = mutableInt1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test428");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        double double4 = mutableInt1.doubleValue();
        mutableInt1.add((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test429");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test430");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test431");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 101);
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test432");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test433");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 100);
        mutableInt1.subtract((int) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (byte) 99);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt4);
        mutableInt4.increment();
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test434");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test435");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test436");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test437");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test438");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test439");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt3);
        float float5 = mutableInt3.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 101.0f + "'", float5 == 101.0f);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test440");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test441");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test442");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test443");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        mutableInt0.add((-1));
        mutableInt0.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        java.lang.Number number5 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableInt4.subtract(number5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test444");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test445");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test446");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test447");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test448");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test449");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test450");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test451");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        int int4 = mutableInt3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test452");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt3.add(0);
        mutableInt1.subtract((java.lang.Number) mutableInt3);
        double double7 = mutableInt1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-90.0d) + "'", double7 == (-90.0d));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test453");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        mutableInt1.subtract((-90));
        java.lang.Integer int4 = mutableInt1.toInteger();
        mutableInt1.decrement();
        mutableInt1.add(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 190 + "'", int4.equals(190));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test454");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test455");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 102);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test456");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test457");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test458");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test459");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 98);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test460");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test461");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test462");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test463");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-1.0d));
        mutableInt1.subtract((int) 'a');
        boolean boolean5 = mutableInt1.equals((java.lang.Object) "0");
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        mutableInt1.add((int) (byte) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test464");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test465");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test466");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test467");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test468");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test469");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 99);
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test470");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test471");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(35);
        mutableInt1.subtract((int) (short) 1);
        java.lang.Integer int4 = mutableInt1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 34 + "'", int4.equals(34));
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test472");
        org.apache.commons.lang3.mutable.MutableInt mutableInt0 = new org.apache.commons.lang3.mutable.MutableInt();
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        org.apache.commons.lang3.mutable.MutableInt mutableInt2 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt0);
        mutableInt2.increment();
        mutableInt2.setValue(88);
        mutableInt2.increment();
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test473");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(102);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test474");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(103);
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((-98));
        mutableInt1.subtract((java.lang.Number) (-98));
        org.apache.commons.lang3.mutable.MutableInt mutableInt6 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100.0d);
        mutableInt6.setValue((-98));
        mutableInt1.setValue((java.lang.Number) mutableInt6);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test475");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 65);
        java.lang.Class<?> wildcardClass2 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test476");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 99);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test477");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(100);
        double double2 = mutableInt1.doubleValue();
        int int3 = mutableInt1.intValue();
        double double4 = mutableInt1.doubleValue();
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test478");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((int) (byte) 65);
        mutableInt1.setValue((int) (short) -90);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test479");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test480");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.increment();
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt1);
        org.apache.commons.lang3.mutable.MutableInt mutableInt4 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) mutableInt3);
        java.lang.Class<?> wildcardClass5 = mutableInt3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test481");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test482");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test483");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test484");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test485");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test486");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((-98));
        org.apache.commons.lang3.mutable.MutableInt mutableInt3 = new org.apache.commons.lang3.mutable.MutableInt((int) (short) 98);
        mutableInt3.setValue((int) (byte) 10);
        mutableInt1.setValue((java.lang.Number) (byte) 10);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test487");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test488");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test489");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100L);
        int int2 = mutableInt1.intValue();
        float float3 = mutableInt1.floatValue();
        mutableInt1.decrement();
        java.lang.Number number5 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test490");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test491");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test492");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) (-99L));
        mutableInt1.increment();
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test493");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test494");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 100);
        mutableInt1.setValue((java.lang.Number) 10.0d);
        org.apache.commons.lang3.mutable.MutableInt mutableInt5 = new org.apache.commons.lang3.mutable.MutableInt((java.lang.Number) 10);
        mutableInt1.add((java.lang.Number) mutableInt5);
        java.lang.Class<?> wildcardClass7 = mutableInt1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test495");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test496");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test497");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test498");
        org.apache.commons.lang3.mutable.MutableInt mutableInt1 = new org.apache.commons.lang3.mutable.MutableInt(35);
        mutableInt1.subtract((-1));
        mutableInt1.setValue((int) (byte) 102);
    }

    @Test
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test499");
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
    public void MutableInt() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableInt0.test500");
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

