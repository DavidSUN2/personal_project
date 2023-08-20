
package MutableShort;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableShort0 {

    public static boolean debug = false;

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0001");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0003");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0004");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0005");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0006");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0007");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0008");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        java.lang.Class<?> wildcardClass2 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0009");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0010");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0011");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0012");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0013");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0014");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0015");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0016");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0017");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0018");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0019");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0020");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Class<?> wildcardClass2 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0021");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        java.lang.String str5 = mutableShort1.toString();
        boolean boolean7 = mutableShort1.equals((java.lang.Object) 0L);
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0022");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0023");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0024");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0025");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0026");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0027");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.increment();
        byte byte3 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 11 + "'", byte3 == (byte) 11);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0028");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        java.lang.Class<?> wildcardClass2 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0029");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0030");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0031");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0032");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0033");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0034");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0035");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.String str1 = mutableShort0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0036");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0037");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0038");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0039");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0040");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0041");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0042");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0043");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0044");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0045");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0046");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0047");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0048");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.getValue();
        java.lang.Number number7 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0049");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0050");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0051");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        java.lang.Class<?> wildcardClass2 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0052");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0053");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0054");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        double double2 = mutableShort1.doubleValue();
        java.lang.Short short3 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3.equals((short) 1));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0055");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0056");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0057");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        double double2 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0058");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0059");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0060");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0061");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 8);
        java.lang.Class<?> wildcardClass2 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0062");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        int int2 = mutableShort1.intValue();
        byte byte3 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0063");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0064");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0065");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0066");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        float float2 = mutableShort1.floatValue();
        mutableShort1.add((short) (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0067");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0068");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0069");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.add((short) (byte) 8);
        boolean boolean9 = mutableShort1.equals((java.lang.Object) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0070");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0071");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0072");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0073");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0074");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        java.lang.Class<?> wildcardClass2 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0075");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0076");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0077");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0078");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0079");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0080");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0081");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.add((java.lang.Number) (byte) 0);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0082");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0083");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.add((short) 0);
        byte byte7 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 12 + "'", byte7 == (byte) 12);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0084");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0085");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0086");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Number number3 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableShort2.add(number3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0087");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0088");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0089");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 10);
        byte byte4 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 20 + "'", byte4 == (byte) 20);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0090");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0091");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0092");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0093");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.decrement();
        java.lang.Class<?> wildcardClass6 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0094");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 9);
        java.lang.Class<?> wildcardClass2 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0095");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0096");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0097");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0098");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0099");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0100");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0101");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0102");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0103");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        byte byte4 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 7 + "'", byte4 == (byte) 7);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0104");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0105");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0106");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0107");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0108");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0109");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0110");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0111");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0112");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0113");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0114");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0115");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0116");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0117");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0118");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0119");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0120");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0121");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0L);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0L);
        byte byte3 = mutableShort2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0122");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0123");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0124");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0125");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0126");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0127");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0128");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0129");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        java.lang.Short short2 = mutableShort1.toShort();
        byte byte3 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2.equals((short) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0130");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        double double2 = mutableShort1.doubleValue();
        java.lang.Class<?> wildcardClass3 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0131");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 18);
        mutableShort1.subtract((short) (byte) 12);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0132");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0133");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0134");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        boolean boolean3 = mutableShort1.equals((java.lang.Object) 8.0d);
        java.lang.Class<?> wildcardClass4 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0135");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0136");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0137");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0138");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0139");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        java.lang.Number number3 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0140");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0141");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0142");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0143");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0144");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0145");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0146");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0147");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) -93);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0148");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0149");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("9");
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0150");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0151");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0152");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0153");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0154");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0155");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0156");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0157");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0158");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0159");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0160");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0161");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0162");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0163");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0164");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        short short2 = mutableShort1.shortValue();
        java.lang.Short short3 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3.equals((short) 0));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0165");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0166");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0167");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0168");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0169");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0170");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0171");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0172");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0173");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.increment();
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0174");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 9);
        byte byte2 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 9 + "'", byte2 == (byte) 9);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0175");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0176");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0177");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0178");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0179");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0180");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0181");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0182");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 11);
        java.lang.Number number4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableShort1.subtract(number4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0183");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0184");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0185");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0186");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0187");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0188");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0189");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0190");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        short short2 = mutableShort0.shortValue();
        java.lang.String str3 = mutableShort0.toString();
        org.apache.commons.lang3.mutable.MutableShort mutableShort4 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0191");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0192");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0193");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.add((short) 0);
        java.lang.Short short7 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 12 + "'", short7.equals((short) 12));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0194");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0195");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0196");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0197");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0198");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        java.lang.Short short3 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3.equals((short) 1));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0199");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0200");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0201");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0202");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0203");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0204");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0205");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0206");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0207");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0208");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0209");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0210");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0211");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0212");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.increment();
        java.lang.Short short3 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 11 + "'", short3.equals((short) 11));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0213");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0214");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0215");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0216");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0217");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0218");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0219");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0220");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0221");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0222");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0223");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0224");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0225");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0226");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0227");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0228");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0229");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0230");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0231");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 6);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0232");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0233");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        mutableShort1.add((short) 0);
        int int7 = mutableShort1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0234");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0235");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0236");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.increment();
        byte byte4 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 2 + "'", byte4 == (byte) 2);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0237");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.setValue((short) (byte) 1);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0238");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0239");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0240");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0241");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0242");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0243");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0244");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0245");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0246");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0247");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0L);
        mutableShort1.setValue((short) 7);
        byte byte4 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 7 + "'", byte4 == (byte) 7);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0248");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0249");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0250");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0251");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0252");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0253");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0254");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0255");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0256");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0257");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0258");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0259");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0260");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0261");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0262");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0263");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0264");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0265");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0266");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0267");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0268");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0269");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0270");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0271");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0272");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0273");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        float float2 = mutableShort1.floatValue();
        java.lang.Class<?> wildcardClass3 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0274");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0275");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0276");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0277");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0278");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        float float2 = mutableShort1.floatValue();
        mutableShort1.subtract((java.lang.Number) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0279");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0280");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0281");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 10);
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort("-10");
        mutableShort1.subtract((java.lang.Number) mutableShort3);
        short short5 = mutableShort1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 20 + "'", short5 == (short) 20);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0282");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0283");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0284");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0285");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0286");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0287");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 12);
        java.lang.Short short2 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 12 + "'", short2.equals((short) 12));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0288");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0289");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0290");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0291");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0292");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0293");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0294");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0295");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        mutableShort1.decrement();
        java.lang.Class<?> wildcardClass3 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0296");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0297");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0298");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 100);
        java.lang.String str2 = mutableShort1.toString();
        mutableShort1.setValue((short) -93);
        mutableShort1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0299");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        double double4 = mutableShort1.doubleValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort5 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.setValue((short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0300");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0301");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0302");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0303");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0304");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0305");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0306");
        java.lang.Number number0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort(number0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0307");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0308");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0309");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0310");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        mutableShort1.setValue((java.lang.Number) (byte) 9);
        byte byte5 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 9 + "'", byte5 == (byte) 9);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0311");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0312");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("0");
        java.lang.Class<?> wildcardClass2 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0313");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0314");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0315");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0316");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0317");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0318");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        java.lang.Short short1 = mutableShort0.toShort();
        mutableShort0.setValue((short) 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1.equals((short) 0));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0319");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0320");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0321");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0322");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0323");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0324");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 2);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0325");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0326");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0327");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0328");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0329");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0330");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0331");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0332");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0333");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0334");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.decrement();
        java.lang.Class<?> wildcardClass7 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0335");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0336");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0337");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        mutableShort1.setValue((java.lang.Number) 9.0f);
        float float5 = mutableShort1.floatValue();
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0338");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        int int2 = mutableShort1.intValue();
        java.lang.Class<?> wildcardClass3 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0339");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0340");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0341");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0342");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0343");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0344");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        float float2 = mutableShort1.floatValue();
        mutableShort1.add((short) (byte) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0345");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0346");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0347");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0348");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0349");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0350");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0351");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0352");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        int int7 = mutableShort6.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0353");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0354");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0355");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0356");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0357");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0358");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0359");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0360");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0361");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0362");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        long long2 = mutableShort1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0363");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0364");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0365");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0366");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0367");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0L);
        mutableShort1.decrement();
        mutableShort1.decrement();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0368");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0369");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((short) 0);
        mutableShort1.add((java.lang.Number) 111L);
        byte byte8 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 112 + "'", byte8 == (byte) 112);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0370");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0371");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0372");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0373");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0374");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("1");
        long long2 = mutableShort1.longValue();
        java.lang.Class<?> wildcardClass3 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0375");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0376");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0377");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0378");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0379");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) -1);
        mutableShort1.setValue((short) (byte) 100);
        java.lang.Short short4 = mutableShort1.toShort();
        mutableShort1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4.equals((short) 100));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0380");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0381");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        short short2 = mutableShort1.shortValue();
        org.apache.commons.lang3.mutable.MutableShort mutableShort3 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0382");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 8);
        mutableShort1.decrement();
        mutableShort1.decrement();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0383");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0384");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0385");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0386");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0387");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0388");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0389");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0390");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0391");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.increment();
        mutableShort1.decrement();
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0392");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0393");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("12");
        mutableShort1.add((short) (byte) 100);
        int int4 = mutableShort1.intValue();
        mutableShort1.add((short) (byte) 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 112 + "'", int4 == 112);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0394");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0395");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0396");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0397");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0398");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0399");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0400");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0401");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0402");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0403");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0404");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0405");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0406");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0407");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0408");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0409");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0410");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        mutableShort1.increment();
        long long3 = mutableShort1.longValue();
        mutableShort1.setValue((short) (byte) 20);
        org.apache.commons.lang3.mutable.MutableShort mutableShort6 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0411");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0412");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0413");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0414");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0415");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        java.lang.Short short6 = mutableShort1.toShort();
        java.lang.String str7 = mutableShort1.toString();
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0416");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0417");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0418");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0419");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0420");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0421");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        mutableShort1.add((short) 10);
        float float4 = mutableShort1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 20.0f + "'", float4 == 20.0f);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0422");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 0L);
        double double2 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0423");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0424");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        mutableShort1.add((java.lang.Number) 9.0f);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.increment();
        mutableShort1.increment();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0425");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0426");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0427");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0428");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0429");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0430");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0431");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0432");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        mutableShort1.increment();
        double double5 = mutableShort1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 8.0d + "'", double5 == 8.0d);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0433");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0434");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0435");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("10");
        int int2 = mutableShort1.intValue();
        java.lang.Class<?> wildcardClass3 = mutableShort1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0436");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0437");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0438");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0439");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0440");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0441");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0442");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0443");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0444");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        long long1 = mutableShort0.longValue();
        mutableShort0.setValue((short) -1);
        mutableShort0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0445");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0446");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 17);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0447");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0448");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 100);
        java.lang.Short short2 = mutableShort1.toShort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2.equals((short) 100));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0449");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0450");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0451");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0452");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0453");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 1);
        mutableShort1.setValue((short) -2);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0454");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) -1);
        mutableShort1.add((short) (byte) 8);
        long long4 = mutableShort1.longValue();
        mutableShort1.setValue((short) (byte) 12);
        mutableShort1.setValue((short) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 7L + "'", long4 == 7L);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0455");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0456");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0457");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0458");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0459");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0460");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0461");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0462");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (byte) 9);
        mutableShort1.decrement();
        java.lang.Short short3 = mutableShort1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 8 + "'", short3.equals((short) 8));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0463");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0464");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0465");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) (short) 9);
        mutableShort1.decrement();
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0466");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0467");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 0);
        mutableShort1.setValue((java.lang.Number) 1.0d);
        int int4 = mutableShort1.intValue();
        mutableShort1.setValue((short) 1);
        java.lang.String str7 = mutableShort1.toString();
        org.apache.commons.lang3.mutable.MutableShort mutableShort8 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0468");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 112);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0469");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0470");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0471");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0472");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0473");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0474");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) 10.0f);
        java.lang.Short short2 = mutableShort1.getValue();
        mutableShort1.add((java.lang.Number) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2.equals((short) 10));
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0475");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0476");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0477");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0478");
        org.apache.commons.lang3.mutable.MutableShort mutableShort0 = new org.apache.commons.lang3.mutable.MutableShort();
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort0);
        byte byte2 = mutableShort1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0479");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0480");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0481");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0482");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) (byte) 1);
        org.apache.commons.lang3.mutable.MutableShort mutableShort2 = new org.apache.commons.lang3.mutable.MutableShort((java.lang.Number) mutableShort1);
        mutableShort1.add((short) (byte) 11);
        int int5 = mutableShort1.intValue();
        mutableShort1.subtract((short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0483");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort((short) 0);
        mutableShort1.subtract((short) (byte) 112);
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0484");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0485");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0486");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0487");
        org.apache.commons.lang3.mutable.MutableShort mutableShort1 = new org.apache.commons.lang3.mutable.MutableShort("2");
    }

    @Test
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0488");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0489");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0490");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0491");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0492");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0493");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0494");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0495");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0496");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0497");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0498");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0499");
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
    public void MutableShort() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableShort0.test0500");
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

