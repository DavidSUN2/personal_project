
package MutableDouble;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableDouble0 {

    public static boolean debug = false;

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test01");
        java.lang.Number number0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(number0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test02");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test03");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test04");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        float float6 = mutableDouble0.floatValue();
        mutableDouble0.decrement();
        mutableDouble0.subtract(9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test05");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        java.lang.String str1 = mutableDouble0.toString();
        java.lang.Class<?> wildcardClass2 = mutableDouble0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.0" + "'", str1.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test06");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        byte byte6 = mutableDouble2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 9 + "'", byte6 == (byte) 9);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test07");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        float float6 = mutableDouble0.floatValue();
        mutableDouble0.decrement();
        mutableDouble0.setValue(9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test08");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 1);
        byte byte2 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test09");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble1.decrement();
        java.lang.Double double3 = mutableDouble1.toDouble();
        mutableDouble1.subtract((java.lang.Number) 10.0d);
        java.lang.String str6 = mutableDouble1.toString();
        mutableDouble1.setValue((java.lang.Number) 9.0d);
        java.lang.Class<?> wildcardClass9 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.0d + "'", double3.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0" + "'", str6.equals("-1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test10");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) 0.0f);
        java.lang.Class<?> wildcardClass2 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test11");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        long long6 = mutableDouble0.longValue();
        boolean boolean7 = mutableDouble0.isInfinite();
        boolean boolean8 = mutableDouble0.isNaN();
        long long9 = mutableDouble0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test12");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        float float6 = mutableDouble0.floatValue();
        mutableDouble0.decrement();
        java.lang.Double double8 = mutableDouble0.getValue();
        java.lang.Double double9 = mutableDouble0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9.equals((-1.0d)));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test13");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble1.decrement();
        java.lang.Double double3 = mutableDouble1.toDouble();
        mutableDouble1.subtract((java.lang.Number) 10.0d);
        java.lang.String str6 = mutableDouble1.toString();
        java.lang.Class<?> wildcardClass7 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.0d + "'", double3.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0" + "'", str6.equals("-1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test14");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        java.lang.String str6 = mutableDouble2.toString();
        mutableDouble2.increment();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble8 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "9.0" + "'", str6.equals("9.0"));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test15");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        short short6 = mutableDouble2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test16");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble1.decrement();
        mutableDouble1.increment();
        int int4 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test17");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        java.lang.String str6 = mutableDouble2.toString();
        short short7 = mutableDouble2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "9.0" + "'", str6.equals("9.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 9 + "'", short7 == (short) 9);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test18");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble1.decrement();
        java.lang.Double double3 = mutableDouble1.toDouble();
        int int4 = mutableDouble1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.0d + "'", double3.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test19");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        mutableDouble2.add((double) 1.0f);
        mutableDouble2.add((java.lang.Number) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test20");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        java.lang.Double double6 = mutableDouble0.getValue();
        boolean boolean7 = mutableDouble0.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test21");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble1.decrement();
        java.lang.Double double3 = mutableDouble1.toDouble();
        mutableDouble1.subtract((java.lang.Number) 10.0d);
        mutableDouble1.increment();
        boolean boolean7 = mutableDouble1.isInfinite();
        java.lang.Class<?> wildcardClass8 = mutableDouble1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.0d + "'", double3.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test22");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("-1.0");
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDouble1.subtract(number2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test23");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        long long6 = mutableDouble0.longValue();
        byte byte7 = mutableDouble0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test24");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        java.lang.String str6 = mutableDouble2.toString();
        mutableDouble2.increment();
        mutableDouble2.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "9.0" + "'", str6.equals("9.0"));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test25");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble1.decrement();
        java.lang.Double double3 = mutableDouble1.toDouble();
        mutableDouble1.subtract((java.lang.Number) 10.0d);
        mutableDouble1.increment();
        mutableDouble1.subtract((java.lang.Number) 1.0d);
        double double9 = mutableDouble1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.0d + "'", double3.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test26");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble1.decrement();
        mutableDouble1.decrement();
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test27");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        float float6 = mutableDouble0.floatValue();
        long long7 = mutableDouble0.longValue();
        java.lang.Class<?> wildcardClass8 = mutableDouble0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test28");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        long long6 = mutableDouble0.longValue();
        long long7 = mutableDouble0.longValue();
        boolean boolean9 = mutableDouble0.equals((java.lang.Object) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test29");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        float float6 = mutableDouble0.floatValue();
        mutableDouble0.add((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test30");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 1);
        mutableDouble1.decrement();
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test31");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        long long6 = mutableDouble0.longValue();
        mutableDouble0.decrement();
        mutableDouble0.subtract((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test32");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        long long6 = mutableDouble0.longValue();
        mutableDouble0.decrement();
        mutableDouble0.add((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test33");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble1.decrement();
        java.lang.Double double3 = mutableDouble1.toDouble();
        mutableDouble1.subtract((double) (byte) 100);
        mutableDouble1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.0d + "'", double3.equals(9.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test34");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble1.subtract((double) '4');
        byte byte4 = mutableDouble1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -42 + "'", byte4 == (byte) -42);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test35");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble1.decrement();
        java.lang.Double double3 = mutableDouble1.toDouble();
        mutableDouble1.subtract((java.lang.Number) 10.0d);
        java.lang.String str6 = mutableDouble1.toString();
        boolean boolean8 = mutableDouble1.equals((java.lang.Object) 1L);
        long long9 = mutableDouble1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.0d + "'", double3.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0" + "'", str6.equals("-1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test36");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble1.decrement();
        java.lang.Double double3 = mutableDouble1.toDouble();
        mutableDouble1.setValue(10.0d);
        mutableDouble1.setValue(1.0d);
        java.lang.String str8 = mutableDouble1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.0d + "'", double3.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1.0" + "'", str8.equals("1.0"));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test37");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        float float6 = mutableDouble0.floatValue();
        long long7 = mutableDouble0.longValue();
        long long8 = mutableDouble0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test38");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        boolean boolean6 = mutableDouble2.isInfinite();
        boolean boolean7 = mutableDouble2.isNaN();
        mutableDouble2.setValue((double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test39");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        long long6 = mutableDouble0.longValue();
        boolean boolean7 = mutableDouble0.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test40");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        long long6 = mutableDouble0.longValue();
        mutableDouble0.decrement();
        mutableDouble0.subtract((java.lang.Number) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test41");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        mutableDouble0.setValue((double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test42");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(1.0d);
        boolean boolean2 = mutableDouble1.isInfinite();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test43");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("-1.0");
        mutableDouble1.setValue((java.lang.Number) (byte) -42);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test44");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("-1.0");
        mutableDouble1.decrement();
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test45");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble1.decrement();
        java.lang.Double double3 = mutableDouble1.toDouble();
        mutableDouble1.setValue(10.0d);
        mutableDouble1.setValue((double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.0d + "'", double3.equals(9.0d));
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test46");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        double double6 = mutableDouble0.doubleValue();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) double6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test47");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble1.decrement();
        java.lang.Double double3 = mutableDouble1.toDouble();
        mutableDouble1.subtract((java.lang.Number) 10.0d);
        java.lang.String str6 = mutableDouble1.toString();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble7 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) mutableDouble1);
        java.lang.Class<?> wildcardClass8 = mutableDouble7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.0d + "'", double3.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1.0" + "'", str6.equals("-1.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test48");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 1);
        mutableDouble1.increment();
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test49");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(9.0d);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test50");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble1.subtract((double) (short) 1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test51");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        java.lang.String str1 = mutableDouble0.toString();
        double double2 = mutableDouble0.doubleValue();
        boolean boolean3 = mutableDouble0.isNaN();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.0" + "'", str1.equals("0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test52");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        double double6 = mutableDouble0.doubleValue();
        long long7 = mutableDouble0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test53");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble1.decrement();
        java.lang.Double double3 = mutableDouble1.toDouble();
        mutableDouble1.subtract((java.lang.Number) 10.0d);
        mutableDouble1.increment();
        boolean boolean7 = mutableDouble1.isInfinite();
        float float8 = mutableDouble1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.0d + "'", double3.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test54");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        float float6 = mutableDouble0.floatValue();
        mutableDouble0.decrement();
        java.lang.Double double8 = mutableDouble0.getValue();
        short short9 = mutableDouble0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8.equals((-1.0d)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test55");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble0 = new org.apache.commons.lang3.mutable.MutableDouble();
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble2 = new org.apache.commons.lang3.mutable.MutableDouble((java.lang.Number) (short) 10);
        mutableDouble2.decrement();
        java.lang.Double double4 = mutableDouble2.toDouble();
        int int5 = mutableDouble0.compareTo(mutableDouble2);
        double double6 = mutableDouble0.doubleValue();
        java.lang.Double double7 = mutableDouble0.getValue();
        byte byte8 = mutableDouble0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4.equals(9.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test56");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble("-1.0");
        short short2 = mutableDouble1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void MutableDouble() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableDouble0.test57");
        org.apache.commons.lang3.mutable.MutableDouble mutableDouble1 = new org.apache.commons.lang3.mutable.MutableDouble(1.0d);
        java.lang.Double double2 = mutableDouble1.toDouble();
        mutableDouble1.add((double) (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2.equals(1.0d));
    }
}

