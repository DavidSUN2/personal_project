package MutableShort;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableShort0 {

    public static boolean debug = false;

    @Test
    public void MutableShort0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0001");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        byte byte7 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void MutableShort0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0002");
        // The following exception was thrown during execution in MutableShort generation
        try {
            org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableShort0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0003");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in MutableShort generation
        try {
            mutableShort1.subtract(number6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
    }

    @Test
    public void MutableShort0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0004");
        // The following exception was thrown during execution in MutableShort generation
        try {
            org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableShort0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0005");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        float float7 = mutableShort1.floatValue();
        mutableShort1.subtract((short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
    }

    @Test
    public void MutableShort0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0006");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0007");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) 0L);
        mutableShort1.increment();
        java.lang.Class<?> wildcardClass9 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0008");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        java.lang.Class<?> wildcardClass2 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableShort0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0009");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        float float7 = mutableShort1.floatValue();
        java.lang.Object obj8 = null;
        boolean boolean9 = mutableShort1.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableShort0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0010");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        mutableShort1.add((java.lang.Number) 1.0f);
        int int7 = mutableShort1.intValue();
        mutableShort1.subtract((short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void MutableShort0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0011");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        java.lang.Class<?> wildcardClass6 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableShort0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0012");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        mutableShort1.decrement();
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 8 + "'", byte8 == (byte) 8);
    }

    @Test
    public void MutableShort0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0013");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int7 = mutableShort6.intValue();
        mutableShort1.subtract((java.lang.Number) int7);
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void MutableShort0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0014");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        float float7 = mutableShort1.floatValue();
        mutableShort1.add((java.lang.Number) 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void MutableShort0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0015");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        java.lang.Short short7 = mutableShort1.getValue();
        mutableShort1.increment();
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
    public void MutableShort0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0016");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        byte byte8 = mutableShort7.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 9 + "'", byte8 == (byte) 9);
    }

    @Test
    public void MutableShort0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0017");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        mutableShort1.setValue((java.lang.Number) 11);
        mutableShort1.setValue((java.lang.Number) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
    }

    @Test
    public void MutableShort0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0018");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        mutableShort1.add((java.lang.Number) 1.0f);
        int int7 = mutableShort1.intValue();
        int int8 = mutableShort1.intValue();
        short short9 = mutableShort1.shortValue();
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
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 11 + "'", short9 == (short) 11);
    }

    @Test
    public void MutableShort0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0019");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        byte byte6 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
    }

    @Test
    public void MutableShort0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0020");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Class<?> wildcardClass2 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableShort0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0021");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) 0L);
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in MutableShort generation
        try {
            mutableShort1.setValue(number8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableShort0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0022");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        mutableShort1.add((java.lang.Number) 1.0f);
        int int7 = mutableShort1.intValue();
        mutableShort1.subtract((short) (byte) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void MutableShort0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0023");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        java.lang.Short short7 = mutableShort1.getValue();
        java.lang.String str8 = mutableShort1.toString();
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void MutableShort0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0024");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) 0L);
        double double8 = mutableShort1.doubleValue();
        java.lang.String str9 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10" + "'", str9.equals("10"));
    }

    @Test
    public void MutableShort0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0025");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        float float7 = mutableShort1.floatValue();
        mutableShort1.subtract((short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
    }

    @Test
    public void MutableShort0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0026");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        mutableShort1.add((java.lang.Number) 1.0f);
        int int7 = mutableShort1.intValue();
        int int8 = mutableShort1.intValue();
        mutableShort1.increment();
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
    }

    @Test
    public void MutableShort0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0027");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.increment();
        byte byte3 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 11 + "'", byte3 == (byte) 11);
    }

    @Test
    public void MutableShort0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0028");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        java.lang.Class<?> wildcardClass2 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableShort0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0029");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0030");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        short short7 = mutableShort1.shortValue();
        short short8 = mutableShort1.shortValue();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 9 + "'", short7 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 9 + "'", short8 == (short) 9);
    }

    @Test
    public void MutableShort0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0031");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        mutableShort1.increment();
        mutableShort1.add((java.lang.Number) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void MutableShort0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0032");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        boolean boolean8 = mutableShort1.equals((java.lang.Object) (-1));
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableShort0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0033");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        mutableShort1.setValue((short) (byte) 1);
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableShort0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0034");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        byte byte7 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 9 + "'", byte7 == (byte) 9);
    }

    @Test
    public void MutableShort0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0035");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.String str1 = mutableShort0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void MutableShort0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0036");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort7.decrement();
        byte byte9 = mutableShort7.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 8 + "'", byte9 == (byte) 8);
    }

    @Test
    public void MutableShort0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0037");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        short short7 = mutableShort1.shortValue();
        short short8 = mutableShort1.shortValue();
        java.lang.Short short9 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 9 + "'", short7 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 9 + "'", short8 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 9 + "'", short9.equals((short) 9));
    }

    @Test
    public void MutableShort0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0038");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort7.decrement();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void MutableShort0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0039");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        short short2 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort4.add((short) (byte) 8);
        double double7 = mutableShort4.doubleValue();
        int int8 = mutableShort1.compareTo(mutableShort4);
        int int9 = mutableShort4.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.0d + "'", double7 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
    }

    @Test
    public void MutableShort0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0040");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((java.lang.Number) 9.0f);
        mutableShort1.subtract((short) (byte) 9);
        float float7 = mutableShort1.floatValue();
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void MutableShort0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0041");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) 0L);
        mutableShort1.increment();
        java.lang.Short short9 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 11 + "'", short9.equals((short) 11));
    }

    @Test
    public void MutableShort0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0042");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        short short2 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort4.add((short) (byte) 8);
        double double7 = mutableShort4.doubleValue();
        int int8 = mutableShort1.compareTo(mutableShort4);
        short short9 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.0d + "'", double7 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
    }

    @Test
    public void MutableShort0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0043");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        byte byte5 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 7 + "'", byte5 == (byte) 7);
    }

    @Test
    public void MutableShort0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0044");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        mutableShort1.setValue((short) (byte) 1);
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void MutableShort0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0045");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        long long7 = mutableShort1.longValue();
        mutableShort1.add((short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
    }

    @Test
    public void MutableShort0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0046");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        java.lang.Short short7 = mutableShort1.getValue();
        java.lang.String str8 = mutableShort1.toString();
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void MutableShort0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0047");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        short short2 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort4.add((short) (byte) 8);
        double double7 = mutableShort4.doubleValue();
        int int8 = mutableShort1.compareTo(mutableShort4);
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.0d + "'", double7 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void MutableShort0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0048");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.getValue();
        java.lang.Number number7 = null;
        // The following exception was thrown during execution in MutableShort generation
        try {
            mutableShort1.subtract(number7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
    }

    @Test
    public void MutableShort0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0049");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        short short2 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort4.add((short) (byte) 8);
        double double7 = mutableShort4.doubleValue();
        int int8 = mutableShort1.compareTo(mutableShort4);
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.0d + "'", double7 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void MutableShort0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0050");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        mutableShort1.decrement();
        java.lang.Short short8 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 8 + "'", short8.equals((short) 8));
    }

    @Test
    public void MutableShort0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0051");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        java.lang.Class<?> wildcardClass2 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableShort0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0052");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        mutableShort1.subtract((short) 0);
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void MutableShort0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0053");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        boolean boolean8 = mutableShort1.equals((java.lang.Object) 10.0f);
        float float9 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void MutableShort0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0054");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        double double2 = mutableShort1.doubleValue();
        java.lang.Short short3 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3.equals((short) 1));
    }

    @Test
    public void MutableShort0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0055");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        mutableShort1.subtract((short) 0);
        byte byte9 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void MutableShort0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0056");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        short short2 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort4.add((short) (byte) 8);
        double double7 = mutableShort4.doubleValue();
        int int8 = mutableShort1.compareTo(mutableShort4);
        float float9 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.0d + "'", double7 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void MutableShort0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0057");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        double double2 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void MutableShort0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0058");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.getValue();
        byte byte7 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void MutableShort0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0059");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        long long5 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void MutableShort0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0060");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short6 = mutableShort5.toShort();
        int int7 = mutableShort1.compareTo(mutableShort5);
        mutableShort1.add((java.lang.Number) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableShort0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0061");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        java.lang.Class<?> wildcardClass2 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableShort0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0062");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        int int2 = mutableShort1.intValue();
        byte byte3 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void MutableShort0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0063");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Short short5 = mutableShort1.toShort();
        java.lang.String str6 = mutableShort1.toString();
        byte byte7 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void MutableShort0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0064");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort();
        long long8 = mutableShort7.longValue();
        mutableShort1.subtract((java.lang.Number) long8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void MutableShort0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0065");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) 0L);
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableShort0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0066");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        float float2 = mutableShort1.floatValue();
        mutableShort1.add((short) (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void MutableShort0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0067");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        float float7 = mutableShort1.floatValue();
        float float8 = mutableShort1.floatValue();
        short short9 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
    }

    @Test
    public void MutableShort0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0068");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        java.lang.Short short6 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
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
    public void MutableShort0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0069");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.add((short) (byte) 8);
        boolean boolean9 = mutableShort1.equals((java.lang.Object) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableShort0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0070");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        java.lang.Short short7 = mutableShort1.getValue();
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void MutableShort0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0071");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        mutableShort1.setValue((short) (byte) 0);
        short short9 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void MutableShort0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0072");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) 0L);
        mutableShort1.add((short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableShort0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0073");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        double double4 = mutableShort1.doubleValue();
        java.lang.Class<?> wildcardClass5 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableShort0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0074");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        java.lang.Class<?> wildcardClass2 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableShort0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0075");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) -1);
        mutableShort1.setValue((java.lang.Number) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void MutableShort0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0076");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        int int7 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort8.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableShort0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0077");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        long long8 = mutableShort7.longValue();
        byte byte9 = mutableShort7.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 9 + "'", byte9 == (byte) 9);
    }

    @Test
    public void MutableShort0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0078");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        long long8 = mutableShort7.longValue();
        java.lang.Short short9 = mutableShort7.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 9 + "'", short9.equals((short) 9));
    }

    @Test
    public void MutableShort0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0079");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int4 = mutableShort3.intValue();
        short short5 = mutableShort3.shortValue();
        short short6 = mutableShort3.shortValue();
        mutableShort0.subtract((java.lang.Number) short6);
        java.lang.Short short8 = mutableShort0.getValue();
        mutableShort0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -10 + "'", short8.equals((short) -10));
    }

    @Test
    public void MutableShort0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0080");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        java.lang.Short short6 = mutableShort4.toShort();
        mutableShort4.subtract((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
    }

    @Test
    public void MutableShort0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0081");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.add((java.lang.Number) (byte) 0);
    }

    @Test
    public void MutableShort0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0082");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        long long7 = mutableShort1.longValue();
        boolean boolean9 = mutableShort1.equals((java.lang.Object) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableShort0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0083");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.add((short) 0);
        byte byte7 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 12 + "'", byte7 == (byte) 12);
    }

    @Test
    public void MutableShort0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0084");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        float float3 = mutableShort2.floatValue();
        float float4 = mutableShort2.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void MutableShort0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0085");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        mutableShort1.decrement();
        java.lang.Short short8 = mutableShort1.toShort();
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 9 + "'", short8.equals((short) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9L + "'", long9 == 9L);
    }

    @Test
    public void MutableShort0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0086");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Number number3 = null;
        // The following exception was thrown during execution in MutableShort generation
        try {
            mutableShort2.add(number3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableShort0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0087");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        float float7 = mutableShort1.floatValue();
        double double8 = mutableShort1.doubleValue();
        java.lang.String str9 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10" + "'", str9.equals("10"));
    }

    @Test
    public void MutableShort0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0088");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        mutableShort1.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort();
        mutableShort1.subtract((java.lang.Number) mutableShort8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void MutableShort0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0089");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 10);
        byte byte4 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 20 + "'", byte4 == (byte) 20);
    }

    @Test
    public void MutableShort0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0090");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.getValue();
        mutableShort1.setValue((short) 9);
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
    }

    @Test
    public void MutableShort0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0091");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) 11);
        java.lang.Class<?> wildcardClass5 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableShort0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0092");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.getValue();
        mutableShort1.setValue((short) 9);
        java.lang.Short short9 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 9 + "'", short9.equals((short) 9));
    }

    @Test
    public void MutableShort0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0093");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        java.lang.Class<?> wildcardClass6 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableShort0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0094");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 9);
        java.lang.Class<?> wildcardClass2 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableShort0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0095");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        java.lang.String str7 = mutableShort1.toString();
        java.lang.Class<?> wildcardClass8 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableShort0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0096");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        int int2 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.setValue((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort6);
        mutableShort1.add((java.lang.Number) mutableShort7);
        java.lang.Class<?> wildcardClass9 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0097");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        byte byte4 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
    }

    @Test
    public void MutableShort0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0098");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short6 = mutableShort5.toShort();
        int int7 = mutableShort1.compareTo(mutableShort5);
        mutableShort1.add((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableShort0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0099");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        mutableShort1.subtract((short) 0);
        float float9 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void MutableShort0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0100");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        java.lang.Short short7 = mutableShort1.getValue();
        java.lang.String str8 = mutableShort1.toString();
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
    }

    @Test
    public void MutableShort0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0101");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        java.lang.Short short6 = mutableShort4.toShort();
        mutableShort4.add((short) -10);
        java.lang.Short short9 = mutableShort4.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9.equals((short) 0));
    }

    @Test
    public void MutableShort0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0102");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        float float7 = mutableShort1.floatValue();
        int int8 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void MutableShort0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0103");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        byte byte4 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 7 + "'", byte4 == (byte) 7);
    }

    @Test
    public void MutableShort0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0104");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        short short2 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort4.add((short) (byte) 8);
        double double7 = mutableShort4.doubleValue();
        int int8 = mutableShort1.compareTo(mutableShort4);
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.0d + "'", double7 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void MutableShort0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0105");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        double double6 = mutableShort1.doubleValue();
        java.lang.Short short7 = mutableShort1.toShort();
        mutableShort1.subtract((java.lang.Number) 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
    }

    @Test
    public void MutableShort0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0106");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        short short7 = mutableShort1.shortValue();
        short short8 = mutableShort1.shortValue();
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 9 + "'", short7 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 9 + "'", short8 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void MutableShort0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0107");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.increment();
        byte byte9 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 19 + "'", byte9 == (byte) 19);
    }

    @Test
    public void MutableShort0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0108");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        java.lang.Short short6 = mutableShort1.toShort();
        java.lang.String str7 = mutableShort1.toString();
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
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
    }

    @Test
    public void MutableShort0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0109");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort7.decrement();
        java.lang.Short short9 = mutableShort7.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 8 + "'", short9.equals((short) 8));
    }

    @Test
    public void MutableShort0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0110");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        float float7 = mutableShort1.floatValue();
        double double8 = mutableShort1.doubleValue();
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void MutableShort0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0111");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int4 = mutableShort3.intValue();
        short short5 = mutableShort3.shortValue();
        short short6 = mutableShort3.shortValue();
        mutableShort0.subtract((java.lang.Number) short6);
        java.lang.String str8 = mutableShort0.toString();
        java.lang.Class<?> wildcardClass9 = mutableShort0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-10" + "'", str8.equals("-10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0112");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.getValue();
        java.lang.Short short7 = mutableShort1.getValue();
        mutableShort1.subtract((short) (byte) 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
    }

    @Test
    public void MutableShort0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0113");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        java.lang.Class<?> wildcardClass6 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableShort0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0114");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        double double6 = mutableShort1.doubleValue();
        java.lang.Object obj7 = null;
        boolean boolean8 = mutableShort1.equals(obj7);
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void MutableShort0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0115");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort7.add((short) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
    }

    @Test
    public void MutableShort0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0116");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 9);
        byte byte5 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 9 + "'", byte5 == (byte) 9);
    }

    @Test
    public void MutableShort0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0117");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        float float7 = mutableShort1.floatValue();
        java.lang.String str8 = mutableShort1.toString();
        short short9 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "9" + "'", str8.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 9 + "'", short9 == (short) 9);
    }

    @Test
    public void MutableShort0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0118");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        java.lang.String str7 = mutableShort1.toString();
        mutableShort1.add((short) 10);
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
    public void MutableShort0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0119");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        int int7 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        long long9 = mutableShort8.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void MutableShort0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0120");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int4 = mutableShort3.intValue();
        short short5 = mutableShort3.shortValue();
        short short6 = mutableShort3.shortValue();
        mutableShort0.subtract((java.lang.Number) short6);
        java.lang.Short short8 = mutableShort0.getValue();
        long long9 = mutableShort0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -10 + "'", short8.equals((short) -10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-10L) + "'", long9 == (-10L));
    }

    @Test
    public void MutableShort0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0121");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0L);
        byte byte3 = mutableShort2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void MutableShort0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0122");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        double double7 = mutableShort1.doubleValue();
        mutableShort1.subtract((short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 111.0d + "'", double7 == 111.0d);
    }

    @Test
    public void MutableShort0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0123");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        int int7 = mutableShort1.intValue();
        long long8 = mutableShort1.longValue();
        short short9 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void MutableShort0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0124");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        java.lang.Short short7 = mutableShort1.toShort();
        long long8 = mutableShort1.longValue();
        java.lang.String str9 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 9 + "'", short7.equals((short) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "9" + "'", str9.equals("9"));
    }

    @Test
    public void MutableShort0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0125");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        long long8 = mutableShort7.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) long8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8 == 9L);
    }

    @Test
    public void MutableShort0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0126");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) 0L);
        mutableShort1.increment();
        float float9 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 11.0f + "'", float9 == 11.0f);
    }

    @Test
    public void MutableShort0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0127");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        mutableShort1.decrement();
        java.lang.Short short8 = mutableShort1.toShort();
        byte byte9 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 9 + "'", short8.equals((short) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 9 + "'", byte9 == (byte) 9);
    }

    @Test
    public void MutableShort0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0128");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.getValue();
        mutableShort1.setValue((short) 9);
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void MutableShort0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0129");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        java.lang.Short short2 = mutableShort1.toShort();
        byte byte3 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void MutableShort0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0130");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        double double2 = mutableShort1.doubleValue();
        java.lang.Class<?> wildcardClass3 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableShort0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0131");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 18);
        mutableShort1.subtract((short) (byte) 12);
    }

    @Test
    public void MutableShort0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0132");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        short short6 = mutableShort1.shortValue();
        int int7 = mutableShort1.intValue();
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void MutableShort0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0133");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        int int7 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        byte byte9 = mutableShort8.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void MutableShort0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0134");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        java.lang.Class<?> wildcardClass4 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableShort0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0135");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort7);
        boolean boolean9 = mutableShort6.equals((java.lang.Object) mutableShort7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableShort0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0136");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        int int8 = mutableShort1.compareTo(mutableShort7);
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void MutableShort0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0137");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        float float7 = mutableShort1.floatValue();
        java.lang.String str8 = mutableShort1.toString();
        java.lang.Short short9 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "9" + "'", str8.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 9 + "'", short9.equals((short) 9));
    }

    @Test
    public void MutableShort0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0138");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.subtract((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
    }

    @Test
    public void MutableShort0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0139");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        java.lang.Number number3 = null;
        // The following exception was thrown during execution in MutableShort generation
        try {
            mutableShort1.add(number3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
    }

    @Test
    public void MutableShort0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0140");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.add((short) 0);
        java.lang.Class<?> wildcardClass5 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableShort0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0141");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.setValue((short) 1);
        double double8 = mutableShort1.doubleValue();
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableShort0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0142");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        double double6 = mutableShort1.doubleValue();
        mutableShort1.subtract((short) (byte) 9);
        java.lang.Short short9 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9.equals((short) 1));
    }

    @Test
    public void MutableShort0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0143");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        mutableShort1.add((short) 0);
        int int4 = mutableShort1.intValue();
        java.lang.Class<?> wildcardClass5 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableShort0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0144");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        byte byte7 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void MutableShort0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0145");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long4 = mutableShort3.longValue();
        mutableShort3.add((short) 0);
        mutableShort1.subtract((java.lang.Number) mutableShort3);
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void MutableShort0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0146");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 10);
    }

    @Test
    public void MutableShort0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0147");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) -93);
    }

    @Test
    public void MutableShort0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0148");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        float float7 = mutableShort1.floatValue();
        double double8 = mutableShort1.doubleValue();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void MutableShort0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0149");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("9");
    }

    @Test
    public void MutableShort0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0150");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) 0L);
        double double8 = mutableShort1.doubleValue();
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void MutableShort0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0151");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        double double7 = mutableShort1.doubleValue();
        java.lang.Class<?> wildcardClass8 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 111.0d + "'", double7 == 111.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableShort0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0152");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 9);
        int int5 = mutableShort1.intValue();
        java.lang.Class<?> wildcardClass6 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableShort0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0153");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) -1);
        mutableShort6.setValue((short) (byte) 100);
        boolean boolean9 = mutableShort1.equals((java.lang.Object) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableShort0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0154");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        float float7 = mutableShort1.floatValue();
        java.lang.String str8 = mutableShort1.toString();
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "9" + "'", str8.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9L + "'", long9 == 9L);
    }

    @Test
    public void MutableShort0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0155");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short6 = mutableShort5.toShort();
        int int7 = mutableShort1.compareTo(mutableShort5);
        mutableShort5.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableShort0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0156");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        int int8 = mutableShort1.intValue();
        float float9 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 9.0f + "'", float9 == 9.0f);
    }

    @Test
    public void MutableShort0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0157");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        java.lang.Short short4 = mutableShort1.getValue();
        java.lang.Class<?> wildcardClass5 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableShort0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0158");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        java.lang.String str6 = mutableShort1.toString();
        mutableShort1.increment();
        short short8 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 11 + "'", short8 == (short) 11);
    }

    @Test
    public void MutableShort0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0159");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short6 = mutableShort5.toShort();
        int int7 = mutableShort1.compareTo(mutableShort5);
        int int8 = mutableShort1.intValue();
        java.lang.String str9 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void MutableShort0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0160");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.subtract((short) 100);
        short short6 = mutableShort1.shortValue();
        mutableShort1.setValue((short) (byte) 1);
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -93 + "'", short6 == (short) -93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void MutableShort0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0161");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 11);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short4 = mutableShort3.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int7 = mutableShort3.compareTo(mutableShort6);
        double double8 = mutableShort3.doubleValue();
        mutableShort1.subtract((java.lang.Number) double8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void MutableShort0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0162");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.add((short) 0);
        mutableShort1.subtract((short) 0);
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0163");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        double double7 = mutableShort1.doubleValue();
        long long8 = mutableShort1.longValue();
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 111.0d + "'", double7 == 111.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 111L + "'", long8 == 111L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 111.0d + "'", double9 == 111.0d);
    }

    @Test
    public void MutableShort0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0164");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        short short2 = mutableShort1.shortValue();
        java.lang.Short short3 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
    }

    @Test
    public void MutableShort0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0165");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        double double6 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void MutableShort0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0166");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.getValue();
        mutableShort1.setValue((short) 10);
        java.lang.Class<?> wildcardClass9 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0167");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.add((short) 0);
        byte byte5 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
    }

    @Test
    public void MutableShort0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0168");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        double double7 = mutableShort1.doubleValue();
        java.lang.Class<?> wildcardClass8 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableShort0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0169");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int7 = mutableShort6.intValue();
        mutableShort1.subtract((java.lang.Number) int7);
        java.lang.Class<?> wildcardClass9 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0170");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.setValue((short) 1);
        mutableShort1.setValue((short) -93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void MutableShort0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0171");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        int int3 = mutableShort1.intValue();
        mutableShort1.decrement();
        mutableShort1.setValue((short) 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void MutableShort0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0172");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        float float7 = mutableShort1.floatValue();
        float float8 = mutableShort1.floatValue();
        java.lang.Short short9 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9.equals((short) 10));
    }

    @Test
    public void MutableShort0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0173");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.increment();
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0174");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 9);
        byte byte2 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 9 + "'", byte2 == (byte) 9);
    }

    @Test
    public void MutableShort0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0175");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        java.lang.Short short2 = mutableShort1.toShort();
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
    public void MutableShort0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0176");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        double double7 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 111.0d + "'", double7 == 111.0d);
    }

    @Test
    public void MutableShort0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0177");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short1 = mutableShort0.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short4 = mutableShort3.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int7 = mutableShort3.compareTo(mutableShort6);
        java.lang.Short short8 = mutableShort6.toShort();
        int int9 = mutableShort0.compareTo(mutableShort6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableShort0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0178");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        short short6 = mutableShort1.shortValue();
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0179");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        mutableShort1.subtract((short) (byte) 12);
        mutableShort1.increment();
        mutableShort1.setValue((short) (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void MutableShort0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0180");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        long long7 = mutableShort1.longValue();
        mutableShort1.setValue((short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
    }

    @Test
    public void MutableShort0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0181");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        boolean boolean8 = mutableShort1.equals((java.lang.Object) mutableShort7);
        java.lang.Short short9 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9.equals((short) 1));
    }

    @Test
    public void MutableShort0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0182");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        java.lang.Number number4 = null;
        // The following exception was thrown during execution in MutableShort generation
        try {
            mutableShort1.subtract(number4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableShort0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0183");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        long long5 = mutableShort1.longValue();
        java.lang.Short short6 = mutableShort1.getValue();
        mutableShort1.increment();
        boolean boolean9 = mutableShort1.equals((java.lang.Object) 17.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableShort0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0184");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.toShort();
        mutableShort1.add((short) 0);
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
    }

    @Test
    public void MutableShort0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0185");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) -1);
        mutableShort1.setValue((short) (byte) 100);
        java.lang.Short short4 = mutableShort1.toShort();
        byte byte5 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
    }

    @Test
    public void MutableShort0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0186");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        java.lang.Short short7 = mutableShort1.getValue();
        java.lang.Short short8 = mutableShort1.getValue();
        java.lang.Short short9 = mutableShort1.toShort();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9.equals((short) 10));
    }

    @Test
    public void MutableShort0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0187");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        long long7 = mutableShort1.longValue();
        float float8 = mutableShort1.floatValue();
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 9.0f + "'", float8 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void MutableShort0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0188");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        long long5 = mutableShort1.longValue();
        java.lang.Short short6 = mutableShort1.getValue();
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0189");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        mutableShort1.add((java.lang.Number) (short) 0);
        java.lang.Class<?> wildcardClass8 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableShort0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0190");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        java.lang.String str3 = mutableShort0.toString();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = null;
        // The following exception was thrown during execution in MutableShort generation
        try {
            int int5 = mutableShort0.compareTo(mutableShort4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void MutableShort0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0191");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.setValue((short) (byte) 7);
        mutableShort1.decrement();
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 6L + "'", long9 == 6L);
    }

    @Test
    public void MutableShort0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0192");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        mutableShort0.setValue((java.lang.Number) (-1.0f));
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        double double7 = mutableShort6.doubleValue();
        double double8 = mutableShort6.doubleValue();
        mutableShort0.add((java.lang.Number) mutableShort6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 8.0d + "'", double7 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
    }

    @Test
    public void MutableShort0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0193");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.add((short) 0);
        java.lang.Short short7 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 12 + "'", short7.equals((short) 12));
    }

    @Test
    public void MutableShort0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0194");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.subtract((short) 100);
        short short6 = mutableShort1.shortValue();
        mutableShort1.setValue((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -93 + "'", short6 == (short) -93);
    }

    @Test
    public void MutableShort0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0195");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.setValue((short) (byte) 7);
        mutableShort1.decrement();
        java.lang.Short short9 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 6 + "'", short9.equals((short) 6));
    }

    @Test
    public void MutableShort0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0196");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        long long7 = mutableShort1.longValue();
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 9 + "'", byte8 == (byte) 9);
    }

    @Test
    public void MutableShort0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0197");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((java.lang.Number) 9.0f);
        mutableShort1.subtract((short) (byte) 9);
        byte byte7 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void MutableShort0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0198");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Short short3 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3.equals((short) 1));
    }

    @Test
    public void MutableShort0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0199");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        double double5 = mutableShort1.doubleValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short8 = mutableShort7.getValue();
        mutableShort1.subtract((java.lang.Number) short8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8.equals((short) 10));
    }

    @Test
    public void MutableShort0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0200");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        long long8 = mutableShort7.longValue();
        java.lang.Class<?> wildcardClass9 = mutableShort7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0201");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        double double7 = mutableShort1.doubleValue();
        long long8 = mutableShort1.longValue();
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 111.0d + "'", double7 == 111.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 111L + "'", long8 == 111L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 111 + "'", int9 == 111);
    }

    @Test
    public void MutableShort0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0202");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 9);
        java.lang.String str5 = mutableShort1.toString();
        double double6 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "9" + "'", str5.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
    }

    @Test
    public void MutableShort0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0203");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        java.lang.Short short7 = mutableShort1.getValue();
        mutableShort1.subtract((short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 9 + "'", short7.equals((short) 9));
    }

    @Test
    public void MutableShort0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0204");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        int int2 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) 9);
        boolean boolean5 = mutableShort1.equals((java.lang.Object) mutableShort4);
        byte byte6 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void MutableShort0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0205");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) 0L);
        double double8 = mutableShort1.doubleValue();
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void MutableShort0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0206");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        long long5 = mutableShort1.longValue();
        java.lang.Class<?> wildcardClass6 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableShort0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0207");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        int int7 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableShort0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0208");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long4 = mutableShort3.longValue();
        mutableShort3.add((short) 0);
        mutableShort1.subtract((java.lang.Number) mutableShort3);
        mutableShort3.setValue((short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void MutableShort0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0209");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort7.decrement();
        float float9 = mutableShort7.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 8.0f + "'", float9 == 8.0f);
    }

    @Test
    public void MutableShort0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0210");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.subtract((short) 100);
        short short6 = mutableShort1.shortValue();
        mutableShort1.add((short) 9);
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -93 + "'", short6 == (short) -93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-84L) + "'", long9 == (-84L));
    }

    @Test
    public void MutableShort0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0211");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.add((short) 0);
        mutableShort1.subtract((short) 0);
        java.lang.Short short7 = mutableShort1.getValue();
        mutableShort1.setValue((short) (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
    }

    @Test
    public void MutableShort0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0212");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.increment();
        java.lang.Short short3 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 11 + "'", short3.equals((short) 11));
    }

    @Test
    public void MutableShort0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0213");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.getValue();
        mutableShort1.setValue((short) 10);
        java.lang.Short short9 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9.equals((short) 10));
    }

    @Test
    public void MutableShort0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0214");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        long long5 = mutableShort1.longValue();
        byte byte6 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
    }

    @Test
    public void MutableShort0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0215");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.getValue();
        java.lang.Short short7 = mutableShort1.getValue();
        int int8 = mutableShort1.intValue();
        float float9 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void MutableShort0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0216");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        java.lang.Short short7 = mutableShort1.getValue();
        java.lang.String str8 = mutableShort1.toString();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
    }

    @Test
    public void MutableShort0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0217");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        mutableShort1.increment();
        double double8 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void MutableShort0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0218");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        mutableShort1.decrement();
        short short8 = mutableShort1.shortValue();
        java.lang.Short short9 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 8 + "'", short8 == (short) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 8 + "'", short9.equals((short) 8));
    }

    @Test
    public void MutableShort0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0219");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        int int7 = mutableShort1.intValue();
        java.lang.Short short8 = mutableShort1.getValue();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 9 + "'", short8.equals((short) 9));
    }

    @Test
    public void MutableShort0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0220");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        float float7 = mutableShort1.floatValue();
        long long8 = mutableShort1.longValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void MutableShort0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0221");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        java.lang.String str6 = mutableShort1.toString();
        mutableShort1.increment();
        java.lang.Class<?> wildcardClass8 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableShort0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0222");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        long long7 = mutableShort1.longValue();
        mutableShort1.increment();
        java.lang.Short short9 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9.equals((short) 10));
    }

    @Test
    public void MutableShort0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0223");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        java.lang.String str7 = mutableShort1.toString();
        mutableShort1.subtract((short) 100);
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
    public void MutableShort0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0224");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int7 = mutableShort6.intValue();
        mutableShort1.subtract((java.lang.Number) int7);
        byte byte9 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void MutableShort0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0225");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        float float7 = mutableShort1.floatValue();
        java.lang.String str8 = mutableShort1.toString();
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "9" + "'", str8.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void MutableShort0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0226");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        float float7 = mutableShort1.floatValue();
        float float8 = mutableShort1.floatValue();
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void MutableShort0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0227");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        long long5 = mutableShort1.longValue();
        java.lang.Short short6 = mutableShort1.toShort();
        float float7 = mutableShort1.floatValue();
        mutableShort1.setValue((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void MutableShort0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0228");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        java.lang.Short short3 = mutableShort1.toShort();
        float float4 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void MutableShort0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0229");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        float float3 = mutableShort2.floatValue();
        double double4 = mutableShort2.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void MutableShort0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0230");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) 0L);
        mutableShort1.decrement();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableShort0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0231");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 6);
    }

    @Test
    public void MutableShort0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0232");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        mutableShort1.add((short) (byte) 100);
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableShort0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0233");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.add((short) 0);
        int int7 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
    }

    @Test
    public void MutableShort0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0234");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
    }

    @Test
    public void MutableShort0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0235");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        float float7 = mutableShort1.floatValue();
        long long8 = mutableShort1.longValue();
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void MutableShort0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0236");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.increment();
        byte byte4 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 2 + "'", byte4 == (byte) 2);
    }

    @Test
    public void MutableShort0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0237");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.setValue((short) (byte) 1);
    }

    @Test
    public void MutableShort0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0238");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0239");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        java.lang.Short short7 = mutableShort1.toShort();
        long long8 = mutableShort1.longValue();
        short short9 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 9 + "'", short7.equals((short) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 9 + "'", short9 == (short) 9);
    }

    @Test
    public void MutableShort0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0240");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.setValue((short) (byte) 7);
        java.lang.String str8 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "7" + "'", str8.equals("7"));
    }

    @Test
    public void MutableShort0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0241");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) 11);
        mutableShort1.decrement();
        java.lang.Class<?> wildcardClass6 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableShort0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0242");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        double double7 = mutableShort1.doubleValue();
        byte byte8 = mutableShort1.byteValue();
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
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 9 + "'", byte8 == (byte) 9);
    }

    @Test
    public void MutableShort0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0243");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        mutableShort0.setValue((short) (byte) 9);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int7 = mutableShort6.intValue();
        java.lang.Short short8 = mutableShort6.toShort();
        int int9 = mutableShort0.compareTo(mutableShort6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableShort0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0244");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        java.lang.Short short7 = mutableShort1.toShort();
        java.lang.Short short8 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 9 + "'", short7.equals((short) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 9 + "'", short8.equals((short) 9));
    }

    @Test
    public void MutableShort0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0245");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        float float7 = mutableShort1.floatValue();
        float float8 = mutableShort1.floatValue();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void MutableShort0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0246");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        int int5 = mutableShort1.intValue();
        java.lang.Short short6 = mutableShort1.toShort();
        int int7 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 12 + "'", short6.equals((short) 12));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
    }

    @Test
    public void MutableShort0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0247");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0L);
        mutableShort1.setValue((short) 7);
        byte byte4 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 7 + "'", byte4 == (byte) 7);
    }

    @Test
    public void MutableShort0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0248");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.decrement();
        java.lang.Class<?> wildcardClass4 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableShort0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0249");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort7);
        mutableShort1.add((java.lang.Number) mutableShort7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void MutableShort0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0250");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        long long5 = mutableShort1.longValue();
        java.lang.Short short6 = mutableShort1.toShort();
        float float7 = mutableShort1.floatValue();
        java.lang.Class<?> wildcardClass8 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableShort0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0251");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        double double6 = mutableShort5.doubleValue();
        short short7 = mutableShort5.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.0d + "'", double6 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 7 + "'", short7 == (short) 7);
    }

    @Test
    public void MutableShort0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0252");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        double double7 = mutableShort1.doubleValue();
        mutableShort1.subtract((short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 111.0d + "'", double7 == 111.0d);
    }

    @Test
    public void MutableShort0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0253");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) 0L);
        double double8 = mutableShort1.doubleValue();
        float float9 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void MutableShort0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0254");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        int int7 = mutableShort1.intValue();
        long long8 = mutableShort1.longValue();
        byte byte9 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void MutableShort0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0255");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        mutableShort1.decrement();
        int int8 = mutableShort1.intValue();
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void MutableShort0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0256");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        long long5 = mutableShort1.longValue();
        java.lang.Short short6 = mutableShort1.getValue();
        mutableShort1.increment();
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 11 + "'", byte8 == (byte) 11);
    }

    @Test
    public void MutableShort0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0257");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        mutableShort1.subtract((short) 0);
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void MutableShort0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0258");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        double double2 = mutableShort1.doubleValue();
        java.lang.Short short3 = mutableShort1.toShort();
        java.lang.String str4 = mutableShort1.toString();
        mutableShort1.add((short) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void MutableShort0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0259");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        int int2 = mutableShort1.intValue();
        java.lang.Short short3 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort5);
        mutableShort6.add((short) (byte) 100);
        mutableShort1.add((java.lang.Number) mutableShort6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3.equals((short) 10));
    }

    @Test
    public void MutableShort0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0260");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        long long5 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void MutableShort0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0261");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 9);
        java.lang.String str5 = mutableShort1.toString();
        byte byte6 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "9" + "'", str5.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 9 + "'", byte6 == (byte) 9);
    }

    @Test
    public void MutableShort0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0262");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        int int3 = mutableShort1.intValue();
        mutableShort1.decrement();
        byte byte5 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 9 + "'", byte5 == (byte) 9);
    }

    @Test
    public void MutableShort0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0263");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort4);
        mutableShort1.add((java.lang.Number) mutableShort5);
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0264");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        double double5 = mutableShort1.doubleValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Short short7 = mutableShort1.toShort();
        java.lang.Class<?> wildcardClass8 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableShort0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0265");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        mutableShort1.add((short) 0);
        int int4 = mutableShort1.intValue();
        long long5 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void MutableShort0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0266");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        int int8 = mutableShort1.intValue();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void MutableShort0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0267");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        java.lang.Short short7 = mutableShort1.toShort();
        mutableShort1.setValue((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 9 + "'", short7.equals((short) 9));
    }

    @Test
    public void MutableShort0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0268");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        java.lang.Short short6 = mutableShort1.toShort();
        java.lang.String str7 = mutableShort1.toString();
        mutableShort1.decrement();
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
    }

    @Test
    public void MutableShort0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0269");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        int int7 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
    }

    @Test
    public void MutableShort0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0270");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Class<?> wildcardClass6 = mutableShort5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableShort0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0271");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((java.lang.Number) 9.0f);
        long long5 = mutableShort1.longValue();
        mutableShort1.add((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9L + "'", long5 == 9L);
    }

    @Test
    public void MutableShort0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0272");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        mutableShort1.decrement();
        long long8 = mutableShort1.longValue();
        float float9 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 9.0f + "'", float9 == 9.0f);
    }

    @Test
    public void MutableShort0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0273");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        float float2 = mutableShort1.floatValue();
        java.lang.Class<?> wildcardClass3 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableShort0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0274");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        float float7 = mutableShort1.floatValue();
        long long8 = mutableShort1.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) long8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void MutableShort0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0275");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort4);
        mutableShort1.add((java.lang.Number) mutableShort5);
        int int7 = mutableShort5.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableShort0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0276");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        mutableShort1.setValue((short) 18);
        java.lang.Class<?> wildcardClass8 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableShort0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0277");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((java.lang.Number) 9.0f);
        java.lang.Class<?> wildcardClass5 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableShort0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0278");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        float float2 = mutableShort1.floatValue();
        mutableShort1.subtract((java.lang.Number) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void MutableShort0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0279");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.setValue((short) 1);
        double double8 = mutableShort1.doubleValue();
        java.lang.Short short9 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9.equals((short) 1));
    }

    @Test
    public void MutableShort0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0280");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.decrement();
        double double4 = mutableShort1.doubleValue();
        short short5 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.0d) + "'", double4 == (-2.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -2 + "'", short5 == (short) -2);
    }

    @Test
    public void MutableShort0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0281");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("-10");
        mutableShort1.subtract((java.lang.Number) mutableShort3);
        short short5 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 20 + "'", short5 == (short) 20);
    }

    @Test
    public void MutableShort0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0282");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        java.lang.Short short7 = mutableShort1.getValue();
        java.lang.Short short8 = mutableShort1.getValue();
        int int9 = mutableShort1.intValue();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void MutableShort0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0283");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        int int3 = mutableShort1.intValue();
        mutableShort1.decrement();
        short short5 = mutableShort1.shortValue();
        java.lang.String str6 = mutableShort1.toString();
        short short7 = mutableShort1.shortValue();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 9 + "'", short5 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "9" + "'", str6.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 9 + "'", short7 == (short) 9);
    }

    @Test
    public void MutableShort0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0284");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        int int5 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void MutableShort0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0285");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.decrement();
        double double4 = mutableShort1.doubleValue();
        java.lang.String str5 = mutableShort1.toString();
        java.lang.Class<?> wildcardClass6 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.0d) + "'", double4 == (-2.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-2" + "'", str5.equals("-2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableShort0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0286");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Short short5 = mutableShort1.toShort();
        java.lang.String str6 = mutableShort1.toString();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
    }

    @Test
    public void MutableShort0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0287");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 12);
        java.lang.Short short2 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 12 + "'", short2.equals((short) 12));
    }

    @Test
    public void MutableShort0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0288");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        float float7 = mutableShort1.floatValue();
        float float8 = mutableShort1.floatValue();
        byte byte9 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void MutableShort0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0289");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        byte byte6 = mutableShort5.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
    }

    @Test
    public void MutableShort0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0290");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort3);
        java.lang.Class<?> wildcardClass5 = mutableShort4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableShort0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0291");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        mutableShort1.setValue((short) 18);
        double double8 = mutableShort1.doubleValue();
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 21.0d + "'", double4 == 21.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 18.0d + "'", double8 == 18.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 18 + "'", int9 == 18);
    }

    @Test
    public void MutableShort0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0292");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        java.lang.Short short5 = mutableShort1.toShort();
        byte byte6 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 110 + "'", short5.equals((short) 110));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 110 + "'", byte6 == (byte) 110);
    }

    @Test
    public void MutableShort0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0293");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((java.lang.Number) 9.0f);
        mutableShort1.subtract((short) (byte) 9);
        float float7 = mutableShort1.floatValue();
        mutableShort1.increment();
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void MutableShort0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0294");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        double double2 = mutableShort1.doubleValue();
        double double3 = mutableShort1.doubleValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) double3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.0d + "'", double3 == 8.0d);
    }

    @Test
    public void MutableShort0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0295");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        mutableShort1.decrement();
        java.lang.Class<?> wildcardClass3 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableShort0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0296");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        int int8 = mutableShort1.compareTo(mutableShort7);
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.0d + "'", double9 == 9.0d);
    }

    @Test
    public void MutableShort0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0297");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        float float5 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void MutableShort0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0298");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 100);
        java.lang.String str2 = mutableShort1.toString();
        mutableShort1.setValue((short) -93);
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
    }

    @Test
    public void MutableShort0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0299");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.setValue((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
    }

    @Test
    public void MutableShort0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0300");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        mutableShort1.add((short) 0);
        int int4 = mutableShort1.intValue();
        mutableShort1.add((short) -10);
        long long7 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-10L) + "'", long7 == (-10L));
    }

    @Test
    public void MutableShort0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0301");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.setValue((short) (byte) 100);
        java.lang.Class<?> wildcardClass9 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0302");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort7.decrement();
        java.lang.String str9 = mutableShort7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "8" + "'", str9.equals("8"));
    }

    @Test
    public void MutableShort0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0303");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        long long7 = mutableShort1.longValue();
        double double8 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 111L + "'", long7 == 111L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 111.0d + "'", double8 == 111.0d);
    }

    @Test
    public void MutableShort0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0304");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 100.0f);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int4 = mutableShort3.intValue();
        mutableShort3.subtract((short) 10);
        java.lang.Short short7 = mutableShort3.toShort();
        mutableShort1.subtract((java.lang.Number) short7);
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) short7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7.equals((short) 0));
    }

    @Test
    public void MutableShort0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0305");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Object obj6 = null;
        boolean boolean7 = mutableShort1.equals(obj6);
        mutableShort1.add((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableShort0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0306");
        java.lang.Number number0 = null;
        // The following exception was thrown during execution in MutableShort generation
        try {
            org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort(number0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableShort0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0307");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        boolean boolean8 = mutableShort1.equals((java.lang.Object) 10.0f);
        short short9 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void MutableShort0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0308");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) float5);
        byte byte7 = mutableShort6.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void MutableShort0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0309");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Short short5 = mutableShort1.toShort();
        java.lang.String str6 = mutableShort1.toString();
        mutableShort1.add((short) 7);
        byte byte9 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 17 + "'", byte9 == (byte) 17);
    }

    @Test
    public void MutableShort0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0310");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        mutableShort1.setValue((java.lang.Number) (byte) 9);
        byte byte5 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 9 + "'", byte5 == (byte) 9);
    }

    @Test
    public void MutableShort0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0311");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("-10");
        mutableShort1.subtract((java.lang.Number) mutableShort3);
        java.lang.Short short5 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        mutableShort1.add((java.lang.Number) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 20 + "'", short5.equals((short) 20));
    }

    @Test
    public void MutableShort0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0312");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        java.lang.Class<?> wildcardClass2 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableShort0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0313");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        long long2 = mutableShort1.longValue();
        java.lang.String str3 = mutableShort1.toString();
        mutableShort1.setValue((short) 100);
        mutableShort1.subtract((short) (byte) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1" + "'", str3.equals("-1"));
    }

    @Test
    public void MutableShort0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0314");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 11);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int4 = mutableShort3.intValue();
        mutableShort3.setValue((short) (byte) 10);
        float float7 = mutableShort3.floatValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) float7);
        mutableShort1.setValue((java.lang.Number) float7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void MutableShort0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0315");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        short short7 = mutableShort1.shortValue();
        short short8 = mutableShort1.shortValue();
        java.lang.String str9 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 9 + "'", short7 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 9 + "'", short8 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "9" + "'", str9.equals("9"));
    }

    @Test
    public void MutableShort0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0316");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int4 = mutableShort3.intValue();
        mutableShort3.setValue((short) (byte) 10);
        java.lang.Short short7 = mutableShort3.getValue();
        double double8 = mutableShort3.doubleValue();
        mutableShort1.add((java.lang.Number) mutableShort3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void MutableShort0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0317");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        java.lang.Short short7 = mutableShort1.getValue();
        java.lang.Short short8 = mutableShort1.getValue();
        byte byte9 = mutableShort1.byteValue();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void MutableShort0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0318");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short1 = mutableShort0.toShort();
        mutableShort0.setValue((short) 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1.equals((short) 0));
    }

    @Test
    public void MutableShort0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0319");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        java.lang.Short short2 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short5 = mutableShort4.getValue();
        mutableShort4.add((short) (byte) 100);
        mutableShort1.add((java.lang.Number) mutableShort4);
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
    }

    @Test
    public void MutableShort0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0320");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Short short5 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 7);
        float float8 = mutableShort1.floatValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 17.0f + "'", float8 == 17.0f);
    }

    @Test
    public void MutableShort0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0321");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        java.lang.String str5 = mutableShort1.toString();
        java.lang.Short short6 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "12" + "'", str5.equals("12"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 12 + "'", short6.equals((short) 12));
    }

    @Test
    public void MutableShort0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0322");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        double double7 = mutableShort1.doubleValue();
        mutableShort1.decrement();
        short short9 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 111.0d + "'", double7 == 111.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 110 + "'", short9 == (short) 110);
    }

    @Test
    public void MutableShort0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0323");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) float5);
        long long7 = mutableShort6.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void MutableShort0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0324");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 2);
    }

    @Test
    public void MutableShort0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0325");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        int int7 = mutableShort1.intValue();
        long long8 = mutableShort1.longValue();
        java.lang.Short short9 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9.equals((short) 1));
    }

    @Test
    public void MutableShort0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0326");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("100");
        java.lang.Short short2 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Class<?> wildcardClass4 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableShort0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0327");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        float float5 = mutableShort1.floatValue();
        java.lang.Class<?> wildcardClass6 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableShort0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0328");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.decrement();
        double double4 = mutableShort1.doubleValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort5);
        mutableShort6.add((short) 0);
        mutableShort1.setValue((java.lang.Number) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.0d) + "'", double4 == (-2.0d));
    }

    @Test
    public void MutableShort0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0329");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        int int5 = mutableShort1.intValue();
        short short6 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void MutableShort0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0330");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        mutableShort0.setValue((short) (byte) 9);
        float float5 = mutableShort0.floatValue();
        mutableShort0.add((java.lang.Number) 17.0f);
        java.lang.Short short8 = mutableShort0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 26 + "'", short8.equals((short) 26));
    }

    @Test
    public void MutableShort0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0331");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        boolean boolean8 = mutableShort1.equals((java.lang.Object) mutableShort7);
        java.lang.String str9 = mutableShort7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "8" + "'", str9.equals("8"));
    }

    @Test
    public void MutableShort0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0332");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("100");
        java.lang.Short short2 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        long long4 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void MutableShort0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0333");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) 0L);
        mutableShort1.decrement();
        java.lang.Class<?> wildcardClass9 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0334");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0335");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        float float7 = mutableShort1.floatValue();
        float float8 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 9.0f + "'", float8 == 9.0f);
    }

    @Test
    public void MutableShort0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0336");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) 11);
        short short5 = mutableShort1.shortValue();
        long long6 = mutableShort1.longValue();
        java.lang.String str7 = mutableShort1.toString();
        java.lang.Class<?> wildcardClass8 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableShort0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0337");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((java.lang.Number) 9.0f);
        float float5 = mutableShort1.floatValue();
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in MutableShort generation
        try {
            mutableShort1.subtract(number6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
    }

    @Test
    public void MutableShort0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0338");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        java.lang.Class<?> wildcardClass3 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableShort0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0339");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.setValue((short) 1);
        long long8 = mutableShort1.longValue();
        byte byte9 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void MutableShort0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0340");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.add((short) (byte) 8);
        java.lang.Short short8 = mutableShort1.getValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 18 + "'", short8.equals((short) 18));
    }

    @Test
    public void MutableShort0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0341");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        int int7 = mutableShort1.intValue();
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void MutableShort0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0342");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        long long7 = mutableShort1.longValue();
        float float8 = mutableShort1.floatValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 9.0f + "'", float8 == 9.0f);
    }

    @Test
    public void MutableShort0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0343");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        double double6 = mutableShort1.doubleValue();
        java.lang.String str7 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
    }

    @Test
    public void MutableShort0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0344");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        float float2 = mutableShort1.floatValue();
        mutableShort1.add((short) (byte) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void MutableShort0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0345");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        mutableShort1.decrement();
        int int8 = mutableShort1.intValue();
        java.lang.String str9 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "8" + "'", str9.equals("8"));
    }

    @Test
    public void MutableShort0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0346");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        java.lang.Short short7 = mutableShort1.getValue();
        short short8 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 9 + "'", short7.equals((short) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 9 + "'", short8 == (short) 9);
    }

    @Test
    public void MutableShort0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0347");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        java.lang.Short short5 = mutableShort1.toShort();
        int int6 = mutableShort1.intValue();
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0348");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        java.lang.Short short2 = mutableShort1.toShort();
        float float3 = mutableShort1.floatValue();
        java.lang.String str4 = mutableShort1.toString();
        mutableShort1.subtract((short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void MutableShort0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0349");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.toShort();
        mutableShort1.setValue((java.lang.Number) 10.0f);
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void MutableShort0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0350");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort();
        long long6 = mutableShort5.longValue();
        mutableShort1.subtract((java.lang.Number) long6);
        long long8 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void MutableShort0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0351");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.getValue();
        java.lang.Short short7 = mutableShort1.getValue();
        int int8 = mutableShort1.intValue();
        java.lang.Class<?> wildcardClass9 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0352");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        int int7 = mutableShort6.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void MutableShort0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0353");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort("100");
        mutableShort1.setValue((java.lang.Number) mutableShort7);
        java.lang.Short short9 = mutableShort7.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9.equals((short) 100));
    }

    @Test
    public void MutableShort0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0354");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short6 = mutableShort5.toShort();
        int int7 = mutableShort1.compareTo(mutableShort5);
        java.lang.Short short8 = mutableShort5.getValue();
        byte byte9 = mutableShort5.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void MutableShort0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0355");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        int int2 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.setValue((java.lang.Number) 10.0f);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort6);
        mutableShort1.add((java.lang.Number) mutableShort7);
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void MutableShort0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0356");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        int int7 = mutableShort1.intValue();
        int int8 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void MutableShort0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0357");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.subtract((short) (byte) 8);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) -93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-8.0f) + "'", float5 == (-8.0f));
    }

    @Test
    public void MutableShort0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0358");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        float float2 = mutableShort1.floatValue();
        java.lang.Short short3 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort5.subtract((short) (byte) 8);
        boolean boolean8 = mutableShort1.equals((java.lang.Object) (byte) 8);
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void MutableShort0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0359");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("100");
        java.lang.Short short2 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Short short4 = mutableShort3.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2.equals((short) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4.equals((short) 100));
    }

    @Test
    public void MutableShort0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0360");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        mutableShort0.setValue((short) (byte) 9);
        float float5 = mutableShort0.floatValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (short) 9);
        mutableShort0.setValue((java.lang.Number) (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 9.0f + "'", float5 == 9.0f);
    }

    @Test
    public void MutableShort0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0361");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) 0L);
        mutableShort1.setValue((short) (byte) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableShort0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0362");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        long long2 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void MutableShort0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0363");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        long long7 = mutableShort1.longValue();
        float float8 = mutableShort1.floatValue();
        java.lang.Short short9 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 111L + "'", long7 == 111L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 111.0f + "'", float8 == 111.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 111 + "'", short9.equals((short) 111));
    }

    @Test
    public void MutableShort0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0364");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        short short2 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort4.add((short) (byte) 8);
        double double7 = mutableShort4.doubleValue();
        int int8 = mutableShort1.compareTo(mutableShort4);
        byte byte9 = mutableShort4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.0d + "'", double7 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 7 + "'", byte9 == (byte) 7);
    }

    @Test
    public void MutableShort0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0365");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        mutableShort1.setValue((short) (byte) -1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableShort0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0366");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        float float7 = mutableShort1.floatValue();
        java.lang.String str8 = mutableShort1.toString();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "9" + "'", str8.equals("9"));
    }

    @Test
    public void MutableShort0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0367");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0L);
        mutableShort1.decrement();
        mutableShort1.decrement();
    }

    @Test
    public void MutableShort0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0368");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        int int5 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
    }

    @Test
    public void MutableShort0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0369");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((short) 0);
        mutableShort1.add((java.lang.Number) 111L);
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 112 + "'", byte8 == (byte) 112);
    }

    @Test
    public void MutableShort0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0370");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        double double5 = mutableShort1.doubleValue();
        java.lang.Class<?> wildcardClass6 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableShort0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0371");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        short short7 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        float float9 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 11 + "'", short6 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7 == (short) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 11.0f + "'", float9 == 11.0f);
    }

    @Test
    public void MutableShort0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0372");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.String str8 = mutableShort7.toString();
        java.lang.String str9 = mutableShort7.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "9" + "'", str9.equals("9"));
    }

    @Test
    public void MutableShort0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0373");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort7.decrement();
        mutableShort7.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
    }

    @Test
    public void MutableShort0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0374");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        java.lang.Class<?> wildcardClass3 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableShort0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0375");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        java.lang.Short short7 = mutableShort1.getValue();
        int int8 = mutableShort1.intValue();
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 111 + "'", short7.equals((short) 111));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 111 + "'", int8 == 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 111.0d + "'", double9 == 111.0d);
    }

    @Test
    public void MutableShort0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0376");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.setValue((short) 0);
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Object obj8 = null;
        boolean boolean9 = mutableShort1.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableShort0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0377");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        long long7 = mutableShort1.longValue();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 111L + "'", long7 == 111L);
    }

    @Test
    public void MutableShort0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0378");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        int int2 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) 9);
        boolean boolean5 = mutableShort1.equals((java.lang.Object) mutableShort4);
        double double6 = mutableShort4.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
    }

    @Test
    public void MutableShort0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0379");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) -1);
        mutableShort1.setValue((short) (byte) 100);
        java.lang.Short short4 = mutableShort1.toShort();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4.equals((short) 100));
    }

    @Test
    public void MutableShort0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0380");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) 0L);
        java.lang.Short short8 = mutableShort1.toShort();
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void MutableShort0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0381");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = null;
        // The following exception was thrown during execution in MutableShort generation
        try {
            int int4 = mutableShort1.compareTo(mutableShort3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void MutableShort0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0382");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 8);
        mutableShort1.decrement();
        mutableShort1.decrement();
    }

    @Test
    public void MutableShort0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0383");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        mutableShort1.increment();
        java.lang.String str5 = mutableShort1.toString();
        java.lang.Class<?> wildcardClass6 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableShort0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0384");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        java.lang.Short short5 = mutableShort1.toShort();
        java.lang.Class<?> wildcardClass6 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 12 + "'", short5.equals((short) 12));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableShort0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0385");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        int int7 = mutableShort1.intValue();
        java.lang.Short short8 = mutableShort1.getValue();
        java.lang.Short short9 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 9 + "'", short8.equals((short) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 9 + "'", short9.equals((short) 9));
    }

    @Test
    public void MutableShort0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0386");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        boolean boolean8 = mutableShort1.equals((java.lang.Object) mutableShort7);
        short short9 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void MutableShort0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0387");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        java.lang.Short short2 = mutableShort1.toShort();
        java.lang.String str3 = mutableShort1.toString();
        float float4 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void MutableShort0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0388");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.setValue((short) (byte) 100);
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
    }

    @Test
    public void MutableShort0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0389");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int4 = mutableShort3.intValue();
        short short5 = mutableShort3.shortValue();
        short short6 = mutableShort3.shortValue();
        mutableShort0.subtract((java.lang.Number) short6);
        java.lang.String str8 = mutableShort0.toString();
        mutableShort0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-10" + "'", str8.equals("-10"));
    }

    @Test
    public void MutableShort0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0390");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        mutableShort1.add((java.lang.Number) (byte) 100);
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
    }

    @Test
    public void MutableShort0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0391");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.increment();
        mutableShort1.decrement();
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void MutableShort0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0392");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.getValue();
        java.lang.Short short7 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
    }

    @Test
    public void MutableShort0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0393");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("12");
        mutableShort1.add((short) (byte) 100);
        int int4 = mutableShort1.intValue();
        mutableShort1.add((short) (byte) 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 112 + "'", int4 == 112);
    }

    @Test
    public void MutableShort0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0394");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.subtract((short) (byte) 8);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        java.lang.Short short6 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-8.0f) + "'", float5 == (-8.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -8 + "'", short6.equals((short) -8));
    }

    @Test
    public void MutableShort0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0395");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Object obj6 = null;
        boolean boolean7 = mutableShort1.equals(obj6);
        int int8 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void MutableShort0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0396");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.getValue();
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0397");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        int int7 = mutableShort1.intValue();
        long long8 = mutableShort1.longValue();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void MutableShort0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0398");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long4 = mutableShort3.longValue();
        mutableShort3.add((short) 0);
        mutableShort1.subtract((java.lang.Number) mutableShort3);
        mutableShort3.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void MutableShort0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0399");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        long long2 = mutableShort1.longValue();
        java.lang.String str3 = mutableShort1.toString();
        java.lang.Short short4 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1" + "'", str3.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4.equals((short) -1));
    }

    @Test
    public void MutableShort0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0400");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        int int2 = mutableShort1.intValue();
        java.lang.Short short3 = mutableShort1.toShort();
        mutableShort1.subtract((short) 0);
        mutableShort1.subtract((short) -93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3.equals((short) 10));
    }

    @Test
    public void MutableShort0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0401");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        mutableShort1.decrement();
        mutableShort1.subtract((short) 7);
        int int5 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort6.setValue((short) 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 92 + "'", int5 == 92);
    }

    @Test
    public void MutableShort0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0402");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        mutableShort1.increment();
        java.lang.String str5 = mutableShort1.toString();
        short short6 = mutableShort1.shortValue();
        mutableShort1.increment();
        int int8 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void MutableShort0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0403");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.increment();
        java.lang.String str5 = mutableShort1.toString();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        int int7 = mutableShort6.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "8" + "'", str5.equals("8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void MutableShort0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0404");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) 11);
        mutableShort1.decrement();
        mutableShort1.setValue((short) (byte) 1);
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void MutableShort0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0405");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        mutableShort1.setValue((java.lang.Number) 11);
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 11);
        java.lang.Short short9 = mutableShort8.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 11 + "'", short9.equals((short) 11));
    }

    @Test
    public void MutableShort0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0406");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        mutableShort1.decrement();
        mutableShort1.subtract((short) 7);
        int int5 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort6.decrement();
        java.lang.Class<?> wildcardClass8 = mutableShort6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 92 + "'", int5 == 92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableShort0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0407");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        java.lang.Short short6 = mutableShort1.getValue();
        short short7 = mutableShort1.shortValue();
        java.lang.Short short8 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8.equals((short) 10));
    }

    @Test
    public void MutableShort0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0408");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        double double5 = mutableShort1.doubleValue();
        byte byte6 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
    }

    @Test
    public void MutableShort0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0409");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        int int7 = mutableShort1.intValue();
        long long8 = mutableShort1.longValue();
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void MutableShort0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0410");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.increment();
        long long3 = mutableShort1.longValue();
        mutableShort1.setValue((short) (byte) 20);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
    }

    @Test
    public void MutableShort0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0411");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        java.lang.Short short2 = mutableShort1.toShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short5 = mutableShort4.getValue();
        mutableShort4.add((short) (byte) 100);
        mutableShort1.add((java.lang.Number) mutableShort4);
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
    }

    @Test
    public void MutableShort0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0412");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        java.lang.Short short5 = mutableShort1.toShort();
        java.lang.Short short6 = mutableShort1.toShort();
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 110 + "'", short5.equals((short) 110));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 110 + "'", short6.equals((short) 110));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0413");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) short6);
        mutableShort7.subtract((short) 110);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 11 + "'", short6 == (short) 11);
    }

    @Test
    public void MutableShort0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0414");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.increment();
        java.lang.String str5 = mutableShort1.toString();
        int int6 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "8" + "'", str5.equals("8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void MutableShort0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0415");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.toShort();
        java.lang.String str7 = mutableShort1.toString();
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in MutableShort generation
        try {
            mutableShort1.subtract(number8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
    }

    @Test
    public void MutableShort0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0416");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        int int6 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void MutableShort0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0417");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableShort1.equals(obj5);
        mutableShort1.add((short) (byte) 100);
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
    }

    @Test
    public void MutableShort0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0418");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        int int4 = mutableShort0.intValue();
        mutableShort0.add((short) -10);
        java.lang.Short short7 = mutableShort0.toShort();
        double double8 = mutableShort0.doubleValue();
        long long9 = mutableShort0.longValue();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-10L) + "'", long9 == (-10L));
    }

    @Test
    public void MutableShort0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0419");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Object obj6 = null;
        boolean boolean7 = mutableShort1.equals(obj6);
        mutableShort1.setValue((short) (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableShort0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0420");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        java.lang.Short short2 = mutableShort1.toShort();
        java.lang.String str3 = mutableShort1.toString();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2.equals((short) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
    }

    @Test
    public void MutableShort0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0421");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 10);
        float float4 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 20.0f + "'", float4 == 20.0f);
    }

    @Test
    public void MutableShort0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0422");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0L);
        double double2 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void MutableShort0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0423");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) 0L);
        mutableShort1.increment();
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 11.0d + "'", double9 == 11.0d);
    }

    @Test
    public void MutableShort0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0424");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.increment();
        mutableShort1.increment();
    }

    @Test
    public void MutableShort0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0425");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        long long2 = mutableShort1.longValue();
        java.lang.String str3 = mutableShort1.toString();
        mutableShort1.setValue((short) 100);
        mutableShort1.subtract((short) (byte) 0);
        float float8 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1" + "'", str3.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void MutableShort0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0426");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        float float7 = mutableShort1.floatValue();
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 9 + "'", byte8 == (byte) 9);
    }

    @Test
    public void MutableShort0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0427");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        short short6 = mutableShort1.shortValue();
        java.lang.Short short7 = mutableShort1.getValue();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
    }

    @Test
    public void MutableShort0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0428");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        java.lang.Short short7 = mutableShort1.getValue();
        long long8 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 9 + "'", short7.equals((short) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8 == 9L);
    }

    @Test
    public void MutableShort0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0429");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        short short4 = mutableShort1.shortValue();
        double double5 = mutableShort1.doubleValue();
        java.lang.Short short6 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
    }

    @Test
    public void MutableShort0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0430");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        mutableShort1.decrement();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Short short5 = mutableShort4.getValue();
        java.lang.Short short6 = mutableShort4.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6.equals((short) 0));
    }

    @Test
    public void MutableShort0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0431");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.increment();
        java.lang.String str5 = mutableShort1.toString();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Short short7 = mutableShort1.toShort();
        mutableShort1.setValue((short) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "8" + "'", str5.equals("8"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 8 + "'", short7.equals((short) 8));
    }

    @Test
    public void MutableShort0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0432");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.increment();
        double double5 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
    }

    @Test
    public void MutableShort0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0433");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        int int8 = mutableShort1.intValue();
        double double9 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.0d + "'", double9 == 9.0d);
    }

    @Test
    public void MutableShort0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0434");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        int int4 = mutableShort0.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) int4);
        mutableShort5.decrement();
        mutableShort5.decrement();
        java.lang.Short short8 = mutableShort5.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -2 + "'", short8.equals((short) -2));
    }

    @Test
    public void MutableShort0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0435");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        int int2 = mutableShort1.intValue();
        java.lang.Class<?> wildcardClass3 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableShort0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0436");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        mutableShort1.subtract((short) (byte) 1);
        long long7 = mutableShort1.longValue();
        float float8 = mutableShort1.floatValue();
        java.lang.Class<?> wildcardClass9 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 9.0f + "'", float8 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0437");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        mutableShort1.increment();
        float float6 = mutableShort1.floatValue();
        mutableShort1.increment();
        mutableShort1.add((short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 8.0f + "'", float6 == 8.0f);
    }

    @Test
    public void MutableShort0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0438");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int4 = mutableShort3.intValue();
        short short5 = mutableShort3.shortValue();
        short short6 = mutableShort3.shortValue();
        mutableShort0.subtract((java.lang.Number) short6);
        java.lang.Short short8 = mutableShort0.getValue();
        byte byte9 = mutableShort0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -10 + "'", short8.equals((short) -10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -10 + "'", byte9 == (byte) -10);
    }

    @Test
    public void MutableShort0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0439");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        double double7 = mutableShort1.doubleValue();
        float float8 = mutableShort1.floatValue();
        float float9 = mutableShort1.floatValue();
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
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 9.0f + "'", float8 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 9.0f + "'", float9 == 9.0f);
    }

    @Test
    public void MutableShort0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0440");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        long long5 = mutableShort1.longValue();
        java.lang.Short short6 = mutableShort1.toShort();
        int int7 = mutableShort1.intValue();
        java.lang.Short short8 = mutableShort1.toShort();
        java.lang.String str9 = mutableShort1.toString();
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10" + "'", str9.equals("10"));
    }

    @Test
    public void MutableShort0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0441");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.subtract((short) (byte) 7);
        mutableShort1.add((short) 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableShort0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0442");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        short short6 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        int int8 = mutableShort1.intValue();
        java.lang.Short short9 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 9 + "'", short9.equals((short) 9));
    }

    @Test
    public void MutableShort0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0443");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        mutableShort1.add((short) 0);
        int int5 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void MutableShort0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0444");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        long long1 = mutableShort0.longValue();
        mutableShort0.setValue((short) -1);
        mutableShort0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void MutableShort0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0445");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        double double6 = mutableShort1.doubleValue();
        mutableShort1.add((short) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void MutableShort0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0446");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 17);
    }

    @Test
    public void MutableShort0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0447");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int5 = mutableShort1.compareTo(mutableShort4);
        double double6 = mutableShort1.doubleValue();
        java.lang.Short short7 = mutableShort1.toShort();
        java.lang.Short short8 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8.equals((short) 10));
    }

    @Test
    public void MutableShort0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0448");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        java.lang.Short short2 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2.equals((short) 100));
    }

    @Test
    public void MutableShort0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0449");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        short short6 = mutableShort1.shortValue();
        java.lang.Short short7 = mutableShort1.toShort();
        double double8 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void MutableShort0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0450");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        mutableShort1.setValue((short) (byte) 1);
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
    }

    @Test
    public void MutableShort0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0451");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        mutableShort1.add((short) 11);
        mutableShort1.decrement();
        long long6 = mutableShort1.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9L + "'", long6 == 9L);
    }

    @Test
    public void MutableShort0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0452");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        mutableShort1.add((short) 0);
        int int4 = mutableShort1.intValue();
        short short5 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void MutableShort0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0453");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 1);
        mutableShort1.setValue((short) -2);
    }

    @Test
    public void MutableShort0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0454");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        long long4 = mutableShort1.longValue();
        mutableShort1.setValue((short) (byte) 12);
        mutableShort1.setValue((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 7L + "'", long4 == 7L);
    }

    @Test
    public void MutableShort0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0455");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        int int4 = mutableShort0.intValue();
        mutableShort0.add((short) -10);
        long long7 = mutableShort0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-10L) + "'", long7 == (-10L));
    }

    @Test
    public void MutableShort0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0456");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.subtract((short) (byte) 8);
        int int4 = mutableShort1.intValue();
        double double5 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-8.0d) + "'", double5 == (-8.0d));
    }

    @Test
    public void MutableShort0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0457");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.increment();
        java.lang.Short short5 = mutableShort1.toShort();
        double double6 = mutableShort1.doubleValue();
        int int7 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 8 + "'", short5.equals((short) 8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void MutableShort0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0458");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 9);
        java.lang.Class<?> wildcardClass5 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableShort0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0459");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        int int4 = mutableShort0.intValue();
        mutableShort0.add((short) -10);
        mutableShort0.decrement();
        java.lang.Short short8 = mutableShort0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -11 + "'", short8.equals((short) -11));
    }

    @Test
    public void MutableShort0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0460");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        java.lang.String str7 = mutableShort1.toString();
        java.lang.Short short8 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8.equals((short) 1));
    }

    @Test
    public void MutableShort0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0461");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Short short5 = mutableShort1.toShort();
        java.lang.String str6 = mutableShort1.toString();
        float float7 = mutableShort1.floatValue();
        java.lang.String str8 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
    }

    @Test
    public void MutableShort0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0462");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        mutableShort1.decrement();
        java.lang.Short short3 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 8 + "'", short3.equals((short) 8));
    }

    @Test
    public void MutableShort0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0463");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        mutableShort1.decrement();
        mutableShort1.increment();
        mutableShort1.setValue((short) (byte) 9);
        java.lang.Short short9 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 9 + "'", short9.equals((short) 9));
    }

    @Test
    public void MutableShort0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0464");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.subtract((short) 100);
        short short6 = mutableShort1.shortValue();
        mutableShort1.add((short) 9);
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -93 + "'", short6 == (short) -93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-84) + "'", int9 == (-84));
    }

    @Test
    public void MutableShort0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0465");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (short) 9);
        mutableShort1.decrement();
    }

    @Test
    public void MutableShort0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0466");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        long long5 = mutableShort1.longValue();
        java.lang.Short short6 = mutableShort1.toShort();
        int int7 = mutableShort1.intValue();
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void MutableShort0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0467");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        java.lang.String str7 = mutableShort1.toString();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = null;
        // The following exception was thrown during execution in MutableShort generation
        try {
            int int9 = mutableShort1.compareTo(mutableShort8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
    }

    @Test
    public void MutableShort0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0468");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 112);
    }

    @Test
    public void MutableShort0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0469");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        mutableShort1.setValue((short) (byte) 100);
        byte byte5 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
    }

    @Test
    public void MutableShort0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0470");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        int int5 = mutableShort1.intValue();
        mutableShort1.setValue((short) 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
    }

    @Test
    public void MutableShort0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0471");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        java.lang.Short short4 = mutableShort0.toShort();
        mutableShort0.increment();
        short short6 = mutableShort0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
    }

    @Test
    public void MutableShort0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0472");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        java.lang.Short short2 = mutableShort1.toShort();
        float float3 = mutableShort1.floatValue();
        java.lang.String str4 = mutableShort1.toString();
        java.lang.String str5 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void MutableShort0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0473");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        float float2 = mutableShort1.floatValue();
        mutableShort1.increment();
        long long4 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void MutableShort0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0474");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((java.lang.Number) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
    }

    @Test
    public void MutableShort0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0475");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Short short5 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 7);
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        long long9 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 17L + "'", long9 == 17L);
    }

    @Test
    public void MutableShort0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0476");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        long long4 = mutableShort1.longValue();
        mutableShort1.setValue((short) (byte) 12);
        double double7 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 7L + "'", long4 == 7L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 12.0d + "'", double7 == 12.0d);
    }

    @Test
    public void MutableShort0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0477");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short6 = mutableShort5.toShort();
        int int7 = mutableShort1.compareTo(mutableShort5);
        int int8 = mutableShort1.intValue();
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableShort0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0478");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        byte byte2 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void MutableShort0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0479");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort4);
        mutableShort1.add((java.lang.Number) mutableShort5);
        java.lang.Short short7 = mutableShort1.toShort();
        java.lang.String str8 = mutableShort1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 2 + "'", short7.equals((short) 2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "2" + "'", str8.equals("2"));
    }

    @Test
    public void MutableShort0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0480");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort7 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        boolean boolean8 = mutableShort1.equals((java.lang.Object) mutableShort7);
        org.apache.commons.lang3.mutable.MutableShort mutableShort9 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableShort0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0481");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.getValue();
        java.lang.Short short7 = mutableShort1.getValue();
        mutableShort1.increment();
        java.lang.Class<?> wildcardClass9 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableShort0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0482");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        int int5 = mutableShort1.intValue();
        mutableShort1.subtract((short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
    }

    @Test
    public void MutableShort0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0483");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        mutableShort1.subtract((short) (byte) 112);
    }

    @Test
    public void MutableShort0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0484");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        float float2 = mutableShort1.floatValue();
        mutableShort1.increment();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int6 = mutableShort5.intValue();
        int int7 = mutableShort5.intValue();
        int int8 = mutableShort1.compareTo(mutableShort5);
        java.lang.String str9 = mutableShort5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10" + "'", str9.equals("10"));
    }

    @Test
    public void MutableShort0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0485");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 9);
        double double2 = mutableShort1.doubleValue();
        long long3 = mutableShort1.longValue();
        mutableShort1.setValue((short) -93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9L + "'", long3 == 9L);
    }

    @Test
    public void MutableShort0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0486");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        java.lang.Short short3 = mutableShort1.toShort();
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3.equals((short) 10));
    }

    @Test
    public void MutableShort0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0487");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("2");
    }

    @Test
    public void MutableShort0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0488");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        java.lang.Short short6 = mutableShort1.getValue();
        long long7 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void MutableShort0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0489");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.subtract((short) 10);
        java.lang.Short short5 = mutableShort1.toShort();
        mutableShort1.add((short) -8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5.equals((short) 0));
    }

    @Test
    public void MutableShort0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0490");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((short) (byte) 100);
        mutableShort1.subtract((short) (byte) -1);
        long long7 = mutableShort1.longValue();
        mutableShort1.add((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 111L + "'", long7 == 111L);
    }

    @Test
    public void MutableShort0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0491");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((java.lang.Number) 9.0f);
        mutableShort1.subtract((short) (byte) 9);
        float float7 = mutableShort1.floatValue();
        mutableShort1.increment();
        int int9 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableShort0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0492");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        float float5 = mutableShort1.floatValue();
        mutableShort1.add((short) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void MutableShort0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0493");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        long long3 = mutableShort1.longValue();
        byte byte4 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
    }

    @Test
    public void MutableShort0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0494");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        short short3 = mutableShort1.shortValue();
        float float4 = mutableShort1.floatValue();
        java.lang.Short short5 = mutableShort1.toShort();
        double double6 = mutableShort1.doubleValue();
        mutableShort1.add((short) 100);
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
    }

    @Test
    public void MutableShort0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0495");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0.0d);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 9);
        int int5 = mutableShort1.intValue();
        byte byte6 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 9 + "'", byte6 == (byte) 9);
    }

    @Test
    public void MutableShort0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0496");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        int int4 = mutableShort0.intValue();
        mutableShort0.add((short) -10);
        java.lang.Short short7 = mutableShort0.toShort();
        int int8 = mutableShort0.intValue();
        double double9 = mutableShort0.doubleValue();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-10.0d) + "'", double9 == (-10.0d));
    }

    @Test
    public void MutableShort0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0497");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        boolean boolean2 = mutableShort0.equals((java.lang.Object) (byte) 1);
        long long3 = mutableShort0.longValue();
        int int4 = mutableShort0.intValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort6.add((short) 10);
        mutableShort0.setValue((java.lang.Number) mutableShort6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void MutableShort0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0498");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        int int7 = mutableShort1.intValue();
        mutableShort1.setValue((short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void MutableShort0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0499");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        boolean boolean5 = mutableShort1.equals((java.lang.Object) 112);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableShort0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.MutableShort0500");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.Short short5 = mutableShort1.toShort();
        java.lang.String str6 = mutableShort1.toString();
        float float7 = mutableShort1.floatValue();
        java.lang.Class<?> wildcardClass8 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

