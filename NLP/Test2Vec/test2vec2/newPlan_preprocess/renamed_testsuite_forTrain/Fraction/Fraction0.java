
package Fraction;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Fraction0 {

    public static boolean debug = false;

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test001");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test002");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction3 = null;
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test003");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test004");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test005");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test006");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test007");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test008");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test009");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test010");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test011");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction3 = null;
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test012");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test013");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test014");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test015");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, 100);
        short short3 = fraction2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test016");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test017");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test018");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        short short1 = fraction0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test019");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test020");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test021");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        float float1 = fraction0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.33333334f + "'", float1 == 0.33333334f);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test022");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        int int3 = fraction2.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test023");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test024");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test025");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test026");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test027");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(3, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test028");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test029");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test030");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) 'a');
        int int3 = fraction2.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test031");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        int int3 = fraction1.getProperWhole();
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test032");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("3/5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test033");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test034");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test035");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        byte byte1 = fraction0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test036");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test037");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test038");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test039");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test040");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test041");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test042");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test043");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test044");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test045");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test046");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        int int1 = fraction0.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test047");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("1/10");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test048");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test049");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test050");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test051");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test052");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test053");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test054");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test055");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test056");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((-10), (int) (short) 10);
        int int3 = fraction2.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test057");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test058");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 100, 5, 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test059");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test060");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test061");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test062");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test063");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test064");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test065");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test066");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test067");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test068");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test069");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test070");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test071");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test072");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test073");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test074");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test075");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test076");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test077");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test078");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test079");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test080");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test081");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.invert();
        long long2 = fraction0.longValue();
        double double3 = fraction0.doubleValue();
        org.apache.commons.lang3.math.Fraction fraction4 = null;
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test082");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test083");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test084");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '4', 1226, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test085");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("10");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test086");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test087");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test088");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test089");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(4, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test090");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test091");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test092");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test093");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test094");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test095");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test096");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test097");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test098");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test099");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test100");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test101");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test102");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test103");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test104");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test105");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test106");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test107");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test108");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        int int4 = fraction3.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.subtract(fraction3);
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test109");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test110");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(4, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test111");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test112");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test113");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        int int3 = fraction1.getNumerator();
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test114");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test115");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test116");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(4, (int) (byte) 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test117");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test118");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test119");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("2/5");
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.reduce();
        org.apache.commons.lang3.math.Fraction fraction3 = null;
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test120");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test121");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test122");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test123");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -1, 1226);
        byte byte3 = fraction2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test124");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test125");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test126");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(4, (int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = fraction3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test127");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test128");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test129");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.negate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test130");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test131");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test132");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test133");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test134");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 0.33333334f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test135");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test136");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test137");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test138");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test139");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test140");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test141");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(1.0d);
        short short2 = fraction1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test142");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(5, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test143");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test144");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test145");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test146");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test147");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test148");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test149");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test150");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test151");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test152");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test153");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test154");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("20/1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test155");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test156");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test157");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.invert();
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test158");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test159");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test160");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test161");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 0.6f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test162");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test163");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test164");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((-1), 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test165");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test166");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test167");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test168");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(208, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test169");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test170");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 0, 30, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test171");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test172");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test173");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test174");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '#', (int) (byte) 1, (int) '#');
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.pow((int) (short) 1);
        java.lang.String str6 = fraction3.toProperString();
        int int7 = fraction3.intValue();
        org.apache.commons.lang3.math.Fraction fraction8 = null;
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test175");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test176");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test177");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test178");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test179");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1, 0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test180");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test181");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test182");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test183");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test184");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test185");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test186");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test187");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, 100);
        int int3 = fraction2.intValue();
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test188");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test189");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test190");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test191");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) -10, 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test192");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test193");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test194");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test195");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test196");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test197");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test198");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(77, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test199");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test200");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.negate();
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test201");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test202");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("2/3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test203");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) 'a');
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.pow(1);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test204");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test205");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test206");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test207");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test208");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 0, (int) (short) 0, (-21));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test209");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test210");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test211");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 1);
        int int2 = fraction1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test212");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test213");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test214");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test215");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("10/1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test216");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test217");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test218");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test219");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test220");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test221");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 0.8f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test222");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 1);
        java.lang.Class<?> wildcardClass2 = fraction1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test223");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test224");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(12, (int) '#', 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test225");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test226");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test227");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(100, (int) (byte) 35);
        int int3 = fraction2.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test228");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test229");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("-1/1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test230");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test231");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 10, (int) 'a');
        int int3 = fraction2.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test232");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test233");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test234");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test235");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test236");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test237");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test238");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test239");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test240");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 1, (int) (short) -1);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction2.divideBy(fraction3);
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.invert();
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test241");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test242");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(4, (int) (byte) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test243");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test244");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test245");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test246");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test247");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test248");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test249");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test250");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test251");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(1226, 20, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test252");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        org.apache.commons.lang3.math.Fraction fraction6 = fraction3.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.negate();
        org.apache.commons.lang3.math.Fraction fraction8 = null;
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test253");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test254");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test255");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test256");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow((int) (byte) 0);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        int int4 = fraction3.getProperWhole();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.subtract(fraction3);
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test257");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        int int1 = fraction0.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test258");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("1");
        int int2 = fraction1.getDenominator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test259");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) -1, (-1));
        byte byte3 = fraction2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test260");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test261");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) -1, (-10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test262");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        long long1 = fraction0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test263");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test264");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(77, 3, 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test265");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test266");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test267");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test268");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 100, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test269");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test270");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test271");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test272");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test273");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(3, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test274");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(100, (int) (short) 10);
        byte byte3 = fraction2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test275");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(5, 2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test276");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test277");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test278");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 100);
        int int2 = fraction1.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test279");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test280");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(0, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test281");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test282");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test283");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test284");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test285");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(2, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test286");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(77, 103);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test287");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test288");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test289");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        int int1 = fraction0.getNumerator();
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test290");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(1.0d);
        float float2 = fraction1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test291");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test292");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test293");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test294");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test295");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test296");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test297");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), 3);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.negate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test298");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test299");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test300");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(0.5d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test301");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(77, (int) (short) -1);
        float float3 = fraction2.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-77.0f) + "'", float3 == (-77.0f));
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test302");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) ' ', (-21), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test303");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test304");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test305");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test306");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test307");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test308");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test309");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        float float1 = fraction0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test310");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test311");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test312");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test313");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test314");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test315");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test316");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test317");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(10, (int) (byte) -1);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.invert();
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test318");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test319");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test320");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test321");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test322");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(208, 5, (int) (short) 10);
        long long4 = fraction3.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 208L + "'", long4 == 208L);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test323");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test324");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test325");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test326");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test327");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 30, (int) (short) 1);
        byte byte3 = fraction2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 30 + "'", byte3 == (byte) 30);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test328");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        java.lang.String str1 = fraction0.toProperString();
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test329");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test330");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test331");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test332");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(35, 5, 30);
        java.lang.String str4 = fraction3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1055/30" + "'", str4.equals("1055/30"));
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test333");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(208, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test334");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test335");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test336");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test337");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test338");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(9, (int) (short) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test339");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) '#');
        org.apache.commons.lang3.math.Fraction fraction2 = fraction1.negate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test340");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 30, (int) (short) 1);
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test341");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-5), 208);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test342");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test343");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test344");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test345");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test346");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test347");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((-1), (int) (byte) -1);
        double double3 = fraction2.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test348");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) 'a', 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test349");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.negate();
        java.lang.String str6 = fraction3.toString();
        org.apache.commons.lang3.math.Fraction fraction7 = null;
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test350");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) -1, 77, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test351");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test352");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test353");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test354");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (-10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test355");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test356");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test357");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test358");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test359");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test360");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 1, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test361");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test362");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test363");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test364");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test365");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test366");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test367");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test368");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 100);
        short short2 = fraction1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test369");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test370");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test371");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(77, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test372");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test373");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test374");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test375");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test376");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test377");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test378");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 0, (int) '#', 1);
        int int4 = fraction3.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test379");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test380");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((-1), 3);
        byte byte3 = fraction2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test381");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("1055/30");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test382");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test383");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test384");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test385");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test386");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test387");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test388");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test389");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test390");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test391");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test392");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test393");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test394");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 35, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test395");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test396");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(5, 1);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.abs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test397");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test398");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test399");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test400");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) -10, 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test401");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test402");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test403");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test404");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 35, (int) (byte) 97, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test405");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test406");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test407");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test408");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test409");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test410");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) ' ', (int) (byte) 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test411");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test412");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("4/5");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test413");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 35, 10, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test414");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) '#');
        float float2 = fraction1.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        org.apache.commons.lang3.math.Fraction fraction4 = fraction1.multiplyBy(fraction3);
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test415");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(2.5d);
        byte byte2 = fraction1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 2 + "'", byte2 == (byte) 2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test416");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(0, (int) (byte) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test417");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test418");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test419");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test420");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test421");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test422");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test423");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test424");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test425");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test426");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test427");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((-21), (int) (byte) 100, (int) (byte) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test428");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test429");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test430");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test431");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test432");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 100, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test433");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test434");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 97, (int) (byte) -10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test435");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test436");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("-10");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test437");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test438");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test439");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test440");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 0.1f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test441");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test442");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test443");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test444");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test445");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test446");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test447");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test448");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test449");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 100, 103);
        int int3 = fraction2.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test450");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test451");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test452");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test453");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test454");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test455");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(12, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = fraction2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test456");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test457");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 2, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test458");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test459");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test460");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test461");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test462");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test463");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 35, (int) (short) 100, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test464");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test465");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test466");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test467");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test468");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 100, (int) (byte) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test469");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test470");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test471");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test472");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test473");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test474");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) -10, (int) (byte) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test475");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test476");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test477");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test478");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test479");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test480");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) (byte) 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test481");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(4, 100, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test482");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 10);
        int int2 = fraction1.intValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.invert();
        int int4 = fraction3.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction3.negate();
        // The following exception was thrown during execution in test generation
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test483");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction("-1/3");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test484");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test485");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test486");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test487");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test488");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test489");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test490");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test491");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction(9, (int) (short) 1, (int) (short) 97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test492");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test493");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test494");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test495");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 35, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test496");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test497");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test498");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test499");
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
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test500");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) 100, (int) (byte) 100, (int) (byte) 30);
        int int4 = fraction3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 103 + "'", int4 == 103);
    }
}

