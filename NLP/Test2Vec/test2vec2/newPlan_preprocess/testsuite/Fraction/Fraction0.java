package Fraction;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Fraction0 {

    public static boolean debug = false;

    @Test
    public void Fraction001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction001");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction7 = fraction3.pow((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void Fraction002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction002");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = null;
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction4 = fraction1.subtract(fraction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void Fraction003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction003");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction004");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        short short3 = fraction0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void Fraction005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction005");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        byte byte2 = fraction0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void Fraction006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction006");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        short short7 = fraction3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
    }

    @Test
    public void Fraction007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction007");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        java.lang.String str8 = fraction5.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.divideBy(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction008");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction009");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction1.compareTo(fraction4);
        double double6 = fraction4.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
    }

    @Test
    public void Fraction010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction010");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.abs();
        long long8 = fraction3.longValue();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction3.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction011");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction3 = null;
        // The following exception was thrown during execution in Fraction generation
        try {
            int int4 = fraction2.compareTo(fraction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction012");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction013");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        long long2 = fraction0.longValue();
        long long3 = fraction0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void Fraction014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction014");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.abs();
        long long8 = fraction3.longValue();
        java.lang.String str9 = fraction3.toProperString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10" + "'", str9.equals("10"));
    }

    @Test
    public void Fraction015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction015");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, 100);
        short short3 = fraction2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void Fraction016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction016");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        int int7 = fraction3.intValue();
        int int8 = fraction3.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "35 1/35" + "'", str6.equals("35 1/35"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1226 + "'", int8 == 1226);
    }

    @Test
    public void Fraction017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction017");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        long long2 = fraction0.longValue();
        short short3 = fraction0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void Fraction018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction018");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        short short1 = fraction0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void Fraction019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction019");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        boolean boolean4 = fraction0.equals((java.lang.Object) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void Fraction020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction020");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        int int6 = fraction0.intValue();
        short short7 = fraction0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void Fraction021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction021");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        float float1 = fraction0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.33333334f + "'", float1 == 0.33333334f);
    }

    @Test
    public void Fraction022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction022");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        int int3 = fraction2.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
    }

    @Test
    public void Fraction023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction023");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction024");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.negate();
        int int7 = fraction3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void Fraction025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction025");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction1.invert();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction026");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction027");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(3, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction028");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        int int3 = fraction1.getProperWhole();
        java.lang.Class<?> wildcardClass4 = fraction1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void Fraction029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction029");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction030");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) 'a');
        int int3 = fraction2.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void Fraction031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction031");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        int int3 = fraction1.getProperWhole();
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction5 = fraction1.pow(1226);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void Fraction032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction032");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("3/5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction033");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.negate();
        short short8 = fraction3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
    }

    @Test
    public void Fraction034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction034");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        int int7 = fraction5.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void Fraction035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction035");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        byte byte1 = fraction0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void Fraction036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction036");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction037");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.abs();
        int int3 = fraction1.getDenominator();
        int int4 = fraction1.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void Fraction038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction038");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction039");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction0.compareTo(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void Fraction040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction040");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        int int3 = fraction1.getProperWhole();
        int int4 = fraction1.getProperWhole();
        java.lang.String str5 = fraction1.toProperString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
    }

    @Test
    public void Fraction041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction041");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.divideBy(fraction2);
        int int4 = fraction3.intValue();
        byte byte5 = fraction3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 30 + "'", byte5 == (byte) 30);
    }

    @Test
    public void Fraction042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction042");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.invert();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void Fraction043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction043");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.reduce();
        float float8 = fraction7.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void Fraction044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction044");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void Fraction045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction045");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        float float7 = fraction3.floatValue();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction3.multiplyBy(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "35 1/35" + "'", str6.equals("35 1/35"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.028572f + "'", float7 == 35.028572f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction046");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        int int1 = fraction0.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void Fraction047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction047");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("1/10");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction048");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.divideBy(fraction2);
        int int4 = fraction3.intValue();
        int int5 = fraction3.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 30 + "'", int5 == 30);
    }

    @Test
    public void Fraction049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction049");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        int int2 = fraction1.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void Fraction050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction050");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((-1.0d));
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.add(fraction3);
        int int6 = fraction3.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void Fraction051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction051");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        float float9 = fraction7.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-10.0f) + "'", float9 == (-10.0f));
    }

    @Test
    public void Fraction052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction052");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        int int6 = fraction3.getDenominator();
        java.lang.String str7 = fraction3.toString();
        long long8 = fraction3.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10/1" + "'", str7.equals("10/1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void Fraction053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction053");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(1, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.pow(1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction2.divideBy(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction054");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        short short4 = fraction2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -10 + "'", short4 == (short) -10);
    }

    @Test
    public void Fraction055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction055");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), 3);
        int int5 = fraction4.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.divideBy(fraction4);
        long long7 = fraction0.longValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction0.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void Fraction056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction056");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((-10), (int) (short) 10);
        int int3 = fraction2.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void Fraction057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction057");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction058");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 100, 5, 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction059");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((-1.0d));
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        float float4 = fraction2.floatValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction2.abs();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.pow((int) (byte) 0);
        boolean boolean8 = fraction1.equals((java.lang.Object) fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.4f + "'", float4 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void Fraction060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction060");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        double double9 = fraction1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void Fraction061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction061");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((double) 0);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction3.add(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction062");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        short short6 = fraction3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void Fraction063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction063");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.divideBy(fraction2);
        int int4 = fraction1.getDenominator();
        java.lang.String str5 = fraction1.toProperString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void Fraction064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction064");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) '4');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.divideBy(fraction3);
        short short5 = fraction4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void Fraction065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction065");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        int int6 = fraction3.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void Fraction066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction066");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        int int1 = fraction0.getProperWhole();
        int int2 = fraction0.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void Fraction067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction067");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), 3);
        int int5 = fraction4.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.divideBy(fraction4);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction4.invert();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void Fraction068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction068");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction069");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.divideBy(fraction6);
        java.lang.Class<?> wildcardClass8 = fraction7.getClass();
        boolean boolean9 = fraction3.equals((java.lang.Object) fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void Fraction070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction070");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.divideBy(fraction2);
        double double4 = fraction2.doubleValue();
        byte byte5 = fraction2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void Fraction071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction071");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), 3);
        int int5 = fraction4.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.divideBy(fraction4);
        int int7 = fraction4.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void Fraction072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction072");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        int int6 = fraction5.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void Fraction073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction073");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.abs();
        int int3 = fraction1.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.multiplyBy(fraction4);
        double double6 = fraction5.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.5d + "'", double6 == 2.5d);
    }

    @Test
    public void Fraction074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction074");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        double double8 = fraction6.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction5.divideBy(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction075");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), 3);
        int int5 = fraction4.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.divideBy(fraction4);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.abs();
        long long9 = fraction8.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void Fraction076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction076");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.invert();
        byte byte8 = fraction3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "35 1/35" + "'", str6.equals("35 1/35"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 35 + "'", byte8 == (byte) 35);
    }

    @Test
    public void Fraction077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction077");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction078");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        int int3 = fraction1.getProperWhole();
        double double4 = fraction1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void Fraction079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction079");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((-1.0d));
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int7 = fraction6.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.add(fraction6);
        int int9 = fraction2.compareTo(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void Fraction080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction080");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow(0);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.negate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void Fraction081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction081");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        long long2 = fraction0.longValue();
        double double3 = fraction0.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction4 = null;
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void Fraction082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction082");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        int int9 = fraction1.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void Fraction083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction083");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.negate();
        int int8 = fraction7.getDenominator();
        int int9 = fraction7.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10) + "'", int9 == (-10));
    }

    @Test
    public void Fraction084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction084");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '4', 1226, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction085");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction086");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow(0);
        float float3 = fraction0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.8f + "'", float3 == 0.8f);
    }

    @Test
    public void Fraction087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction087");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction9 = fraction3.subtract(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction088");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) 'a', (int) (short) 1);
        boolean boolean4 = fraction2.equals((java.lang.Object) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction2.add(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void Fraction089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction089");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction090");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        double double1 = fraction0.doubleValue();
        byte byte2 = fraction0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5d + "'", double1 == 0.5d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void Fraction091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction091");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction092");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), 3);
        int int3 = fraction2.getProperNumerator();
        java.lang.Object obj4 = null;
        boolean boolean5 = fraction2.equals(obj4);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.reduce();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void Fraction093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction093");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        java.lang.Class<?> wildcardClass4 = fraction0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2/5" + "'", str3.equals("2/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void Fraction094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction094");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) '4');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.divideBy(fraction3);
        int int5 = fraction4.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 208 + "'", int5 == 208);
    }

    @Test
    public void Fraction095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction095");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.multiplyBy(fraction6);
        int int8 = fraction7.getProperWhole();
        int int9 = fraction7.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-21) + "'", int8 == (-21));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-21) + "'", int9 == (-21));
    }

    @Test
    public void Fraction096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction096");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.abs();
        int int8 = fraction5.getDenominator();
        float float9 = fraction5.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.1f + "'", float9 == 0.1f);
    }

    @Test
    public void Fraction097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction097");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.abs();
        int int3 = fraction1.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.multiplyBy(fraction4);
        java.lang.Class<?> wildcardClass6 = fraction4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void Fraction098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction098");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        int int6 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction0.reduce();
        int int9 = fraction0.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void Fraction099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction099");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void Fraction100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction100");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.abs();
        int int8 = fraction3.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void Fraction101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction101");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction3.toString();
        java.lang.String str5 = fraction3.toProperString();
        short short6 = fraction3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1/10" + "'", str4.equals("1/10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1/10" + "'", str5.equals("1/10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void Fraction102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction102");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        java.lang.String str7 = fraction3.toProperString();
        int int8 = fraction3.getNumerator();
        int int9 = fraction3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void Fraction103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction103");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        int int4 = fraction3.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.subtract(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.reduce();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ZERO;
        int int8 = fraction5.compareTo(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void Fraction104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction104");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.abs();
        double double8 = fraction6.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
    }

    @Test
    public void Fraction105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction105");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.reduce();
        long long4 = fraction1.longValue();
        short short5 = fraction1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void Fraction106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction106");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction("35 1/35");
        org.apache.commons.lang3.math.Fraction fraction9 = fraction5.add(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction107");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction108");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        int int4 = fraction3.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.subtract(fraction3);
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction7 = fraction5.pow((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void Fraction109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction109");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.abs();
        int int3 = fraction2.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.reduce();
        float float5 = fraction2.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void Fraction110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction110");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction111");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.reduce();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.pow((int) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction1.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void Fraction112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction112");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        int int7 = fraction3.intValue();
        int int8 = fraction3.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "35 1/35" + "'", str6.equals("35 1/35"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void Fraction113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction113");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        int int3 = fraction1.getNumerator();
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction5 = fraction1.pow(208);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void Fraction114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction114");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.negate();
        int int8 = fraction7.getDenominator();
        int int9 = fraction7.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void Fraction115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction115");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.intValue();
        int int6 = fraction4.getProperWhole();
        boolean boolean7 = fraction1.equals((java.lang.Object) int6);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.reduce();
        java.lang.Class<?> wildcardClass9 = fraction8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Fraction116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction116");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(4, (int) (byte) 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction117");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow(0);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        int int4 = fraction2.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void Fraction118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction118");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.reduce();
        int int8 = fraction3.intValue();
        int int9 = fraction3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void Fraction119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction119");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.reduce();
        org.apache.commons.lang3.math.Fraction fraction3 = null;
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction4 = fraction2.divideBy(fraction3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction120");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction2.reduce();
        float float6 = fraction2.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.10309278f + "'", float6 == 0.10309278f);
    }

    @Test
    public void Fraction121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction121");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.reduce();
        float float3 = fraction0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.25f + "'", float3 == 0.25f);
    }

    @Test
    public void Fraction122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction122");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.negate();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) -1);
        int int6 = fraction5.intValue();
        byte byte7 = fraction5.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void Fraction123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction123");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -1, 1226);
        byte byte3 = fraction2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void Fraction124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction124");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        long long2 = fraction1.longValue();
        short short3 = fraction1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void Fraction125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction125");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.abs();
        int int8 = fraction5.getDenominator();
        double double9 = fraction5.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1d + "'", double9 == 0.1d);
    }

    @Test
    public void Fraction126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction126");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(4, (int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = fraction3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void Fraction127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction127");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction128");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow(0);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.negate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction129");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.negate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction130");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.abs();
        int int8 = fraction6.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10) + "'", int8 == (-10));
    }

    @Test
    public void Fraction131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction131");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.negate();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) -1);
        double double6 = fraction3.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
    }

    @Test
    public void Fraction132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction132");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.abs();
        java.lang.String str8 = fraction3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10/1" + "'", str8.equals("10/1"));
    }

    @Test
    public void Fraction133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction133");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.reduce();
        int int7 = fraction5.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void Fraction134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction134");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 0.33333334f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction135");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.pow((int) (short) 0);
        int int4 = fraction1.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void Fraction136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction136");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void Fraction137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction137");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.subtract(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.negate();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction0.divideBy(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction138");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.reduce();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void Fraction139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction139");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getNumerator();
        java.lang.String str2 = fraction0.toProperString();
        long long3 = fraction0.longValue();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.reduce();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int6 = fraction5.intValue();
        float float7 = fraction5.floatValue();
        java.lang.String str8 = fraction5.toString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction0.add(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4/5" + "'", str2.equals("4/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.4f + "'", float7 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "2/5" + "'", str8.equals("2/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction140");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.pow((int) (short) 1);
        java.lang.String str7 = fraction4.toProperString();
        int int8 = fraction4.intValue();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction0.divideBy(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "35 1/35" + "'", str7.equals("35 1/35"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction141");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(1.0d);
        short short2 = fraction1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void Fraction142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction142");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(5, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction143");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void Fraction144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction144");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((-1.0d));
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.add(fraction3);
        short short6 = fraction1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
    }

    @Test
    public void Fraction145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction145");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction4.subtract(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.pow(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction146");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        int int4 = fraction3.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.subtract(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.reduce();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void Fraction147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction147");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        java.lang.String str7 = fraction3.toProperString();
        short short8 = fraction3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
    }

    @Test
    public void Fraction148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction148");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -1, 1226);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        int int4 = fraction3.getNumerator();
        java.lang.String str5 = fraction3.toProperString();
        long long6 = fraction3.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.reduce();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction2.add(fraction3);
        int int9 = fraction2.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4/5" + "'", str5.equals("4/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1226 + "'", int9 == 1226);
    }

    @Test
    public void Fraction149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction149");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        java.lang.String str9 = fraction8.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20/1" + "'", str9.equals("20/1"));
    }

    @Test
    public void Fraction150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction150");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.reduce();
        java.lang.String str4 = fraction3.toString();
        int int5 = fraction3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10/1" + "'", str4.equals("10/1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void Fraction151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction151");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        int int9 = fraction8.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void Fraction152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction152");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction153");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.abs();
        int int3 = fraction2.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.reduce();
        java.lang.String str5 = fraction4.toProperString();
        byte byte6 = fraction4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
    }

    @Test
    public void Fraction154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction154");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("20/1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction155");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.reduce();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.pow((int) (short) -1);
        short short5 = fraction4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 2 + "'", short5 == (short) 2);
    }

    @Test
    public void Fraction156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction156");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.getNumerator();
        float float3 = fraction1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void Fraction157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction157");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.invert();
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction8 = fraction3.pow(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void Fraction158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction158");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        int int4 = fraction0.getDenominator();
        java.lang.String str5 = fraction0.toProperString();
        int int6 = fraction0.getNumerator();
        int int7 = fraction0.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2/5" + "'", str3.equals("2/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2/5" + "'", str5.equals("2/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void Fraction159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction159");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.multiplyBy(fraction6);
        java.lang.Class<?> wildcardClass8 = fraction0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Fraction160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction160");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction161");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 0.6f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction162");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.abs();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void Fraction163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction163");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.negate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void Fraction164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction164");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((-1), 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction165");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.negate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction166");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.negate();
        int int8 = fraction7.getDenominator();
        float float9 = fraction7.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-10.0f) + "'", float9 == (-10.0f));
    }

    @Test
    public void Fraction167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction167");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.reduce();
        int int3 = fraction2.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void Fraction168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction168");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(208, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction169");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow((int) (byte) 0);
        double double3 = fraction2.doubleValue();
        int int4 = fraction2.getProperWhole();
        int int5 = fraction2.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void Fraction170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction170");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 0, 30, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction171");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        int int4 = fraction3.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.subtract(fraction3);
        float float6 = fraction3.floatValue();
        int int7 = fraction3.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void Fraction172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction172");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow(0);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.abs();
        int int6 = fraction5.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.reduce();
        java.lang.String str8 = fraction7.toProperString();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction0.add(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction173");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        int int6 = fraction0.intValue();
        int int7 = fraction0.getNumerator();
        long long8 = fraction0.longValue();
        int int9 = fraction0.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void Fraction174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction174");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        int int7 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction8 = null;
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction9 = fraction3.add(fraction8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "35 1/35" + "'", str6.equals("35 1/35"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void Fraction175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction175");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 0, (int) (byte) 100);
        int int3 = fraction2.getProperWhole();
        java.lang.Class<?> wildcardClass4 = fraction2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void Fraction176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction176");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((-1.0d));
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction1.pow((int) ' ');
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.invert();
        short short9 = fraction7.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void Fraction177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction177");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow(0);
        int int3 = fraction2.getDenominator();
        int int4 = fraction2.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void Fraction178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction178");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction0.subtract(fraction7);
        short short9 = fraction8.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -10 + "'", short9 == (short) -10);
    }

    @Test
    public void Fraction179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction179");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, 0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction180");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction1.compareTo(fraction4);
        short short6 = fraction1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
    }

    @Test
    public void Fraction181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction181");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction4.subtract(fraction6);
        int int8 = fraction7.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 77 + "'", int8 == 77);
    }

    @Test
    public void Fraction182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction182");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.abs();
        int int3 = fraction1.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.multiplyBy(fraction4);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.reduce();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void Fraction183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction183");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        int int6 = fraction3.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void Fraction184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction184");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.reduce();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.pow((int) (short) -1);
        java.lang.String str5 = fraction4.toProperString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2 1/2" + "'", str5.equals("2 1/2"));
    }

    @Test
    public void Fraction185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction185");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.abs();
        boolean boolean4 = fraction1.equals((java.lang.Object) 10);
        short short5 = fraction1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void Fraction186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction186");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        int int7 = fraction6.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction5.multiplyBy(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.negate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction187");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, 100);
        int int3 = fraction2.intValue();
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction5 = fraction2.pow((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void Fraction188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction188");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        boolean boolean3 = fraction0.equals((java.lang.Object) 3);
        float float4 = fraction0.floatValue();
        java.lang.Class<?> wildcardClass5 = fraction0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3/5" + "'", str1.equals("3/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.6f + "'", float4 == 0.6f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void Fraction189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction189");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.reduce();
        int int8 = fraction7.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void Fraction190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction190");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction3.divideBy(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction191");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -10, 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction192");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) 'a', (int) (short) 1);
        boolean boolean5 = fraction3.equals((java.lang.Object) (short) -1);
        int int6 = fraction0.compareTo(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void Fraction193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction193");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.reduce();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.reduce();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction194");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        int int4 = fraction3.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.subtract(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.reduce();
        int int7 = fraction6.getProperWhole();
        int int8 = fraction6.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void Fraction195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction195");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.multiplyBy(fraction6);
        int int8 = fraction0.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void Fraction196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction196");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        java.lang.String str7 = fraction3.toProperString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "35 1/35" + "'", str6.equals("35 1/35"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "35 1/35" + "'", str7.equals("35 1/35"));
    }

    @Test
    public void Fraction197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction197");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.negate();
        int int5 = fraction3.intValue();
        int int6 = fraction3.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void Fraction198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction198");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(77, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction199");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction200");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.negate();
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction8 = fraction6.pow((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void Fraction201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction201");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction3.toString();
        java.lang.String str5 = fraction3.toProperString();
        double double6 = fraction3.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1/10" + "'", str4.equals("1/10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1/10" + "'", str5.equals("1/10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1d + "'", double6 == 0.1d);
    }

    @Test
    public void Fraction202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction202");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("2/3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction203");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction7 = fraction5.pow(1226);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void Fraction204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction204");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        int int3 = fraction1.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void Fraction205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction205");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.reduce();
        int int3 = fraction2.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void Fraction206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction206");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.reduce();
        int int3 = fraction1.intValue();
        java.lang.String str4 = fraction1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2/5" + "'", str4.equals("2/5"));
    }

    @Test
    public void Fraction207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction207");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.abs();
        int int3 = fraction1.getDenominator();
        int int4 = fraction1.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.reduce();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void Fraction208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction208");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 0, (int) (short) 0, (-21));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction209");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction210");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((-1.0d));
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction1.pow((int) ' ');
        byte byte8 = fraction1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void Fraction211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction211");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 1);
        int int2 = fraction1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void Fraction212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction212");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        java.lang.Class<?> wildcardClass2 = fraction0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void Fraction213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction213");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        int int6 = fraction3.getDenominator();
        int int7 = fraction3.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void Fraction214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction214");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.multiplyBy(fraction6);
        java.lang.String str8 = fraction7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-3678/175" + "'", str8.equals("-3678/175"));
    }

    @Test
    public void Fraction215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction215");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("10/1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction216");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction4.subtract(fraction6);
        int int8 = fraction6.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void Fraction217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction217");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) 'a', (int) (short) 1);
        float float3 = fraction2.floatValue();
        float float4 = fraction2.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
    }

    @Test
    public void Fraction218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction218");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("1");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.divideBy(fraction4);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.invert();
        double double7 = fraction4.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.multiplyBy(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.3333333333333333d + "'", double7 == 0.3333333333333333d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void Fraction219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction219");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction3.toString();
        java.lang.String str5 = fraction3.toProperString();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1/10" + "'", str4.equals("1/10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1/10" + "'", str5.equals("1/10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void Fraction220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction220");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.negate();
        int int7 = fraction3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void Fraction221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction221");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 0.8f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction222");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 1);
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void Fraction223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction223");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.invert();
        int int3 = fraction1.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void Fraction224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction224");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(12, (int) '#', 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction225");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), 3);
        int int5 = fraction4.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.divideBy(fraction4);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.abs();
        int int9 = fraction8.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void Fraction226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction226");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        byte byte9 = fraction1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void Fraction227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction227");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(100, (int) (byte) 35);
        int int3 = fraction2.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void Fraction228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction228");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.negate();
        int int5 = fraction4.getProperWhole();
        float float6 = fraction4.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.4f) + "'", float6 == (-0.4f));
    }

    @Test
    public void Fraction229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction229");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("-1/1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction230");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        int int6 = fraction5.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void Fraction231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction231");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) 'a');
        int int3 = fraction2.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void Fraction232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction232");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.reduce();
        double double3 = fraction0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void Fraction233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction233");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.negate();
        long long8 = fraction7.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-10L) + "'", long8 == (-10L));
    }

    @Test
    public void Fraction234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction234");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        double double5 = fraction1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void Fraction235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction235");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction236");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) ' ', 1);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.negate();
        double double4 = fraction3.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-32.0d) + "'", double4 == (-32.0d));
    }

    @Test
    public void Fraction237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction237");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(1);
        int int5 = fraction4.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void Fraction238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction238");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        int int6 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction0.reduce();
        long long9 = fraction0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void Fraction239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction239");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        double double3 = fraction2.doubleValue();
        int int4 = fraction2.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.0d) + "'", double3 == (-5.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-5) + "'", int4 == (-5));
    }

    @Test
    public void Fraction240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction240");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 1, (int) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.divideBy(fraction3);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction7 = fraction4.pow(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void Fraction241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction241");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        int int6 = fraction4.intValue();
        int int7 = fraction4.getProperNumerator();
        short short8 = fraction4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void Fraction242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction242");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(4, (int) (byte) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction243");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction0.reduce();
        int int9 = fraction8.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void Fraction244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction244");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.reduce();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.subtract(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void Fraction245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction245");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.abs();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction246");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        int int6 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.pow((int) (short) -10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction247");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.reduce();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.reduce();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void Fraction248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction248");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow((int) (byte) 0);
        java.lang.String str3 = fraction0.toProperString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1/3" + "'", str3.equals("1/3"));
    }

    @Test
    public void Fraction249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction249");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) 'a', (int) (short) 1);
        boolean boolean4 = fraction2.equals((java.lang.Object) (short) -1);
        byte byte5 = fraction2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 97 + "'", byte5 == (byte) 97);
    }

    @Test
    public void Fraction250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction250");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.reduce();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.pow((int) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.invert();
        float float6 = fraction1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.4f + "'", float6 == 0.4f);
    }

    @Test
    public void Fraction251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction251");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1226, 20, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction252");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = null;
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction9 = fraction7.divideBy(fraction8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void Fraction253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction253");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((-1.0d));
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.add(fraction3);
        int int6 = fraction1.intValue();
        java.lang.String str7 = fraction1.toString();
        long long8 = fraction1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1/1" + "'", str7.equals("-1/1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void Fraction254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction254");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction255");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((-1.0d));
        java.lang.String str2 = fraction1.toString();
        java.lang.String str3 = fraction1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-1/1" + "'", str2.equals("-1/1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1/1" + "'", str3.equals("-1/1"));
    }

    @Test
    public void Fraction256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction256");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        int int4 = fraction3.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.subtract(fraction3);
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction7 = fraction3.pow(1226);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void Fraction257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction257");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void Fraction258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction258");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("1");
        int int2 = fraction1.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void Fraction259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction259");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) -1, (-1));
        byte byte3 = fraction2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void Fraction260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction260");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("35 1/35");
        int int2 = fraction1.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.reduce();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(100.0d);
        int int6 = fraction5.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.divideBy(fraction5);
        long long8 = fraction3.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void Fraction261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction261");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) -1, (-10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction262");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        long long1 = fraction0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void Fraction263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction263");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.reduce();
        java.lang.String str4 = fraction1.toProperString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
    }

    @Test
    public void Fraction264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction264");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(77, 3, 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction265");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.negate();
        java.lang.Class<?> wildcardClass5 = fraction4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void Fraction266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction266");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) '4');
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.multiplyBy(fraction6);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction0.reduce();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void Fraction267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction267");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getNumerator();
        java.lang.String str2 = fraction0.toProperString();
        long long3 = fraction0.longValue();
        short short4 = fraction0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4/5" + "'", str2.equals("4/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void Fraction268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction268");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 100, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction269");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.multiplyBy(fraction6);
        int int8 = fraction0.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void Fraction270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction270");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.divideBy(fraction2);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void Fraction271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction271");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        float float7 = fraction3.floatValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.reduce();
        int int9 = fraction8.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "35 1/35" + "'", str6.equals("35 1/35"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.028572f + "'", float7 == 35.028572f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void Fraction272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction272");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow((int) (byte) 0);
        double double3 = fraction2.doubleValue();
        int int4 = fraction2.getDenominator();
        double double5 = fraction2.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void Fraction273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction273");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(3, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction274");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(100, (int) (short) 10);
        byte byte3 = fraction2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void Fraction275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction275");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(5, 2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction276");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        long long2 = fraction0.longValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.abs();
        java.lang.String str6 = fraction4.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.add(fraction4);
        short short8 = fraction0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void Fraction277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction277");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.reduce();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.invert();
        int int9 = fraction8.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void Fraction278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction278");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 100);
        int int2 = fraction1.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void Fraction279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction279");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.invert();
        short short8 = fraction3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "35 1/35" + "'", str6.equals("35 1/35"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 35 + "'", short8 == (short) 35);
    }

    @Test
    public void Fraction280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction280");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(0, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction281");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        double double2 = fraction0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2d + "'", double2 == 0.2d);
    }

    @Test
    public void Fraction282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction282");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.divideBy(fraction2);
        int int4 = fraction2.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void Fraction283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction283");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), 3);
        int int5 = fraction4.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.divideBy(fraction4);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        float float9 = fraction6.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.8f) + "'", float9 == (-1.8f));
    }

    @Test
    public void Fraction284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction284");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow((int) (byte) 0);
        long long3 = fraction0.longValue();
        double double4 = fraction0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.3333333333333333d + "'", double4 == 0.3333333333333333d);
    }

    @Test
    public void Fraction285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction285");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(2, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction286");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(77, 103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction287");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        double double2 = fraction0.doubleValue();
        double double3 = fraction0.doubleValue();
        int int4 = fraction0.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void Fraction288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction288");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        int int3 = fraction2.intValue();
        double double4 = fraction2.doubleValue();
        byte byte5 = fraction2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void Fraction289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction289");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = fraction0.pow((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void Fraction290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction290");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(1.0d);
        float float2 = fraction1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void Fraction291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction291");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) (byte) 100, (int) (byte) 30);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.reduce();
        int int5 = fraction3.intValue();
        int int6 = fraction3.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 103 + "'", int5 == 103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void Fraction292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction292");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.abs();
        int int3 = fraction1.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.multiplyBy(fraction4);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.invert();
        int int7 = fraction6.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void Fraction293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction293");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) ' ', 1);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.negate();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.reduce();
        float float5 = fraction2.floatValue();
        long long6 = fraction2.longValue();
        float float7 = fraction2.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
    }

    @Test
    public void Fraction294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction294");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(100, (int) (short) 10);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int5 = fraction4.getNumerator();
        int int6 = fraction4.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.subtract(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void Fraction295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction295");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void Fraction296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction296");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.reduce();
        long long3 = fraction1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void Fraction297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction297");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), 3);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.negate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction298");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), 3);
        int int5 = fraction4.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.divideBy(fraction4);
        long long7 = fraction0.longValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction0.negate();
        java.lang.Class<?> wildcardClass9 = fraction0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Fraction299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction299");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        float float7 = fraction3.floatValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.reduce();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction3.reduce();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "35 1/35" + "'", str6.equals("35 1/35"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.028572f + "'", float7 == 35.028572f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction300");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(0.5d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction301");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(77, (int) (short) -1);
        float float3 = fraction2.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-77.0f) + "'", float3 == (-77.0f));
    }

    @Test
    public void Fraction302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction302");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) ' ', (-21), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction303");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(100.0d);
        int int4 = fraction3.intValue();
        int int5 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.add(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void Fraction304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction304");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.abs();
        int int8 = fraction7.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void Fraction305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction305");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction(5, 2, (int) (short) 1);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction4);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.pow(0);
        int int9 = fraction0.compareTo(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void Fraction306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction306");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction307");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((-21), 0, (int) (byte) 1);
        java.lang.String str4 = fraction3.toProperString();
        int int5 = fraction3.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-21" + "'", str4.equals("-21"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void Fraction308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction308");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        int int1 = fraction0.getProperWhole();
        long long2 = fraction0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void Fraction309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction309");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        float float1 = fraction0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
    }

    @Test
    public void Fraction310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction310");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) (byte) 100, (int) (byte) 30);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.abs();
        int int5 = fraction3.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 30 + "'", int5 == 30);
    }

    @Test
    public void Fraction311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction311");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction0.compareTo(fraction2);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.negate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void Fraction312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction312");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction1.compareTo(fraction4);
        int int6 = fraction1.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void Fraction313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction313");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.reduce();
        int int3 = fraction0.getProperNumerator();
        java.lang.Class<?> wildcardClass4 = fraction0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void Fraction314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction314");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) ' ', 1);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 0.5f);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction2.multiplyBy(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void Fraction315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction315");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.negate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void Fraction316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction316");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.getNumerator();
        int int3 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction4.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction1.subtract(fraction4);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.pow((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void Fraction317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction317");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow(208);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mulPos");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction318");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.negate();
        int int8 = fraction7.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction319");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -10, 5);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', 2, 77);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.divideBy(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void Fraction320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction320");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getNumerator();
        java.lang.String str2 = fraction0.toProperString();
        long long3 = fraction0.longValue();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.reduce();
        java.lang.String str5 = fraction4.toString();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.reduce();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4/5" + "'", str2.equals("4/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4/5" + "'", str5.equals("4/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void Fraction321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction321");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        float float7 = fraction3.floatValue();
        long long8 = fraction3.longValue();
        int int9 = fraction3.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "35 1/35" + "'", str6.equals("35 1/35"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.028572f + "'", float7 == 35.028572f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void Fraction322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction322");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(208, 5, (int) (short) 10);
        long long4 = fraction3.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 208L + "'", long4 == 208L);
    }

    @Test
    public void Fraction323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction323");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.invert();
        java.lang.Class<?> wildcardClass3 = fraction1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void Fraction324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction324");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction0.reduce();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction0.negate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction325");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.negate();
        double double6 = fraction3.doubleValue();
        int int7 = fraction3.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.1d + "'", double6 == 0.1d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void Fraction326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction326");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        int int3 = fraction1.getNumerator();
        int int4 = fraction1.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void Fraction327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction327");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 30, (int) (short) 1);
        byte byte3 = fraction2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 30 + "'", byte3 == (byte) 30);
    }

    @Test
    public void Fraction328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction328");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        java.lang.String str1 = fraction0.toProperString();
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = fraction0.pow(103);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "2/3" + "'", str1.equals("2/3"));
    }

    @Test
    public void Fraction329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction329");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.reduce();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.abs();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        int int5 = fraction4.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.divideBy(fraction4);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.invert();
        boolean boolean9 = fraction6.equals((java.lang.Object) fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void Fraction330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction330");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        int int6 = fraction3.getDenominator();
        java.lang.String str7 = fraction3.toString();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction3.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10/1" + "'", str7.equals("10/1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction331");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 1, (int) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.divideBy(fraction3);
        float float5 = fraction2.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
    }

    @Test
    public void Fraction332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction332");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(35, 5, 30);
        java.lang.String str4 = fraction3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1055/30" + "'", str4.equals("1055/30"));
    }

    @Test
    public void Fraction333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction333");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(208, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction334");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 1);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.reduce();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction1.divideBy(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void Fraction335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction335");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        long long2 = fraction0.longValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.abs();
        java.lang.String str6 = fraction4.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.add(fraction4);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void Fraction336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction336");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) (byte) 100, (int) (byte) 30);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.reduce();
        double double5 = fraction4.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 103.33333333333333d + "'", double5 == 103.33333333333333d);
    }

    @Test
    public void Fraction337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction337");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.negate();
        java.lang.String str5 = fraction4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1226/35" + "'", str5.equals("-1226/35"));
    }

    @Test
    public void Fraction338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction338");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(9, (int) (short) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction339");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) '#');
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction340");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 30, (int) (short) 1);
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow((int) (byte) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction341");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-5), 208);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction342");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.abs();
        java.lang.String str8 = fraction6.toProperString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-10" + "'", str8.equals("-10"));
    }

    @Test
    public void Fraction343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction343");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) '4');
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.multiplyBy(fraction6);
        boolean boolean9 = fraction6.equals((java.lang.Object) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void Fraction344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction344");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void Fraction345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction345");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow(0);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.reduce();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction4);
        java.lang.String str8 = fraction7.toProperString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-9 1/5" + "'", str8.equals("-9 1/5"));
    }

    @Test
    public void Fraction346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction346");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) (byte) 100);
        int int3 = fraction2.getProperNumerator();
        long long4 = fraction2.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void Fraction347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction347");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) (byte) -1);
        double double3 = fraction2.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void Fraction348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction348");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction349");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.negate();
        java.lang.String str6 = fraction3.toString();
        org.apache.commons.lang3.math.Fraction fraction7 = null;
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction8 = fraction3.add(fraction7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fraction must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1/10" + "'", str6.equals("1/10"));
    }

    @Test
    public void Fraction350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction350");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) -1, 77, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction351");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.subtract(fraction7);
        java.lang.String str9 = fraction7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-10/1" + "'", str9.equals("-10/1"));
    }

    @Test
    public void Fraction352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction352");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.divideBy(fraction2);
        double double4 = fraction2.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.invert();
        long long7 = fraction6.longValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction2.multiplyBy(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction2.invert();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction353");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        int int3 = fraction2.getProperNumerator();
        long long4 = fraction2.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void Fraction354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction354");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (-10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction355");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction1.compareTo(fraction4);
        java.lang.String str6 = fraction1.toString();
        int int7 = fraction1.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10/1" + "'", str6.equals("10/1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void Fraction356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction356");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        byte byte6 = fraction5.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
    }

    @Test
    public void Fraction357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction357");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.abs();
        int int3 = fraction1.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.multiplyBy(fraction4);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.abs();
        byte byte8 = fraction6.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 4 + "'", byte8 == (byte) 4);
    }

    @Test
    public void Fraction358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction358");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(1, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.negate();
        java.lang.String str6 = fraction4.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.divideBy(fraction4);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction4.pow((-5));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "5" + "'", str6.equals("5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction359");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), 3);
        int int3 = fraction2.getProperNumerator();
        java.lang.Object obj4 = null;
        boolean boolean5 = fraction2.equals(obj4);
        int int6 = fraction2.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void Fraction360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction360");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 1, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction361");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction362");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.reduce();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.invert();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void Fraction363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction363");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        double double1 = fraction0.doubleValue();
        int int2 = fraction0.getDenominator();
        int int3 = fraction0.intValue();
        java.lang.String str4 = fraction0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5d + "'", double1 == 0.5d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2/4" + "'", str4.equals("2/4"));
    }

    @Test
    public void Fraction364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction364");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        int int3 = fraction1.getProperWhole();
        int int4 = fraction1.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.divideBy(fraction7);
        int int9 = fraction1.compareTo(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void Fraction365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction365");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.reduce();
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.abs();
        double double5 = fraction4.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.4d + "'", double5 == 0.4d);
    }

    @Test
    public void Fraction366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction366");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        int int6 = fraction3.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void Fraction367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction367");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.divideBy(fraction2);
        double double4 = fraction2.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.invert();
        long long7 = fraction6.longValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction2.multiplyBy(fraction6);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction2.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction368");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 100);
        short short2 = fraction1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void Fraction369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction369");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        int int4 = fraction3.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.subtract(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.reduce();
        int int7 = fraction5.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void Fraction370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction370");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getFraction(5, 2, (int) (short) 1);
        boolean boolean5 = fraction0.equals((java.lang.Object) fraction4);
        java.lang.String str6 = fraction0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0/1" + "'", str6.equals("0/1"));
    }

    @Test
    public void Fraction371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction371");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(77, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction372");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(1226, (int) (byte) 100);
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.invert();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void Fraction373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction373");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', (int) '#', (int) (byte) 10);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.add(fraction4);
        int int8 = fraction3.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void Fraction374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction374");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.negate();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) -1);
        int int6 = fraction5.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.negate();
        java.lang.Class<?> wildcardClass8 = fraction7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Fraction375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction375");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        int int6 = fraction3.getProperWhole();
        float float7 = fraction3.floatValue();
        long long8 = fraction3.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.4f + "'", float7 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void Fraction376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction376");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), 3);
        int int5 = fraction4.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.divideBy(fraction4);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.abs();
        byte byte9 = fraction8.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void Fraction377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction377");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.reduce();
        int int7 = fraction6.getProperWhole();
        long long8 = fraction6.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void Fraction378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction378");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) '#', 1);
        int int4 = fraction3.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void Fraction379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction379");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), 3);
        int int5 = fraction4.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.divideBy(fraction4);
        long long7 = fraction0.longValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction0.negate();
        int int9 = fraction8.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void Fraction380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction380");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), 3);
        byte byte3 = fraction2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void Fraction381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction381");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("1055/30");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction382");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(1);
        int int5 = fraction2.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void Fraction383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction383");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.divideBy(fraction2);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.negate();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction2.negate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void Fraction384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction384");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        double double6 = fraction5.doubleValue();
        float float7 = fraction5.floatValue();
        int int8 = fraction5.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.02857142857143d + "'", double6 == 35.02857142857143d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.028572f + "'", float7 == 35.028572f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void Fraction385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction385");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        int int4 = fraction3.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.subtract(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.reduce();
        double double7 = fraction6.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.reduce();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-0.16666666666666666d) + "'", double7 == (-0.16666666666666666d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void Fraction386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction386");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        int int6 = fraction3.intValue();
        boolean boolean8 = fraction3.equals((java.lang.Object) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void Fraction387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction387");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 0, (int) (byte) 100);
        int int3 = fraction2.getProperWhole();
        java.lang.String str4 = fraction2.toString();
        byte byte5 = fraction2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0/1" + "'", str4.equals("0/1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void Fraction388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction388");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        int int4 = fraction3.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.subtract(fraction3);
        float float6 = fraction3.floatValue();
        int int7 = fraction3.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void Fraction389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction389");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 0, (int) (byte) 100);
        int int3 = fraction2.getProperWhole();
        java.lang.String str4 = fraction2.toString();
        int int5 = fraction2.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0/1" + "'", str4.equals("0/1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void Fraction390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction390");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) '4');
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.multiplyBy(fraction6);
        java.lang.Class<?> wildcardClass8 = fraction6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void Fraction391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction391");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        int int4 = fraction3.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.pow(4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void Fraction392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction392");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.abs();
        int int3 = fraction1.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.multiplyBy(fraction4);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.abs();
        byte byte8 = fraction7.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 4 + "'", byte8 == (byte) 4);
    }

    @Test
    public void Fraction393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction393");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.negate();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) -1);
        int int6 = fraction3.getDenominator();
        byte byte7 = fraction3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -10 + "'", byte7 == (byte) -10);
    }

    @Test
    public void Fraction394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction394");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 35, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction395");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) ' ', (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.reduce();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void Fraction396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction396");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(5, 1);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction397");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        int int4 = fraction0.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.pow((int) (byte) -1);
        float float7 = fraction0.floatValue();
        int int8 = fraction0.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2/5" + "'", str3.equals("2/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.4f + "'", float7 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void Fraction398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction398");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.negate();
        short short7 = fraction0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void Fraction399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction399");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), 3);
        int int3 = fraction2.getProperNumerator();
        java.lang.Object obj4 = null;
        boolean boolean5 = fraction2.equals(obj4);
        java.lang.String str6 = fraction2.toString();
        float float7 = fraction2.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1/3" + "'", str6.equals("-1/3"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-0.33333334f) + "'", float7 == (-0.33333334f));
    }

    @Test
    public void Fraction400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction400");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) -10, 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction401");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.negate();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        long long6 = fraction4.longValue();
        java.lang.String str7 = fraction4.toProperString();
        int int8 = fraction1.compareTo(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void Fraction402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction402");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        float float6 = fraction3.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 35.028572f + "'", float6 == 35.028572f);
    }

    @Test
    public void Fraction403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction403");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 100, (int) (byte) 35);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.negate();
        java.lang.String str4 = fraction2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100/35" + "'", str4.equals("100/35"));
    }

    @Test
    public void Fraction404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction404");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 35, (int) (byte) 97, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction405");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.divideBy(fraction2);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.invert();
        int int7 = fraction6.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.multiplyBy(fraction6);
        int int9 = fraction1.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void Fraction406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction406");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(100, (-10));
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.negate();
        int int4 = fraction2.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10) + "'", int4 == (-10));
    }

    @Test
    public void Fraction407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction407");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.abs();
        int int5 = fraction3.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.multiplyBy(fraction6);
        int int8 = fraction7.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction0.divideBy(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3/5" + "'", str1.equals("3/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction408");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow(0);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.negate();
        java.lang.Class<?> wildcardClass4 = fraction0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void Fraction409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction409");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        int int6 = fraction4.intValue();
        int int7 = fraction4.getProperNumerator();
        double double8 = fraction4.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.10309278350515463d + "'", double8 == 0.10309278350515463d);
    }

    @Test
    public void Fraction410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction410");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) ' ', (int) (byte) 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction411");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        double double3 = fraction2.doubleValue();
        long long4 = fraction2.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.0d) + "'", double3 == (-5.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-5L) + "'", long4 == (-5L));
    }

    @Test
    public void Fraction412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction412");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("4/5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction413");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 35, 10, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction414");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) '#');
        float float2 = fraction1.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.multiplyBy(fraction3);
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction6 = fraction1.pow(208);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void Fraction415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction415");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(2.5d);
        byte byte2 = fraction1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 2 + "'", byte2 == (byte) 2);
    }

    @Test
    public void Fraction416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction416");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(0, (int) (byte) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction417");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3/5" + "'", str1.equals("3/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction418");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(1226, (int) (byte) 100);
        int int3 = fraction2.intValue();
        java.lang.Class<?> wildcardClass4 = fraction2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void Fraction419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction419");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        int int4 = fraction0.getDenominator();
        java.lang.String str5 = fraction0.toProperString();
        int int6 = fraction0.getNumerator();
        int int7 = fraction0.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2/5" + "'", str3.equals("2/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2/5" + "'", str5.equals("2/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void Fraction420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction420");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int1 = fraction0.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.pow(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction421");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction2.add(fraction5);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction0.subtract(fraction7);
        java.lang.String str9 = fraction7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "52/5" + "'", str9.equals("52/5"));
    }

    @Test
    public void Fraction422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction422");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.reduce();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.pow(0);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction4.negate();
        boolean boolean8 = fraction3.equals((java.lang.Object) fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void Fraction423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction423");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getNumerator();
        java.lang.String str2 = fraction0.toProperString();
        long long3 = fraction0.longValue();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.reduce();
        int int5 = fraction0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4/5" + "'", str2.equals("4/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void Fraction424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction424");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        float float7 = fraction3.floatValue();
        long long8 = fraction3.longValue();
        java.lang.Class<?> wildcardClass9 = fraction3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "35 1/35" + "'", str6.equals("35 1/35"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.028572f + "'", float7 == 35.028572f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void Fraction425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction425");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.reduce();
        long long4 = fraction1.longValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.reduce();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void Fraction426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction426");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) '4');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.divideBy(fraction3);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.abs();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        int int8 = fraction6.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void Fraction427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction427");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((-21), (int) (byte) 100, (int) (byte) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction428");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        double double2 = fraction0.doubleValue();
        double double3 = fraction0.doubleValue();
        short short4 = fraction0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
    }

    @Test
    public void Fraction429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction429");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.reduce();
        boolean boolean5 = fraction1.equals((java.lang.Object) (byte) 4);
        int int6 = fraction1.getProperNumerator();
        java.lang.Class<?> wildcardClass7 = fraction1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void Fraction430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction430");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), 3);
        int int5 = fraction4.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.divideBy(fraction4);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        int int8 = fraction6.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void Fraction431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction431");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((-1.0d));
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction1.pow((int) ' ');
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction7.reduce();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction432");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 100, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction433");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        double double2 = fraction0.doubleValue();
        double double3 = fraction0.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.reduce();
        int int5 = fraction4.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void Fraction434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction434");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 97, (int) (byte) -10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction435");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        java.lang.String str4 = fraction3.toString();
        java.lang.String str5 = fraction3.toProperString();
        int int6 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.subtract(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1/10" + "'", str4.equals("1/10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1/10" + "'", str5.equals("1/10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void Fraction436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction436");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("-10");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction437");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getNumerator();
        java.lang.String str2 = fraction0.toProperString();
        long long3 = fraction0.longValue();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.reduce();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        java.lang.String str6 = fraction5.toProperString();
        int int7 = fraction0.compareTo(fraction5);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction0.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4/5" + "'", str2.equals("4/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2/3" + "'", str6.equals("2/3"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void Fraction438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction438");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.reduce();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        java.lang.String str4 = fraction2.toProperString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void Fraction439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction439");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        int int7 = fraction6.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction5.multiplyBy(fraction6);
        java.lang.String str9 = fraction5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1226/35" + "'", str9.equals("1226/35"));
    }

    @Test
    public void Fraction440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction440");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 0.1f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction441");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) 'a', (int) (short) 1);
        boolean boolean4 = fraction2.equals((java.lang.Object) (short) -1);
        int int5 = fraction2.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void Fraction442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction442");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) (short) 10);
        int int3 = fraction2.intValue();
        int int4 = fraction2.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction2.reduce();
        int int6 = fraction2.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void Fraction443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction443");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE;
        int int7 = fraction6.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction5.multiplyBy(fraction6);
        int int9 = fraction5.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void Fraction444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction444");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) (byte) 100, (int) (byte) 30);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.reduce();
        int int5 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.negate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 103 + "'", int5 == 103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void Fraction445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction445");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, 100);
        long long3 = fraction2.longValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(1.0d);
        int int6 = fraction2.compareTo(fraction5);
        long long7 = fraction2.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void Fraction446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction446");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        float float2 = fraction0.floatValue();
        java.lang.String str3 = fraction0.toString();
        int int4 = fraction0.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.reduce();
        long long6 = fraction5.longValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction5.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.4f + "'", float2 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2/5" + "'", str3.equals("2/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void Fraction447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction447");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) '4');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.divideBy(fraction3);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.abs();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.negate();
        int int7 = fraction6.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void Fraction448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction448");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.multiplyBy(fraction6);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction0.invert();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void Fraction449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction449");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 100, 103);
        int int3 = fraction2.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void Fraction450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction450");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), 35);
        java.lang.String str3 = fraction2.toProperString();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.invert();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1/35" + "'", str3.equals("-1/35"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void Fraction451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction451");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ZERO;
        int int1 = fraction0.getNumerator();
        java.lang.String str2 = fraction0.toProperString();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int4 = fraction3.intValue();
        float float5 = fraction3.floatValue();
        java.lang.String str6 = fraction3.toString();
        int int7 = fraction3.getDenominator();
        int int8 = fraction3.getNumerator();
        boolean boolean9 = fraction0.equals((java.lang.Object) int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0" + "'", str2.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.4f + "'", float5 == 0.4f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2/5" + "'", str6.equals("2/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void Fraction452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction452");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow(0);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        double double4 = fraction2.doubleValue();
        byte byte5 = fraction2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void Fraction453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction453");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((-1.0d));
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.pow((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void Fraction454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction454");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        float float2 = fraction0.floatValue();
        int int3 = fraction0.getDenominator();
        int int4 = fraction0.intValue();
        boolean boolean6 = fraction0.equals((java.lang.Object) '#');
        float float7 = fraction0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void Fraction455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction455");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(12, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void Fraction456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction456");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.reduce();
        int int3 = fraction1.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void Fraction457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction457");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 2, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction458");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), 3);
        int int5 = fraction4.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.divideBy(fraction4);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.invert();
        int int9 = fraction8.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
    }

    @Test
    public void Fraction459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction459");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        int int4 = fraction3.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.subtract(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.reduce();
        int int7 = fraction6.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.reduce();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void Fraction460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction460");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) 'a', (int) (short) 1);
        boolean boolean4 = fraction2.equals((java.lang.Object) (short) -1);
        int int5 = fraction2.getDenominator();
        int int6 = fraction2.getProperNumerator();
        short short7 = fraction2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 97 + "'", short7 == (short) 97);
    }

    @Test
    public void Fraction461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction461");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        int int3 = fraction1.getProperWhole();
        byte byte4 = fraction1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
    }

    @Test
    public void Fraction462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction462");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) 'a', (int) (short) 1);
        boolean boolean4 = fraction2.equals((java.lang.Object) (short) -1);
        int int5 = fraction2.getDenominator();
        int int6 = fraction2.getProperNumerator();
        int int7 = fraction2.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void Fraction463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction463");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 35, (int) (short) 100, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction464");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        int int6 = fraction3.getDenominator();
        java.lang.String str7 = fraction3.toString();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.negate();
        short short9 = fraction8.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10/1" + "'", str7.equals("10/1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -10 + "'", short9 == (short) -10);
    }

    @Test
    public void Fraction465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction465");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        int int2 = fraction0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void Fraction466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction466");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(1, (int) (short) 1);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 1, (int) (byte) 100);
        boolean boolean6 = fraction2.equals((java.lang.Object) (byte) 1);
        java.lang.String str7 = fraction2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1/1" + "'", str7.equals("1/1"));
    }

    @Test
    public void Fraction467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction467");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(1226, (int) (byte) 100);
        int int3 = fraction2.intValue();
        int int4 = fraction2.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void Fraction468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction468");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 100, (int) (byte) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction469");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getNumerator();
        java.lang.String str2 = fraction0.toProperString();
        long long3 = fraction0.longValue();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.reduce();
        java.lang.String str5 = fraction4.toString();
        float float6 = fraction4.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4/5" + "'", str2.equals("4/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "4/5" + "'", str5.equals("4/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
    }

    @Test
    public void Fraction470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction470");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.invert();
        int int8 = fraction7.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "35 1/35" + "'", str6.equals("35 1/35"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void Fraction471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction471");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction3.toProperString();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.abs();
        int int8 = fraction7.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void Fraction472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction472");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        int int7 = fraction2.compareTo(fraction6);
        int int8 = fraction2.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-10) + "'", int8 == (-10));
    }

    @Test
    public void Fraction473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction473");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((-1.0d));
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction1.pow((int) ' ');
        org.apache.commons.lang3.math.Fraction fraction8 = fraction7.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction8.negate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction474");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) -10, (int) (byte) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction475");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.reduce();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.negate();
        int int4 = fraction0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void Fraction476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction476");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.divideBy(fraction2);
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.reduce();
        long long5 = fraction4.longValue();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2L + "'", long5 == 2L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
    }

    @Test
    public void Fraction477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction477");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        float float2 = fraction0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
    }

    @Test
    public void Fraction478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction478");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("-1/35");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((-0.16666666666666666d));
        boolean boolean4 = fraction1.equals((java.lang.Object) fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void Fraction479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction479");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.abs();
        int int3 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) (byte) 100);
        int int7 = fraction6.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction1.divideBy(fraction6);
        long long9 = fraction1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void Fraction480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction480");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction481");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(4, 100, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction482");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.negate();
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction7 = fraction5.pow((-21));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
    }

    @Test
    public void Fraction483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction483");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("-1/3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction484");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow(0);
        int int3 = fraction2.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void Fraction485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction485");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) '#');
        float float2 = fraction1.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.multiplyBy(fraction3);
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction6 = fraction5.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction3.multiplyBy(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void Fraction486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction486");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.abs();
        int int3 = fraction1.getDenominator();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.multiplyBy(fraction4);
        org.apache.commons.lang3.math.Fraction fraction8 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -1, 1226);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction4.subtract(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction487");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(100, (-10));
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.negate();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction3.reduce();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void Fraction488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction488");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction489");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.abs();
        float float3 = fraction1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void Fraction490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction490");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        int int6 = fraction3.intValue();
        float float7 = fraction3.floatValue();
        int int8 = fraction3.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.028572f + "'", float7 == 35.028572f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1226 + "'", int8 == 1226);
    }

    @Test
    public void Fraction491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction491");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(9, (int) (short) 1, (int) (short) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction492");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.negate();
        java.lang.String str4 = fraction1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10/1" + "'", str4.equals("10/1"));
    }

    @Test
    public void Fraction493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction493");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.negate();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.invert();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
    }

    @Test
    public void Fraction494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction494");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction0.subtract(fraction5);
        int int7 = fraction0.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void Fraction495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction495");
        // The following exception was thrown during execution in Fraction generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 35, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction496");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int5 = fraction1.compareTo(fraction4);
        int int6 = fraction4.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void Fraction497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction497");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction6.pow(0);
        org.apache.commons.lang3.math.Fraction fraction9 = fraction3.divideBy(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction9);
    }

    @Test
    public void Fraction498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction498");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        int int2 = fraction1.getNumerator();
        java.lang.String str3 = fraction1.toProperString();
        long long4 = fraction1.longValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction1.reduce();
        boolean boolean6 = fraction0.equals((java.lang.Object) fraction5);
        org.apache.commons.lang3.math.Fraction fraction7 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction8 = fraction0.subtract(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "4/5" + "'", str3.equals("4/5"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
    }

    @Test
    public void Fraction499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction499");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.negate();
        java.lang.String str7 = fraction6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-10/1" + "'", str7.equals("-10/1"));
    }

    @Test
    public void Fraction500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.Fraction500");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) (byte) 100, (int) (byte) 30);
        int int4 = fraction3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 103 + "'", int4 == 103);
    }
}

