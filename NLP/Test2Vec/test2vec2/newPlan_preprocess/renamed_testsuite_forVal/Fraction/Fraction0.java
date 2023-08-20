
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
            System.out.format("%n%s%n", "Fraction0.test01");
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
            System.out.format("%n%s%n", "Fraction0.test02");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(0.0d);
        int int2 = fraction1.getNumerator();
        int int3 = fraction1.getProperNumerator();
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(0.0d);
        int int6 = fraction5.getNumerator();
        int int7 = fraction5.getProperNumerator();
        int int8 = fraction1.compareTo(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test03");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_FIFTHS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test04");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(0.0d);
        int int2 = fraction1.getNumerator();
        int int3 = fraction1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test05");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        double double1 = fraction0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4d + "'", double1 == 0.4d);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test06");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0.0d);
        int int3 = fraction2.getNumerator();
        int int4 = fraction2.getProperNumerator();
        long long5 = fraction2.longValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction6 = fraction0.divideBy(fraction2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The fraction to divide by must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test07");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_QUARTER;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test08");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ZERO;
        byte byte1 = fraction0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test09");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        long long1 = fraction0.longValue();
        short short2 = fraction0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test10");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) 1, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The numerator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test11");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction(1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test12");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        java.lang.String str4 = fraction3.toString();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        int int6 = fraction0.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3/4" + "'", str1.equals("3/4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.75f + "'", float2 == 0.75f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2/4" + "'", str4.equals("2/4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test13");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_HALF;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test14");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test15");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0.0d);
        int int3 = fraction2.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.add(fraction2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction6 = fraction0.pow((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test16");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test17");
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) '4', (int) (short) 10, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test18");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        int int5 = fraction4.intValue();
        org.apache.commons.lang3.math.Fraction fraction6 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction7 = fraction4.divideBy(fraction6);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction0.multiplyBy(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3/4" + "'", str1.equals("3/4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.75f + "'", float2 == 0.75f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
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
            System.out.format("%n%s%n", "Fraction0.test19");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (byte) -1, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be negative");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test20");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        long long1 = fraction0.longValue();
        java.lang.Class<?> wildcardClass2 = fraction0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test21");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow(10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.negate();
        long long4 = fraction3.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test22");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow(10);
        java.lang.String str3 = fraction2.toString();
        java.lang.Class<?> wildcardClass4 = fraction2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1/9765625" + "'", str3.equals("1/9765625"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test23");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test24");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        int int1 = fraction0.intValue();
        long long2 = fraction0.longValue();
        float float3 = fraction0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.75f + "'", float3 == 0.75f);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test25");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(0.0d);
        int int2 = fraction1.getNumerator();
        int int3 = fraction1.getProperNumerator();
        long long4 = fraction1.longValue();
        byte byte5 = fraction1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test26");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        int int1 = fraction0.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test27");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0.0d);
        int int3 = fraction2.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.add(fraction2);
        java.lang.String str5 = fraction2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0/1" + "'", str5.equals("0/1"));
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test28");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0.0d);
        int int3 = fraction2.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.add(fraction2);
        java.lang.String str5 = fraction2.toProperString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test29");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        java.lang.String str4 = fraction3.toString();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        java.lang.String str6 = fraction5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3/4" + "'", str1.equals("3/4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.75f + "'", float2 == 0.75f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2/4" + "'", str4.equals("2/4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "5/4" + "'", str6.equals("5/4"));
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test30");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 1, 10);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(0.0d);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.add(fraction5);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction2.divideBy(fraction3);
        int int9 = fraction2.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
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
            System.out.format("%n%s%n", "Fraction0.test31");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.divideBy(fraction2);
        java.lang.String str4 = fraction0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "3/4" + "'", str4.equals("3/4"));
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test32");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        int int1 = fraction0.intValue();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.divideBy(fraction2);
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        java.lang.String str5 = fraction4.toString();
        float float6 = fraction4.floatValue();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction8 = fraction4.invert();
        org.apache.commons.lang3.math.Fraction fraction9 = fraction2.multiplyBy(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "3/4" + "'", str5.equals("3/4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.75f + "'", float6 == 0.75f);
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
            System.out.format("%n%s%n", "Fraction0.test33");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        java.lang.String str3 = fraction2.toString();
        float float4 = fraction2.floatValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction2.invert();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction0.subtract(fraction6);
        boolean boolean9 = fraction0.equals((java.lang.Object) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3/4" + "'", str1.equals("3/4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "3/4" + "'", str3.equals("3/4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.75f + "'", float4 == 0.75f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
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
            System.out.format("%n%s%n", "Fraction0.test34");
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (short) 1, 10);
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction5 = org.apache.commons.lang3.math.Fraction.getFraction(0.0d);
        int int6 = fraction5.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction7 = fraction3.add(fraction5);
        org.apache.commons.lang3.math.Fraction fraction8 = fraction2.divideBy(fraction3);
        double double9 = fraction2.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1d + "'", double9 == 0.1d);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test35");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(0.0d);
        int int2 = fraction1.getNumerator();
        int int3 = fraction1.getProperNumerator();
        java.lang.String str4 = fraction1.toProperString();
        org.apache.commons.lang3.math.Fraction fraction6 = fraction1.pow((int) (short) 100);
        short short7 = fraction1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test36");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow(10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.negate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction5 = fraction2.pow((int) (short) 100);
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
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test37");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.reduce();
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        int int3 = fraction2.intValue();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction2.pow((-1));
        org.apache.commons.lang3.math.Fraction fraction6 = fraction1.add(fraction5);
        double double7 = fraction6.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.1333333333333333d + "'", double7 == 2.1333333333333333d);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test38");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test39");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        float float2 = fraction0.floatValue();
        int int3 = fraction0.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3/4" + "'", str1.equals("3/4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.75f + "'", float2 == 0.75f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test40");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(0.0d);
        int int3 = fraction2.getNumerator();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.add(fraction2);
        short short5 = fraction2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test41");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ZERO;
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.getFraction((int) (short) -1, (int) (short) -1);
        boolean boolean4 = fraction0.equals((java.lang.Object) fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test42");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.TWO_THIRDS;
        float float1 = fraction0.floatValue();
        float float2 = fraction0.floatValue();
        short short3 = fraction0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.6666667f + "'", float1 == 0.6666667f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.6666667f + "'", float2 == 0.6666667f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test43");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        int int1 = fraction0.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test44");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getReducedFraction((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test45");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_THIRD;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test46");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.math.Fraction fraction2 = org.apache.commons.lang3.math.Fraction.getFraction(1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The denominator must not be zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test47");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow(10);
        java.lang.String str3 = fraction2.toString();
        java.lang.String str4 = fraction2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1/9765625" + "'", str3.equals("1/9765625"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1/9765625" + "'", str4.equals("1/9765625"));
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test48");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction3 = fraction1.pow(10);
        java.lang.String str4 = fraction3.toString();
        int int5 = fraction0.compareTo(fraction3);
        int int6 = fraction3.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1/9765625" + "'", str4.equals("1/9765625"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test49");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.reduce();
        int int2 = fraction0.getNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test50");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.FOUR_FIFTHS;
        org.apache.commons.lang3.math.Fraction fraction1 = fraction0.reduce();
        int int2 = fraction0.getProperWhole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test51");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction2 = fraction0.pow(10);
        org.apache.commons.lang3.math.Fraction fraction3 = fraction2.negate();
        org.apache.commons.lang3.math.Fraction fraction4 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        org.apache.commons.lang3.math.Fraction fraction6 = fraction4.pow(10);
        org.apache.commons.lang3.math.Fraction fraction7 = fraction6.negate();
        boolean boolean8 = fraction2.equals((java.lang.Object) fraction6);
        int int9 = fraction6.getProperNumerator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test52");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE_FIFTH;
        boolean boolean2 = fraction0.equals((java.lang.Object) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test53");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.ONE;
        long long1 = fraction0.longValue();
        java.lang.String str2 = fraction0.toProperString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test54");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction(0.0d);
        int int2 = fraction1.getNumerator();
        int int3 = fraction1.getProperNumerator();
        java.lang.String str4 = fraction1.toProperString();
        float float5 = fraction1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test55");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction4 = fraction0.invert();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction4.negate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3/4" + "'", str1.equals("3/4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.75f + "'", float2 == 0.75f);
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
            System.out.format("%n%s%n", "Fraction0.test56");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        int int2 = fraction1.intValue();
        int int3 = fraction0.compareTo(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test57");
        org.apache.commons.lang3.math.Fraction fraction1 = org.apache.commons.lang3.math.Fraction.getFraction((-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction1);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test58");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        java.lang.String str4 = fraction3.toString();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        long long6 = fraction3.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3/4" + "'", str1.equals("3/4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.75f + "'", float2 == 0.75f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2/4" + "'", str4.equals("2/4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test59");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        float float2 = fraction0.floatValue();
        int int3 = fraction0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3/4" + "'", str1.equals("3/4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.75f + "'", float2 == 0.75f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void Fraction() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Fraction0.test60");
        org.apache.commons.lang3.math.Fraction fraction0 = org.apache.commons.lang3.math.Fraction.THREE_QUARTERS;
        java.lang.String str1 = fraction0.toString();
        float float2 = fraction0.floatValue();
        org.apache.commons.lang3.math.Fraction fraction3 = org.apache.commons.lang3.math.Fraction.TWO_QUARTERS;
        java.lang.String str4 = fraction3.toString();
        org.apache.commons.lang3.math.Fraction fraction5 = fraction0.add(fraction3);
        int int6 = fraction5.getDenominator();
        long long7 = fraction5.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "3/4" + "'", str1.equals("3/4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.75f + "'", float2 == 0.75f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2/4" + "'", str4.equals("2/4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fraction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }
}

